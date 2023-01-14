// Generated from java-escape by ANTLR 4.11.1

    package gram;
    import compilador.*;
    import java.io.*;
    import java.util.Deque;
    import java.util.ArrayDeque;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(testParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(testParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(testParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(testParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#declArray}.
	 * @param ctx the parse tree
	 */
	void enterDeclArray(testParser.DeclArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#declArray}.
	 * @param ctx the parse tree
	 */
	void exitDeclArray(testParser.DeclArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#declArray_}.
	 * @param ctx the parse tree
	 */
	void enterDeclArray_(testParser.DeclArray_Context ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#declArray_}.
	 * @param ctx the parse tree
	 */
	void exitDeclArray_(testParser.DeclArray_Context ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(testParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(testParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#encabezado}.
	 * @param ctx the parse tree
	 */
	void enterEncabezado(testParser.EncabezadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#encabezado}.
	 * @param ctx the parse tree
	 */
	void exitEncabezado(testParser.EncabezadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(testParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(testParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(testParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(testParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#sents}.
	 * @param ctx the parse tree
	 */
	void enterSents(testParser.SentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#sents}.
	 * @param ctx the parse tree
	 */
	void exitSents(testParser.SentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#sents_}.
	 * @param ctx the parse tree
	 */
	void enterSents_(testParser.Sents_Context ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#sents_}.
	 * @param ctx the parse tree
	 */
	void exitSents_(testParser.Sents_Context ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(testParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(testParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#contcase}.
	 * @param ctx the parse tree
	 */
	void enterContcase(testParser.ContcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#contcase}.
	 * @param ctx the parse tree
	 */
	void exitContcase(testParser.ContcaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#contcase_}.
	 * @param ctx the parse tree
	 */
	void enterContcase_(testParser.Contcase_Context ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#contcase_}.
	 * @param ctx the parse tree
	 */
	void exitContcase_(testParser.Contcase_Context ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#caso}.
	 * @param ctx the parse tree
	 */
	void enterCaso(testParser.CasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#caso}.
	 * @param ctx the parse tree
	 */
	void exitCaso(testParser.CasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#endcase}.
	 * @param ctx the parse tree
	 */
	void enterEndcase(testParser.EndcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#endcase}.
	 * @param ctx the parse tree
	 */
	void exitEndcase(testParser.EndcaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#referencia}.
	 * @param ctx the parse tree
	 */
	void enterReferencia(testParser.ReferenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#referencia}.
	 * @param ctx the parse tree
	 */
	void exitReferencia(testParser.ReferenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#idx}.
	 * @param ctx the parse tree
	 */
	void enterIdx(testParser.IdxContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#idx}.
	 * @param ctx the parse tree
	 */
	void exitIdx(testParser.IdxContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#idx_}.
	 * @param ctx the parse tree
	 */
	void enterIdx_(testParser.Idx_Context ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#idx_}.
	 * @param ctx the parse tree
	 */
	void exitIdx_(testParser.Idx_Context ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#contIdx}.
	 * @param ctx the parse tree
	 */
	void enterContIdx(testParser.ContIdxContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#contIdx}.
	 * @param ctx the parse tree
	 */
	void exitContIdx(testParser.ContIdxContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#contIdx_}.
	 * @param ctx the parse tree
	 */
	void enterContIdx_(testParser.ContIdx_Context ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#contIdx_}.
	 * @param ctx the parse tree
	 */
	void exitContIdx_(testParser.ContIdx_Context ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(testParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(testParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#exprOr}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(testParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#exprOr}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(testParser.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#exprOr_}.
	 * @param ctx the parse tree
	 */
	void enterExprOr_(testParser.ExprOr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#exprOr_}.
	 * @param ctx the parse tree
	 */
	void exitExprOr_(testParser.ExprOr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#exprAnd}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(testParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#exprAnd}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(testParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#exprAnd_}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd_(testParser.ExprAnd_Context ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#exprAnd_}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd_(testParser.ExprAnd_Context ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#exprNot}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(testParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#exprNot}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(testParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#exprComp}.
	 * @param ctx the parse tree
	 */
	void enterExprComp(testParser.ExprCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#exprComp}.
	 * @param ctx the parse tree
	 */
	void exitExprComp(testParser.ExprCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#exprComp_}.
	 * @param ctx the parse tree
	 */
	void enterExprComp_(testParser.ExprComp_Context ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#exprComp_}.
	 * @param ctx the parse tree
	 */
	void exitExprComp_(testParser.ExprComp_Context ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#exprAdit}.
	 * @param ctx the parse tree
	 */
	void enterExprAdit(testParser.ExprAditContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#exprAdit}.
	 * @param ctx the parse tree
	 */
	void exitExprAdit(testParser.ExprAditContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#exprAdit_}.
	 * @param ctx the parse tree
	 */
	void enterExprAdit_(testParser.ExprAdit_Context ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#exprAdit_}.
	 * @param ctx the parse tree
	 */
	void exitExprAdit_(testParser.ExprAdit_Context ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#exprMult}.
	 * @param ctx the parse tree
	 */
	void enterExprMult(testParser.ExprMultContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#exprMult}.
	 * @param ctx the parse tree
	 */
	void exitExprMult(testParser.ExprMultContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#exprMult_}.
	 * @param ctx the parse tree
	 */
	void enterExprMult_(testParser.ExprMult_Context ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#exprMult_}.
	 * @param ctx the parse tree
	 */
	void exitExprMult_(testParser.ExprMult_Context ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#exprNeg}.
	 * @param ctx the parse tree
	 */
	void enterExprNeg(testParser.ExprNegContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#exprNeg}.
	 * @param ctx the parse tree
	 */
	void exitExprNeg(testParser.ExprNegContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#primario}.
	 * @param ctx the parse tree
	 */
	void enterPrimario(testParser.PrimarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#primario}.
	 * @param ctx the parse tree
	 */
	void exitPrimario(testParser.PrimarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(testParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(testParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(testParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(testParser.LiteralContext ctx);
}