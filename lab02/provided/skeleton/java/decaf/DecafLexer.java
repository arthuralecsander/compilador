// Generated from /home/uniceub/Compila/compilador/lab02/provided/skeleton/src/decaf/DecafLexer.g4 by ANTLR 4.5.3

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
		PARENTESESDIR=1, PARENTESESESQ=2, CHAVEDIR=3, CHAVESQ=4, COLCHETEDIR=5, 
		COLCHETESQ=6, PONTOVIRGULA=7, VIRGULA=8, BARRAVERTICAL=9, BARRABARRA=10, 
		BARRA=11, PORCENTAGEM=12, AND=13, BOOL=14, CALL=15, CLASS=16, T_INT=17, 
		RETURN=18, VOID=19, FOR=20, BREAK=21, CONTINUE=22, ADICAO=23, SUBTRACAO=24, 
		MULTIPLICACAO=25, EXCLAMACAO=26, DIFERENTED=27, IGUAL=28, IGUALIGUAL=29, 
		MAIORQUE=30, MENORQUE=31, MAIORIGUAL=32, MENORIGUAL=33, MAISIGUAL=34, 
		MENOSIGUAL=35, BOOLEAN=36, IF=37, ELSE=38, INT=39, HEXN=40, MUNDCHAR=41, 
		STRING_=42, ID=43, WS_=44, SL_COMMENT=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PARENTESESDIR", "PARENTESESESQ", "CHAVEDIR", "CHAVESQ", "COLCHETEDIR", 
		"COLCHETESQ", "PONTOVIRGULA", "VIRGULA", "BARRAVERTICAL", "BARRABARRA", 
		"BARRA", "PORCENTAGEM", "AND", "BOOL", "CALL", "CLASS", "T_INT", "RETURN", 
		"VOID", "FOR", "BREAK", "CONTINUE", "ADICAO", "SUBTRACAO", "MULTIPLICACAO", 
		"EXCLAMACAO", "DIFERENTED", "IGUAL", "IGUALIGUAL", "MAIORQUE", "MENORQUE", 
		"MAIORIGUAL", "MENORIGUAL", "MAISIGUAL", "MENOSIGUAL", "BOOLEAN", "IF", 
		"ELSE", "INT", "HEXN", "MUNDCHAR", "STRING_", "CARAC", "ID", "WS_", "SL_COMMENT", 
		"CHARS", "ESC", "WSPACE", "BACKS", "SIMBOLS", "LETRAS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2/\u014d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\5%\u00ea\n%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\6(\u00f5"+
		"\n(\r(\16(\u00f6\3(\5(\u00fa\n(\3)\3)\3)\3)\6)\u0100\n)\r)\16)\u0101\3"+
		"*\3*\3*\3*\3+\3+\3+\6+\u010b\n+\r+\16+\u010c\3+\3+\3,\3,\3,\5,\u0114\n"+
		",\3-\3-\5-\u0118\n-\3-\3-\3-\7-\u011d\n-\f-\16-\u0120\13-\3.\3.\3.\3."+
		"\3/\3/\3/\3/\7/\u012a\n/\f/\16/\u012d\13/\3/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\60\5\60\u0138\n\60\3\61\3\61\3\61\3\62\6\62\u013e\n\62\r\62\16\62"+
		"\u013f\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0148\n\63\3\64\3\64\3\65\3"+
		"\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W\2Y-[.]/_\2a\2c\2e\2g\2i\2\3\2"+
		"\n\5\2$$))^^\4\2\13\f\"\"\3\2\f\f\6\2$$^^ppvv\4\2..\60\60\4\2<<pp\7\2"+
		"\'\'..\60\60<=AA\4\2C\\c|\u015a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\3k\3\2\2\2\5m\3\2\2\2\7o\3\2\2\2\tq\3\2\2\2\13s\3\2\2\2\ru\3\2\2"+
		"\2\17w\3\2\2\2\21y\3\2\2\2\23{\3\2\2\2\25}\3\2\2\2\27\u0080\3\2\2\2\31"+
		"\u0082\3\2\2\2\33\u0084\3\2\2\2\35\u0087\3\2\2\2\37\u008f\3\2\2\2!\u0097"+
		"\3\2\2\2#\u009d\3\2\2\2%\u00a1\3\2\2\2\'\u00a8\3\2\2\2)\u00ad\3\2\2\2"+
		"+\u00b1\3\2\2\2-\u00b7\3\2\2\2/\u00c0\3\2\2\2\61\u00c2\3\2\2\2\63\u00c4"+
		"\3\2\2\2\65\u00c6\3\2\2\2\67\u00c8\3\2\2\29\u00cb\3\2\2\2;\u00cd\3\2\2"+
		"\2=\u00d0\3\2\2\2?\u00d2\3\2\2\2A\u00d4\3\2\2\2C\u00d7\3\2\2\2E\u00da"+
		"\3\2\2\2G\u00dd\3\2\2\2I\u00e9\3\2\2\2K\u00eb\3\2\2\2M\u00ee\3\2\2\2O"+
		"\u00f9\3\2\2\2Q\u00fb\3\2\2\2S\u0103\3\2\2\2U\u0107\3\2\2\2W\u0110\3\2"+
		"\2\2Y\u0117\3\2\2\2[\u0121\3\2\2\2]\u0125\3\2\2\2_\u0137\3\2\2\2a\u0139"+
		"\3\2\2\2c\u013d\3\2\2\2e\u0147\3\2\2\2g\u0149\3\2\2\2i\u014b\3\2\2\2k"+
		"l\7+\2\2l\4\3\2\2\2mn\7*\2\2n\6\3\2\2\2op\7\177\2\2p\b\3\2\2\2qr\7}\2"+
		"\2r\n\3\2\2\2st\7_\2\2t\f\3\2\2\2uv\7]\2\2v\16\3\2\2\2wx\7=\2\2x\20\3"+
		"\2\2\2yz\7.\2\2z\22\3\2\2\2{|\7~\2\2|\24\3\2\2\2}~\7~\2\2~\177\7~\2\2"+
		"\177\26\3\2\2\2\u0080\u0081\7\61\2\2\u0081\30\3\2\2\2\u0082\u0083\7\'"+
		"\2\2\u0083\32\3\2\2\2\u0084\u0085\7(\2\2\u0085\u0086\7(\2\2\u0086\34\3"+
		"\2\2\2\u0087\u0088\7d\2\2\u0088\u0089\7q\2\2\u0089\u008a\7q\2\2\u008a"+
		"\u008b\7n\2\2\u008b\u008c\7g\2\2\u008c\u008d\7c\2\2\u008d\u008e\7p\2\2"+
		"\u008e\36\3\2\2\2\u008f\u0090\7e\2\2\u0090\u0091\7c\2\2\u0091\u0092\7"+
		"n\2\2\u0092\u0093\7n\2\2\u0093\u0094\7q\2\2\u0094\u0095\7w\2\2\u0095\u0096"+
		"\7v\2\2\u0096 \3\2\2\2\u0097\u0098\7e\2\2\u0098\u0099\7n\2\2\u0099\u009a"+
		"\7c\2\2\u009a\u009b\7u\2\2\u009b\u009c\7u\2\2\u009c\"\3\2\2\2\u009d\u009e"+
		"\7k\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7v\2\2\u00a0$\3\2\2\2\u00a1\u00a2"+
		"\7t\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7w\2\2\u00a5"+
		"\u00a6\7t\2\2\u00a6\u00a7\7p\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7x\2\2\u00a9"+
		"\u00aa\7q\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7f\2\2\u00ac(\3\2\2\2\u00ad"+
		"\u00ae\7h\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7t\2\2\u00b0*\3\2\2\2\u00b1"+
		"\u00b2\7d\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7c\2\2"+
		"\u00b5\u00b6\7m\2\2\u00b6,\3\2\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7q\2"+
		"\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd"+
		"\7p\2\2\u00bd\u00be\7w\2\2\u00be\u00bf\7g\2\2\u00bf.\3\2\2\2\u00c0\u00c1"+
		"\7-\2\2\u00c1\60\3\2\2\2\u00c2\u00c3\7/\2\2\u00c3\62\3\2\2\2\u00c4\u00c5"+
		"\7,\2\2\u00c5\64\3\2\2\2\u00c6\u00c7\7#\2\2\u00c7\66\3\2\2\2\u00c8\u00c9"+
		"\7#\2\2\u00c9\u00ca\7?\2\2\u00ca8\3\2\2\2\u00cb\u00cc\7?\2\2\u00cc:\3"+
		"\2\2\2\u00cd\u00ce\7?\2\2\u00ce\u00cf\7?\2\2\u00cf<\3\2\2\2\u00d0\u00d1"+
		"\7@\2\2\u00d1>\3\2\2\2\u00d2\u00d3\7>\2\2\u00d3@\3\2\2\2\u00d4\u00d5\7"+
		"@\2\2\u00d5\u00d6\7?\2\2\u00d6B\3\2\2\2\u00d7\u00d8\7>\2\2\u00d8\u00d9"+
		"\7?\2\2\u00d9D\3\2\2\2\u00da\u00db\7-\2\2\u00db\u00dc\7?\2\2\u00dcF\3"+
		"\2\2\2\u00dd\u00de\7/\2\2\u00de\u00df\7?\2\2\u00dfH\3\2\2\2\u00e0\u00e1"+
		"\7v\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7w\2\2\u00e3\u00ea\7g\2\2\u00e4"+
		"\u00e5\7h\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7u\2\2"+
		"\u00e8\u00ea\7g\2\2\u00e9\u00e0\3\2\2\2\u00e9\u00e4\3\2\2\2\u00eaJ\3\2"+
		"\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7h\2\2\u00edL\3\2\2\2\u00ee\u00ef"+
		"\7g\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7g\2\2\u00f2"+
		"N\3\2\2\2\u00f3\u00f5\4\62;\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2"+
		"\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00fa"+
		"\5Q)\2\u00f9\u00f4\3\2\2\2\u00f9\u00f8\3\2\2\2\u00faP\3\2\2\2\u00fb\u00fc"+
		"\7\62\2\2\u00fc\u00ff\7z\2\2\u00fd\u0100\5O(\2\u00fe\u0100\5i\65\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102R\3\2\2\2\u0103\u0104\7)\2\2\u0104\u0105"+
		"\5_\60\2\u0105\u0106\7)\2\2\u0106T\3\2\2\2\u0107\u010a\7$\2\2\u0108\u010b"+
		"\5_\60\2\u0109\u010b\5W,\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u010f\7$\2\2\u010fV\3\2\2\2\u0110\u0113\7^\2\2\u0111\u0114"+
		"\t\2\2\2\u0112\u0114\5Y-\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114"+
		"X\3\2\2\2\u0115\u0118\5i\65\2\u0116\u0118\7a\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0116\3\2\2\2\u0118\u011e\3\2\2\2\u0119\u011d\5i\65\2\u011a\u011d\7a"+
		"\2\2\u011b\u011d\5O(\2\u011c\u0119\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b"+
		"\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"Z\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\t\3\2\2\u0122\u0123\3\2\2\2"+
		"\u0123\u0124\b.\2\2\u0124\\\3\2\2\2\u0125\u0126\7\61\2\2\u0126\u0127\7"+
		"\61\2\2\u0127\u012b\3\2\2\2\u0128\u012a\n\4\2\2\u0129\u0128\3\2\2\2\u012a"+
		"\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7\f\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\b/\2\2\u0131^\3\2\2\2\u0132\u0138\5i\65\2\u0133\u0138\5O(\2\u0134"+
		"\u0138\5e\63\2\u0135\u0138\5c\62\2\u0136\u0138\5g\64\2\u0137\u0132\3\2"+
		"\2\2\u0137\u0133\3\2\2\2\u0137\u0134\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0136\3\2\2\2\u0138`\3\2\2\2\u0139\u013a\7^\2\2\u013a\u013b\t\5\2\2\u013b"+
		"b\3\2\2\2\u013c\u013e\7\"\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2"+
		"\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140d\3\2\2\2\u0141\u0142\7"+
		"^\2\2\u0142\u0148\7$\2\2\u0143\u0148\t\6\2\2\u0144\u0145\7^\2\2\u0145"+
		"\u0148\7)\2\2\u0146\u0148\t\7\2\2\u0147\u0141\3\2\2\2\u0147\u0143\3\2"+
		"\2\2\u0147\u0144\3\2\2\2\u0147\u0146\3\2\2\2\u0148f\3\2\2\2\u0149\u014a"+
		"\t\b\2\2\u014ah\3\2\2\2\u014b\u014c\t\t\2\2\u014cj\3\2\2\2\22\2\u00e9"+
		"\u00f6\u00f9\u00ff\u0101\u010a\u010c\u0113\u0117\u011c\u011e\u012b\u0137"+
		"\u013f\u0147\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}