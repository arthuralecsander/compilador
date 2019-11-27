// Generated from /home/uniceub/Compila/compilador/lab02/provided/skeleton/src/decaf/DecafParser.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PARENTESESDIR=1, PARENTESESESQ=2, CHAVEDIR=3, CHAVESQ=4, COLCHETEDIR=5, 
		COLCHETESQ=6, PONTOVIRGULA=7, VIRGULA=8, BARRAVERTICAL=9, BARRABARRA=10, 
		BARRA=11, PORCENTAGEM=12, AND=13, BOOL=14, CALL=15, CLASS=16, T_INT=17, 
		RETURN=18, VOID=19, FOR=20, BREAK=21, CONTINUE=22, ADICAO=23, SUBTRACAO=24, 
		MULTIPLICACAO=25, EXCLAMACAO=26, DIFERENTED=27, IGUAL=28, IGUALIGUAL=29, 
		MAIORQUE=30, MENORQUE=31, MAIORIGUAL=32, MENORIGUAL=33, MAISIGUAL=34, 
		MENOSIGUAL=35, BOOLEAN=36, IF=37, ELSE=38, INT=39, HEXN=40, MUNDCHAR=41, 
		STRING_=42, ID=43, WS_=44, SL_COMMENT=45;
	public static final int
		RULE_program = 0, RULE_method_decl = 1, RULE_block_decl = 2, RULE_var_decl = 3, 
		RULE_type_id = 4, RULE_type = 5, RULE_statement_decl = 6, RULE_assign_op = 7, 
		RULE_method_call = 8, RULE_method_name = 9, RULE_location_decl = 10, RULE_expr_decl = 11, 
		RULE_callout_arg = 12, RULE_pont = 13, RULE_bin_op = 14, RULE_arith_op = 15, 
		RULE_rel_op = 16, RULE_eq_op = 17, RULE_cond_op = 18, RULE_literal = 19, 
		RULE_int_literal = 20, RULE_array_decl = 21;
	public static final String[] ruleNames = {
		"program", "method_decl", "block_decl", "var_decl", "type_id", "type", 
		"statement_decl", "assign_op", "method_call", "method_name", "location_decl", 
		"expr_decl", "callout_arg", "pont", "bin_op", "arith_op", "rel_op", "eq_op", 
		"cond_op", "literal", "int_literal", "array_decl"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "')'", "'('", "'}'", "'{'", "']'", "'['", "';'", "','", "'|'", "'||'", 
		"'/'", "'%'", "'&&'", "'boolean'", "'callout'", "'class'", "'int'", "'return'", 
		"'void'", "'for'", "'break'", "'continue'", "'+'", "'-'", "'*'", "'!'", 
		"'!='", "'='", "'=='", "'>'", "'<'", "'>='", "'<='", "'+='", "'-='", null, 
		"'if'", "'else'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PARENTESESDIR", "PARENTESESESQ", "CHAVEDIR", "CHAVESQ", "COLCHETEDIR", 
		"COLCHETESQ", "PONTOVIRGULA", "VIRGULA", "BARRAVERTICAL", "BARRABARRA", 
		"BARRA", "PORCENTAGEM", "AND", "BOOL", "CALL", "CLASS", "T_INT", "RETURN", 
		"VOID", "FOR", "BREAK", "CONTINUE", "ADICAO", "SUBTRACAO", "MULTIPLICACAO", 
		"EXCLAMACAO", "DIFERENTED", "IGUAL", "IGUALIGUAL", "MAIORQUE", "MENORQUE", 
		"MAIORIGUAL", "MENORIGUAL", "MAISIGUAL", "MENOSIGUAL", "BOOLEAN", "IF", 
		"ELSE", "INT", "HEXN", "MUNDCHAR", "STRING_", "ID", "WS_", "SL_COMMENT"
	};
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
	public String getGrammarFileName() { return "DecafParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(DecafParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode CHAVESQ() { return getToken(DecafParser.CHAVESQ, 0); }
		public TerminalNode CHAVEDIR() { return getToken(DecafParser.CHAVEDIR, 0); }
		public TerminalNode EOF() { return getToken(DecafParser.EOF, 0); }
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(CLASS);
			setState(45);
			match(ID);
			setState(46);
			match(CHAVESQ);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(47);
							var_decl();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(50); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << T_INT) | (1L << VOID))) != 0)) {
				{
				{
				setState(57);
				method_decl();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(CHAVEDIR);
			setState(64);
			match(EOF);
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

	public static class Method_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode PARENTESESESQ() { return getToken(DecafParser.PARENTESESESQ, 0); }
		public TerminalNode PARENTESESDIR() { return getToken(DecafParser.PARENTESESDIR, 0); }
		public Block_declContext block_decl() {
			return getRuleContext(Block_declContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<PontContext> pont() {
			return getRuleContexts(PontContext.class);
		}
		public PontContext pont(int i) {
			return getRuleContext(PontContext.class,i);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			switch (_input.LA(1)) {
			case BOOL:
			case T_INT:
				{
				setState(66);
				type();
				}
				break;
			case VOID:
				{
				setState(67);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(70);
			match(ID);
			setState(71);
			match(PARENTESESESQ);
			setState(83);
			_la = _input.LA(1);
			if (_la==BOOL || _la==T_INT) {
				{
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(72);
					var_decl();
					}
					}
					setState(75); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BOOL || _la==T_INT );
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PONTOVIRGULA) | (1L << VIRGULA) | (1L << EXCLAMACAO))) != 0)) {
					{
					{
					setState(77);
					pont();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(85);
			match(PARENTESESDIR);
			setState(86);
			block_decl();
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

	public static class Block_declContext extends ParserRuleContext {
		public TerminalNode CHAVESQ() { return getToken(DecafParser.CHAVESQ, 0); }
		public TerminalNode CHAVEDIR() { return getToken(DecafParser.CHAVEDIR, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<Statement_declContext> statement_decl() {
			return getRuleContexts(Statement_declContext.class);
		}
		public Statement_declContext statement_decl(int i) {
			return getRuleContext(Statement_declContext.class,i);
		}
		public Block_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBlock_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBlock_decl(this);
		}
	}

	public final Block_declContext block_decl() throws RecognitionException {
		Block_declContext _localctx = new Block_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(CHAVESQ);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOL || _la==T_INT) {
				{
				{
				setState(89);
				var_decl();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAVESQ) | (1L << CALL) | (1L << RETURN) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(95);
				statement_decl();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(CHAVEDIR);
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

	public static class Var_declContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public Array_declContext array_decl() {
			return getRuleContext(Array_declContext.class,0);
		}
		public List<PontContext> pont() {
			return getRuleContexts(PontContext.class);
		}
		public PontContext pont(int i) {
			return getRuleContext(PontContext.class,i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			type();
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					match(ID);
					setState(108);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(105);
							pont();
							}
							} 
						}
						setState(110);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					}
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(117);
			_la = _input.LA(1);
			if (_la==COLCHETESQ) {
				{
				setState(116);
				array_decl();
				}
			}

			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					pont();
					}
					} 
				}
				setState(124);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Type_idContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public Type_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterType_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitType_id(this);
		}
	}

	public final Type_idContext type_id() throws RecognitionException {
		Type_idContext _localctx = new Type_idContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			type();
			setState(126);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode T_INT() { return getToken(DecafParser.T_INT, 0); }
		public TerminalNode BOOL() { return getToken(DecafParser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==BOOL || _la==T_INT) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Statement_declContext extends ParserRuleContext {
		public Location_declContext location_decl() {
			return getRuleContext(Location_declContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public List<Expr_declContext> expr_decl() {
			return getRuleContexts(Expr_declContext.class);
		}
		public Expr_declContext expr_decl(int i) {
			return getRuleContext(Expr_declContext.class,i);
		}
		public List<PontContext> pont() {
			return getRuleContexts(PontContext.class);
		}
		public PontContext pont(int i) {
			return getRuleContext(PontContext.class,i);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode IF() { return getToken(DecafParser.IF, 0); }
		public List<Block_declContext> block_decl() {
			return getRuleContexts(Block_declContext.class);
		}
		public Block_declContext block_decl(int i) {
			return getRuleContext(Block_declContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DecafParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(DecafParser.IGUAL, 0); }
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(DecafParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(DecafParser.CONTINUE, 0); }
		public Statement_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterStatement_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitStatement_decl(this);
		}
	}

	public final Statement_declContext statement_decl() throws RecognitionException {
		Statement_declContext _localctx = new Statement_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement_decl);
		int _la;
		try {
			int _alt;
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				location_decl();
				setState(131);
				assign_op();
				setState(132);
				expr_decl(0);
				setState(133);
				pont();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				method_call();
				setState(136);
				pont();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(IF);
				setState(139);
				expr_decl(0);
				setState(140);
				block_decl();
				setState(143);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(141);
					match(ELSE);
					setState(142);
					block_decl();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(FOR);
				setState(146);
				match(ID);
				setState(147);
				match(IGUAL);
				setState(148);
				expr_decl(0);
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(149);
						pont();
						}
						} 
					}
					setState(154);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(155);
				expr_decl(0);
				setState(156);
				block_decl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				match(RETURN);
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(159);
					expr_decl(0);
					}
					break;
				}
				setState(162);
				pont();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				match(BREAK);
				setState(164);
				pont();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(165);
				match(CONTINUE);
				setState(166);
				pont();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(167);
				block_decl();
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

	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(DecafParser.IGUAL, 0); }
		public TerminalNode MAISIGUAL() { return getToken(DecafParser.MAISIGUAL, 0); }
		public TerminalNode MENOSIGUAL() { return getToken(DecafParser.MENOSIGUAL, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitAssign_op(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAISIGUAL) | (1L << MENOSIGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Method_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode PARENTESESESQ() { return getToken(DecafParser.PARENTESESESQ, 0); }
		public List<Expr_declContext> expr_decl() {
			return getRuleContexts(Expr_declContext.class);
		}
		public Expr_declContext expr_decl(int i) {
			return getRuleContext(Expr_declContext.class,i);
		}
		public TerminalNode PARENTESESDIR() { return getToken(DecafParser.PARENTESESDIR, 0); }
		public List<PontContext> pont() {
			return getRuleContexts(PontContext.class);
		}
		public PontContext pont(int i) {
			return getRuleContext(PontContext.class,i);
		}
		public TerminalNode CALL() { return getToken(DecafParser.CALL, 0); }
		public List<TerminalNode> STRING_() { return getTokens(DecafParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(DecafParser.STRING_, i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_method_call);
		int _la;
		try {
			int _alt;
			setState(209);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(ID);
				setState(173);
				match(PARENTESESESQ);
				setState(174);
				expr_decl(0);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PONTOVIRGULA) | (1L << VIRGULA) | (1L << EXCLAMACAO))) != 0)) {
					{
					{
					setState(175);
					pont();
					setState(176);
					expr_decl(0);
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(PARENTESESDIR);
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(CALL);
				setState(186);
				match(PARENTESESESQ);
				setState(187);
				match(STRING_);
				setState(206);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTESESESQ) | (1L << PONTOVIRGULA) | (1L << VIRGULA) | (1L << BARRABARRA) | (1L << BARRA) | (1L << PORCENTAGEM) | (1L << AND) | (1L << CALL) | (1L << ADICAO) | (1L << SUBTRACAO) | (1L << MULTIPLICACAO) | (1L << EXCLAMACAO) | (1L << DIFERENTED) | (1L << IGUALIGUAL) | (1L << MAIORQUE) | (1L << MENORQUE) | (1L << MAIORIGUAL) | (1L << MENORIGUAL) | (1L << BOOLEAN) | (1L << INT) | (1L << MUNDCHAR) | (1L << STRING_) | (1L << ID))) != 0)) {
					{
					setState(191);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(188);
							pont();
							}
							} 
						}
						setState(193);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					}
					setState(196); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(196);
							switch (_input.LA(1)) {
							case PARENTESESESQ:
							case PONTOVIRGULA:
							case VIRGULA:
							case BARRABARRA:
							case BARRA:
							case PORCENTAGEM:
							case AND:
							case CALL:
							case ADICAO:
							case SUBTRACAO:
							case MULTIPLICACAO:
							case EXCLAMACAO:
							case DIFERENTED:
							case IGUALIGUAL:
							case MAIORQUE:
							case MENORQUE:
							case MAIORIGUAL:
							case MENORIGUAL:
							case BOOLEAN:
							case INT:
							case MUNDCHAR:
							case ID:
								{
								setState(194);
								expr_decl(0);
								}
								break;
							case STRING_:
								{
								setState(195);
								match(STRING_);
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(198); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PONTOVIRGULA) | (1L << VIRGULA) | (1L << EXCLAMACAO))) != 0)) {
						{
						{
						setState(200);
						pont();
						}
						}
						setState(205);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(208);
				match(PARENTESESDIR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_name(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
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

	public static class Location_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode COLCHETESQ() { return getToken(DecafParser.COLCHETESQ, 0); }
		public Expr_declContext expr_decl() {
			return getRuleContext(Expr_declContext.class,0);
		}
		public TerminalNode COLCHETEDIR() { return getToken(DecafParser.COLCHETEDIR, 0); }
		public Location_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLocation_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLocation_decl(this);
		}
	}

	public final Location_declContext location_decl() throws RecognitionException {
		Location_declContext _localctx = new Location_declContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_location_decl);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(ID);
				setState(215);
				match(COLCHETESQ);
				setState(216);
				expr_decl(0);
				setState(217);
				match(COLCHETEDIR);
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

	public static class Expr_declContext extends ParserRuleContext {
		public Location_declContext location_decl() {
			return getRuleContext(Location_declContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public List<Expr_declContext> expr_decl() {
			return getRuleContexts(Expr_declContext.class);
		}
		public Expr_declContext expr_decl(int i) {
			return getRuleContext(Expr_declContext.class,i);
		}
		public PontContext pont() {
			return getRuleContext(PontContext.class,0);
		}
		public TerminalNode PARENTESESESQ() { return getToken(DecafParser.PARENTESESESQ, 0); }
		public TerminalNode PARENTESESDIR() { return getToken(DecafParser.PARENTESESDIR, 0); }
		public Expr_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpr_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpr_decl(this);
		}
	}

	public final Expr_declContext expr_decl() throws RecognitionException {
		return expr_decl(0);
	}

	private Expr_declContext expr_decl(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_declContext _localctx = new Expr_declContext(_ctx, _parentState);
		Expr_declContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr_decl, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(222);
				location_decl();
				}
				break;
			case 2:
				{
				setState(223);
				method_call();
				}
				break;
			case 3:
				{
				setState(224);
				literal();
				}
				break;
			case 4:
				{
				setState(225);
				bin_op();
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(226);
						expr_decl(0);
						}
						} 
					}
					setState(231);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 5:
				{
				setState(232);
				pont();
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(233);
						expr_decl(0);
						}
						} 
					}
					setState(238);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			case 6:
				{
				setState(239);
				match(PARENTESESESQ);
				setState(240);
				expr_decl(0);
				setState(241);
				match(PARENTESESDIR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_declContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_decl);
					setState(245);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(246);
					bin_op();
					setState(247);
					expr_decl(5);
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class Callout_argContext extends ParserRuleContext {
		public Expr_declContext expr_decl() {
			return getRuleContext(Expr_declContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(DecafParser.STRING_, 0); }
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCallout_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCallout_arg(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callout_arg);
		try {
			setState(256);
			switch (_input.LA(1)) {
			case PARENTESESESQ:
			case PONTOVIRGULA:
			case VIRGULA:
			case BARRABARRA:
			case BARRA:
			case PORCENTAGEM:
			case AND:
			case CALL:
			case ADICAO:
			case SUBTRACAO:
			case MULTIPLICACAO:
			case EXCLAMACAO:
			case DIFERENTED:
			case IGUALIGUAL:
			case MAIORQUE:
			case MENORQUE:
			case MAIORIGUAL:
			case MENORIGUAL:
			case BOOLEAN:
			case INT:
			case MUNDCHAR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				expr_decl(0);
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(STRING_);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PontContext extends ParserRuleContext {
		public TerminalNode PONTOVIRGULA() { return getToken(DecafParser.PONTOVIRGULA, 0); }
		public TerminalNode VIRGULA() { return getToken(DecafParser.VIRGULA, 0); }
		public TerminalNode EXCLAMACAO() { return getToken(DecafParser.EXCLAMACAO, 0); }
		public PontContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pont; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterPont(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitPont(this);
		}
	}

	public final PontContext pont() throws RecognitionException {
		PontContext _localctx = new PontContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pont);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PONTOVIRGULA) | (1L << VIRGULA) | (1L << EXCLAMACAO))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Bin_opContext extends ParserRuleContext {
		public Arith_opContext arith_op() {
			return getRuleContext(Arith_opContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBin_op(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bin_op);
		try {
			setState(264);
			switch (_input.LA(1)) {
			case BARRA:
			case PORCENTAGEM:
			case ADICAO:
			case SUBTRACAO:
			case MULTIPLICACAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				arith_op();
				}
				break;
			case MAIORQUE:
			case MENORQUE:
			case MAIORIGUAL:
			case MENORIGUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				rel_op();
				}
				break;
			case DIFERENTED:
			case IGUALIGUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				eq_op();
				}
				break;
			case BARRABARRA:
			case AND:
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				cond_op();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Arith_opContext extends ParserRuleContext {
		public TerminalNode ADICAO() { return getToken(DecafParser.ADICAO, 0); }
		public TerminalNode SUBTRACAO() { return getToken(DecafParser.SUBTRACAO, 0); }
		public TerminalNode MULTIPLICACAO() { return getToken(DecafParser.MULTIPLICACAO, 0); }
		public TerminalNode BARRA() { return getToken(DecafParser.BARRA, 0); }
		public TerminalNode PORCENTAGEM() { return getToken(DecafParser.PORCENTAGEM, 0); }
		public Arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterArith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitArith_op(this);
		}
	}

	public final Arith_opContext arith_op() throws RecognitionException {
		Arith_opContext _localctx = new Arith_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BARRA) | (1L << PORCENTAGEM) | (1L << ADICAO) | (1L << SUBTRACAO) | (1L << MULTIPLICACAO))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode MENORQUE() { return getToken(DecafParser.MENORQUE, 0); }
		public TerminalNode MAIORQUE() { return getToken(DecafParser.MAIORQUE, 0); }
		public TerminalNode MENORIGUAL() { return getToken(DecafParser.MENORIGUAL, 0); }
		public TerminalNode MAIORIGUAL() { return getToken(DecafParser.MAIORIGUAL, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitRel_op(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIORQUE) | (1L << MENORQUE) | (1L << MAIORIGUAL) | (1L << MENORIGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Eq_opContext extends ParserRuleContext {
		public TerminalNode IGUALIGUAL() { return getToken(DecafParser.IGUALIGUAL, 0); }
		public TerminalNode DIFERENTED() { return getToken(DecafParser.DIFERENTED, 0); }
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitEq_op(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !(_la==DIFERENTED || _la==IGUALIGUAL) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Cond_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(DecafParser.AND, 0); }
		public TerminalNode BARRABARRA() { return getToken(DecafParser.BARRABARRA, 0); }
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCond_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCond_op(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !(_la==BARRABARRA || _la==AND) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class LiteralContext extends ParserRuleContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public TerminalNode MUNDCHAR() { return getToken(DecafParser.MUNDCHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(DecafParser.BOOLEAN, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_literal);
		try {
			setState(277);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				int_literal();
				}
				break;
			case MUNDCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(MUNDCHAR);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitInt_literal(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_int_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(INT);
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

	public static class Array_declContext extends ParserRuleContext {
		public TerminalNode COLCHETESQ() { return getToken(DecafParser.COLCHETESQ, 0); }
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public TerminalNode COLCHETEDIR() { return getToken(DecafParser.COLCHETEDIR, 0); }
		public Array_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterArray_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitArray_decl(this);
		}
	}

	public final Array_declContext array_decl() throws RecognitionException {
		Array_declContext _localctx = new Array_declContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_array_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(COLCHETESQ);
			setState(282);
			match(INT);
			setState(283);
			match(COLCHETEDIR);
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
		case 11:
			return expr_decl_sempred((Expr_declContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_decl_sempred(Expr_declContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u0120\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\6\2"+
		"\63\n\2\r\2\16\2\64\7\2\67\n\2\f\2\16\2:\13\2\3\2\7\2=\n\2\f\2\16\2@\13"+
		"\2\3\2\3\2\3\2\3\3\3\3\5\3G\n\3\3\3\3\3\3\3\6\3L\n\3\r\3\16\3M\3\3\7\3"+
		"Q\n\3\f\3\16\3T\13\3\5\3V\n\3\3\3\3\3\3\3\3\4\3\4\7\4]\n\4\f\4\16\4`\13"+
		"\4\3\4\7\4c\n\4\f\4\16\4f\13\4\3\4\3\4\3\5\3\5\3\5\7\5m\n\5\f\5\16\5p"+
		"\13\5\7\5r\n\5\f\5\16\5u\13\5\3\5\5\5x\n\5\3\5\7\5{\n\5\f\5\16\5~\13\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0092\n\b\3\b\3\b\3\b\3\b\3\b\7\b\u0099\n\b\f\b\16\b\u009c\13\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u00a3\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ab\n"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b5\n\n\f\n\16\n\u00b8\13\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c0\n\n\f\n\16\n\u00c3\13\n\3\n\3\n\6\n\u00c7"+
		"\n\n\r\n\16\n\u00c8\3\n\7\n\u00cc\n\n\f\n\16\n\u00cf\13\n\5\n\u00d1\n"+
		"\n\3\n\5\n\u00d4\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00de\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\7\r\u00e6\n\r\f\r\16\r\u00e9\13\r\3\r\3\r\7\r\u00ed"+
		"\n\r\f\r\16\r\u00f0\13\r\3\r\3\r\3\r\3\r\5\r\u00f6\n\r\3\r\3\r\3\r\3\r"+
		"\7\r\u00fc\n\r\f\r\16\r\u00ff\13\r\3\16\3\16\5\16\u0103\n\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\5\20\u010b\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\5\25\u0118\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\2\3\30\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\t\4\2\20\20"+
		"\23\23\4\2\36\36$%\4\2\t\n\34\34\4\2\r\16\31\33\3\2 #\4\2\35\35\37\37"+
		"\4\2\f\f\17\17\u0136\2.\3\2\2\2\4F\3\2\2\2\6Z\3\2\2\2\bi\3\2\2\2\n\177"+
		"\3\2\2\2\f\u0082\3\2\2\2\16\u00aa\3\2\2\2\20\u00ac\3\2\2\2\22\u00d3\3"+
		"\2\2\2\24\u00d5\3\2\2\2\26\u00dd\3\2\2\2\30\u00f5\3\2\2\2\32\u0102\3\2"+
		"\2\2\34\u0104\3\2\2\2\36\u010a\3\2\2\2 \u010c\3\2\2\2\"\u010e\3\2\2\2"+
		"$\u0110\3\2\2\2&\u0112\3\2\2\2(\u0117\3\2\2\2*\u0119\3\2\2\2,\u011b\3"+
		"\2\2\2./\7\22\2\2/\60\7-\2\2\608\7\6\2\2\61\63\5\b\5\2\62\61\3\2\2\2\63"+
		"\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\62\3\2\2\2\67"+
		":\3\2\2\28\66\3\2\2\289\3\2\2\29>\3\2\2\2:8\3\2\2\2;=\5\4\3\2<;\3\2\2"+
		"\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\5\2\2BC\7\2\2"+
		"\3C\3\3\2\2\2DG\5\f\7\2EG\7\25\2\2FD\3\2\2\2FE\3\2\2\2GH\3\2\2\2HI\7-"+
		"\2\2IU\7\4\2\2JL\5\b\5\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NR\3\2"+
		"\2\2OQ\5\34\17\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3"+
		"\2\2\2UK\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\3\2\2XY\5\6\4\2Y\5\3\2\2\2Z^"+
		"\7\6\2\2[]\5\b\5\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_d\3\2\2\2"+
		"`^\3\2\2\2ac\5\16\b\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2"+
		"\2fd\3\2\2\2gh\7\5\2\2h\7\3\2\2\2is\5\f\7\2jn\7-\2\2km\5\34\17\2lk\3\2"+
		"\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2pn\3\2\2\2qj\3\2\2\2ru\3\2"+
		"\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3\2\2\2vx\5,\27\2wv\3\2\2\2wx\3\2"+
		"\2\2x|\3\2\2\2y{\5\34\17\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\t"+
		"\3\2\2\2~|\3\2\2\2\177\u0080\5\f\7\2\u0080\u0081\7-\2\2\u0081\13\3\2\2"+
		"\2\u0082\u0083\t\2\2\2\u0083\r\3\2\2\2\u0084\u0085\5\26\f\2\u0085\u0086"+
		"\5\20\t\2\u0086\u0087\5\30\r\2\u0087\u0088\5\34\17\2\u0088\u00ab\3\2\2"+
		"\2\u0089\u008a\5\22\n\2\u008a\u008b\5\34\17\2\u008b\u00ab\3\2\2\2\u008c"+
		"\u008d\7\'\2\2\u008d\u008e\5\30\r\2\u008e\u0091\5\6\4\2\u008f\u0090\7"+
		"(\2\2\u0090\u0092\5\6\4\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u00ab\3\2\2\2\u0093\u0094\7\26\2\2\u0094\u0095\7-\2\2\u0095\u0096\7\36"+
		"\2\2\u0096\u009a\5\30\r\2\u0097\u0099\5\34\17\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009d\u009e\5\30\r\2\u009e\u009f\5\6\4\2\u009f"+
		"\u00ab\3\2\2\2\u00a0\u00a2\7\24\2\2\u00a1\u00a3\5\30\r\2\u00a2\u00a1\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00ab\5\34\17\2\u00a5"+
		"\u00a6\7\27\2\2\u00a6\u00ab\5\34\17\2\u00a7\u00a8\7\30\2\2\u00a8\u00ab"+
		"\5\34\17\2\u00a9\u00ab\5\6\4\2\u00aa\u0084\3\2\2\2\u00aa\u0089\3\2\2\2"+
		"\u00aa\u008c\3\2\2\2\u00aa\u0093\3\2\2\2\u00aa\u00a0\3\2\2\2\u00aa\u00a5"+
		"\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\17\3\2\2\2\u00ac"+
		"\u00ad\t\3\2\2\u00ad\21\3\2\2\2\u00ae\u00af\7-\2\2\u00af\u00b0\7\4\2\2"+
		"\u00b0\u00b6\5\30\r\2\u00b1\u00b2\5\34\17\2\u00b2\u00b3\5\30\r\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00ba\7\3\2\2\u00ba\u00d4\3\2\2\2\u00bb\u00bc\7\21\2\2\u00bc\u00bd\7"+
		"\4\2\2\u00bd\u00d0\7,\2\2\u00be\u00c0\5\34\17\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c6\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\5\30\r\2\u00c5\u00c7\7,\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cd\3\2\2\2\u00ca\u00cc\5\34\17\2\u00cb"+
		"\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00c1\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\7\3\2\2\u00d3\u00ae\3\2"+
		"\2\2\u00d3\u00bb\3\2\2\2\u00d4\23\3\2\2\2\u00d5\u00d6\7-\2\2\u00d6\25"+
		"\3\2\2\2\u00d7\u00de\7-\2\2\u00d8\u00d9\7-\2\2\u00d9\u00da\7\b\2\2\u00da"+
		"\u00db\5\30\r\2\u00db\u00dc\7\7\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d7\3"+
		"\2\2\2\u00dd\u00d8\3\2\2\2\u00de\27\3\2\2\2\u00df\u00e0\b\r\1\2\u00e0"+
		"\u00f6\5\26\f\2\u00e1\u00f6\5\22\n\2\u00e2\u00f6\5(\25\2\u00e3\u00e7\5"+
		"\36\20\2\u00e4\u00e6\5\30\r\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2"+
		"\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00f6\3\2\2\2\u00e9\u00e7"+
		"\3\2\2\2\u00ea\u00ee\5\34\17\2\u00eb\u00ed\5\30\r\2\u00ec\u00eb\3\2\2"+
		"\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f6"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\4\2\2\u00f2\u00f3\5\30\r\2"+
		"\u00f3\u00f4\7\3\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00df\3\2\2\2\u00f5\u00e1"+
		"\3\2\2\2\u00f5\u00e2\3\2\2\2\u00f5\u00e3\3\2\2\2\u00f5\u00ea\3\2\2\2\u00f5"+
		"\u00f1\3\2\2\2\u00f6\u00fd\3\2\2\2\u00f7\u00f8\f\6\2\2\u00f8\u00f9\5\36"+
		"\20\2\u00f9\u00fa\5\30\r\7\u00fa\u00fc\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\31\3\2\2"+
		"\2\u00ff\u00fd\3\2\2\2\u0100\u0103\5\30\r\2\u0101\u0103\7,\2\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0101\3\2\2\2\u0103\33\3\2\2\2\u0104\u0105\t\4\2\2\u0105"+
		"\35\3\2\2\2\u0106\u010b\5 \21\2\u0107\u010b\5\"\22\2\u0108\u010b\5$\23"+
		"\2\u0109\u010b\5&\24\2\u010a\u0106\3\2\2\2\u010a\u0107\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010a\u0109\3\2\2\2\u010b\37\3\2\2\2\u010c\u010d\t\5\2\2\u010d"+
		"!\3\2\2\2\u010e\u010f\t\6\2\2\u010f#\3\2\2\2\u0110\u0111\t\7\2\2\u0111"+
		"%\3\2\2\2\u0112\u0113\t\b\2\2\u0113\'\3\2\2\2\u0114\u0118\5*\26\2\u0115"+
		"\u0118\7+\2\2\u0116\u0118\7&\2\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2\2"+
		"\2\u0117\u0116\3\2\2\2\u0118)\3\2\2\2\u0119\u011a\7)\2\2\u011a+\3\2\2"+
		"\2\u011b\u011c\7\b\2\2\u011c\u011d\7)\2\2\u011d\u011e\7\7\2\2\u011e-\3"+
		"\2\2\2\"\648>FMRU^dnsw|\u0091\u009a\u00a2\u00aa\u00b6\u00c1\u00c6\u00c8"+
		"\u00cd\u00d0\u00d3\u00dd\u00e7\u00ee\u00f5\u00fd\u0102\u010a\u0117";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}