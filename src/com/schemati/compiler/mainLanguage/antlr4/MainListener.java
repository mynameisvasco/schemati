// Generated from Main.g4 by ANTLR 4.8

package com.schemati.compiler.mainLanguage.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MainParser}.
 */
public interface MainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MainParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MainParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MainParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#controlStruct}.
	 * @param ctx the parse tree
	 */
	void enterControlStruct(MainParser.ControlStructContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#controlStruct}.
	 * @param ctx the parse tree
	 */
	void exitControlStruct(MainParser.ControlStructContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#animStruct}.
	 * @param ctx the parse tree
	 */
	void enterAnimStruct(MainParser.AnimStructContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#animStruct}.
	 * @param ctx the parse tree
	 */
	void exitAnimStruct(MainParser.AnimStructContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MainParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MainParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#createVar}.
	 * @param ctx the parse tree
	 */
	void enterCreateVar(MainParser.CreateVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#createVar}.
	 * @param ctx the parse tree
	 */
	void exitCreateVar(MainParser.CreateVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void enterAssignVar(MainParser.AssignVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void exitAssignVar(MainParser.AssignVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#assignFunc}.
	 * @param ctx the parse tree
	 */
	void enterAssignFunc(MainParser.AssignFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#assignFunc}.
	 * @param ctx the parse tree
	 */
	void exitAssignFunc(MainParser.AssignFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#changeArr}.
	 * @param ctx the parse tree
	 */
	void enterChangeArr(MainParser.ChangeArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#changeArr}.
	 * @param ctx the parse tree
	 */
	void exitChangeArr(MainParser.ChangeArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(MainParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(MainParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MainParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MainParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#loopCtrl}.
	 * @param ctx the parse tree
	 */
	void enterLoopCtrl(MainParser.LoopCtrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#loopCtrl}.
	 * @param ctx the parse tree
	 */
	void exitLoopCtrl(MainParser.LoopCtrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MainParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MainParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#blockFunc}.
	 * @param ctx the parse tree
	 */
	void enterBlockFunc(MainParser.BlockFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#blockFunc}.
	 * @param ctx the parse tree
	 */
	void exitBlockFunc(MainParser.BlockFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(MainParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(MainParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(MainParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(MainParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#atTimeDuring}.
	 * @param ctx the parse tree
	 */
	void enterAtTimeDuring(MainParser.AtTimeDuringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#atTimeDuring}.
	 * @param ctx the parse tree
	 */
	void exitAtTimeDuring(MainParser.AtTimeDuringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#atEventDuring}.
	 * @param ctx the parse tree
	 */
	void enterAtEventDuring(MainParser.AtEventDuringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#atEventDuring}.
	 * @param ctx the parse tree
	 */
	void exitAtEventDuring(MainParser.AtEventDuringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#forStat}.
	 * @param ctx the parse tree
	 */
	void enterForStat(MainParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#forStat}.
	 * @param ctx the parse tree
	 */
	void exitForStat(MainParser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#startCtrl}.
	 * @param ctx the parse tree
	 */
	void enterStartCtrl(MainParser.StartCtrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#startCtrl}.
	 * @param ctx the parse tree
	 */
	void exitStartCtrl(MainParser.StartCtrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVar(MainParser.ExprVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVar(MainParser.ExprVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDouble}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDouble(MainParser.ExprDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDouble}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDouble(MainParser.ExprDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprComp}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprComp(MainParser.ExprCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprComp}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprComp(MainParser.ExprCompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSeconds}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSeconds(MainParser.ExprSecondsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSeconds}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSeconds(MainParser.ExprSecondsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprColor}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprColor(MainParser.ExprColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprColor}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprColor(MainParser.ExprColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParenthesis(MainParser.ExprParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParenthesis(MainParser.ExprParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMilliseconds}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMilliseconds(MainParser.ExprMillisecondsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMilliseconds}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMilliseconds(MainParser.ExprMillisecondsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVec}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVec(MainParser.ExprVecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVec}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVec(MainParser.ExprVecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStr}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprStr(MainParser.ExprStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStr}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprStr(MainParser.ExprStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprArray}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprArray(MainParser.ExprArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprArray}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprArray(MainParser.ExprArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDivMod(MainParser.ExprMultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDivMod(MainParser.ExprMultDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(MainParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(MainParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(MainParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(MainParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFunCall}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFunCall(MainParser.ExprFunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFunCall}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFunCall(MainParser.ExprFunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVarDblOp}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVarDblOp(MainParser.ExprVarDblOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVarDblOp}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVarDblOp(MainParser.ExprVarDblOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNull}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNull(MainParser.ExprNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNull}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNull(MainParser.ExprNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(MainParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(MainParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBool}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBool(MainParser.ExprBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBool}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBool(MainParser.ExprBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MainParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MainParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(MainParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(MainParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#typedArgs}.
	 * @param ctx the parse tree
	 */
	void enterTypedArgs(MainParser.TypedArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#typedArgs}.
	 * @param ctx the parse tree
	 */
	void exitTypedArgs(MainParser.TypedArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#typeID}.
	 * @param ctx the parse tree
	 */
	void enterTypeID(MainParser.TypeIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#typeID}.
	 * @param ctx the parse tree
	 */
	void exitTypeID(MainParser.TypeIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarArr}
	 * labeled alternative in {@link MainParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVarArr(MainParser.VarArrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarArr}
	 * labeled alternative in {@link MainParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVarArr(MainParser.VarArrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarId}
	 * labeled alternative in {@link MainParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVarId(MainParser.VarIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarId}
	 * labeled alternative in {@link MainParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVarId(MainParser.VarIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(MainParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(MainParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#vector2}.
	 * @param ctx the parse tree
	 */
	void enterVector2(MainParser.Vector2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#vector2}.
	 * @param ctx the parse tree
	 */
	void exitVector2(MainParser.Vector2Context ctx);
}