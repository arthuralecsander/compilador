// Generated from /home/uniceub/Arthur/compilador/lab02/provided/skeleton/src/decaf/DecafLexer.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCURLY", "RCURLY", "LPAR", "RPAR", "LBRAC", "RBRAC", "BOOLEAN", "BREAK", 
		"CALLOUT", "CLASS", "CONTINUE", "ELSE", "IF", "FOR", "INTV", "RETURN", 
		"VOID", "BOOLEANS", "INT", "HEXN", "ID", "WS_", "SL_COMMENT", "MUNDCHAR", 
		"STRING_", "OPPOS", "OPNEG", "OPMUL", "OPDIV", "OPPER", "OPIGU", "OPMIG", 
		"OPMME", "DIF", "OPLOGE", "OPLOGO", "OPMEN", "OPMAI", "OPMENI", "OPMAII", 
		"OPCIG", "OPDIF", "PVIRG", "COMMA", "CHARS", "LETRAS", "BACKS", "WSPACE", 
		"SIMBOLS"
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


	public DecafLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DecafLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2/\u013e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00bc\n\23\3\24\6\24\u00bf\n\24\r\24\16\24\u00c0"+
		"\3\24\5\24\u00c4\n\24\3\25\3\25\3\25\3\25\6\25\u00ca\n\25\r\25\16\25\u00cb"+
		"\3\26\3\26\3\26\3\26\7\26\u00d2\n\26\f\26\16\26\u00d5\13\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\7\30\u00e0\n\30\f\30\16\30\u00e3\13"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\6\32\u00ef\n\32"+
		"\r\32\16\32\u00f0\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\3.\5"+
		".\u0128\n.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u0136\n\60\3\61\6\61\u0139\n\61\r\61\16\61\u013a\3\62\3\62\2\2\63\3\4"+
		"\5\5\7\6\t\7\13\b\r\t\17\n\21\13\23\f\25\r\27\16\31\17\33\20\35\21\37"+
		"\22!\23#\24%\25\'\26)\27+\30-\31/\32\61\33\63\34\65\35\67\369\37; =!?"+
		"\"A#C$E%G&I\'K(M)O*Q+S,U-W.Y/[\2]\2_\2a\2c\2\3\2\5\4\2\13\f\"\"\4\2C\\"+
		"c|\7\2\'\'..\60\60<=AA\u014c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3e\3\2\2\2"+
		"\5g\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13m\3\2\2\2\ro\3\2\2\2\17q\3\2\2\2\21"+
		"y\3\2\2\2\23\177\3\2\2\2\25\u0087\3\2\2\2\27\u008d\3\2\2\2\31\u0096\3"+
		"\2\2\2\33\u009b\3\2\2\2\35\u009e\3\2\2\2\37\u00a2\3\2\2\2!\u00a6\3\2\2"+
		"\2#\u00ad\3\2\2\2%\u00bb\3\2\2\2\'\u00c3\3\2\2\2)\u00c5\3\2\2\2+\u00cd"+
		"\3\2\2\2-\u00d6\3\2\2\2/\u00da\3\2\2\2\61\u00e8\3\2\2\2\63\u00ec\3\2\2"+
		"\2\65\u00f4\3\2\2\2\67\u00f6\3\2\2\29\u00f8\3\2\2\2;\u00fa\3\2\2\2=\u00fc"+
		"\3\2\2\2?\u00fe\3\2\2\2A\u0100\3\2\2\2C\u0103\3\2\2\2E\u0106\3\2\2\2G"+
		"\u0108\3\2\2\2I\u010b\3\2\2\2K\u010e\3\2\2\2M\u0110\3\2\2\2O\u0112\3\2"+
		"\2\2Q\u0115\3\2\2\2S\u0118\3\2\2\2U\u011b\3\2\2\2W\u011e\3\2\2\2Y\u0120"+
		"\3\2\2\2[\u0127\3\2\2\2]\u0129\3\2\2\2_\u0135\3\2\2\2a\u0138\3\2\2\2c"+
		"\u013c\3\2\2\2ef\7}\2\2f\4\3\2\2\2gh\7\177\2\2h\6\3\2\2\2ij\7*\2\2j\b"+
		"\3\2\2\2kl\7+\2\2l\n\3\2\2\2mn\7]\2\2n\f\3\2\2\2op\7_\2\2p\16\3\2\2\2"+
		"qr\7d\2\2rs\7q\2\2st\7q\2\2tu\7n\2\2uv\7g\2\2vw\7c\2\2wx\7p\2\2x\20\3"+
		"\2\2\2yz\7d\2\2z{\7t\2\2{|\7g\2\2|}\7c\2\2}~\7m\2\2~\22\3\2\2\2\177\u0080"+
		"\7e\2\2\u0080\u0081\7c\2\2\u0081\u0082\7n\2\2\u0082\u0083\7n\2\2\u0083"+
		"\u0084\7q\2\2\u0084\u0085\7w\2\2\u0085\u0086\7v\2\2\u0086\24\3\2\2\2\u0087"+
		"\u0088\7e\2\2\u0088\u0089\7n\2\2\u0089\u008a\7c\2\2\u008a\u008b\7u\2\2"+
		"\u008b\u008c\7u\2\2\u008c\26\3\2\2\2\u008d\u008e\7e\2\2\u008e\u008f\7"+
		"q\2\2\u008f\u0090\7p\2\2\u0090\u0091\7v\2\2\u0091\u0092\7k\2\2\u0092\u0093"+
		"\7p\2\2\u0093\u0094\7w\2\2\u0094\u0095\7g\2\2\u0095\30\3\2\2\2\u0096\u0097"+
		"\7g\2\2\u0097\u0098\7n\2\2\u0098\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a"+
		"\32\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d\7h\2\2\u009d\34\3\2\2\2\u009e"+
		"\u009f\7h\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7t\2\2\u00a1\36\3\2\2\2\u00a2"+
		"\u00a3\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7v\2\2\u00a5 \3\2\2\2\u00a6"+
		"\u00a7\7t\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7w\2\2"+
		"\u00aa\u00ab\7t\2\2\u00ab\u00ac\7p\2\2\u00ac\"\3\2\2\2\u00ad\u00ae\7x"+
		"\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7f\2\2\u00b1$\3"+
		"\2\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7w\2\2\u00b5"+
		"\u00bc\7g\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7n\2\2"+
		"\u00b9\u00ba\7u\2\2\u00ba\u00bc\7g\2\2\u00bb\u00b2\3\2\2\2\u00bb\u00b6"+
		"\3\2\2\2\u00bc&\3\2\2\2\u00bd\u00bf\4\62;\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c4\3\2"+
		"\2\2\u00c2\u00c4\5)\25\2\u00c3\u00be\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"(\3\2\2\2\u00c5\u00c6\7\62\2\2\u00c6\u00c9\7z\2\2\u00c7\u00ca\5\'\24\2"+
		"\u00c8\u00ca\5]/\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc*\3\2\2\2\u00cd"+
		"\u00d3\5]/\2\u00ce\u00d2\5]/\2\u00cf\u00d2\7a\2\2\u00d0\u00d2\5\'\24\2"+
		"\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4,\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d7\t\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\b\27"+
		"\2\2\u00d9.\3\2\2\2\u00da\u00db\7\61\2\2\u00db\u00dc\7\61\2\2\u00dc\u00e1"+
		"\3\2\2\2\u00dd\u00e0\5[.\2\u00de\u00e0\7)\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7\f\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\b\30\2\2\u00e7\60\3\2\2\2\u00e8\u00e9\7)\2"+
		"\2\u00e9\u00ea\5[.\2\u00ea\u00eb\7)\2\2\u00eb\62\3\2\2\2\u00ec\u00ee\7"+
		"$\2\2\u00ed\u00ef\5[.\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7$"+
		"\2\2\u00f3\64\3\2\2\2\u00f4\u00f5\7-\2\2\u00f5\66\3\2\2\2\u00f6\u00f7"+
		"\7/\2\2\u00f78\3\2\2\2\u00f8\u00f9\7,\2\2\u00f9:\3\2\2\2\u00fa\u00fb\7"+
		"\61\2\2\u00fb<\3\2\2\2\u00fc\u00fd\7\'\2\2\u00fd>\3\2\2\2\u00fe\u00ff"+
		"\7?\2\2\u00ff@\3\2\2\2\u0100\u0101\7-\2\2\u0101\u0102\7?\2\2\u0102B\3"+
		"\2\2\2\u0103\u0104\7/\2\2\u0104\u0105\7?\2\2\u0105D\3\2\2\2\u0106\u0107"+
		"\7#\2\2\u0107F\3\2\2\2\u0108\u0109\7(\2\2\u0109\u010a\7(\2\2\u010aH\3"+
		"\2\2\2\u010b\u010c\7~\2\2\u010c\u010d\7~\2\2\u010dJ\3\2\2\2\u010e\u010f"+
		"\7>\2\2\u010fL\3\2\2\2\u0110\u0111\7@\2\2\u0111N\3\2\2\2\u0112\u0113\7"+
		">\2\2\u0113\u0114\7?\2\2\u0114P\3\2\2\2\u0115\u0116\7@\2\2\u0116\u0117"+
		"\7?\2\2\u0117R\3\2\2\2\u0118\u0119\7?\2\2\u0119\u011a\7?\2\2\u011aT\3"+
		"\2\2\2\u011b\u011c\7#\2\2\u011c\u011d\7?\2\2\u011dV\3\2\2\2\u011e\u011f"+
		"\7=\2\2\u011fX\3\2\2\2\u0120\u0121\7.\2\2\u0121Z\3\2\2\2\u0122\u0128\5"+
		"]/\2\u0123\u0128\5\'\24\2\u0124\u0128\5_\60\2\u0125\u0128\5a\61\2\u0126"+
		"\u0128\5c\62\2\u0127\u0122\3\2\2\2\u0127\u0123\3\2\2\2\u0127\u0124\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\\\3\2\2\2\u0129\u012a"+
		"\t\3\2\2\u012a^\3\2\2\2\u012b\u012c\7^\2\2\u012c\u0136\7p\2\2\u012d\u012e"+
		"\7^\2\2\u012e\u0136\7v\2\2\u012f\u0130\7^\2\2\u0130\u0136\7^\2\2\u0131"+
		"\u0132\7^\2\2\u0132\u0136\7$\2\2\u0133\u0134\7^\2\2\u0134\u0136\7)\2\2"+
		"\u0135\u012b\3\2\2\2\u0135\u012d\3\2\2\2\u0135\u012f\3\2\2\2\u0135\u0131"+
		"\3\2\2\2\u0135\u0133\3\2\2\2\u0136`\3\2\2\2\u0137\u0139\7\"\2\2\u0138"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013bb\3\2\2\2\u013c\u013d\t\4\2\2\u013dd\3\2\2\2\20\2\u00bb\u00c0"+
		"\u00c3\u00c9\u00cb\u00d1\u00d3\u00df\u00e1\u00f0\u0127\u0135\u013a\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}