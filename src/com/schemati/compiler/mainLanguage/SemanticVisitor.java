package com.schemati.compiler.mainLanguage;

import com.schemati.compiler.languageUtils.*;
import com.schemati.compiler.mainLanguage.antlr4.MainBaseVisitor;
import com.schemati.compiler.mainLanguage.antlr4.MainParser;

import java.util.ArrayList;
import java.util.List;

public class SemanticVisitor extends MainBaseVisitor<Object> {
    public Scope globalScope;
    private Scope currentScope;
    boolean isExprCallOnly = true;

    @Override
    public Object visitProg(MainParser.ProgContext ctx) {
        //Programs starts the global scope
        this.globalScope = new Scope("Global", "Global");
        this.currentScope = globalScope;
        if (ctx.children == null) {
            System.out.println("Error make sure program contain at least one statement");
            System.exit(0);
        }
        return visitChildren(ctx);
    }

    /**
     * - Variable type and value to be assigned must match
     * - Variable id cannot be a reserved keyword
     */
    @Override
    public Object visitAssignVar(MainParser.AssignVarContext ctx) {
        //Get variable or attribute of variable type
        isExprCallOnly = false;
        Variable variable = (Variable) visit(ctx.var());
        if(ReservedKeywords.isReserved(variable.getId())) {
            System.out.println(variable.getId() + " is a reserved keyword.");
            System.exit(0);
        }
        Type assignType = (Type) visit(ctx.expr());
        boolean canAssign = variable.getType().canAssign(assignType);
        if (!canAssign) {
            System.out.println("Cannot assign " + variable.getId() + " (" + variable.getType() + ")" +
                    " to " + assignType + ".");
            System.exit(0);
        }
        isExprCallOnly = true;

        return null;
    }

    @Override
    public Object visitExprVar(MainParser.ExprVarContext ctx) {
        if(isExprCallOnly) {
            System.out.println(ctx.getText() + " alone is not valid, you should use it in some of context.");
            System.exit(0);
        }
        Variable variable = (Variable) visit(ctx.var());
        return variable.getType();
    }

    /**
     * - Array variable must be defined in current scope or parent
     */
    @Override
    public Object visitVarArr(MainParser.VarArrContext ctx) {
        Variable variable = currentScope.getVariable(ctx.ID().getText());

        if (variable == null) {
            System.out.println("Variable " + ctx.ID().getText() + " does not exist in this scope or parent.");
            System.exit(0);
        }
        Type indexType = (Type) visit(ctx.expr());
        if (!new IntegerType().canAssign(indexType)) {
            System.out.println("Array " + ctx.ID().getText() + " index must be an Integer.");
            System.exit(0);
        }
        Variable variableArr = new Variable(Type.fromString(variable.getType().toString()), variable.getId());
        return variableArr;
    }


    /**
     * -
     */
    @Override
    public Object visitChangeArr(MainParser.ChangeArrContext ctx) {
        isExprCallOnly = false;
        Variable variable = currentScope.getVariable(ctx.ID().getText());
        if (variable == null) {
            System.out.println("Variable " + ctx.ID().getText() + " does not exist in this scope or parent.");
            System.exit(0);
        }
        if (ctx.op.getText().equals("<<")) {
            for (MainParser.ExprContext exprCtx : ctx.expr()) {
                Type type = (Type) visit(exprCtx);
                if (!variable.getType().canAddToArray(type)) {
                    System.out.println("Expression type " + "(" + type.toString() + ")" + " must match " + variable.getType());
                    System.exit(0);
                }
            }
        } else {
            for (MainParser.ExprContext exprCtx : ctx.expr()) {
                Type type = (Type) visit(exprCtx);
                if (!(type instanceof IntegerType)) {
                    System.out.println("Index to remove must be an Integer type not " + type);
                    System.exit(0);
                }
            }
        }
        isExprCallOnly = true;
        return null;
    }

    /**
     * - Must be already created in current scope or parent scopes
     * - If contains attributes they must exist in variable type
     */
    @Override
    public Object visitVarId(MainParser.VarIdContext ctx) {
        //Check if current scope contains variable
        boolean containsInScope = currentScope.containsInScope(ctx.ID().getText());
        if (!containsInScope) {
            //If not defined in current scope it can be defined in parent scopes
            boolean containsInScopeAndParent = currentScope.containsInScopeAndParent(ctx.ID().getText());
            if (!containsInScopeAndParent) {
                System.out.println("Variable " + ctx.ID().getText() + " does not exist in this scope or parent.");
                System.exit(0);
            }
        }

        Variable variable = currentScope.getVariable(ctx.ID().getText());

        //Check if attributes match type attributes
        int i = 0;
        for (MainParser.AttrContext attrCtx : ctx.attr()) {
            String attrId = (String) visit(attrCtx);
            Variable attribute = variable.getType().getAttribute(attrId);
            if (attribute == null) {
                System.out.println("Variable " + variable.getId() + " (" + variable.getType() + ") " +
                        "type does not contains " + attrId + " attribute.");
                System.exit(0);
            }
            variable = variable.getType().getAttribute(attrId);
        }
        return variable;
    }

    @Override
    public Object visitAttr(MainParser.AttrContext ctx) {
        return ctx.ID().getText();
    }

    /**
     * - Function must be declared in global scope
     * - Function id must be unique
     * - Function id cannot be a reserved keyword
     */
    @Override
    public Object visitAssignFunc(MainParser.AssignFuncContext ctx) {
        if(ReservedKeywords.isReserved(ctx.ID().getText())) {
            System.out.println(ctx.ID().getText() + " is a reserved keyword.");
            System.exit(0);
        }
        //Check if function is being assigned in global scope
        if (!currentScope.isGlobal()) {
            System.out.println("Cannot create a function outside global scope");
            System.exit(0);
        }
        //Check if function id is unique
        Type returnType = Type.fromString(ctx.Type().getText());
        Function function = new Function(ctx.ID().getText(), returnType);
        boolean addedToScope = currentScope.addScopable(function);
        if (!addedToScope) {
            System.out.println("A function named " + ctx.ID().getText() + " already exists.");
            System.exit(0);
        }
        //Create a new scope for current function and make it current scope
        Scope scope = new Scope("Function-" + ctx.ID().getText(), "Function", currentScope);
        currentScope.addChildren(scope);
        currentScope = scope;
        scope.addScopable(function);

        if (ctx.typedArgs() != null) {
            visit(ctx.typedArgs());
        }
        visit(ctx.blockFunc());

        //Make function parent scope the current scope after visit all children
        currentScope = currentScope.getParent();
        return null;
    }

    /**
     * - Must be inside a function scope
     * - Argument id must be unique in function scope
     */
    @Override
    public Object visitTypedArgs(MainParser.TypedArgsContext ctx) {
        //Check if typed arguments are inside function scope
        if (!currentScope.isFunction()) {
            System.out.println("Cannot declare function arguments outside a function");
            System.out.println(0);
        }

        //Check if each argument id is unique and add them to function scope
        Function function = currentScope.toFunction();
        for (MainParser.TypeIDContext argumentCtx : ctx.typeID()) {
            Variable arg = (Variable) visit(argumentCtx);
            boolean addArgument = function.addArgument(arg);
            if (!addArgument) {
                System.out.println("Function " + function.getId() + " already contains an argument named " +
                        arg.getId());
            }
            currentScope.addScopable(arg);
        }

        return null;
    }

    @Override
    public Object visitTypeID(MainParser.TypeIDContext ctx) {
        return new Variable(Type.fromString(ctx.Type().getText()), ctx.ID().getText());
    }

    /**
     * - Must be inside a function scope
     * - Return type must match function return type
     */
    @Override
    public Object visitReturnStat(MainParser.ReturnStatContext ctx) {
        isExprCallOnly = false;
        //Check if return is inside function scope
        Function function = null;
        if (!currentScope.isFunction()) {
            //Return can be inside another scope that belongs to functions
            boolean isNestedReturn = false;
            Scope tmpScope = currentScope;
            while (!tmpScope.isGlobal()) {
                if (tmpScope.isFunction()) {
                    isNestedReturn = true;
                    function = tmpScope.toFunction();
                }
                tmpScope = tmpScope.getParent();
            }
            if (!isNestedReturn) {
                System.out.println("Cannot return values outside functions");
                System.exit(0);
            }
        } else {
            function = currentScope.toFunction();
        }

        //Check if return type matches the function return type;
        Type returnType = (Type) visit(ctx.expr());
        if (!function.getReturnType().canAssign(returnType)) {
            System.out.println(
                    "Function " + function.getId() + " return type is " + function.getReturnType() + "" +
                            " not " + returnType
            );
        }
        isExprCallOnly = true;
        return null;
    }

    /**
     * - Variable type and value to be assigned must match
     * - Variable id must be unique in current scope
     * - Variable id cannot be a reserved keyword
     */
    @Override
    public Object visitCreateVar(MainParser.CreateVarContext ctx) {
        if(ReservedKeywords.isReserved(ctx.ID().getText())) {
            System.out.println(ctx.ID().getText() + " is a reserved keyword.");
            System.exit(0);
        }
        isExprCallOnly = false;
        //Validate variable type and value to be assigned
        Type valueType = (Type) visit(ctx.expr());
        boolean canAssign = Type.fromString(ctx.Type().getText()).canAssign(valueType);
        if (!canAssign) {
            System.out.println("Cannot create variable " + ctx.Type().getText() + " with " + valueType + " expression.");
            System.exit(0);
        }

        //Add variable to current scope
        Variable variable = new Variable(Type.fromString(ctx.Type().getText()), ctx.ID().getText());
        boolean addedToScope = currentScope.addScopable(variable);
        if (!addedToScope) {
            System.out.println("Cannot create variable named " + ctx.ID().getText() + " because already exists.");
            System.exit(0);
        }
        isExprCallOnly = true;
        return variable;
    }

    /**
     * - Expression must be a boolean
     */
    @Override
    public Object visitIfStat(MainParser.IfStatContext ctx) {
        //Check if expression is a boolean
        isExprCallOnly = false;
        Type type = (Type) visit(ctx.expr());
        isExprCallOnly = true;
        if (!(type instanceof BooleanType)) {
            System.out.println("Expression in if statement must be a boolean");
            System.exit(0);
        }

        //Create a new scope
        Scope scope = new Scope("If-" + Math.random(), "If", currentScope);
        currentScope.addChildren(scope);
        currentScope = scope;

        visit(ctx.block());
        if (ctx.elseStat() != null) {
            visit(ctx.elseStat());
        }

        currentScope = scope.getParent();
        return null;
    }

    @Override
    public Object visitElseStat(MainParser.ElseStatContext ctx) {
        if (!currentScope.isIf()) {
            System.out.println("Else is not allowed without an if statement before.");
            System.exit(0);
        }

        //Create a new scope
        Scope scope = new Scope("Else-" + Math.random(), "Else", currentScope);
        //Else is a children of if so that we must do a workaround to bypass this bug in grammar
        scope.setParent(scope.getParent().getParent());

        currentScope = scope;

        visit(ctx.block());

        currentScope = scope.getParent();
        return null;
    }

    /**
     * (CASE FOR)
     * - Must have a valid variable assigment or variable create
     * - Must have a valid comparison
     * - Must have a valid algebraic operation
     * <p>
     * (CASE FOREACH)
     * - Must have a valid variable create
     * - Must have a valid array
     */
    @Override
    public Object visitForStat(MainParser.ForStatContext ctx) {
        //(For)
        if (ctx.each == null) {
            Scope scope = new Scope("For" + Math.random(), "For", currentScope);
            currentScope.addChildren(scope);
            currentScope = scope;
            //Check if variable assigment or variable create is valid
            if (ctx.createVar() != null) {
                scope.addScopable((Variable) visit(ctx.createVar()));
            } else {
                //Needs to check parent scope not self
                currentScope = scope.getParent();
                visit(ctx.assignVar(0));
                currentScope = scope;
            }
            //Check if comparision is valid
            isExprCallOnly = false;
            Type comparisionType = (Type) visit(ctx.end);
            isExprCallOnly = true;
            if (!(comparisionType instanceof BooleanType)) {
                System.out.println("For must contain a valid comparasion to end the loop.");
                System.exit(0);
            }
            //Check if algebraic operation or assigment is valid
            if (ctx.createVar() == null && ctx.assignVar(1) != null) {
                visit(ctx.assignVar(1));
            } else if (ctx.createVar() != null && ctx.assignVar(0) != null) {
                visit(ctx.assignVar(0));
            } else {
                isExprCallOnly = false;
                visit(ctx.expr(1));
                isExprCallOnly = true;
            }

            visit(ctx.block());
            currentScope = scope.getParent();

        } else {
            //(For each)
            Scope scope = new Scope("For" + Math.random(), "For", currentScope);
            currentScope.addChildren(scope);

            Type variableType = Type.fromString(ctx.Type().getText());
            Variable variable = new Variable(variableType, ctx.ID(0).getText());
            Variable array = currentScope.getVariable(ctx.ID(1).getText());
            //Check if array is defined in current scope or parent
            if (array == null) {
                System.out.println("A variable named " + ctx.ID(1).getText() + " does not exists " +
                        "in current scope or parent.");
                System.exit(0);
            }
            //Check if array type matches created var type
            if (!(variable.getType().toString().equals(array.getType().toString()))) {
                System.out.println("Cannot iterate a " + array.getType() + " array using a " + variable.getType() +
                        "variable.");
                System.exit(0);
            }

            scope.addScopable(variable);
            currentScope = scope;
            visit(ctx.block());
            currentScope = scope.getParent();
        }

        return null;
    }

    /**
     * - Must be followed of an id that represents an array of entities in global scope
     */
    @Override
    public Object visitStartCtrl(MainParser.StartCtrlContext ctx) {
        isExprCallOnly = false;
        Variable variable = globalScope.getVariable(ctx.ID().getText());
        if (variable == null) {
            System.out.println("Variable " + ctx.ID().getText() + " does not exist in global scope.");
            System.exit(0);
        }
        if (!variable.getType().isArray()) {
            System.out.println("Start must be followed by an array of type Entity");
            System.out.println(0);
        }
        isExprCallOnly = true;
        return null;
    }

    @Override
    public Object visitPrint(MainParser.PrintContext ctx) {
        isExprCallOnly = false;
        visit(ctx.expr());
        isExprCallOnly = true;
        return null;
    }

    /**
     * - Function id must exist in global scope
     * - Arguments must match
     */
    @Override
    public Object visitFunctionCall(MainParser.FunctionCallContext ctx) {

        //Check if function id exists in global scope because functions can only be declared in global
        Function function = globalScope.getFunction(ctx.ID().getText());
        if (function == null) {
            System.out.println("Function " + ctx.ID().getText() + " does not exist in global scope.");
            System.exit(0);
        }
        //Check if supplied arguments match real function arguments
        List<Variable> suppliedArgs = new ArrayList<>();
        if (ctx.args() != null) {
            suppliedArgs = (List<Variable>) visit(ctx.args());
        }
        for (Variable suppliedArg : suppliedArgs) {
            Variable arg = function.getArgument(suppliedArg.getId());
            if (suppliedArgs.size() != function.getArguments().size()) {
                System.out.println("Function " + ctx.ID().getText() + " " +
                        "must have " + function.getArguments().size() + " arguments.");
                System.exit(0);
            }
            if (arg == null) {
                System.out.println("Function " + ctx.ID().getText() + " " +
                        "does not contain any argument called " + suppliedArg.getId());
                System.exit(0);
            }
            if (!(arg.getType().canAssign(suppliedArg.getType()))) {
                System.out.println("Function " + ctx.ID().getText() + " " +
                        "argument " + arg.getId() + " (" + arg.getType() + ") " +
                        "does not match type " + suppliedArg.getType());
                System.exit(0);
            }
        }

        if (ctx.attr().size() == 0) {
            return function.getReturnType();
        }

        Variable attr = function.getReturnType().getAttribute((String) visit(ctx.attr(0)));
        if (attr == null) {
            System.out.println("test");
            System.exit(0);
        }
        for (int i = 1; i < ctx.attr().size(); i++) {
            attr = attr.getType().getAttribute((String) visit(ctx.attr(i)));
            if (attr == null) {
                System.out.println("ee");
                System.exit(0);
            }
        }
        System.out.println(attr);
        return attr.getType();
    }

    @Override
    public Object visitArgs(MainParser.ArgsContext ctx) {
        List<Variable> args = new ArrayList<>();
        for (int i = 0; i < ctx.ID().size(); i++) {
            Type argType = (Type) visit(ctx.expr(i));
            String argId = ctx.ID(i).getText();
            args.add(new Variable(argType, argId));
        }
        return args;
    }

    /**
     * - Must be inside for loop
     */
    @Override
    public Object visitLoopCtrl(MainParser.LoopCtrlContext ctx) {
        if (!currentScope.isFor()) {
            System.out.println("Break or continue cannot be used outside for loops.");
            System.exit(0);
        }
        return null;
    }

    @Override
    public Object visitAnimStruct(MainParser.AnimStructContext ctx) {
        if (!currentScope.isGlobal()) {
            System.out.println("Animations must be inside global scope.");
            System.exit(0);
        }
        Scope scope = new Scope("Anim" + Math.random(), "Anim", currentScope);
        currentScope.addChildren(scope);
        currentScope = scope;
        visitChildren(ctx);
        currentScope = scope.getParent();
        return null;
    }

    /**
     * - Start expression must be an Integer (Seconds or Milliseconds)
     * - End expression must be an Integer (Seconds or Milliseconds)
     */
    @Override
    public Object visitAtTimeDuring(MainParser.AtTimeDuringContext ctx) {
        if (!currentScope.isAnim()) {
            System.out.println("Timed animations must be inside Anim scope.");
            System.exit(0);
        }
        //Check if start and end expressions are integers
        isExprCallOnly = false;
        Type startType = (Type) visit(ctx.start);
        Type endType = (Type) visit(ctx.start);
        isExprCallOnly = true;
        //Using canAssign because if we compare type string only it would allow Integer[] as a value
        if (!startType.canAssign(new IntegerType()) &&
                (!ctx.start.getText().contains("s") || !ctx.start.getText().contains("ms"))) {
            System.out.println("Animation start must be in seconds or milliseconds");
            System.exit(0);
        }
        if (!endType.canAssign(new IntegerType()) &&
                (!ctx.during.getText().contains("s") || !ctx.during.getText().contains("ms"))) {
            System.out.println("Animation end must be an seconds or milliseconds");
            System.exit(0);
        }
        Scope scope = new Scope("TimedAnim" + Math.random(), "TimedAnim", currentScope);
        currentScope.addChildren(scope);
        currentScope = scope;
        visit(ctx.block());
        currentScope = scope.getParent();

        return null;
    }


    /**
     * - Start expression must be an id that represents event listeners enum
     */
    @Override
    public Object visitAtEventDuring(MainParser.AtEventDuringContext ctx) {
        if (!currentScope.isAnim()) {
            System.out.println("Timed animations must be inside Anim scope.");
            System.exit(0);
        }
        Scope scope = new Scope("EventAnim" + Math.random(), "EventAnim", currentScope);
        currentScope.addChildren(scope);
        currentScope = scope;
        visit(ctx.block());
        currentScope = scope.getParent();
        return null;
    }

    /**
     * - Expressions must be allowed to do algebraic operations between each other
     */
    @Override
    public Object visitExprAddSub(MainParser.ExprAddSubContext ctx) {
        if(isExprCallOnly) {
            System.out.println(ctx.getText() + " alone is not valid, you should use it in some of context.");
            System.exit(0);
        }
        Type firstType = (Type) visit(ctx.e1);
        Type secondType = (Type) visit(ctx.e2);
        boolean canAlgebric = firstType.canAlgebricWith(secondType);
        if (!canAlgebric) {
            System.out.println("Operation " + ctx.op.getText() +
                    " is not allowed between " + firstType + " and " + secondType);
            System.exit(0);
        }
        return Type.fromString(firstType.toString());
    }

    /**
     * - Expressions must be allowed to do algebraic operations between each other
     */
    @Override
    public Object visitExprMultDivMod(MainParser.ExprMultDivModContext ctx) {
        if(isExprCallOnly) {
            System.out.println(ctx.getText() + " alone is not valid, you should use it in some of context.");
            System.exit(0);
        }
        Type firstType = (Type) visit(ctx.e1);
        Type secondType = (Type) visit(ctx.e2);
        boolean canAlgebric = firstType.canAlgebricWith(secondType);
        if (!canAlgebric) {
            System.out.println("Operation " + ctx.op.getText() +
                    " is not allowed between " + firstType + " and " + secondType);
            System.exit(0);
        }
        return Type.fromString(firstType.toString());
    }

    /**
     * - Expressions must be comparable with each other
     */
    @Override
    public Object visitExprComp(MainParser.ExprCompContext ctx) {
        if(isExprCallOnly) {
            System.out.println(ctx.getText() + " alone is not valid, you should use it in some of context.");
            System.exit(0);
        }
        //Check if types are comparable with each other
        Type firstType = (Type) visit(ctx.e1);
        Type secondType = (Type) visit(ctx.e2);
        boolean canCompare = firstType.canCompareWith(secondType);
        if (!canCompare) {
            System.out.println("Cannot compare " + firstType + " with " + secondType);
            System.exit(0);
        }

        return new BooleanType();
    }

    @Override
    public Object visitExprInteger(MainParser.ExprIntegerContext ctx) {
        if(isExprCallOnly) {
            System.out.println(ctx.getText() + " alone is not valid, you should use it in some of context.");
            System.exit(0);
        }
        return new IntegerType();
    }

    @Override
    public Object visitExprBool(MainParser.ExprBoolContext ctx) {
        if(isExprCallOnly) {
            System.out.println(ctx.getText() + " alone is not valid, you should use it in some of context.");
            System.exit(0);
        }
        return new BooleanType();
    }

    @Override
    public Object visitExprStr(MainParser.ExprStrContext ctx) {
        if(isExprCallOnly) {
            System.out.println(ctx.getText() + " alone is not valid, you should use it in some of context.");
            System.exit(0);
        }
        return new StringType();
    }

    @Override
    public Object visitExprVec(MainParser.ExprVecContext ctx) {
        if(isExprCallOnly) {
            System.out.println(ctx.getText() + " alone is not valid, you should use it in some of context.");
            System.exit(0);
        }
        return visit(ctx.vector2());
    }

    @Override
    public Object visitExprColor(MainParser.ExprColorContext ctx) {
        if(isExprCallOnly) {
            System.out.println(ctx.getText() + " alone is not valid, you should use it in some of context.");
            System.exit(0);
        }
        return new ColorType();
    }

    @Override
    public Object visitVector2(MainParser.Vector2Context ctx) {
        if(isExprCallOnly) {
            System.out.println(ctx.getText() + " alone is not valid, you should use it in some of context.");
            System.exit(0);
        }
        return new Vector2Type();
    }

    @Override
    public Object visitExprNull(MainParser.ExprNullContext ctx) {
        if(isExprCallOnly) {
            System.out.println(ctx.getText() + " alone is not valid, you should use it in some of context.");
            System.exit(0);
        }
        return new VoidType();
    }

    @Override
    public Object visitExprDouble(MainParser.ExprDoubleContext ctx) {
        if(isExprCallOnly) {
            System.out.println(ctx.getText() + " alone is not valid, you should use it in some of context.");
            System.exit(0);
        }
        return new DoubleType();
    }

    @Override
    public Object visitExprUnary(MainParser.ExprUnaryContext ctx) {
        if(isExprCallOnly) {
            System.out.println(ctx.getText() + " alone is not valid, you should use it in some of context.");
            System.exit(0);
        }
        Type type = (Type) visit(ctx.expr());
        if (!type.canUnary()) {
            System.out.println("Cannot make an unary operation to " + type + " type.");
            System.exit(0);
        }
        return type;
    }

    @Override
    public Object visitExprMilliseconds(MainParser.ExprMillisecondsContext ctx) {
        if(isExprCallOnly) {
            System.out.println(ctx.getText() + " alone is not valid, you should use it in some of context.");
            System.exit(0);
        }
        return new IntegerType();
    }

    @Override
    public Object visitExprSeconds(MainParser.ExprSecondsContext ctx) {
        if(isExprCallOnly) {
            System.out.println(ctx.getText() + " alone is not valid, you should use it in some of context.");
            System.exit(0);
        }
        return new IntegerType();
    }

    @Override
    public Object visitExprVarDblOp(MainParser.ExprVarDblOpContext ctx) {
        Variable variable = (Variable) visit(ctx.var());
        if (!variable.getType().canAlgebricWith(Type.fromString("Integer"))) {
            System.out.println("Cannot increment/decrement " + variable.getType() + " type.");
            System.exit(0);
        }
        return variable.getType();
    }

    @Override
    public Object visitExprParenthesis(MainParser.ExprParenthesisContext ctx) {
        if(isExprCallOnly) {
            System.out.println(ctx.getText() + " alone is not valid, you should use it in some of context.");
            System.exit(0);
        }
        return visit(ctx.expr());
    }

    @Override
    public Object visitExprArray(MainParser.ExprArrayContext ctx) {
        if(isExprCallOnly) {
            System.out.println(ctx.getText() + " alone is not valid, you should use it in some of context.");
            System.exit(0);
        }
        return new ArrayType();
    }
}
