// Generated from java-escape by ANTLR 4.11.1

package gram;
import compilador.*;
import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link eGramC3D}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface eGramC3DVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link eGramC3D#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(eGramC3D.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(eGramC3D.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#declAndFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclAndFunc(eGramC3D.DeclAndFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(eGramC3D.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#funcs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncs(eGramC3D.FuncsContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#sents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSents(eGramC3D.SentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#sents_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSents_(eGramC3D.Sents_Context ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(eGramC3D.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(eGramC3D.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(eGramC3D.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(eGramC3D.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#declArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclArray(eGramC3D.DeclArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#declArray_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclArray_(eGramC3D.DeclArray_Context ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(eGramC3D.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(eGramC3D.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#idx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdx(eGramC3D.IdxContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#idx_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdx_(eGramC3D.Idx_Context ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#contIdx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContIdx(eGramC3D.ContIdxContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#contIdx_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContIdx_(eGramC3D.ContIdx_Context ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(eGramC3D.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#exprOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(eGramC3D.ExprOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#exprOr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr_(eGramC3D.ExprOr_Context ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#exprAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(eGramC3D.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#exprAnd_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd_(eGramC3D.ExprAnd_Context ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#exprNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(eGramC3D.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#exprComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComp(eGramC3D.ExprCompContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#exprComp_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComp_(eGramC3D.ExprComp_Context ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#exprAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdd(eGramC3D.ExprAddContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#exprAdd_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdd_(eGramC3D.ExprAdd_Context ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#exprMult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMult(eGramC3D.ExprMultContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#exprMult_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMult_(eGramC3D.ExprMult_Context ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#exprNeg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNeg(eGramC3D.ExprNegContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(eGramC3D.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(eGramC3D.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(eGramC3D.LiteralContext ctx);
}