// Generated from java-escape by ANTLR 4.11.1

package gram;
import compilador.*;
import compilador.Instruction.OP;
import compilador.Symbol.Types;
import compilador.Symbol.DataTypes;
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
	 * Visit a parse tree produced by {@link eGramC3D#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(eGramC3D.DeclContext ctx);
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
	 * Visit a parse tree produced by {@link eGramC3D#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(eGramC3D.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#encabezado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncabezado(eGramC3D.EncabezadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(eGramC3D.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(eGramC3D.ParametroContext ctx);
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
	 * Visit a parse tree produced by {@link eGramC3D#contcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContcase(eGramC3D.ContcaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#contcase_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContcase_(eGramC3D.Contcase_Context ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso(eGramC3D.CasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#endcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndcase(eGramC3D.EndcaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#referencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencia(eGramC3D.ReferenciaContext ctx);
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
	 * Visit a parse tree produced by {@link eGramC3D#exprAdit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdit(eGramC3D.ExprAditContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#exprAdit_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdit_(eGramC3D.ExprAdit_Context ctx);
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
	 * Visit a parse tree produced by {@link eGramC3D#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimario(eGramC3D.PrimarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(eGramC3D.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link eGramC3D#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(eGramC3D.LiteralContext ctx);
}