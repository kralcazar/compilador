// Generated from java-escape by ANTLR 4.11.1

    package gram;
    import compilador.*;
    import java.io.*;
    import java.util.Deque;
    import java.util.ArrayDeque;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link eGramParser}.
 */
public interface eGramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link eGramParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(eGramParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(eGramParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(eGramParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(eGramParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(eGramParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(eGramParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#funcs}.
	 * @param ctx the parse tree
	 */
	void enterFuncs(eGramParser.FuncsContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#funcs}.
	 * @param ctx the parse tree
	 */
	void exitFuncs(eGramParser.FuncsContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#sents}.
	 * @param ctx the parse tree
	 */
	void enterSents(eGramParser.SentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#sents}.
	 * @param ctx the parse tree
	 */
	void exitSents(eGramParser.SentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#sents_}.
	 * @param ctx the parse tree
	 */
	void enterSents_(eGramParser.Sents_Context ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#sents_}.
	 * @param ctx the parse tree
	 */
	void exitSents_(eGramParser.Sents_Context ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(eGramParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(eGramParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(eGramParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(eGramParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(eGramParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(eGramParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(eGramParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(eGramParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDecl(eGramParser.ArrayDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDecl(eGramParser.ArrayDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#arrayDecl_}.
	 * @param ctx the parse tree
	 */
	void enterArrayDecl_(eGramParser.ArrayDecl_Context ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#arrayDecl_}.
	 * @param ctx the parse tree
	 */
	void exitArrayDecl_(eGramParser.ArrayDecl_Context ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(eGramParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(eGramParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(eGramParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(eGramParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#idx}.
	 * @param ctx the parse tree
	 */
	void enterIdx(eGramParser.IdxContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#idx}.
	 * @param ctx the parse tree
	 */
	void exitIdx(eGramParser.IdxContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#idx_}.
	 * @param ctx the parse tree
	 */
	void enterIdx_(eGramParser.Idx_Context ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#idx_}.
	 * @param ctx the parse tree
	 */
	void exitIdx_(eGramParser.Idx_Context ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#contIdx}.
	 * @param ctx the parse tree
	 */
	void enterContIdx(eGramParser.ContIdxContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#contIdx}.
	 * @param ctx the parse tree
	 */
	void exitContIdx(eGramParser.ContIdxContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#contIdx_}.
	 * @param ctx the parse tree
	 */
	void enterContIdx_(eGramParser.ContIdx_Context ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#contIdx_}.
	 * @param ctx the parse tree
	 */
	void exitContIdx_(eGramParser.ContIdx_Context ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(eGramParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(eGramParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#exprOr}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(eGramParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#exprOr}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(eGramParser.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#exprOr_}.
	 * @param ctx the parse tree
	 */
	void enterExprOr_(eGramParser.ExprOr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#exprOr_}.
	 * @param ctx the parse tree
	 */
	void exitExprOr_(eGramParser.ExprOr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#exprAnd}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(eGramParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#exprAnd}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(eGramParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#exprAnd_}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd_(eGramParser.ExprAnd_Context ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#exprAnd_}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd_(eGramParser.ExprAnd_Context ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#exprNot}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(eGramParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#exprNot}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(eGramParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#exprComp}.
	 * @param ctx the parse tree
	 */
	void enterExprComp(eGramParser.ExprCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#exprComp}.
	 * @param ctx the parse tree
	 */
	void exitExprComp(eGramParser.ExprCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#exprComp_}.
	 * @param ctx the parse tree
	 */
	void enterExprComp_(eGramParser.ExprComp_Context ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#exprComp_}.
	 * @param ctx the parse tree
	 */
	void exitExprComp_(eGramParser.ExprComp_Context ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#exprAdd}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(eGramParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#exprAdd}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(eGramParser.ExprAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#exprAdd_}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd_(eGramParser.ExprAdd_Context ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#exprAdd_}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd_(eGramParser.ExprAdd_Context ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#exprMult}.
	 * @param ctx the parse tree
	 */
	void enterExprMult(eGramParser.ExprMultContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#exprMult}.
	 * @param ctx the parse tree
	 */
	void exitExprMult(eGramParser.ExprMultContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#exprMult_}.
	 * @param ctx the parse tree
	 */
	void enterExprMult_(eGramParser.ExprMult_Context ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#exprMult_}.
	 * @param ctx the parse tree
	 */
	void exitExprMult_(eGramParser.ExprMult_Context ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#exprNeg}.
	 * @param ctx the parse tree
	 */
	void enterExprNeg(eGramParser.ExprNegContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#exprNeg}.
	 * @param ctx the parse tree
	 */
	void exitExprNeg(eGramParser.ExprNegContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(eGramParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(eGramParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(eGramParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(eGramParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link eGramParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(eGramParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link eGramParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(eGramParser.LiteralContext ctx);
}