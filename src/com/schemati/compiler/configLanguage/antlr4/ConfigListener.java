// Generated from Config.g4 by ANTLR 4.8

package com.schemati.compiler.configLanguage.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ConfigParser}.
 */
public interface ConfigListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ConfigParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ConfigParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ConfigParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#headers}.
	 * @param ctx the parse tree
	 */
	void enterHeaders(ConfigParser.HeadersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#headers}.
	 * @param ctx the parse tree
	 */
	void exitHeaders(ConfigParser.HeadersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(ConfigParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(ConfigParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#load}.
	 * @param ctx the parse tree
	 */
	void enterLoad(ConfigParser.LoadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#load}.
	 * @param ctx the parse tree
	 */
	void exitLoad(ConfigParser.LoadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#scene}.
	 * @param ctx the parse tree
	 */
	void enterScene(ConfigParser.SceneContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#scene}.
	 * @param ctx the parse tree
	 */
	void exitScene(ConfigParser.SceneContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(ConfigParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(ConfigParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#width}.
	 * @param ctx the parse tree
	 */
	void enterWidth(ConfigParser.WidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#width}.
	 * @param ctx the parse tree
	 */
	void exitWidth(ConfigParser.WidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#height}.
	 * @param ctx the parse tree
	 */
	void enterHeight(ConfigParser.HeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#height}.
	 * @param ctx the parse tree
	 */
	void exitHeight(ConfigParser.HeightContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#scale}.
	 * @param ctx the parse tree
	 */
	void enterScale(ConfigParser.ScaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#scale}.
	 * @param ctx the parse tree
	 */
	void exitScale(ConfigParser.ScaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#background}.
	 * @param ctx the parse tree
	 */
	void enterBackground(ConfigParser.BackgroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#background}.
	 * @param ctx the parse tree
	 */
	void exitBackground(ConfigParser.BackgroundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarLocal}
	 * labeled alternative in {@link ConfigParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVarLocal(ConfigParser.VarLocalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarLocal}
	 * labeled alternative in {@link ConfigParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVarLocal(ConfigParser.VarLocalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarLoad}
	 * labeled alternative in {@link ConfigParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVarLoad(ConfigParser.VarLoadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarLoad}
	 * labeled alternative in {@link ConfigParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVarLoad(ConfigParser.VarLoadContext ctx);
}