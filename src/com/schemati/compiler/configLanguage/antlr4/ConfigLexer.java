// Generated from Config.g4 by ANTLR 4.8

package com.schemati.compiler.configLanguage.antlr4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConfigLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, WS=16, Int=17, 
		ID=18, Hex=19, String=20, Double=21, FilePath=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "WS", "Int", "ID", 
			"Hex", "String", "Double", "FilePath"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'include'", "'<'", "'>'", "'fromHeader'", "'('", "')'", "'scene'", 
			"'{'", "'}'", "'title:'", "','", "'width:'", "'height:'", "'scale:'", 
			"'background:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "WS", "Int", "ID", "Hex", "String", "Double", 
			"FilePath"
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


	public ConfigLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Config.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\6\21"+
		"\u0081\n\21\r\21\16\21\u0082\3\21\3\21\3\22\6\22\u0088\n\22\r\22\16\22"+
		"\u0089\3\23\6\23\u008d\n\23\r\23\16\23\u008e\3\24\3\24\6\24\u0093\n\24"+
		"\r\24\16\24\u0094\3\25\3\25\7\25\u0099\n\25\f\25\16\25\u009c\13\25\3\25"+
		"\3\25\3\26\6\26\u00a1\n\26\r\26\16\26\u00a2\3\26\3\26\6\26\u00a7\n\26"+
		"\r\26\16\26\u00a8\3\27\6\27\u00ac\n\27\r\27\16\27\u00ad\3\u009a\2\30\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30\3\2\7\5\2\13\f\17\17\"\"\3\2\62;\5\2"+
		"\62;C\\c|\5\2\62;CHch\6\2/;C\\^^c|\2\u00b6\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\t"+
		";\3\2\2\2\13F\3\2\2\2\rH\3\2\2\2\17J\3\2\2\2\21P\3\2\2\2\23R\3\2\2\2\25"+
		"T\3\2\2\2\27[\3\2\2\2\31]\3\2\2\2\33d\3\2\2\2\35l\3\2\2\2\37s\3\2\2\2"+
		"!\u0080\3\2\2\2#\u0087\3\2\2\2%\u008c\3\2\2\2\'\u0090\3\2\2\2)\u0096\3"+
		"\2\2\2+\u00a0\3\2\2\2-\u00ab\3\2\2\2/\60\7k\2\2\60\61\7p\2\2\61\62\7e"+
		"\2\2\62\63\7n\2\2\63\64\7w\2\2\64\65\7f\2\2\65\66\7g\2\2\66\4\3\2\2\2"+
		"\678\7>\2\28\6\3\2\2\29:\7@\2\2:\b\3\2\2\2;<\7h\2\2<=\7t\2\2=>\7q\2\2"+
		">?\7o\2\2?@\7J\2\2@A\7g\2\2AB\7c\2\2BC\7f\2\2CD\7g\2\2DE\7t\2\2E\n\3\2"+
		"\2\2FG\7*\2\2G\f\3\2\2\2HI\7+\2\2I\16\3\2\2\2JK\7u\2\2KL\7e\2\2LM\7g\2"+
		"\2MN\7p\2\2NO\7g\2\2O\20\3\2\2\2PQ\7}\2\2Q\22\3\2\2\2RS\7\177\2\2S\24"+
		"\3\2\2\2TU\7v\2\2UV\7k\2\2VW\7v\2\2WX\7n\2\2XY\7g\2\2YZ\7<\2\2Z\26\3\2"+
		"\2\2[\\\7.\2\2\\\30\3\2\2\2]^\7y\2\2^_\7k\2\2_`\7f\2\2`a\7v\2\2ab\7j\2"+
		"\2bc\7<\2\2c\32\3\2\2\2de\7j\2\2ef\7g\2\2fg\7k\2\2gh\7i\2\2hi\7j\2\2i"+
		"j\7v\2\2jk\7<\2\2k\34\3\2\2\2lm\7u\2\2mn\7e\2\2no\7c\2\2op\7n\2\2pq\7"+
		"g\2\2qr\7<\2\2r\36\3\2\2\2st\7d\2\2tu\7c\2\2uv\7e\2\2vw\7m\2\2wx\7i\2"+
		"\2xy\7t\2\2yz\7q\2\2z{\7w\2\2{|\7p\2\2|}\7f\2\2}~\7<\2\2~ \3\2\2\2\177"+
		"\u0081\t\2\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\21\2\2\u0085"+
		"\"\3\2\2\2\u0086\u0088\t\3\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2"+
		"\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a$\3\2\2\2\u008b\u008d\t"+
		"\4\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f&\3\2\2\2\u0090\u0092\7%\2\2\u0091\u0093\t\5\2\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095(\3\2\2\2\u0096\u009a\7$\2\2\u0097\u0099\13\2\2\2\u0098\u0097"+
		"\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7$\2\2\u009e*\3\2\2\2\u009f"+
		"\u00a1\t\3\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\7\60\2\2\u00a5"+
		"\u00a7\t\3\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9,\3\2\2\2\u00aa\u00ac\t\6\2\2\u00ab\u00aa"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		".\3\2\2\2\13\2\u0082\u0089\u008e\u0094\u009a\u00a2\u00a8\u00ad\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}