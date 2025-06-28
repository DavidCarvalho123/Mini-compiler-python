// Generated from c:/Users/David/Documents/Escola/Curso Superior/Licenciatura/2A.2S/TAC/Mini Compiler python/Mini-compiler-python/PythonParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULT=3, DIV=4, FLOOR_DIV=5, MOD=6, EXP=7, EQ=8, NEQ=9, 
		LT=10, LTE=11, GT=12, GTE=13, AND=14, OR=15, NOT=16, ASSIGN=17, ADD_ASSIGN=18, 
		SUB_ASSIGN=19, MUL_ASSIGN=20, DIV_ASSIGN=21, FLOOR_DIV_ASSIGN=22, MOD_ASSIGN=23, 
		EXP_ASSIGN=24, LPAREN=25, RPAREN=26, NEWLINE=27, COMMA=28, QUOTE=29, SINGLE_QUOTE=30, 
		COLON=31, IF=32, ELIF=33, ELSE=34, WHILE=35, FOR=36, DEF=37, TRY=38, EXCEPT=39, 
		FINALLY=40, WITH=41, INT=42, FLOAT=43, STRING=44, BOOL=45, LIST=46, DICT=47, 
		TUPLE=48, NONE=49, TRUE=50, FALSE=51, PRINT=52, INPUT=53, LEN=54, IMPORT=55, 
		FROM=56, AS=57, IN=58, IS=59, RETURN=60, BREAK=61, CONTINUE=62, PASS=63, 
		GLOBAL=64, ID=65, LETTER=66, NUMBER=67, WS=68;
	public static final int
		RULE_code = 0, RULE_stat = 1, RULE_expr = 2, RULE_term = 3, RULE_factor = 4, 
		RULE_base = 5, RULE_ids = 6, RULE_stringliteral = 7, RULE_numeros = 8, 
		RULE_query = 9, RULE_booleans = 10, RULE_assignment = 11, RULE_condicional = 12, 
		RULE_func = 13, RULE_func_call = 14, RULE_args_list = 15, RULE_param_list = 16, 
		RULE_param = 17, RULE_types = 18, RULE_return_stmt = 19, RULE_loop_while = 20, 
		RULE_loop_for = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "stat", "expr", "term", "factor", "base", "ids", "stringliteral", 
			"numeros", "query", "booleans", "assignment", "condicional", "func", 
			"func_call", "args_list", "param_list", "param", "types", "return_stmt", 
			"loop_while", "loop_for"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'//'", "'%'", "'**'", "'=='", "'!='", 
			"'<'", "'<='", "'>'", "'>='", "'and'", "'or'", "'not'", "'='", "'+='", 
			"'-='", "'*='", "'/='", "'//='", "'%='", "'**='", "'('", "')'", null, 
			"','", "'\"'", "'''", "':'", "'if'", "'elif'", "'else'", "'while'", "'for'", 
			"'def'", "'try'", "'except'", "'finally'", "'with'", "'int'", "'float'", 
			"'str'", "'bool'", "'list'", "'dict'", "'tuple'", "'None'", "'True'", 
			"'False'", "'print'", "'input'", "'len'", "'import'", "'from'", "'as'", 
			"'in'", "'is'", "'return'", "'break'", "'continue'", "'pass'", "'global'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MULT", "DIV", "FLOOR_DIV", "MOD", "EXP", "EQ", 
			"NEQ", "LT", "LTE", "GT", "GTE", "AND", "OR", "NOT", "ASSIGN", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "FLOOR_DIV_ASSIGN", "MOD_ASSIGN", 
			"EXP_ASSIGN", "LPAREN", "RPAREN", "NEWLINE", "COMMA", "QUOTE", "SINGLE_QUOTE", 
			"COLON", "IF", "ELIF", "ELSE", "WHILE", "FOR", "DEF", "TRY", "EXCEPT", 
			"FINALLY", "WITH", "INT", "FLOAT", "STRING", "BOOL", "LIST", "DICT", 
			"TUPLE", "NONE", "TRUE", "FALSE", "PRINT", "INPUT", "LEN", "IMPORT", 
			"FROM", "AS", "IN", "IS", "RETURN", "BREAK", "CONTINUE", "PASS", "GLOBAL", 
			"ID", "LETTER", "NUMBER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeContext extends ParserRuleContext {
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public List<CondicionalContext> condicional() {
			return getRuleContexts(CondicionalContext.class);
		}
		public CondicionalContext condicional(int i) {
			return getRuleContext(CondicionalContext.class,i);
		}
		public List<Loop_whileContext> loop_while() {
			return getRuleContexts(Loop_whileContext.class);
		}
		public Loop_whileContext loop_while(int i) {
			return getRuleContext(Loop_whileContext.class,i);
		}
		public List<Loop_forContext> loop_for() {
			return getRuleContexts(Loop_forContext.class);
		}
		public Loop_forContext loop_for(int i) {
			return getRuleContext(Loop_forContext.class,i);
		}
		public List<Func_callContext> func_call() {
			return getRuleContexts(Func_callContext.class);
		}
		public Func_callContext func_call(int i) {
			return getRuleContext(Func_callContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3377946177896452L) != 0) || _la==ID || _la==NUMBER) {
				{
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(44);
					func();
					}
					break;
				case 2:
					{
					setState(45);
					condicional();
					}
					break;
				case 3:
					{
					setState(46);
					loop_while();
					}
					break;
				case 4:
					{
					setState(47);
					loop_for();
					}
					break;
				case 5:
					{
					setState(48);
					func_call();
					}
					break;
				case 6:
					{
					setState(49);
					stat();
					}
					break;
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(55);
				match(EOF);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(58);
				expr(0);
				}
				break;
			case 2:
				{
				setState(59);
				query(0);
				}
				break;
			case 3:
				{
				setState(60);
				assignment();
				}
				break;
			}
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(63);
				match(NEWLINE);
				}
				break;
			case EOF:
			case MINUS:
			case NOT:
			case LPAREN:
			case QUOTE:
			case SINGLE_QUOTE:
			case IF:
			case ELIF:
			case ELSE:
			case WHILE:
			case FOR:
			case DEF:
			case TRUE:
			case FALSE:
			case RETURN:
			case ID:
			case NUMBER:
				{
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(64);
					match(EOF);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PythonParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(70);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(72);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(73);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(74);
					term(0);
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MULT() { return getToken(PythonParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(PythonParser.DIV, 0); }
		public TerminalNode FLOOR_DIV() { return getToken(PythonParser.FLOOR_DIV, 0); }
		public TerminalNode MOD() { return getToken(PythonParser.MOD, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(81);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(83);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(84);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(85);
					factor();
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public TerminalNode EXP() { return getToken(PythonParser.EXP, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_factor);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				base();
				setState(92);
				match(EXP);
				setState(93);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(MINUS);
				setState(96);
				factor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				base();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BaseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public NumerosContext numeros() {
			return getRuleContext(NumerosContext.class,0);
		}
		public StringliteralContext stringliteral() {
			return getRuleContext(StringliteralContext.class,0);
		}
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_base);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(LPAREN);
				setState(101);
				expr(0);
				setState(102);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				func_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				ids();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				numeros();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(107);
				stringliteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ids);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringliteralContext extends ParserRuleContext {
		public List<TerminalNode> QUOTE() { return getTokens(PythonParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(PythonParser.QUOTE, i);
		}
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(PythonParser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(PythonParser.SINGLE_QUOTE, i);
		}
		public StringliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringliteral; }
	}

	public final StringliteralContext stringliteral() throws RecognitionException {
		StringliteralContext _localctx = new StringliteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stringliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
				{
				{
				setState(112);
				match(QUOTE);
				setState(113);
				match(ID);
				setState(114);
				match(QUOTE);
				}
				}
				break;
			case SINGLE_QUOTE:
				{
				{
				setState(115);
				match(SINGLE_QUOTE);
				setState(116);
				match(ID);
				setState(117);
				match(SINGLE_QUOTE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumerosContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public NumerosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeros; }
	}

	public final NumerosContext numeros() throws RecognitionException {
		NumerosContext _localctx = new NumerosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_numeros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public BooleansContext booleans() {
			return getRuleContext(BooleansContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(PythonParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(PythonParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(PythonParser.LT, 0); }
		public TerminalNode LTE() { return getToken(PythonParser.LTE, 0); }
		public TerminalNode GT() { return getToken(PythonParser.GT, 0); }
		public TerminalNode GTE() { return getToken(PythonParser.GTE, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode AND() { return getToken(PythonParser.AND, 0); }
		public TerminalNode OR() { return getToken(PythonParser.OR, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		return query(0);
	}

	private QueryContext query(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryContext _localctx = new QueryContext(_ctx, _parentState);
		QueryContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_query, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(123);
				booleans();
				}
				break;
			case 2:
				{
				setState(124);
				match(NOT);
				setState(125);
				query(4);
				}
				break;
			case 3:
				{
				setState(126);
				match(LPAREN);
				setState(127);
				query(0);
				setState(128);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(130);
				expr(0);
				setState(131);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16128L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				expr(0);
				}
				break;
			case 5:
				{
				setState(134);
				func_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new QueryContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_query);
					setState(137);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(138);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(139);
					query(6);
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleansContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PythonParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public BooleansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleans; }
	}

	public final BooleansContext booleans() throws RecognitionException {
		BooleansContext _localctx = new BooleansContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_booleans);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(PythonParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(PythonParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(PythonParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(PythonParser.DIV_ASSIGN, 0); }
		public TerminalNode FLOOR_DIV_ASSIGN() { return getToken(PythonParser.FLOOR_DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(PythonParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(PythonParser.EXP_ASSIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(ID);
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33423360L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(149);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public List<TerminalNode> ELIF() { return getTokens(PythonParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(PythonParser.ELIF, i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condicional);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(IF);
				setState(152);
				query(0);
				setState(153);
				match(COLON);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(154);
					match(NEWLINE);
					}
				}

				setState(157);
				stat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(IF);
				setState(160);
				query(0);
				setState(161);
				match(COLON);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(162);
					match(NEWLINE);
					}
				}

				setState(165);
				stat();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELIF) {
					{
					{
					setState(166);
					match(ELIF);
					setState(167);
					query(0);
					setState(168);
					match(COLON);
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(169);
						match(NEWLINE);
						}
					}

					setState(172);
					stat();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179);
				match(ELSE);
				setState(180);
				match(COLON);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(181);
					match(NEWLINE);
					}
				}

				setState(184);
				stat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PythonParser.DEF, 0); }
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(DEF);
			setState(189);
			match(ID);
			setState(190);
			match(LPAREN);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(191);
				param_list();
				}
			}

			setState(194);
			match(RPAREN);
			setState(195);
			match(COLON);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					stat();
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(202);
				return_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public Args_listContext args_list() {
			return getRuleContext(Args_listContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ID);
			setState(206);
			match(LPAREN);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1644167172L) != 0) || _la==ID || _la==NUMBER) {
				{
				setState(207);
				args_list();
				}
			}

			setState(210);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Args_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Args_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_list; }
	}

	public final Args_listContext args_list() throws RecognitionException {
		Args_listContext _localctx = new Args_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_args_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			expr(0);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(213);
				match(COMMA);
				setState(214);
				expr(0);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Param_listContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			param();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(221);
				match(COMMA);
				setState(222);
				param();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(ID);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(229);
				match(COLON);
				setState(230);
				types();
				}
			}

			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(233);
				match(ASSIGN);
				setState(234);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PythonParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PythonParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(PythonParser.BOOL, 0); }
		public TerminalNode LIST() { return getToken(PythonParser.LIST, 0); }
		public TerminalNode DICT() { return getToken(PythonParser.DICT, 0); }
		public TerminalNode TUPLE() { return getToken(PythonParser.TUPLE, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 558551906910208L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(RETURN);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1644167172L) != 0) || _la==ID || _la==NUMBER) {
				{
				setState(240);
				expr(0);
				}
			}

			setState(243);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PythonParser.WHILE, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Loop_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_while; }
	}

	public final Loop_whileContext loop_while() throws RecognitionException {
		Loop_whileContext _localctx = new Loop_whileContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_loop_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(WHILE);
			setState(246);
			query(0);
			setState(247);
			match(COLON);
			setState(248);
			stat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Loop_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_for; }
	}

	public final Loop_forContext loop_for() throws RecognitionException {
		Loop_forContext _localctx = new Loop_forContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_loop_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(FOR);
			setState(251);
			match(ID);
			setState(252);
			match(IN);
			setState(253);
			expr(0);
			setState(254);
			match(COLON);
			setState(255);
			stat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 3:
			return term_sempred((TermContext)_localctx, predIndex);
		case 9:
			return query_sempred((QueryContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean query_sempred(QueryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001D\u0102\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u00003\b\u0000\n\u0000\f\u00006\t\u0000\u0001\u0000\u0003\u0000"+
		"9\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001>\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0003\u0001D\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"L\b\u0002\n\u0002\f\u0002O\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003W\b\u0003\n\u0003\f\u0003"+
		"Z\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004c\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005m\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007w\b\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0088\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u008d\b\t\n\t\f\t\u0090\t\t\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u009c\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00a4\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ab"+
		"\b\f\u0001\f\u0001\f\u0005\f\u00af\b\f\n\f\f\f\u00b2\t\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00b7\b\f\u0001\f\u0001\f\u0003\f\u00bb\b\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u00c1\b\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00c6\b\r\n\r\f\r\u00c9\t\r\u0001\r\u0003\r\u00cc\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00d1\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00d8\b\u000f\n\u000f\f\u000f"+
		"\u00db\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00e0\b"+
		"\u0010\n\u0010\f\u0010\u00e3\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00e8\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00ec\b"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u00f2"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0003\u0004\u0006\u0012"+
		"\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*\u0000\b\u0001\u0000\u0001\u0002\u0001\u0000"+
		"\u0003\u0006\u0001\u0000\b\r\u0001\u0000\u000e\u000f\u0001\u000023\u0001"+
		"\u0000\u0011\u0018\u0001\u0000*0\u0001\u0001\u001b\u001b\u0113\u00004"+
		"\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0004E\u0001\u0000"+
		"\u0000\u0000\u0006P\u0001\u0000\u0000\u0000\bb\u0001\u0000\u0000\u0000"+
		"\nl\u0001\u0000\u0000\u0000\fn\u0001\u0000\u0000\u0000\u000ev\u0001\u0000"+
		"\u0000\u0000\u0010x\u0001\u0000\u0000\u0000\u0012\u0087\u0001\u0000\u0000"+
		"\u0000\u0014\u0091\u0001\u0000\u0000\u0000\u0016\u0093\u0001\u0000\u0000"+
		"\u0000\u0018\u00ba\u0001\u0000\u0000\u0000\u001a\u00bc\u0001\u0000\u0000"+
		"\u0000\u001c\u00cd\u0001\u0000\u0000\u0000\u001e\u00d4\u0001\u0000\u0000"+
		"\u0000 \u00dc\u0001\u0000\u0000\u0000\"\u00e4\u0001\u0000\u0000\u0000"+
		"$\u00ed\u0001\u0000\u0000\u0000&\u00ef\u0001\u0000\u0000\u0000(\u00f5"+
		"\u0001\u0000\u0000\u0000*\u00fa\u0001\u0000\u0000\u0000,3\u0003\u001a"+
		"\r\u0000-3\u0003\u0018\f\u0000.3\u0003(\u0014\u0000/3\u0003*\u0015\u0000"+
		"03\u0003\u001c\u000e\u000013\u0003\u0002\u0001\u00002,\u0001\u0000\u0000"+
		"\u00002-\u0001\u0000\u0000\u00002.\u0001\u0000\u0000\u00002/\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u000036\u0001"+
		"\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"58\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000079\u0005\u0000\u0000"+
		"\u000187\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009\u0001\u0001"+
		"\u0000\u0000\u0000:>\u0003\u0004\u0002\u0000;>\u0003\u0012\t\u0000<>\u0003"+
		"\u0016\u000b\u0000=:\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		"=<\u0001\u0000\u0000\u0000>C\u0001\u0000\u0000\u0000?D\u0005\u001b\u0000"+
		"\u0000@B\u0005\u0000\u0000\u0001A@\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000BD\u0001\u0000\u0000\u0000C?\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000D\u0003\u0001\u0000\u0000\u0000EF\u0006\u0002\uffff"+
		"\uffff\u0000FG\u0003\u0006\u0003\u0000GM\u0001\u0000\u0000\u0000HI\n\u0002"+
		"\u0000\u0000IJ\u0007\u0000\u0000\u0000JL\u0003\u0006\u0003\u0000KH\u0001"+
		"\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000N\u0005\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000PQ\u0006\u0003\uffff\uffff\u0000QR\u0003\b\u0004\u0000RX\u0001"+
		"\u0000\u0000\u0000ST\n\u0002\u0000\u0000TU\u0007\u0001\u0000\u0000UW\u0003"+
		"\b\u0004\u0000VS\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\u0007\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[\\\u0003\n\u0005\u0000\\]\u0005\u0007"+
		"\u0000\u0000]^\u0003\b\u0004\u0000^c\u0001\u0000\u0000\u0000_`\u0005\u0002"+
		"\u0000\u0000`c\u0003\b\u0004\u0000ac\u0003\n\u0005\u0000b[\u0001\u0000"+
		"\u0000\u0000b_\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000c\t\u0001"+
		"\u0000\u0000\u0000de\u0005\u0019\u0000\u0000ef\u0003\u0004\u0002\u0000"+
		"fg\u0005\u001a\u0000\u0000gm\u0001\u0000\u0000\u0000hm\u0003\u001c\u000e"+
		"\u0000im\u0003\f\u0006\u0000jm\u0003\u0010\b\u0000km\u0003\u000e\u0007"+
		"\u0000ld\u0001\u0000\u0000\u0000lh\u0001\u0000\u0000\u0000li\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000m\u000b"+
		"\u0001\u0000\u0000\u0000no\u0005A\u0000\u0000o\r\u0001\u0000\u0000\u0000"+
		"pq\u0005\u001d\u0000\u0000qr\u0005A\u0000\u0000rw\u0005\u001d\u0000\u0000"+
		"st\u0005\u001e\u0000\u0000tu\u0005A\u0000\u0000uw\u0005\u001e\u0000\u0000"+
		"vp\u0001\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000w\u000f\u0001\u0000"+
		"\u0000\u0000xy\u0005C\u0000\u0000y\u0011\u0001\u0000\u0000\u0000z{\u0006"+
		"\t\uffff\uffff\u0000{\u0088\u0003\u0014\n\u0000|}\u0005\u0010\u0000\u0000"+
		"}\u0088\u0003\u0012\t\u0004~\u007f\u0005\u0019\u0000\u0000\u007f\u0080"+
		"\u0003\u0012\t\u0000\u0080\u0081\u0005\u001a\u0000\u0000\u0081\u0088\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0003\u0004\u0002\u0000\u0083\u0084\u0007"+
		"\u0002\u0000\u0000\u0084\u0085\u0003\u0004\u0002\u0000\u0085\u0088\u0001"+
		"\u0000\u0000\u0000\u0086\u0088\u0003\u001c\u000e\u0000\u0087z\u0001\u0000"+
		"\u0000\u0000\u0087|\u0001\u0000\u0000\u0000\u0087~\u0001\u0000\u0000\u0000"+
		"\u0087\u0082\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u008e\u0001\u0000\u0000\u0000\u0089\u008a\n\u0005\u0000\u0000\u008a"+
		"\u008b\u0007\u0003\u0000\u0000\u008b\u008d\u0003\u0012\t\u0006\u008c\u0089"+
		"\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0013"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0007\u0004\u0000\u0000\u0092\u0015\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0005A\u0000\u0000\u0094\u0095\u0007\u0005\u0000\u0000\u0095\u0096\u0003"+
		"\u0004\u0002\u0000\u0096\u0017\u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
		" \u0000\u0000\u0098\u0099\u0003\u0012\t\u0000\u0099\u009b\u0005\u001f"+
		"\u0000\u0000\u009a\u009c\u0005\u001b\u0000\u0000\u009b\u009a\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0003\u0002\u0001\u0000\u009e\u00bb\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0005 \u0000\u0000\u00a0\u00a1\u0003\u0012\t"+
		"\u0000\u00a1\u00a3\u0005\u001f\u0000\u0000\u00a2\u00a4\u0005\u001b\u0000"+
		"\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00b0\u0003\u0002\u0001"+
		"\u0000\u00a6\u00a7\u0005!\u0000\u0000\u00a7\u00a8\u0003\u0012\t\u0000"+
		"\u00a8\u00aa\u0005\u001f\u0000\u0000\u00a9\u00ab\u0005\u001b\u0000\u0000"+
		"\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003\u0002\u0001\u0000"+
		"\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00a6\u0001\u0000\u0000\u0000"+
		"\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\"\u0000\u0000\u00b4"+
		"\u00b6\u0005\u001f\u0000\u0000\u00b5\u00b7\u0005\u001b\u0000\u0000\u00b6"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0003\u0002\u0001\u0000\u00b9"+
		"\u00bb\u0001\u0000\u0000\u0000\u00ba\u0097\u0001\u0000\u0000\u0000\u00ba"+
		"\u009f\u0001\u0000\u0000\u0000\u00bb\u0019\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0005%\u0000\u0000\u00bd\u00be\u0005A\u0000\u0000\u00be\u00c0\u0005"+
		"\u0019\u0000\u0000\u00bf\u00c1\u0003 \u0010\u0000\u00c0\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0005\u001a\u0000\u0000\u00c3\u00c7\u0005\u001f"+
		"\u0000\u0000\u00c4\u00c6\u0003\u0002\u0001\u0000\u00c5\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cc\u0003&\u0013"+
		"\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cc\u001b\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005A\u0000\u0000"+
		"\u00ce\u00d0\u0005\u0019\u0000\u0000\u00cf\u00d1\u0003\u001e\u000f\u0000"+
		"\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u001a\u0000\u0000"+
		"\u00d3\u001d\u0001\u0000\u0000\u0000\u00d4\u00d9\u0003\u0004\u0002\u0000"+
		"\u00d5\u00d6\u0005\u001c\u0000\u0000\u00d6\u00d8\u0003\u0004\u0002\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000"+
		"\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000"+
		"\u00da\u001f\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000"+
		"\u00dc\u00e1\u0003\"\u0011\u0000\u00dd\u00de\u0005\u001c\u0000\u0000\u00de"+
		"\u00e0\u0003\"\u0011\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e2!\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e7\u0005A\u0000\u0000\u00e5\u00e6\u0005\u001f"+
		"\u0000\u0000\u00e6\u00e8\u0003$\u0012\u0000\u00e7\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0005\u0011\u0000\u0000\u00ea\u00ec\u0003\u0004\u0002"+
		"\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ec#\u0001\u0000\u0000\u0000\u00ed\u00ee\u0007\u0006\u0000\u0000"+
		"\u00ee%\u0001\u0000\u0000\u0000\u00ef\u00f1\u0005<\u0000\u0000\u00f0\u00f2"+
		"\u0003\u0004\u0002\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0007\u0007\u0000\u0000\u00f4\'\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"#\u0000\u0000\u00f6\u00f7\u0003\u0012\t\u0000\u00f7\u00f8\u0005\u001f"+
		"\u0000\u0000\u00f8\u00f9\u0003\u0002\u0001\u0000\u00f9)\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0005$\u0000\u0000\u00fb\u00fc\u0005A\u0000\u0000\u00fc"+
		"\u00fd\u0005:\u0000\u0000\u00fd\u00fe\u0003\u0004\u0002\u0000\u00fe\u00ff"+
		"\u0005\u001f\u0000\u0000\u00ff\u0100\u0003\u0002\u0001\u0000\u0100+\u0001"+
		"\u0000\u0000\u0000\u001c248=ACMXblv\u0087\u008e\u009b\u00a3\u00aa\u00b0"+
		"\u00b6\u00ba\u00c0\u00c7\u00cb\u00d0\u00d9\u00e1\u00e7\u00eb\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}