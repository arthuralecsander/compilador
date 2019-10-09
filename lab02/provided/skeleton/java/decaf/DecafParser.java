// Generated from /home/uniceub/Arthur/compilador/lab02/provided/skeleton/src/decaf/DecafParser.g4 by ANTLR 4.5.3

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
		TK_class=1, LCURLY=2, RCURLY=3, LPAR=4, RPAR=5, LBRAC=6, RBRAC=7, BOOLEAN=8, 
		BREAK=9, CALLOUT=10, CLASS=11, CONTINUE=12, ELSE=13, IF=14, FOR=15, INTV=16, 
		RETURN=17, VOID=18, BOOLEANS=19, INT=20, HEXN=21, ID=22, WS_=23, SL_COMMENT=24, 
		MUNDCHAR=25, STRING_=26, OPPOS=27, OPNEG=28, OPMUL=29, OPDIV=30, OPPER=31, 
		OPIGU=32, OPMIG=33, OPMME=34, DIF=35, OPLOGE=36, OPLOGO=37, OPMEN=38, 
		OPMAI=39, OPMENI=40, OPMAII=41, OPCIG=42, OPDIF=43, PVIRG=44, COMMA=45;
	public static final int
		RULE_program = 0, RULE_field_dec = 1, RULE_method_decl = 2, RULE_block = 3, 
		RULE_var_dec = 4, RULE_type = 5, RULE_state = 6, RULE_assign_op = 7, RULE_method_call = 8, 
		RULE_method_name = 9, RULE_loc = 10, RULE_expr = 11, RULE_callout_arg = 12, 
		RULE_bin_op = 13, RULE_arith_op = 14, RULE_rel_op = 15, RULE_eq_op = 16, 
		RULE_cond_op = 17, RULE_literal = 18;
	public static final String[] ruleNames = {
		"program", "field_dec", "method_decl", "block", "var_dec", "type", "state", 
		"assign_op", "method_call", "method_name", "loc", "expr", "callout_arg", 
		"bin_op", "arith_op", "rel_op", "eq_op", "cond_op", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'{'", "'}'", "'('", "')'", "'['", "']'", "'boolean'", "'break'", 
		"'callout'", "'class'", "'continue'", "'else'", "'if'", "'for'", "'int'", 
		"'return'", "'void'", null, null, null, null, null, null, null, null, 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'+='", "'-='", "'!'", "'&&'", 
		"'||'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_class", "LCURLY", "RCURLY", "LPAR", "RPAR", "LBRAC", "RBRAC", 
		"BOOLEAN", "BREAK", "CALLOUT", "CLASS", "CONTINUE", "ELSE", "IF", "FOR", 
		"INTV", "RETURN", "VOID", "BOOLEANS", "INT", "HEXN", "ID", "WS_", "SL_COMMENT", 
		"MUNDCHAR", "STRING_", "OPPOS", "OPNEG", "OPMUL", "OPDIV", "OPPER", "OPIGU", 
		"OPMIG", "OPMME", "DIF", "OPLOGE", "OPLOGO", "OPMEN", "OPMAI", "OPMENI", 
		"OPMAII", "OPCIG", "OPDIF", "PVIRG", "COMMA"
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
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public TerminalNode EOF() { return getToken(DecafParser.EOF, 0); }
		public List<Field_decContext> field_dec() {
			return getRuleContexts(Field_decContext.class);
		}
		public Field_decContext field_dec(int i) {
			return getRuleContext(Field_decContext.class,i);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
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
			setState(38);
			match(CLASS);
			setState(39);
			match(ID);
			setState(40);
			match(LCURLY);
			{
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(41);
					field_dec();
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTV) | (1L << VOID))) != 0)) {
				{
				{
				setState(47);
				method_decl();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(53);
			match(RCURLY);
			setState(54);
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

	public static class Field_decContext extends ParserRuleContext {
		public TerminalNode PVIRG() { return getToken(DecafParser.PVIRG, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LBRAC() { return getToken(DecafParser.LBRAC, 0); }
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public TerminalNode RBRAC() { return getToken(DecafParser.RBRAC, 0); }
		public Field_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterField_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitField_dec(this);
		}
	}

	public final Field_decContext field_dec() throws RecognitionException {
		Field_decContext _localctx = new Field_decContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(56);
				type();
				setState(57);
				match(ID);
				}
				break;
			case 2:
				{
				setState(59);
				type();
				setState(60);
				match(ID);
				setState(61);
				match(LBRAC);
				setState(62);
				match(INT);
				setState(63);
				match(RBRAC);
				}
				break;
			}
			setState(67);
			match(PVIRG);
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
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(DecafParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(DecafParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
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
		enterRule(_localctx, 4, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INTV:
				{
				setState(69);
				type();
				}
				break;
			case VOID:
				{
				setState(70);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(73);
			match(ID);
			setState(74);
			match(LPAR);
			setState(86);
			_la = _input.LA(1);
			if (_la==BOOLEAN || _la==INTV) {
				{
				setState(75);
				type();
				setState(76);
				match(ID);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(77);
					match(COMMA);
					setState(78);
					type();
					setState(79);
					match(ID);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(88);
			match(RPAR);
			setState(89);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public List<Var_decContext> var_dec() {
			return getRuleContexts(Var_decContext.class);
		}
		public Var_decContext var_dec(int i) {
			return getRuleContext(Var_decContext.class,i);
		}
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(LCURLY);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLEAN || _la==INTV) {
				{
				{
				setState(92);
				var_dec();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(98);
				state();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(RCURLY);
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

	public static class Var_decContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public TerminalNode PVIRG() { return getToken(DecafParser.PVIRG, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public Var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterVar_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitVar_dec(this);
		}
	}

	public final Var_decContext var_dec() throws RecognitionException {
		Var_decContext _localctx = new Var_decContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			type();
			setState(107);
			match(ID);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(108);
				match(COMMA);
				setState(109);
				type();
				setState(110);
				match(ID);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(PVIRG);
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
		public TerminalNode INTV() { return getToken(DecafParser.INTV, 0); }
		public TerminalNode BOOLEAN() { return getToken(DecafParser.BOOLEAN, 0); }
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
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==INTV) ) {
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

	public static class StateContext extends ParserRuleContext {
		public LocContext loc() {
			return getRuleContext(LocContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PVIRG() { return getToken(DecafParser.PVIRG, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode IF() { return getToken(DecafParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(DecafParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(DecafParser.RPAR, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DecafParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode OPIGU() { return getToken(DecafParser.OPIGU, 0); }
		public TerminalNode COMMA() { return getToken(DecafParser.COMMA, 0); }
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(DecafParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(DecafParser.CONTINUE, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_state);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				loc();
				setState(122);
				assign_op();
				setState(123);
				expr(0);
				setState(124);
				match(PVIRG);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				method_call();
				setState(127);
				match(PVIRG);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(IF);
				setState(130);
				match(LPAR);
				setState(131);
				expr(0);
				setState(132);
				match(RPAR);
				setState(133);
				block();
				setState(136);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(134);
					match(ELSE);
					setState(135);
					block();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(FOR);
				setState(139);
				match(ID);
				setState(140);
				match(OPIGU);
				setState(141);
				expr(0);
				setState(142);
				match(COMMA);
				setState(143);
				expr(0);
				setState(144);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				match(RETURN);
				setState(148);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << CALLOUT) | (1L << BOOLEANS) | (1L << INT) | (1L << ID) | (1L << MUNDCHAR) | (1L << OPNEG) | (1L << DIF))) != 0)) {
					{
					setState(147);
					expr(0);
					}
				}

				setState(150);
				match(PVIRG);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				match(BREAK);
				setState(152);
				match(PVIRG);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(153);
				match(CONTINUE);
				setState(154);
				match(PVIRG);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(155);
				block();
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
		public TerminalNode OPIGU() { return getToken(DecafParser.OPIGU, 0); }
		public TerminalNode OPMIG() { return getToken(DecafParser.OPMIG, 0); }
		public TerminalNode OPMME() { return getToken(DecafParser.OPMME, 0); }
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
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPIGU) | (1L << OPMIG) | (1L << OPMME))) != 0)) ) {
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
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(DecafParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(DecafParser.RPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public TerminalNode CALLOUT() { return getToken(DecafParser.CALLOUT, 0); }
		public TerminalNode STRING_() { return getToken(DecafParser.STRING_, 0); }
		public List<Callout_argContext> callout_arg() {
			return getRuleContexts(Callout_argContext.class);
		}
		public Callout_argContext callout_arg(int i) {
			return getRuleContext(Callout_argContext.class,i);
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
			setState(189);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				method_name();
				setState(161);
				match(LPAR);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << CALLOUT) | (1L << BOOLEANS) | (1L << INT) | (1L << ID) | (1L << MUNDCHAR) | (1L << OPNEG) | (1L << DIF))) != 0)) {
					{
					{
					setState(162);
					expr(0);
					setState(165);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(163);
						match(COMMA);
						setState(164);
						expr(0);
						}
					}

					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
				match(RPAR);
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(CALLOUT);
				setState(175);
				match(LPAR);
				setState(176);
				match(STRING_);
				setState(186);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(177);
					match(COMMA);
					setState(178);
					callout_arg();
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(179);
						match(COMMA);
						setState(180);
						callout_arg();
						}
						}
						setState(185);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(188);
				match(RPAR);
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
			setState(191);
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

	public static class LocContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LBRAC() { return getToken(DecafParser.LBRAC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRAC() { return getToken(DecafParser.RBRAC, 0); }
		public LocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLoc(this);
		}
	}

	public final LocContext loc() throws RecognitionException {
		LocContext _localctx = new LocContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_loc);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(ID);
				setState(195);
				match(LBRAC);
				setState(196);
				expr(0);
				setState(197);
				match(RBRAC);
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

	public static class ExprContext extends ParserRuleContext {
		public LocContext loc() {
			return getRuleContext(LocContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode OPNEG() { return getToken(DecafParser.OPNEG, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIF() { return getToken(DecafParser.DIF, 0); }
		public TerminalNode LPAR() { return getToken(DecafParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(DecafParser.RPAR, 0); }
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(202);
				loc();
				}
				break;
			case 2:
				{
				setState(203);
				method_call();
				}
				break;
			case 3:
				{
				setState(204);
				literal();
				}
				break;
			case 4:
				{
				setState(205);
				match(OPNEG);
				setState(206);
				expr(3);
				}
				break;
			case 5:
				{
				setState(207);
				match(DIF);
				setState(208);
				expr(2);
				}
				break;
			case 6:
				{
				setState(209);
				match(LPAR);
				setState(210);
				expr(0);
				setState(211);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(215);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(216);
					bin_op();
					setState(217);
					expr(5);
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(226);
			switch (_input.LA(1)) {
			case LPAR:
			case CALLOUT:
			case BOOLEANS:
			case INT:
			case ID:
			case MUNDCHAR:
			case OPNEG:
			case DIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				expr(0);
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
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
		enterRule(_localctx, 26, RULE_bin_op);
		try {
			setState(232);
			switch (_input.LA(1)) {
			case OPPOS:
			case OPNEG:
			case OPMUL:
			case OPDIV:
			case OPPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				arith_op();
				}
				break;
			case OPMEN:
			case OPMAI:
			case OPMENI:
			case OPMAII:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				rel_op();
				}
				break;
			case OPCIG:
			case OPDIF:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				eq_op();
				}
				break;
			case OPLOGE:
			case OPLOGO:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
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
		public TerminalNode OPPOS() { return getToken(DecafParser.OPPOS, 0); }
		public TerminalNode OPNEG() { return getToken(DecafParser.OPNEG, 0); }
		public TerminalNode OPMUL() { return getToken(DecafParser.OPMUL, 0); }
		public TerminalNode OPDIV() { return getToken(DecafParser.OPDIV, 0); }
		public TerminalNode OPPER() { return getToken(DecafParser.OPPER, 0); }
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
		enterRule(_localctx, 28, RULE_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPPOS) | (1L << OPNEG) | (1L << OPMUL) | (1L << OPDIV) | (1L << OPPER))) != 0)) ) {
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
		public TerminalNode OPMEN() { return getToken(DecafParser.OPMEN, 0); }
		public TerminalNode OPMAI() { return getToken(DecafParser.OPMAI, 0); }
		public TerminalNode OPMENI() { return getToken(DecafParser.OPMENI, 0); }
		public TerminalNode OPMAII() { return getToken(DecafParser.OPMAII, 0); }
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
		enterRule(_localctx, 30, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPMEN) | (1L << OPMAI) | (1L << OPMENI) | (1L << OPMAII))) != 0)) ) {
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
		public TerminalNode OPCIG() { return getToken(DecafParser.OPCIG, 0); }
		public TerminalNode OPDIF() { return getToken(DecafParser.OPDIF, 0); }
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
		enterRule(_localctx, 32, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==OPCIG || _la==OPDIF) ) {
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
		public TerminalNode OPLOGE() { return getToken(DecafParser.OPLOGE, 0); }
		public TerminalNode OPLOGO() { return getToken(DecafParser.OPLOGO, 0); }
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
		enterRule(_localctx, 34, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !(_la==OPLOGE || _la==OPLOGO) ) {
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
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public TerminalNode MUNDCHAR() { return getToken(DecafParser.MUNDCHAR, 0); }
		public TerminalNode BOOLEANS() { return getToken(DecafParser.BOOLEANS, 0); }
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
		enterRule(_localctx, 36, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANS) | (1L << INT) | (1L << MUNDCHAR))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u00f7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\7\2"+
		"\63\n\2\f\2\16\2\66\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3D\n\3\3\3\3\3\3\4\3\4\5\4J\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4T\n\4\f\4\16\4W\13\4\5\4Y\n\4\3\4\3\4\3\4\3\5\3\5\7\5`\n\5\f\5\16\5"+
		"c\13\5\3\5\7\5f\n\5\f\5\16\5i\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"s\n\6\f\6\16\6v\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008b\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u0097\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009f\n\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u00a8\n\n\7\n\u00aa\n\n\f\n\16\n\u00ad\13\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b8\n\n\f\n\16\n\u00bb\13\n\5"+
		"\n\u00bd\n\n\3\n\5\n\u00c0\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ca"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d8\n\r\3\r"+
		"\3\r\3\r\3\r\7\r\u00de\n\r\f\r\16\r\u00e1\13\r\3\16\3\16\5\16\u00e5\n"+
		"\16\3\17\3\17\3\17\3\17\5\17\u00eb\n\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\2\3\30\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&\2\t\4\2\n\n\22\22\3\2\"$\3\2\35!\3\2(+\3\2,-\3\2&\'\4\2\25\26"+
		"\33\33\u0105\2(\3\2\2\2\4C\3\2\2\2\6I\3\2\2\2\b]\3\2\2\2\nl\3\2\2\2\f"+
		"y\3\2\2\2\16\u009e\3\2\2\2\20\u00a0\3\2\2\2\22\u00bf\3\2\2\2\24\u00c1"+
		"\3\2\2\2\26\u00c9\3\2\2\2\30\u00d7\3\2\2\2\32\u00e4\3\2\2\2\34\u00ea\3"+
		"\2\2\2\36\u00ec\3\2\2\2 \u00ee\3\2\2\2\"\u00f0\3\2\2\2$\u00f2\3\2\2\2"+
		"&\u00f4\3\2\2\2()\7\r\2\2)*\7\30\2\2*.\7\4\2\2+-\5\4\3\2,+\3\2\2\2-\60"+
		"\3\2\2\2.,\3\2\2\2./\3\2\2\2/\64\3\2\2\2\60.\3\2\2\2\61\63\5\6\4\2\62"+
		"\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66"+
		"\64\3\2\2\2\678\7\5\2\289\7\2\2\39\3\3\2\2\2:;\5\f\7\2;<\7\30\2\2<D\3"+
		"\2\2\2=>\5\f\7\2>?\7\30\2\2?@\7\b\2\2@A\7\26\2\2AB\7\t\2\2BD\3\2\2\2C"+
		":\3\2\2\2C=\3\2\2\2DE\3\2\2\2EF\7.\2\2F\5\3\2\2\2GJ\5\f\7\2HJ\7\24\2\2"+
		"IG\3\2\2\2IH\3\2\2\2JK\3\2\2\2KL\7\30\2\2LX\7\6\2\2MN\5\f\7\2NU\7\30\2"+
		"\2OP\7/\2\2PQ\5\f\7\2QR\7\30\2\2RT\3\2\2\2SO\3\2\2\2TW\3\2\2\2US\3\2\2"+
		"\2UV\3\2\2\2VY\3\2\2\2WU\3\2\2\2XM\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\7\2"+
		"\2[\\\5\b\5\2\\\7\3\2\2\2]a\7\4\2\2^`\5\n\6\2_^\3\2\2\2`c\3\2\2\2a_\3"+
		"\2\2\2ab\3\2\2\2bg\3\2\2\2ca\3\2\2\2df\5\16\b\2ed\3\2\2\2fi\3\2\2\2ge"+
		"\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\5\2\2k\t\3\2\2\2lm\5\f\7\2"+
		"mt\7\30\2\2no\7/\2\2op\5\f\7\2pq\7\30\2\2qs\3\2\2\2rn\3\2\2\2sv\3\2\2"+
		"\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7.\2\2x\13\3\2\2\2yz\t\2"+
		"\2\2z\r\3\2\2\2{|\5\26\f\2|}\5\20\t\2}~\5\30\r\2~\177\7.\2\2\177\u009f"+
		"\3\2\2\2\u0080\u0081\5\22\n\2\u0081\u0082\7.\2\2\u0082\u009f\3\2\2\2\u0083"+
		"\u0084\7\20\2\2\u0084\u0085\7\6\2\2\u0085\u0086\5\30\r\2\u0086\u0087\7"+
		"\7\2\2\u0087\u008a\5\b\5\2\u0088\u0089\7\17\2\2\u0089\u008b\5\b\5\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u009f\3\2\2\2\u008c\u008d\7\21"+
		"\2\2\u008d\u008e\7\30\2\2\u008e\u008f\7\"\2\2\u008f\u0090\5\30\r\2\u0090"+
		"\u0091\7/\2\2\u0091\u0092\5\30\r\2\u0092\u0093\5\b\5\2\u0093\u009f\3\2"+
		"\2\2\u0094\u0096\7\23\2\2\u0095\u0097\5\30\r\2\u0096\u0095\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009f\7.\2\2\u0099\u009a\7\13"+
		"\2\2\u009a\u009f\7.\2\2\u009b\u009c\7\16\2\2\u009c\u009f\7.\2\2\u009d"+
		"\u009f\5\b\5\2\u009e{\3\2\2\2\u009e\u0080\3\2\2\2\u009e\u0083\3\2\2\2"+
		"\u009e\u008c\3\2\2\2\u009e\u0094\3\2\2\2\u009e\u0099\3\2\2\2\u009e\u009b"+
		"\3\2\2\2\u009e\u009d\3\2\2\2\u009f\17\3\2\2\2\u00a0\u00a1\t\3\2\2\u00a1"+
		"\21\3\2\2\2\u00a2\u00a3\5\24\13\2\u00a3\u00ab\7\6\2\2\u00a4\u00a7\5\30"+
		"\r\2\u00a5\u00a6\7/\2\2\u00a6\u00a8\5\30\r\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a4\3\2\2\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00af\7\7\2\2\u00af\u00c0\3\2\2\2\u00b0\u00b1\7\f"+
		"\2\2\u00b1\u00b2\7\6\2\2\u00b2\u00bc\7\34\2\2\u00b3\u00b4\7/\2\2\u00b4"+
		"\u00b9\5\32\16\2\u00b5\u00b6\7/\2\2\u00b6\u00b8\5\32\16\2\u00b7\u00b5"+
		"\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\7\7\2\2\u00bf\u00a2\3\2\2\2\u00bf"+
		"\u00b0\3\2\2\2\u00c0\23\3\2\2\2\u00c1\u00c2\7\30\2\2\u00c2\25\3\2\2\2"+
		"\u00c3\u00ca\7\30\2\2\u00c4\u00c5\7\30\2\2\u00c5\u00c6\7\b\2\2\u00c6\u00c7"+
		"\5\30\r\2\u00c7\u00c8\7\t\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c3\3\2\2\2"+
		"\u00c9\u00c4\3\2\2\2\u00ca\27\3\2\2\2\u00cb\u00cc\b\r\1\2\u00cc\u00d8"+
		"\5\26\f\2\u00cd\u00d8\5\22\n\2\u00ce\u00d8\5&\24\2\u00cf\u00d0\7\36\2"+
		"\2\u00d0\u00d8\5\30\r\5\u00d1\u00d2\7%\2\2\u00d2\u00d8\5\30\r\4\u00d3"+
		"\u00d4\7\6\2\2\u00d4\u00d5\5\30\r\2\u00d5\u00d6\7\7\2\2\u00d6\u00d8\3"+
		"\2\2\2\u00d7\u00cb\3\2\2\2\u00d7\u00cd\3\2\2\2\u00d7\u00ce\3\2\2\2\u00d7"+
		"\u00cf\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8\u00df\3\2"+
		"\2\2\u00d9\u00da\f\6\2\2\u00da\u00db\5\34\17\2\u00db\u00dc\5\30\r\7\u00dc"+
		"\u00de\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\31\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e5"+
		"\5\30\r\2\u00e3\u00e5\7\34\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2"+
		"\u00e5\33\3\2\2\2\u00e6\u00eb\5\36\20\2\u00e7\u00eb\5 \21\2\u00e8\u00eb"+
		"\5\"\22\2\u00e9\u00eb\5$\23\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2\2\2"+
		"\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\35\3\2\2\2\u00ec\u00ed"+
		"\t\4\2\2\u00ed\37\3\2\2\2\u00ee\u00ef\t\5\2\2\u00ef!\3\2\2\2\u00f0\u00f1"+
		"\t\6\2\2\u00f1#\3\2\2\2\u00f2\u00f3\t\7\2\2\u00f3%\3\2\2\2\u00f4\u00f5"+
		"\t\b\2\2\u00f5\'\3\2\2\2\30.\64CIUXagt\u008a\u0096\u009e\u00a7\u00ab\u00b9"+
		"\u00bc\u00bf\u00c9\u00d7\u00df\u00e4\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}