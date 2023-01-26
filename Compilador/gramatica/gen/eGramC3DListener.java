// Generated from java-escape by ANTLR 4.11.1

package gram;
import compilador.*;
import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link eGramC3D}.
 */
public interface eGramC3DListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link eGramC3D#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(eGramC3D.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(eGramC3D.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(eGramC3D.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(eGramC3D.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#declAndFunc}.
	 * @param ctx the parse tree
	 */
	void enterDeclAndFunc(eGramC3D.DeclAndFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#declAndFunc}.
	 * @param ctx the parse tree
	 */
	void exitDeclAndFunc(eGramC3D.DeclAndFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(eGramC3D.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(eGramC3D.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#funcs}.
	 * @param ctx the parse tree
	 */
	void enterFuncs(eGramC3D.FuncsContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#funcs}.
	 * @param ctx the parse tree
	 */
	void exitFuncs(eGramC3D.FuncsContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#sents}.
	 * @param ctx the parse tree
	 */
	void enterSents(eGramC3D.SentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#sents}.
	 * @param ctx the parse tree
	 */
	void exitSents(eGramC3D.SentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#sents_}.
	 * @param ctx the parse tree
	 */
	void enterSents_(eGramC3D.Sents_Context ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#sents_}.
	 * @param ctx the parse tree
	 */
	void exitSents_(eGramC3D.Sents_Context ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(eGramC3D.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(eGramC3D.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(eGramC3D.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(eGramC3D.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(eGramC3D.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(eGramC3D.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(eGramC3D.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(eGramC3D.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#declArray}.
	 * @param ctx the parse tree
	 */
	void enterDeclArray(eGramC3D.DeclArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#declArray}.
	 * @param ctx the parse tree
	 */
	void exitDeclArray(eGramC3D.DeclArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#declArray_}.
	 * @param ctx the parse tree
	 */
	void enterDeclArray_(eGramC3D.DeclArray_Context ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#declArray_}.
	 * @param ctx the parse tree
	 */
	void exitDeclArray_(eGramC3D.DeclArray_Context ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(eGramC3D.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(eGramC3D.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(eGramC3D.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(eGramC3D.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#idx}.
	 * @param ctx the parse tree
	 */
	void enterIdx(eGramC3D.IdxContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#idx}.
	 * @param ctx the parse tree
	 */
	void exitIdx(eGramC3D.IdxContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#idx_}.
	 * @param ctx the parse tree
	 */
	void enterIdx_(eGramC3D.Idx_Context ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#idx_}.
	 * @param ctx the parse tree
	 */
	void exitIdx_(eGramC3D.Idx_Context ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#contIdx}.
	 * @param ctx the parse tree
	 */
	void enterContIdx(eGramC3D.ContIdxContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#contIdx}.
	 * @param ctx the parse tree
	 */
	void exitContIdx(eGramC3D.ContIdxContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#contIdx_}.
	 * @param ctx the parse tree
	 */
	void enterContIdx_(eGramC3D.ContIdx_Context ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#contIdx_}.
	 * @param ctx the parse tree
	 */
	void exitContIdx_(eGramC3D.ContIdx_Context ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(eGramC3D.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(eGramC3D.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#exprOr}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(eGramC3D.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#exprOr}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(eGramC3D.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#exprOr_}.
	 * @param ctx the parse tree
	 */
	void enterExprOr_(eGramC3D.ExprOr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#exprOr_}.
	 * @param ctx the parse tree
	 */
	void exitExprOr_(eGramC3D.ExprOr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#exprAnd}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(eGramC3D.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#exprAnd}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(eGramC3D.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#exprAnd_}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd_(eGramC3D.ExprAnd_Context ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#exprAnd_}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd_(eGramC3D.ExprAnd_Context ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#exprNot}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(eGramC3D.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#exprNot}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(eGramC3D.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#exprComp}.
	 * @param ctx the parse tree
	 */
	void enterExprComp(eGramC3D.ExprCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#exprComp}.
	 * @param ctx the parse tree
	 */
	void exitExprComp(eGramC3D.ExprCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#exprComp_}.
	 * @param ctx the parse tree
	 */
	void enterExprComp_(eGramC3D.ExprComp_Context ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#exprComp_}.
	 * @param ctx the parse tree
	 */
	void exitExprComp_(eGramC3D.ExprComp_Context ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#exprAdd}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(eGramC3D.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#exprAdd}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(eGramC3D.ExprAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#exprAdd_}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd_(eGramC3D.ExprAdd_Context ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#exprAdd_}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd_(eGramC3D.ExprAdd_Context ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#exprMult}.
	 * @param ctx the parse tree
	 */
	void enterExprMult(eGramC3D.ExprMultContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#exprMult}.
	 * @param ctx the parse tree
	 */
	void exitExprMult(eGramC3D.ExprMultContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#exprMult_}.
	 * @param ctx the parse tree
	 */
	void enterExprMult_(eGramC3D.ExprMult_Context ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#exprMult_}.
	 * @param ctx the parse tree
	 */
	void exitExprMult_(eGramC3D.ExprMult_Context ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#exprNeg}.
	 * @param ctx the parse tree
	 */
	void enterExprNeg(eGramC3D.ExprNegContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#exprNeg}.
	 * @param ctx the parse tree
	 */
	void exitExprNeg(eGramC3D.ExprNegContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(eGramC3D.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(eGramC3D.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#type}.
	 * @param ctx the parse tree
	 */
	void enterType(eGramC3D.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#type}.
	 * @param ctx the parse tree
	 */
	void exitType(eGramC3D.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramC3D#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(eGramC3D.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramC3D#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(eGramC3D.LiteralContext ctx);
}