package com.schemati.compiler.mainLanguage;

import com.schemati.backend.entities.Rectangle;
import com.schemati.compiler.languageUtils.Function;
import com.schemati.compiler.languageUtils.Scope;
import com.schemati.compiler.languageUtils.Type;
import com.schemati.compiler.languageUtils.Variable;
import com.schemati.compiler.mainLanguage.antlr4.MainBaseVisitor;
import com.schemati.compiler.mainLanguage.antlr4.MainParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.util.HashMap;

public class CompilerVisitor extends MainBaseVisitor<Object> {
    public HashMap<String, String> headerVariables;
    public HashMap<String, Object> sceneAttributes;
    public String filename;
    public Scope globalScope;
    public Scope currentScope;
    public String output;
    public STGroup stTemplates = new STGroupFile("com/schemati/compiler/mainLanguage/templates.stg");
    ST stMain = stTemplates.getInstanceOf("main");
    boolean isExprCallOnly = true;

    @Override
    public Object visitProg(MainParser.ProgContext ctx) {
        stMain.add("id", filename);

        //Configure the scene according to config file
        ST stScene = stTemplates.getInstanceOf("scene");
        if(sceneAttributes.size() != 5) {
            System.out.println("Make sure you configured scene into config file!");
            System.exit(0);
        }
        stScene.add("title", sceneAttributes.get("title"));
        stScene.add("width", sceneAttributes.get("width"));
        stScene.add("height", sceneAttributes.get("height"));
        stScene.add("scale", sceneAttributes.get("scale"));
        stScene.add("background", sceneAttributes.get("background"));
        stMain.add("scene", stScene.render());

        currentScope = globalScope;

        if(ctx.children != null) {
            for (ParseTree children : ctx.children) {
                if (children instanceof TerminalNode) {
                    continue;
                }
                visit(children);
            }
        }

        output = stMain.render();
        return null;
    }

    @Override
    public Object visitAssignFunc(MainParser.AssignFuncContext ctx) {
        ST st = stTemplates.getInstanceOf("assignFunc");
        st.add("type", ctx.Type().getText());
        st.add("id", ctx.ID().getText());
        if (ctx.typedArgs() != null) {
            st.add("args", visit(ctx.typedArgs()));
        } else {
            st.add("args", false);
        }

        Scope scope = new Scope("Function-" + ctx.ID().getText(), "Function", currentScope);
        globalScope.addScopable(new Function(ctx.ID().getText(), Type.fromString(ctx.Type().getText())));
        currentScope.addChildren(scope);
        currentScope = scope;
        st.add("stat", visit(ctx.blockFunc()));
        currentScope = scope.getParent();

        String output = st.render();
        stMain.add("glScope", output); //Functions are always on global scope
        return null;
    }

    @Override
    public Object visitCreateVar(MainParser.CreateVarContext ctx) {
        String type = ctx.Type().getText();
        if (type.contains("[]")) {
            type = "List<" + type.replace("[]", "") + ">";
        }
        isExprCallOnly = false;
        String output = type + " " + ctx.ID().getText() + " = " + visit(ctx.expr()) + ";";
        isExprCallOnly = true;
        if (currentScope.isGlobal()) {
            stMain.add("glScope", output);
            return null;
        }
        return output;
    }

    @Override
    public Object visitAssignVar(MainParser.AssignVarContext ctx) {
        isExprCallOnly = false;
        String output = visit(ctx.var()) + " = " + visit(ctx.expr()) + ";";
        isExprCallOnly = true;
        if (currentScope.isGlobal()) {
            stMain.add("stat", output);
            return null;
        }
        return output;
    }

    @Override
    public Object visitIfStat(MainParser.IfStatContext ctx) {
        ST st = stTemplates.getInstanceOf("ifStat");

        Scope scope = new Scope("If-" + Math.random(), "If", currentScope);
        currentScope.addChildren(scope);
        currentScope = scope;
        isExprCallOnly = false;
        st.add("cond", visit(ctx.expr()));
        isExprCallOnly = true;
        st.add("stat", visit(ctx.block()));
        currentScope = scope.getParent();
        String output = st.render();

        if(ctx.elseStat() != null) {
            output += visit(ctx.elseStat());
        }
        if (currentScope.isGlobal()) {
            stMain.add("stat", output);
            return null;
        }
        return output;
    }

    @Override
    public Object visitElseStat(MainParser.ElseStatContext ctx) {
        ST st = stTemplates.getInstanceOf("elseStat");
        Scope scope = new Scope("Else-" + Math.random(), "Else", currentScope);
        currentScope.addChildren(scope);
        currentScope = scope;
        st.add("stat", visit(ctx.block()));
        currentScope = scope.getParent();
        return st.render();
    }

    @Override
    public Object visitBlockFunc(MainParser.BlockFuncContext ctx) {
        StringBuilder output = new StringBuilder("");
        for (ParseTree children : ctx.children) {
            if (children instanceof TerminalNode) {
                continue;
            }
            output.append(visit(children));
        }
        return output.toString();
    }

    @Override
    public Object visitStat(MainParser.StatContext ctx) {
        StringBuilder output = new StringBuilder("");
        for (ParseTree children : ctx.children) {
            if (children instanceof TerminalNode) {
                continue;
            }
            output.append(visit(children));
        }
        return output.toString();
    }

    @Override
    public Object visitAnimStruct(MainParser.AnimStructContext ctx) {
        StringBuilder output = new StringBuilder("");
        for (ParseTree children : ctx.children) {
            if (children instanceof TerminalNode) {
                continue;
            }
            output.append(visit(children));
        }
        return output.toString();
    }

    @Override
    public Object visitBlock(MainParser.BlockContext ctx) {
        StringBuilder output = new StringBuilder("");
        for (ParseTree children : ctx.children) {
            if (children instanceof TerminalNode) {
                continue;
            }
            output.append(visit(children));
        }
        return output.toString();
    }

    @Override
    public Object visitLoopCtrl(MainParser.LoopCtrlContext ctx) {
        if (ctx.Continue() != null) {
            return "continue;";
        } else {
            return "break;";
        }
    }

    @Override
    public Object visitPrint(MainParser.PrintContext ctx) {
        isExprCallOnly = false;
        String output = "System.out.println(" + visit(ctx.expr()) + ");";
        isExprCallOnly = true;
        if (currentScope.isGlobal()) {
            stMain.add("stat", output);
            return null;
        }
        return output;
    }

    @Override
    public Object visitReturnStat(MainParser.ReturnStatContext ctx) {
        isExprCallOnly = false;
        String output = "return " + visit(ctx.expr()) + ";";
        isExprCallOnly = true;
        return output;
    }

    @Override
    public Object visitTypedArgs(MainParser.TypedArgsContext ctx) {
        StringBuilder args = new StringBuilder("");
        args.append(visit(ctx.typeID(0)));
        for (int i = 1; i < ctx.typeID().size(); i++) {
            args.append(",").append(visit(ctx.typeID(i)));
        }
        return args;
    }

    @Override
    public Object visitTypeID(MainParser.TypeIDContext ctx) {
        return ctx.Type().getText() + " " + ctx.ID().getText();
    }

    @Override
    public Object visitStartCtrl(MainParser.StartCtrlContext ctx) {
        //Always on global
        stMain.add("startCtrl", "mainEntityList" + "=" + ctx.ID().getText() + ";");
        return null;
    }

    @Override
    public Object visitAtTimeDuring(MainParser.AtTimeDuringContext ctx) {
        ST st = stTemplates.getInstanceOf("timedAnim");
        isExprCallOnly = false;
        st.add("start", visit(ctx.start));
        st.add("during", visit(ctx.during));
        isExprCallOnly = true;
        Scope scope = new Scope("Anim-" + Math.random(), "Anim", currentScope);
        currentScope.addChildren(scope);
        currentScope = scope;
        st.add("stat", visit(ctx.block()));
        currentScope = scope.getParent();
        String output = st.render();
        stMain.add("anim", output); //Anim always on global
        return null;
    }

    @Override
    public Object visitAtEventDuring(MainParser.AtEventDuringContext ctx) {
        ST st = stTemplates.getInstanceOf("eventAnim");
        st.add("start", ctx.start.getText());
        Scope scope = new Scope("Anim-" + Math.random(), "Anim", currentScope);
        currentScope.addChildren(scope);
        currentScope = scope;
        st.add("stat", visit(ctx.block()));
        currentScope = scope.getParent();
        String output = st.render();
        stMain.add("anim", output); //Anim always on global
        return null;
    }

    @Override
    public Object visitExprParenthesis(MainParser.ExprParenthesisContext ctx) {
        String exprStr = (String) visit(ctx.expr());
        StringBuilder output = new StringBuilder("");
        if(exprStr.contains("new Integer")) {
            output.append("new Integer(").append(exprStr).append(")");
        } else if(exprStr.contains("new Double")) {
            output.append("new Double(").append(exprStr).append(")");
        } else if(exprStr.contains("new Boolean")) {
            output.append("new Boolean(").append(exprStr).append(")");
        } else {
            output.append(exprStr);
        }
        if(isExprCallOnly) {
            output.append(";");
        }
        return output.toString();
    }

    @Override
    public Object visitChangeArr(MainParser.ChangeArrContext ctx) {
        switch (ctx.op.getText()) {
            case "<<":
                StringBuilder list = new StringBuilder("");
                isExprCallOnly = false;
                for (MainParser.ExprContext exprCtx : ctx.expr()) {
                    list.append(visit(exprCtx)).append(",");
                }
                isExprCallOnly = true;
                list.setCharAt(list.length() - 1, ' ');
                StringBuilder arrayAsList = new StringBuilder("Arrays.asList");
                arrayAsList.append("(").append(list).append(")");
                String output1 = ctx.ID().getText() + ".addAll(" + arrayAsList + ");";
                if (currentScope.isGlobal()) {
                    stMain.add("stat", output1);
                    return null;
                }
                return output1;

            case ">>":
                StringBuilder removeIndexes = new StringBuilder("for(Integer arrayIterator : Arrays.asList(");
                isExprCallOnly = false;
                for (MainParser.ExprContext exprCtx : ctx.expr()) {
                    removeIndexes.append(visit(exprCtx)).append(",");
                }
                isExprCallOnly = true;
                removeIndexes.setCharAt(removeIndexes.length() - 1, ' ');
                removeIndexes.append(").stream()" +
                        ".sorted((i1,i2) -> i2.compareTo(i1))" +
                        ".collect(Collectors.toList())) {")
                        .append(ctx.ID()).append(".remove(arrayIterator); }");

                String output2 = removeIndexes.toString();
                if (currentScope.isGlobal()) {
                    stMain.add("stat", output2);
                    return null;
                }
                return output2;
        }
        return null;
    }

    @Override
    public Object visitForStat(MainParser.ForStatContext ctx) {
        if (ctx.each != null) {
            Scope scope = new Scope("For-" + Math.random(), "For", currentScope);
            currentScope.addChildren(scope);
            currentScope = scope;
            ST st = stTemplates.getInstanceOf("forEachStat");
            st.add("var", ctx.Type().getText() + ctx.ID(0).getText());
            st.add("array", ctx.ID(1));

            st.add("stat", visit(ctx.block()));
            currentScope = scope.getParent();

            String output = st.render();
            if (currentScope.isGlobal()) {
                stMain.add("stat", output);
                return null;
            } else {
                return output;
            }
        } else {
            ST st = stTemplates.getInstanceOf("forStat");
            Scope scope = new Scope("For-" + Math.random(), "For", currentScope);
            currentScope.addChildren(scope);
            currentScope = scope;
            isExprCallOnly = false;
            if (ctx.createVar() != null) {
                st.add("start", visit(ctx.createVar()));
                st.add("end", visit(ctx.end) + ";");
                if (ctx.assignVar(0) != null) {
                    String step = (String) visit(ctx.assignVar(0));
                    step = step.replace(";", "");
                    st.add("step", step);
                } else {
                    String step = (String) visit(ctx.expr(1));
                    step = step.replace(";", "");
                    st.add("step", step);
                }
            } else {
                st.add("start", visit(ctx.assignVar(0)));
                st.add("end", visit(ctx.end) + ";");
                if (ctx.assignVar(1) != null) {
                    String step = (String) visit(ctx.assignVar(1));
                    step = step.replace(";", "");
                    st.add("step", step.replace(";", ""));
                } else {
                    String step = (String) visit(ctx.expr(1));
                    step = step.replace(";", "");
                    st.add("step", step);
                }
            }
            isExprCallOnly = true;
            st.add("stat", visit(ctx.block()));
            currentScope = scope.getParent();

            String output = st.render();
            if (currentScope.isGlobal()) {
                stMain.add("stat", output);
                return null;
            } else {
                return output;
            }
        }
    }

    @Override
    public Object visitFunctionCall(MainParser.FunctionCallContext ctx) {
        Function function = globalScope.getFunction(ctx.ID().getText());
        StringBuilder args = new StringBuilder("");
        if (ctx.args() != null) {
            args.append(visit(ctx.args()));
        }

        StringBuilder orderedArgs = new StringBuilder("");
        for (Variable arg : function.getArguments()) {
            for (String randArg : args.toString().split("%")) {
                String id = randArg.split(":")[0];
                String value = randArg.split(":")[1];

                if (id.equals(arg.getId())) {
                    orderedArgs.append(value).append(",");
                }
            }
        }
        if (orderedArgs.length() > 0) {
            orderedArgs.setCharAt(orderedArgs.length() - 1, ' ');
        }

        StringBuilder attrs = new StringBuilder("");
        for (MainParser.AttrContext attrCtx : ctx.attr()) {
            attrs.append(visit(attrCtx));
        }

        String output = ctx.ID().getText() + "(" + orderedArgs + ")" + attrs;

        if(!getDefaultFunctionString(ctx.ID().getText()).equals("notDefault")) {
            output = getDefaultFunctionString(ctx.ID().getText()) + "(" + orderedArgs + ")";
        }

        if (isExprCallOnly) {
            output = output + ";";
        }
        if (currentScope.isGlobal() && isExprCallOnly) {
            stMain.add("stat", output);
            return null;
        }
        return output;
    }

    @Override
    public Object visitArgs(MainParser.ArgsContext ctx) {
        StringBuilder args = new StringBuilder("");
        args.append(ctx.ID(0)).append(":").append(visit(ctx.expr(0)));
        for (int i = 1; i < ctx.ID().size(); i++) {
            args.append("%").append(ctx.ID(i)).append(":").append(visit(ctx.expr(i)));
        }
        return args;
    }

    @Override
    public Object visitVarArr(MainParser.VarArrContext ctx) {
        StringBuilder attrs = new StringBuilder("");
        for (MainParser.AttrContext attrCtx : ctx.attr()) {
            attrs.append(visit(attrCtx));
        }

        return ctx.ID().getText() + ".get(" + visit(ctx.index) + ")" + attrs;
    }

    @Override
    public Object visitVarId(MainParser.VarIdContext ctx) {
        StringBuilder attrs = new StringBuilder("");
        for (MainParser.AttrContext attrCtx : ctx.attr()) {
            attrs.append(visit(attrCtx));
        }

        return ctx.ID().getText() + attrs;
    }

    @Override
    public Object visitAttr(MainParser.AttrContext ctx) {
        if (ctx.ID().getText().equals("size") || ctx.ID().getText().equals("length")) {
            return "." + ctx.ID().getText() + "()";
        } else {
            return "." + ctx.ID().getText();
        }
    }

    @Override
    public Object visitExprVarDblOp(MainParser.ExprVarDblOpContext ctx) {
        String output = visit(ctx.var()) + ctx.dbl.getText();
        if(isExprCallOnly) {
            output += ";";
        }
        if (currentScope.isGlobal()) {
            stMain.add("stat", output);
            return null;
        }
        return output;
    }

    @Override
    public Object visitExprUnary(MainParser.ExprUnaryContext ctx) {
        String output = ctx.op.getText() + visit(ctx.expr());
        if (currentScope.isGlobal()) {
            stMain.add("stat", output);
            return null;
        }
        return output;
    }

    @Override
    public Object visitExprComp(MainParser.ExprCompContext ctx) {
        String op = ctx.op.getText();
        switch (op) {
            case "==":
                return visit(ctx.e1) + ".compareTo(" + visit(ctx.e2) + ") == 0";
            case "!=":
                return visit(ctx.e1) + ".compareTo(" + visit(ctx.e2) + ") != 0";
            case ">=":
                return visit(ctx.e1) + ".compareTo(" + visit(ctx.e2) + ") >= 0";
            case "<=":
                return visit(ctx.e1) + ".compareTo(" + visit(ctx.e2) + ") <= 0";
            case ">":
                return visit(ctx.e1) + ".compareTo(" + visit(ctx.e2) + ") > 0";
            case "<":
                return visit(ctx.e1) + ".compareTo(" + visit(ctx.e2) + ") < 0";
            default:
                System.out.println("ERROR");
                break;
        }
        String output = visit(ctx.e1) + " " + ctx.op + " " + visit(ctx.e2);
        if (currentScope.isGlobal()) {
            stMain.add("stat", output);
            return null;
        }
        return output;
    }

    @Override
    public Object visitExprMultDivMod(MainParser.ExprMultDivModContext ctx) {
        String output = visit(ctx.e1) + ctx.op.getText() + visit(ctx.e2);
        if (currentScope.isGlobal()) {
            stMain.add("stat", output);
            return null;
        }
        return output;
    }

    @Override
    public Object visitExprAddSub(MainParser.ExprAddSubContext ctx) {
        String output = visit(ctx.e1) + ctx.op.getText() + visit(ctx.e2);
        if (currentScope.isGlobal()) {
            stMain.add("stat", output);
            return null;
        }
        return output;
    }

    @Override
    public Object visitExprArray(MainParser.ExprArrayContext ctx) {
        String output = "new ArrayList<>()";
        return output;
    }

    @Override
    public Object visitExprSeconds(MainParser.ExprSecondsContext ctx) {
        Integer sToMs = Integer.parseInt(ctx.Seconds().getText().replace("s", "")) * 1000;
        String output = "new Integer(\"" + sToMs.toString() + "\")";
        return output;
    }

    @Override
    public Object visitExprMilliseconds(MainParser.ExprMillisecondsContext ctx) {
        String output = "new Integer(\"" + ctx.Milliseconds().getText().replace("ms", "") + "\")";
        return output;
    }

    @Override
    public Object visitExprNull(MainParser.ExprNullContext ctx) {
        String output = "null";
        if(isExprCallOnly) {
            output = "";
        }
        return output;
    }

    @Override
    public Object visitExprStr(MainParser.ExprStrContext ctx) {
        return ctx.String().getText();
    }

    @Override
    public Object visitExprBool(MainParser.ExprBoolContext ctx) {
        String output = "new Boolean(\"" + ctx.Boolean().getText() + "\")";
        return output;
    }

    @Override
    public Object visitExprInteger(MainParser.ExprIntegerContext ctx) {
        String output = "new Integer(\"" + ctx.Integer().getText() + "\")";
        return output;
    }

    @Override
    public Object visitExprDouble(MainParser.ExprDoubleContext ctx) {
        String output = "new Double(\"" + ctx.Double().getText() + "\")";
        return output;
    }

    @Override
    public Object visitExprColor(MainParser.ExprColorContext ctx) {
        String output = "Color.decode(\"" + ctx.Color().getText() + "\")";
        return output;
    }

    @Override
    public Object visitVector2(MainParser.Vector2Context ctx) {
        String output = "new Vector2(" + ctx.xVal.getText() + "," + ctx.yVal.getText() + ")";
        return output;
    }

    private String getDefaultFunctionString(String s) {
        switch (s) {
            case "circle":
                return "new Circle";
            case "square":
                return "new Square";
            case "polygon":
                return "new Polygon";
            case "ellipse":
                return "new Ellipse";
            case "rectangle":
                return "new Rectangle";
            case "image":
                return "new Image";
            case "text":
                return "new Text";
            case "rand":
                return "Utils.randInt";
            case "itos":
                return "Utils.intToString";
            default:
                return "notDefault";
        }
    }
}
