// Generated from Config.g4 by ANTLR 4.8

package com.schemati.compiler.configLanguage.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ConfigParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ConfigVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ConfigParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ConfigParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#headers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaders(ConfigParser.HeadersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(ConfigParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#load}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoad(ConfigParser.LoadContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#scene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScene(ConfigParser.SceneContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(ConfigParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(ConfigParser.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#height}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeight(ConfigParser.HeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#scale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale(ConfigParser.ScaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#background}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackground(ConfigParser.BackgroundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarLocal}
	 * labeled alternative in {@link ConfigParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarLocal(ConfigParser.VarLocalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarLoad}
	 * labeled alternative in {@link ConfigParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarLoad(ConfigParser.VarLoadContext ctx);
}