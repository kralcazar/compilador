// Generated from java-escape by ANTLR 4.11.1

package gram;
import compilador.*;
import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link eGramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface eGramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link eGramParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(eGramParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(eGramParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(eGramParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#arrayDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDecl(eGramParser.ArrayDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#arrayDecl_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDecl_(eGramParser.ArrayDecl_Context ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(eGramParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(eGramParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(eGramParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(eGramParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#sentsVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentsVoid(eGramParser.SentsVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#sents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSents(eGramParser.SentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#sents_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSents_(eGramParser.Sents_Context ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(eGramParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(eGramParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#idx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdx(eGramParser.IdxContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#idx_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdx_(eGramParser.Idx_Context ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#contIdx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContIdx(eGramParser.ContIdxContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#contIdx_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContIdx_(eGramParser.ContIdx_Context ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(eGramParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#exprOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(eGramParser.ExprOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#exprOr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr_(eGramParser.ExprOr_Context ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#exprAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(eGramParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#exprAnd_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd_(eGramParser.ExprAnd_Context ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#exprNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(eGramParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#exprComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComp(eGramParser.ExprCompContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#exprComp_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComp_(eGramParser.ExprComp_Context ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#exprAdit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdit(eGramParser.ExprAditContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#exprAdit_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdit_(eGramParser.ExprAdit_Context ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#exprMult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMult(eGramParser.ExprMultContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#exprMult_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMult_(eGramParser.ExprMult_Context ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#exprNeg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNeg(eGramParser.ExprNegContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(eGramParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(eGramParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(eGramParser.LiteralContext ctx);
}