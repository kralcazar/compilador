// Generated from java-escape by ANTLR 4.11.1

    package gram;
    import compilador.*;
    import java.io.*;
    import java.util.Deque;
    import java.util.ArrayDeque;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link testParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface testVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link testParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(testParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(testParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#declArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclArray(testParser.DeclArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#declArray_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclArray_(testParser.DeclArray_Context ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(testParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#encabezado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncabezado(testParser.EncabezadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(testParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(testParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#sents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSents(testParser.SentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#sents_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSents_(testParser.Sents_Context ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(testParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#contcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContcase(testParser.ContcaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#contcase_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContcase_(testParser.Contcase_Context ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso(testParser.CasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#endcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndcase(testParser.EndcaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#referencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencia(testParser.ReferenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#idx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdx(testParser.IdxContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#idx_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdx_(testParser.Idx_Context ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#contIdx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContIdx(testParser.ContIdxContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#contIdx_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContIdx_(testParser.ContIdx_Context ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(testParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#exprOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(testParser.ExprOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#exprOr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr_(testParser.ExprOr_Context ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#exprAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(testParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#exprAnd_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd_(testParser.ExprAnd_Context ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#exprNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(testParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#exprComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComp(testParser.ExprCompContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#exprComp_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComp_(testParser.ExprComp_Context ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#exprAdit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdit(testParser.ExprAditContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#exprAdit_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdit_(testParser.ExprAdit_Context ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#exprMult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMult(testParser.ExprMultContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#exprMult_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMult_(testParser.ExprMult_Context ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#exprNeg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNeg(testParser.ExprNegContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimario(testParser.PrimarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(testParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(testParser.LiteralContext ctx);
}