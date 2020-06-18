// Generated from Main.g4 by ANTLR 4.8

package com.schemati.compiler.mainLanguage.antlr4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MainLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Type=4, Print=5, Break=6, Continue=7, Start=8, 
		At=9, During=10, If=11, Else=12, For=13, Null=14, Anim=15, Boolean=16, 
		Double=17, Integer=18, Color=19, Seconds=20, Milliseconds=21, Array=22, 
		Void=23, LRp=24, RRp=25, Pointer=26, LBr=27, RBr=28, LPa=29, RPa=30, Comma=31, 
		DblDots=32, Semicolon=33, DblPlus=34, DblMinus=35, Mult=36, Div=37, Mod=38, 
		Sum=39, Sub=40, AddArr=41, RemoveArr=42, DblEqual=43, EqLess=44, EqGreater=45, 
		Equal=46, NtEqual=47, Less=48, Greater=49, ID=50, String=51, Comment=52, 
		WS=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "Type", "Print", "Break", "Continue", "Start", 
			"At", "During", "If", "Else", "For", "Null", "Anim", "Boolean", "Double", 
			"Integer", "Color", "Seconds", "Milliseconds", "Array", "Void", "LRp", 
			"RRp", "Pointer", "LBr", "RBr", "LPa", "RPa", "Comma", "DblDots", "Semicolon", 
			"DblPlus", "DblMinus", "Mult", "Div", "Mod", "Sum", "Sub", "AddArr", 
			"RemoveArr", "DblEqual", "EqLess", "EqGreater", "Equal", "NtEqual", "Less", 
			"Greater", "ID", "String", "Comment", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'return'", "'in'", null, "'print'", "'break'", "'continue'", 
			"'start'", "'at'", "'during'", "'if'", "'else'", "'for'", "'null'", "'anim'", 
			null, null, null, null, null, null, "'[]'", "'Void'", "'['", "']'", "'->'", 
			"'{'", "'}'", "'('", "')'", "','", "':'", "';'", "'++'", "'--'", "'*'", 
			"'/'", "'%'", "'+'", "'-'", "'<<'", "'>>'", "'=='", "'<='", "'>='", "'='", 
			"'!='", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "Type", "Print", "Break", "Continue", "Start", 
			"At", "During", "If", "Else", "For", "Null", "Anim", "Boolean", "Double", 
			"Integer", "Color", "Seconds", "Milliseconds", "Array", "Void", "LRp", 
			"RRp", "Pointer", "LBr", "RBr", "LPa", "RPa", "Comma", "DblDots", "Semicolon", 
			"DblPlus", "DblMinus", "Mult", "Div", "Mod", "Sum", "Sub", "AddArr", 
			"RemoveArr", "DblEqual", "EqLess", "EqGreater", "Equal", "NtEqual", "Less", 
			"Greater", "ID", "String", "Comment", "WS"
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


	public MainLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Main.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u01a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0089"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0091\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u009c\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a6\n\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b1\n\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u00ba\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00c5\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00cf\n\5\5\5\u00d1\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u0117\n\21\3\22\3\22\3\22\3\22\3\23\6\23\u011e\n\23"+
		"\r\23\16\23\u011f\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3"+
		"*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\7\63\u0178\n\63\f\63\16\63\u017b\13\63\3\64"+
		"\3\64\7\64\u017f\n\64\f\64\16\64\u0182\13\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\7\65\u018a\n\65\f\65\16\65\u018d\13\65\3\65\5\65\u0190\n\65\3\65"+
		"\3\65\3\65\3\65\3\65\7\65\u0197\n\65\f\65\16\65\u019a\13\65\3\65\3\65"+
		"\5\65\u019e\n\65\3\65\3\65\3\66\6\66\u01a3\n\66\r\66\16\66\u01a4\3\66"+
		"\3\66\5\u0180\u018b\u0198\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66k\67\3\2\7\3\2\62;\5\2\62;CHch\5\2C\\aac|\6\2\62;"+
		"C\\aac|\5\2\13\f\17\17\"\"\2\u01bf\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5v\3\2\2\2\7}\3\2\2\2\t\u00d0\3\2"+
		"\2\2\13\u00d2\3\2\2\2\r\u00d8\3\2\2\2\17\u00de\3\2\2\2\21\u00e7\3\2\2"+
		"\2\23\u00ed\3\2\2\2\25\u00f0\3\2\2\2\27\u00f7\3\2\2\2\31\u00fa\3\2\2\2"+
		"\33\u00ff\3\2\2\2\35\u0103\3\2\2\2\37\u0108\3\2\2\2!\u0116\3\2\2\2#\u0118"+
		"\3\2\2\2%\u011d\3\2\2\2\'\u0121\3\2\2\2)\u0129\3\2\2\2+\u012c\3\2\2\2"+
		"-\u0130\3\2\2\2/\u0133\3\2\2\2\61\u0138\3\2\2\2\63\u013a\3\2\2\2\65\u013c"+
		"\3\2\2\2\67\u013f\3\2\2\29\u0141\3\2\2\2;\u0143\3\2\2\2=\u0145\3\2\2\2"+
		"?\u0147\3\2\2\2A\u0149\3\2\2\2C\u014b\3\2\2\2E\u014d\3\2\2\2G\u0150\3"+
		"\2\2\2I\u0153\3\2\2\2K\u0155\3\2\2\2M\u0157\3\2\2\2O\u0159\3\2\2\2Q\u015b"+
		"\3\2\2\2S\u015d\3\2\2\2U\u0160\3\2\2\2W\u0163\3\2\2\2Y\u0166\3\2\2\2["+
		"\u0169\3\2\2\2]\u016c\3\2\2\2_\u016e\3\2\2\2a\u0171\3\2\2\2c\u0173\3\2"+
		"\2\2e\u0175\3\2\2\2g\u017c\3\2\2\2i\u019d\3\2\2\2k\u01a2\3\2\2\2mn\7h"+
		"\2\2no\7w\2\2op\7p\2\2pq\7e\2\2qr\7v\2\2rs\7k\2\2st\7q\2\2tu\7p\2\2u\4"+
		"\3\2\2\2vw\7t\2\2wx\7g\2\2xy\7v\2\2yz\7w\2\2z{\7t\2\2{|\7p\2\2|\6\3\2"+
		"\2\2}~\7k\2\2~\177\7p\2\2\177\b\3\2\2\2\u0080\u0081\7U\2\2\u0081\u0082"+
		"\7v\2\2\u0082\u0083\7t\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085"+
		"\u0086\7i\2\2\u0086\u0088\3\2\2\2\u0087\u0089\5-\27\2\u0088\u0087\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u00d1\3\2\2\2\u008a\u008b\7X\2\2\u008b"+
		"\u008c\7q\2\2\u008c\u008d\7k\2\2\u008d\u008e\7f\2\2\u008e\u0090\3\2\2"+
		"\2\u008f\u0091\5-\27\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u00d1"+
		"\3\2\2\2\u0092\u0093\7K\2\2\u0093\u0094\7p\2\2\u0094\u0095\7v\2\2\u0095"+
		"\u0096\7g\2\2\u0096\u0097\7i\2\2\u0097\u0098\7g\2\2\u0098\u0099\7t\2\2"+
		"\u0099\u009b\3\2\2\2\u009a\u009c\5-\27\2\u009b\u009a\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u00d1\3\2\2\2\u009d\u009e\7F\2\2\u009e\u009f\7q\2\2\u009f"+
		"\u00a0\7w\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7g\2\2"+
		"\u00a3\u00a5\3\2\2\2\u00a4\u00a6\5-\27\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00d1\3\2\2\2\u00a7\u00a8\7D\2\2\u00a8\u00a9\7q\2\2\u00a9"+
		"\u00aa\7q\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7c\2\2"+
		"\u00ad\u00ae\7p\2\2\u00ae\u00b0\3\2\2\2\u00af\u00b1\5-\27\2\u00b0\u00af"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00d1\3\2\2\2\u00b2\u00b3\7E\2\2\u00b3"+
		"\u00b4\7q\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7t\2\2"+
		"\u00b7\u00b9\3\2\2\2\u00b8\u00ba\5-\27\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00d1\3\2\2\2\u00bb\u00bc\7X\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\u00be\7e\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7t\2\2"+
		"\u00c1\u00c2\7\64\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c5\5-\27\2\u00c4\u00c3"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00d1\3\2\2\2\u00c6\u00c7\7G\2\2\u00c7"+
		"\u00c8\7p\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7v\2\2"+
		"\u00cb\u00cc\7{\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cf\5-\27\2\u00ce\u00cd"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u0080\3\2\2\2\u00d0"+
		"\u008a\3\2\2\2\u00d0\u0092\3\2\2\2\u00d0\u009d\3\2\2\2\u00d0\u00a7\3\2"+
		"\2\2\u00d0\u00b2\3\2\2\2\u00d0\u00bb\3\2\2\2\u00d0\u00c6\3\2\2\2\u00d1"+
		"\n\3\2\2\2\u00d2\u00d3\7r\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7k\2\2\u00d5"+
		"\u00d6\7p\2\2\u00d6\u00d7\7v\2\2\u00d7\f\3\2\2\2\u00d8\u00d9\7d\2\2\u00d9"+
		"\u00da\7t\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7m\2\2"+
		"\u00dd\16\3\2\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7"+
		"p\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5"+
		"\7w\2\2\u00e5\u00e6\7g\2\2\u00e6\20\3\2\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9"+
		"\7v\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7v\2\2\u00ec"+
		"\22\3\2\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7v\2\2\u00ef\24\3\2\2\2\u00f0"+
		"\u00f1\7f\2\2\u00f1\u00f2\7w\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7k\2\2"+
		"\u00f4\u00f5\7p\2\2\u00f5\u00f6\7i\2\2\u00f6\26\3\2\2\2\u00f7\u00f8\7"+
		"k\2\2\u00f8\u00f9\7h\2\2\u00f9\30\3\2\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc"+
		"\7n\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7g\2\2\u00fe\32\3\2\2\2\u00ff\u0100"+
		"\7h\2\2\u0100\u0101\7q\2\2\u0101\u0102\7t\2\2\u0102\34\3\2\2\2\u0103\u0104"+
		"\7p\2\2\u0104\u0105\7w\2\2\u0105\u0106\7n\2\2\u0106\u0107\7n\2\2\u0107"+
		"\36\3\2\2\2\u0108\u0109\7c\2\2\u0109\u010a\7p\2\2\u010a\u010b\7k\2\2\u010b"+
		"\u010c\7o\2\2\u010c \3\2\2\2\u010d\u010e\7h\2\2\u010e\u010f\7c\2\2\u010f"+
		"\u0110\7n\2\2\u0110\u0111\7u\2\2\u0111\u0117\7g\2\2\u0112\u0113\7v\2\2"+
		"\u0113\u0114\7t\2\2\u0114\u0115\7w\2\2\u0115\u0117\7g\2\2\u0116\u010d"+
		"\3\2\2\2\u0116\u0112\3\2\2\2\u0117\"\3\2\2\2\u0118\u0119\5%\23\2\u0119"+
		"\u011a\7\60\2\2\u011a\u011b\5%\23\2\u011b$\3\2\2\2\u011c\u011e\t\2\2\2"+
		"\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120&\3\2\2\2\u0121\u0122\7%\2\2\u0122\u0123\t\3\2\2\u0123\u0124"+
		"\t\3\2\2\u0124\u0125\t\3\2\2\u0125\u0126\t\3\2\2\u0126\u0127\t\3\2\2\u0127"+
		"\u0128\t\3\2\2\u0128(\3\2\2\2\u0129\u012a\5%\23\2\u012a\u012b\7u\2\2\u012b"+
		"*\3\2\2\2\u012c\u012d\5%\23\2\u012d\u012e\7o\2\2\u012e\u012f\7u\2\2\u012f"+
		",\3\2\2\2\u0130\u0131\7]\2\2\u0131\u0132\7_\2\2\u0132.\3\2\2\2\u0133\u0134"+
		"\7X\2\2\u0134\u0135\7q\2\2\u0135\u0136\7k\2\2\u0136\u0137\7f\2\2\u0137"+
		"\60\3\2\2\2\u0138\u0139\7]\2\2\u0139\62\3\2\2\2\u013a\u013b\7_\2\2\u013b"+
		"\64\3\2\2\2\u013c\u013d\7/\2\2\u013d\u013e\7@\2\2\u013e\66\3\2\2\2\u013f"+
		"\u0140\7}\2\2\u01408\3\2\2\2\u0141\u0142\7\177\2\2\u0142:\3\2\2\2\u0143"+
		"\u0144\7*\2\2\u0144<\3\2\2\2\u0145\u0146\7+\2\2\u0146>\3\2\2\2\u0147\u0148"+
		"\7.\2\2\u0148@\3\2\2\2\u0149\u014a\7<\2\2\u014aB\3\2\2\2\u014b\u014c\7"+
		"=\2\2\u014cD\3\2\2\2\u014d\u014e\7-\2\2\u014e\u014f\7-\2\2\u014fF\3\2"+
		"\2\2\u0150\u0151\7/\2\2\u0151\u0152\7/\2\2\u0152H\3\2\2\2\u0153\u0154"+
		"\7,\2\2\u0154J\3\2\2\2\u0155\u0156\7\61\2\2\u0156L\3\2\2\2\u0157\u0158"+
		"\7\'\2\2\u0158N\3\2\2\2\u0159\u015a\7-\2\2\u015aP\3\2\2\2\u015b\u015c"+
		"\7/\2\2\u015cR\3\2\2\2\u015d\u015e\7>\2\2\u015e\u015f\7>\2\2\u015fT\3"+
		"\2\2\2\u0160\u0161\7@\2\2\u0161\u0162\7@\2\2\u0162V\3\2\2\2\u0163\u0164"+
		"\7?\2\2\u0164\u0165\7?\2\2\u0165X\3\2\2\2\u0166\u0167\7>\2\2\u0167\u0168"+
		"\7?\2\2\u0168Z\3\2\2\2\u0169\u016a\7@\2\2\u016a\u016b\7?\2\2\u016b\\\3"+
		"\2\2\2\u016c\u016d\7?\2\2\u016d^\3\2\2\2\u016e\u016f\7#\2\2\u016f\u0170"+
		"\7?\2\2\u0170`\3\2\2\2\u0171\u0172\7>\2\2\u0172b\3\2\2\2\u0173\u0174\7"+
		"@\2\2\u0174d\3\2\2\2\u0175\u0179\t\4\2\2\u0176\u0178\t\5\2\2\u0177\u0176"+
		"\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"f\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u0180\7$\2\2\u017d\u017f\13\2\2\2"+
		"\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u0181\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\7$\2\2\u0184"+
		"h\3\2\2\2\u0185\u0186\7\61\2\2\u0186\u0187\7\61\2\2\u0187\u018b\3\2\2"+
		"\2\u0188\u018a\13\2\2\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018e\u0190\7\17\2\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u019e\7\f\2\2\u0192\u0193\7\61\2\2\u0193\u0194\7"+
		",\2\2\u0194\u0198\3\2\2\2\u0195\u0197\13\2\2\2\u0196\u0195\3\2\2\2\u0197"+
		"\u019a\3\2\2\2\u0198\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019b\3\2"+
		"\2\2\u019a\u0198\3\2\2\2\u019b\u019c\7,\2\2\u019c\u019e\7\61\2\2\u019d"+
		"\u0185\3\2\2\2\u019d\u0192\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\b\65"+
		"\2\2\u01a0j\3\2\2\2\u01a1\u01a3\t\6\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a7\b\66\2\2\u01a7l\3\2\2\2\25\2\u0088\u0090\u009b\u00a5\u00b0\u00b9"+
		"\u00c4\u00ce\u00d0\u0116\u011f\u0179\u0180\u018b\u018f\u0198\u019d\u01a4"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}