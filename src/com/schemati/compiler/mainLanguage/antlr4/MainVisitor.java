// Generated from Main.g4 by ANTLR 4.8

package com.schemati.compiler.mainLanguage.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MainParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MainVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MainParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MainParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#controlStruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlStruct(MainParser.ControlStructContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#animStruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimStruct(MainParser.AnimStructContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(MainParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#createVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateVar(MainParser.CreateVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#assignVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVar(MainParser.AssignVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#assignFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignFunc(MainParser.AssignFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#changeArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeArr(MainParser.ChangeArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(MainParser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MainParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#loopCtrl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopCtrl(MainParser.LoopCtrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MainParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#blockFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockFunc(MainParser.BlockFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(MainParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#elseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStat(MainParser.ElseStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#atTimeDuring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtTimeDuring(MainParser.AtTimeDuringContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#atEventDuring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtEventDuring(MainParser.AtEventDuringContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#forStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(MainParser.ForStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#startCtrl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartCtrl(MainParser.StartCtrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVar(MainParser.ExprVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDouble}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDouble(MainParser.ExprDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprComp}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComp(MainParser.ExprCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSeconds}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSeconds(MainParser.ExprSecondsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprColor}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprColor(MainParser.ExprColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParenthesis(MainParser.ExprParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMilliseconds}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMilliseconds(MainParser.ExprMillisecondsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVec}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVec(MainParser.ExprVecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStr}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStr(MainParser.ExprStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprArray}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArray(MainParser.ExprArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDivMod(MainParser.ExprMultDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(MainParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnary(MainParser.ExprUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFunCall}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFunCall(MainParser.ExprFunCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVarDblOp}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVarDblOp(MainParser.ExprVarDblOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNull}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNull(MainParser.ExprNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInteger(MainParser.ExprIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBool}
	 * labeled alternative in {@link MainParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBool(MainParser.ExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(MainParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(MainParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#typedArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedArgs(MainParser.TypedArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#typeID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeID(MainParser.TypeIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarArr}
	 * labeled alternative in {@link MainParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarArr(MainParser.VarArrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarId}
	 * labeled alternative in {@link MainParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarId(MainParser.VarIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(MainParser.AttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#vector2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector2(MainParser.Vector2Context ctx);
}