// Generated from c:/Users/David/Documents/Escola/Curso Superior/Licenciatura/2A.2S/TAC/Mini Compiler python/Mini-compiler-python/PythonParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(PythonParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(PythonParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(PythonParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(PythonParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PythonParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PythonParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#ids}.
	 * @param ctx the parse tree
	 */
	void enterIds(PythonParser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#ids}.
	 * @param ctx the parse tree
	 */
	void exitIds(PythonParser.IdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#numeros}.
	 * @param ctx the parse tree
	 */
	void enterNumeros(PythonParser.NumerosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#numeros}.
	 * @param ctx the parse tree
	 */
	void exitNumeros(PythonParser.NumerosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(PythonParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(PythonParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#booleans}.
	 * @param ctx the parse tree
	 */
	void enterBooleans(PythonParser.BooleansContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#booleans}.
	 * @param ctx the parse tree
	 */
	void exitBooleans(PythonParser.BooleansContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(PythonParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(PythonParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(PythonParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(PythonParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(PythonParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(PythonParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#args_list}.
	 * @param ctx the parse tree
	 */
	void enterArgs_list(PythonParser.Args_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#args_list}.
	 * @param ctx the parse tree
	 */
	void exitArgs_list(PythonParser.Args_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(PythonParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(PythonParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(PythonParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(PythonParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#loop_while}.
	 * @param ctx the parse tree
	 */
	void enterLoop_while(PythonParser.Loop_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#loop_while}.
	 * @param ctx the parse tree
	 */
	void exitLoop_while(PythonParser.Loop_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#loop_for}.
	 * @param ctx the parse tree
	 */
	void enterLoop_for(PythonParser.Loop_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#loop_for}.
	 * @param ctx the parse tree
	 */
	void exitLoop_for(PythonParser.Loop_forContext ctx);
}