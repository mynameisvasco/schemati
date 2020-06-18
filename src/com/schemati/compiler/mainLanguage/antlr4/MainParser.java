// Generated from Main.g4 by ANTLR 4.8

package com.schemati.compiler.mainLanguage.antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MainParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_controlStruct = 1, RULE_animStruct = 2, RULE_stat = 3, 
		RULE_createVar = 4, RULE_assignVar = 5, RULE_assignFunc = 6, RULE_changeArr = 7, 
		RULE_returnStat = 8, RULE_print = 9, RULE_loopCtrl = 10, RULE_block = 11, 
		RULE_blockFunc = 12, RULE_ifStat = 13, RULE_elseStat = 14, RULE_atTimeDuring = 15, 
		RULE_atEventDuring = 16, RULE_forStat = 17, RULE_startCtrl = 18, RULE_expr = 19, 
		RULE_functionCall = 20, RULE_args = 21, RULE_typedArgs = 22, RULE_typeID = 23, 
		RULE_var = 24, RULE_attr = 25, RULE_vector2 = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "controlStruct", "animStruct", "stat", "createVar", "assignVar", 
			"assignFunc", "changeArr", "returnStat", "print", "loopCtrl", "block", 
			"blockFunc", "ifStat", "elseStat", "atTimeDuring", "atEventDuring", "forStat", 
			"startCtrl", "expr", "functionCall", "args", "typedArgs", "typeID", "var", 
			"attr", "vector2"
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

	@Override
	public String getGrammarFileName() { return "Main.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MainParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<AssignFuncContext> assignFunc() {
			return getRuleContexts(AssignFuncContext.class);
		}
		public AssignFuncContext assignFunc(int i) {
			return getRuleContext(AssignFuncContext.class,i);
		}
		public List<ControlStructContext> controlStruct() {
			return getRuleContexts(ControlStructContext.class);
		}
		public ControlStructContext controlStruct(int i) {
			return getRuleContext(ControlStructContext.class,i);
		}
		public List<AnimStructContext> animStruct() {
			return getRuleContexts(AnimStructContext.class);
		}
		public AnimStructContext animStruct(int i) {
			return getRuleContext(AnimStructContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<StartCtrlContext> startCtrl() {
			return getRuleContexts(StartCtrlContext.class);
		}
		public StartCtrlContext startCtrl(int i) {
			return getRuleContext(StartCtrlContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Type) | (1L << Print) | (1L << Start) | (1L << If) | (1L << For) | (1L << Null) | (1L << Anim) | (1L << Boolean) | (1L << Double) | (1L << Integer) | (1L << Color) | (1L << Seconds) | (1L << Milliseconds) | (1L << Array) | (1L << LBr) | (1L << LPa) | (1L << Sum) | (1L << Sub) | (1L << ID) | (1L << String))) != 0)) {
				{
				setState(60);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Type:
				case Null:
				case Boolean:
				case Double:
				case Integer:
				case Color:
				case Seconds:
				case Milliseconds:
				case Array:
				case LBr:
				case LPa:
				case Sum:
				case Sub:
				case ID:
				case String:
					{
					setState(54);
					stat();
					}
					break;
				case T__0:
					{
					setState(55);
					assignFunc();
					}
					break;
				case If:
				case For:
					{
					setState(56);
					controlStruct();
					}
					break;
				case Anim:
					{
					setState(57);
					animStruct();
					}
					break;
				case Print:
					{
					setState(58);
					print();
					}
					break;
				case Start:
					{
					setState(59);
					startCtrl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(64);
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

	public static class ControlStructContext extends ParserRuleContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public ForStatContext forStat() {
			return getRuleContext(ForStatContext.class,0);
		}
		public ControlStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterControlStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitControlStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitControlStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlStructContext controlStruct() throws RecognitionException {
		ControlStructContext _localctx = new ControlStructContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_controlStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				{
				setState(65);
				ifStat();
				}
				break;
			case For:
				{
				setState(66);
				forStat();
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

	public static class AnimStructContext extends ParserRuleContext {
		public TerminalNode Anim() { return getToken(MainParser.Anim, 0); }
		public TerminalNode LBr() { return getToken(MainParser.LBr, 0); }
		public TerminalNode RBr() { return getToken(MainParser.RBr, 0); }
		public List<AtTimeDuringContext> atTimeDuring() {
			return getRuleContexts(AtTimeDuringContext.class);
		}
		public AtTimeDuringContext atTimeDuring(int i) {
			return getRuleContext(AtTimeDuringContext.class,i);
		}
		public List<AtEventDuringContext> atEventDuring() {
			return getRuleContexts(AtEventDuringContext.class);
		}
		public AtEventDuringContext atEventDuring(int i) {
			return getRuleContext(AtEventDuringContext.class,i);
		}
		public AnimStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAnimStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAnimStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitAnimStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimStructContext animStruct() throws RecognitionException {
		AnimStructContext _localctx = new AnimStructContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_animStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(Anim);
			setState(70);
			match(LBr);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==At) {
				{
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(71);
					atTimeDuring();
					}
					break;
				case 2:
					{
					setState(72);
					atEventDuring();
					}
					break;
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(RBr);
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

	public static class StatContext extends ParserRuleContext {
		public TerminalNode Semicolon() { return getToken(MainParser.Semicolon, 0); }
		public CreateVarContext createVar() {
			return getRuleContext(CreateVarContext.class,0);
		}
		public AssignVarContext assignVar() {
			return getRuleContext(AssignVarContext.class,0);
		}
		public ChangeArrContext changeArr() {
			return getRuleContext(ChangeArrContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(80);
				createVar();
				}
				break;
			case 2:
				{
				setState(81);
				assignVar();
				}
				break;
			case 3:
				{
				setState(82);
				changeArr();
				}
				break;
			case 4:
				{
				setState(83);
				expr(0);
				}
				break;
			}
			setState(86);
			match(Semicolon);
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

	public static class CreateVarContext extends ParserRuleContext {
		public ExprContext e1;
		public TerminalNode Type() { return getToken(MainParser.Type, 0); }
		public TerminalNode ID() { return getToken(MainParser.ID, 0); }
		public TerminalNode Equal() { return getToken(MainParser.Equal, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CreateVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterCreateVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitCreateVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitCreateVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateVarContext createVar() throws RecognitionException {
		CreateVarContext _localctx = new CreateVarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(Type);
			setState(89);
			match(ID);
			setState(90);
			match(Equal);
			setState(91);
			((CreateVarContext)_localctx).e1 = expr(0);
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

	public static class AssignVarContext extends ParserRuleContext {
		public ExprContext e1;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode Equal() { return getToken(MainParser.Equal, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAssignVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAssignVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitAssignVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignVarContext assignVar() throws RecognitionException {
		AssignVarContext _localctx = new AssignVarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			var();
			setState(94);
			match(Equal);
			setState(95);
			((AssignVarContext)_localctx).e1 = expr(0);
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

	public static class AssignFuncContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(MainParser.Type, 0); }
		public TerminalNode ID() { return getToken(MainParser.ID, 0); }
		public TerminalNode LPa() { return getToken(MainParser.LPa, 0); }
		public TerminalNode RPa() { return getToken(MainParser.RPa, 0); }
		public BlockFuncContext blockFunc() {
			return getRuleContext(BlockFuncContext.class,0);
		}
		public TypedArgsContext typedArgs() {
			return getRuleContext(TypedArgsContext.class,0);
		}
		public AssignFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAssignFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAssignFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitAssignFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignFuncContext assignFunc() throws RecognitionException {
		AssignFuncContext _localctx = new AssignFuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__0);
			setState(98);
			match(Type);
			setState(99);
			match(ID);
			setState(100);
			match(LPa);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Type) {
				{
				setState(101);
				typedArgs();
				}
			}

			setState(104);
			match(RPa);
			setState(105);
			blockFunc();
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

	public static class ChangeArrContext extends ParserRuleContext {
		public Token op;
		public TerminalNode ID() { return getToken(MainParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AddArr() { return getToken(MainParser.AddArr, 0); }
		public TerminalNode RemoveArr() { return getToken(MainParser.RemoveArr, 0); }
		public List<TerminalNode> Comma() { return getTokens(MainParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MainParser.Comma, i);
		}
		public ChangeArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterChangeArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitChangeArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitChangeArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChangeArrContext changeArr() throws RecognitionException {
		ChangeArrContext _localctx = new ChangeArrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_changeArr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ID);
			setState(108);
			((ChangeArrContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==AddArr || _la==RemoveArr) ) {
				((ChangeArrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(109);
			expr(0);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(110);
				match(Comma);
				setState(111);
				expr(0);
				}
				}
				setState(116);
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

	public static class ReturnStatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(MainParser.Semicolon, 0); }
		public ReturnStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitReturnStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__1);
			setState(118);
			expr(0);
			setState(119);
			match(Semicolon);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(MainParser.Print, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(MainParser.Semicolon, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(Print);
			setState(122);
			expr(0);
			setState(123);
			match(Semicolon);
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

	public static class LoopCtrlContext extends ParserRuleContext {
		public TerminalNode Semicolon() { return getToken(MainParser.Semicolon, 0); }
		public TerminalNode Break() { return getToken(MainParser.Break, 0); }
		public TerminalNode Continue() { return getToken(MainParser.Continue, 0); }
		public LoopCtrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopCtrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLoopCtrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLoopCtrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitLoopCtrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopCtrlContext loopCtrl() throws RecognitionException {
		LoopCtrlContext _localctx = new LoopCtrlContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_loopCtrl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==Break || _la==Continue) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(126);
			match(Semicolon);
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
		public TerminalNode LBr() { return getToken(MainParser.LBr, 0); }
		public TerminalNode RBr() { return getToken(MainParser.RBr, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<ControlStructContext> controlStruct() {
			return getRuleContexts(ControlStructContext.class);
		}
		public ControlStructContext controlStruct(int i) {
			return getRuleContext(ControlStructContext.class,i);
		}
		public List<AnimStructContext> animStruct() {
			return getRuleContexts(AnimStructContext.class);
		}
		public AnimStructContext animStruct(int i) {
			return getRuleContext(AnimStructContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public LoopCtrlContext loopCtrl() {
			return getRuleContext(LoopCtrlContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(LBr);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Type) | (1L << Print) | (1L << If) | (1L << For) | (1L << Null) | (1L << Anim) | (1L << Boolean) | (1L << Double) | (1L << Integer) | (1L << Color) | (1L << Seconds) | (1L << Milliseconds) | (1L << Array) | (1L << LBr) | (1L << LPa) | (1L << Sum) | (1L << Sub) | (1L << ID) | (1L << String))) != 0)) {
				{
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Type:
				case Null:
				case Boolean:
				case Double:
				case Integer:
				case Color:
				case Seconds:
				case Milliseconds:
				case Array:
				case LBr:
				case LPa:
				case Sum:
				case Sub:
				case ID:
				case String:
					{
					setState(129);
					stat();
					}
					break;
				case If:
				case For:
					{
					setState(130);
					controlStruct();
					}
					break;
				case Anim:
					{
					setState(131);
					animStruct();
					}
					break;
				case Print:
					{
					setState(132);
					print();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(138);
				returnStat();
				}
				break;
			case Break:
			case Continue:
				{
				setState(139);
				loopCtrl();
				}
				break;
			case RBr:
				break;
			default:
				break;
			}
			setState(142);
			match(RBr);
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

	public static class BlockFuncContext extends ParserRuleContext {
		public TerminalNode LBr() { return getToken(MainParser.LBr, 0); }
		public TerminalNode RBr() { return getToken(MainParser.RBr, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<ControlStructContext> controlStruct() {
			return getRuleContexts(ControlStructContext.class);
		}
		public ControlStructContext controlStruct(int i) {
			return getRuleContext(ControlStructContext.class,i);
		}
		public List<AnimStructContext> animStruct() {
			return getRuleContexts(AnimStructContext.class);
		}
		public AnimStructContext animStruct(int i) {
			return getRuleContext(AnimStructContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public BlockFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterBlockFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitBlockFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitBlockFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockFuncContext blockFunc() throws RecognitionException {
		BlockFuncContext _localctx = new BlockFuncContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_blockFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(LBr);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Type) | (1L << Print) | (1L << If) | (1L << For) | (1L << Null) | (1L << Anim) | (1L << Boolean) | (1L << Double) | (1L << Integer) | (1L << Color) | (1L << Seconds) | (1L << Milliseconds) | (1L << Array) | (1L << LBr) | (1L << LPa) | (1L << Sum) | (1L << Sub) | (1L << ID) | (1L << String))) != 0)) {
				{
				setState(149);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Type:
				case Null:
				case Boolean:
				case Double:
				case Integer:
				case Color:
				case Seconds:
				case Milliseconds:
				case Array:
				case LBr:
				case LPa:
				case Sum:
				case Sub:
				case ID:
				case String:
					{
					setState(145);
					stat();
					}
					break;
				case If:
				case For:
					{
					setState(146);
					controlStruct();
					}
					break;
				case Anim:
					{
					setState(147);
					animStruct();
					}
					break;
				case Print:
					{
					setState(148);
					print();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(154);
				returnStat();
				}
			}

			setState(157);
			match(RBr);
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

	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(MainParser.If, 0); }
		public TerminalNode LPa() { return getToken(MainParser.LPa, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPa() { return getToken(MainParser.RPa, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(If);
			setState(160);
			match(LPa);
			setState(161);
			expr(0);
			setState(162);
			match(RPa);
			setState(163);
			block();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(164);
				elseStat();
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

	public static class ElseStatContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(MainParser.Else, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(Else);
			setState(168);
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

	public static class AtTimeDuringContext extends ParserRuleContext {
		public ExprContext start;
		public ExprContext during;
		public TerminalNode At() { return getToken(MainParser.At, 0); }
		public TerminalNode During() { return getToken(MainParser.During, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AtTimeDuringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atTimeDuring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAtTimeDuring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAtTimeDuring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitAtTimeDuring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtTimeDuringContext atTimeDuring() throws RecognitionException {
		AtTimeDuringContext _localctx = new AtTimeDuringContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atTimeDuring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(At);
			setState(171);
			((AtTimeDuringContext)_localctx).start = expr(0);
			setState(172);
			match(During);
			setState(173);
			((AtTimeDuringContext)_localctx).during = expr(0);
			setState(174);
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

	public static class AtEventDuringContext extends ParserRuleContext {
		public Token start;
		public TerminalNode At() { return getToken(MainParser.At, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ID() { return getToken(MainParser.ID, 0); }
		public AtEventDuringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atEventDuring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAtEventDuring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAtEventDuring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitAtEventDuring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtEventDuringContext atEventDuring() throws RecognitionException {
		AtEventDuringContext _localctx = new AtEventDuringContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atEventDuring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(At);
			setState(177);
			((AtEventDuringContext)_localctx).start = match(ID);
			setState(178);
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

	public static class ForStatContext extends ParserRuleContext {
		public Token each;
		public ExprContext end;
		public TerminalNode For() { return getToken(MainParser.For, 0); }
		public TerminalNode LPa() { return getToken(MainParser.LPa, 0); }
		public TerminalNode Type() { return getToken(MainParser.Type, 0); }
		public List<TerminalNode> ID() { return getTokens(MainParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MainParser.ID, i);
		}
		public TerminalNode RPa() { return getToken(MainParser.RPa, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> Semicolon() { return getTokens(MainParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(MainParser.Semicolon, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CreateVarContext createVar() {
			return getRuleContext(CreateVarContext.class,0);
		}
		public List<AssignVarContext> assignVar() {
			return getRuleContexts(AssignVarContext.class);
		}
		public AssignVarContext assignVar(int i) {
			return getRuleContext(AssignVarContext.class,i);
		}
		public ForStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterForStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitForStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitForStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatContext forStat() throws RecognitionException {
		ForStatContext _localctx = new ForStatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forStat);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(For);
				setState(181);
				match(LPa);
				setState(182);
				match(Type);
				setState(183);
				match(ID);
				setState(184);
				((ForStatContext)_localctx).each = match(T__2);
				setState(185);
				match(ID);
				setState(186);
				match(RPa);
				setState(187);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(For);
				setState(189);
				match(LPa);
				setState(192);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Type:
					{
					setState(190);
					createVar();
					}
					break;
				case ID:
					{
					setState(191);
					assignVar();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(194);
				match(Semicolon);
				setState(195);
				((ForStatContext)_localctx).end = expr(0);
				setState(196);
				match(Semicolon);
				setState(199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(197);
					expr(0);
					}
					break;
				case 2:
					{
					setState(198);
					assignVar();
					}
					break;
				}
				setState(201);
				match(RPa);
				setState(202);
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

	public static class StartCtrlContext extends ParserRuleContext {
		public TerminalNode Start() { return getToken(MainParser.Start, 0); }
		public TerminalNode ID() { return getToken(MainParser.ID, 0); }
		public StartCtrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startCtrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterStartCtrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitStartCtrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitStartCtrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartCtrlContext startCtrl() throws RecognitionException {
		StartCtrlContext _localctx = new StartCtrlContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_startCtrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(Start);
			setState(207);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprVarContext extends ExprContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprVarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExprVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExprVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExprVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDoubleContext extends ExprContext {
		public TerminalNode Double() { return getToken(MainParser.Double, 0); }
		public ExprDoubleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExprDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExprDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExprDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCompContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EqGreater() { return getToken(MainParser.EqGreater, 0); }
		public TerminalNode EqLess() { return getToken(MainParser.EqLess, 0); }
		public TerminalNode DblEqual() { return getToken(MainParser.DblEqual, 0); }
		public TerminalNode Greater() { return getToken(MainParser.Greater, 0); }
		public TerminalNode Less() { return getToken(MainParser.Less, 0); }
		public TerminalNode NtEqual() { return getToken(MainParser.NtEqual, 0); }
		public ExprCompContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExprComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExprComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExprComp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprSecondsContext extends ExprContext {
		public TerminalNode Seconds() { return getToken(MainParser.Seconds, 0); }
		public ExprSecondsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExprSeconds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExprSeconds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExprSeconds(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprColorContext extends ExprContext {
		public TerminalNode Color() { return getToken(MainParser.Color, 0); }
		public ExprColorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExprColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExprColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExprColor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParenthesisContext extends ExprContext {
		public TerminalNode LPa() { return getToken(MainParser.LPa, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPa() { return getToken(MainParser.RPa, 0); }
		public ExprParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExprParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExprParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExprParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMillisecondsContext extends ExprContext {
		public TerminalNode Milliseconds() { return getToken(MainParser.Milliseconds, 0); }
		public ExprMillisecondsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExprMilliseconds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExprMilliseconds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExprMilliseconds(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprVecContext extends ExprContext {
		public Vector2Context vector2() {
			return getRuleContext(Vector2Context.class,0);
		}
		public ExprVecContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExprVec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExprVec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExprVec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStrContext extends ExprContext {
		public TerminalNode String() { return getToken(MainParser.String, 0); }
		public ExprStrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExprStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExprStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExprStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprArrayContext extends ExprContext {
		public TerminalNode Array() { return getToken(MainParser.Array, 0); }
		public ExprArrayContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExprArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExprArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExprArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMultDivModContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Mult() { return getToken(MainParser.Mult, 0); }
		public TerminalNode Div() { return getToken(MainParser.Div, 0); }
		public TerminalNode Mod() { return getToken(MainParser.Mod, 0); }
		public ExprMultDivModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExprMultDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExprMultDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExprMultDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAddSubContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Sum() { return getToken(MainParser.Sum, 0); }
		public TerminalNode Sub() { return getToken(MainParser.Sub, 0); }
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprUnaryContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Sub() { return getToken(MainParser.Sub, 0); }
		public TerminalNode Sum() { return getToken(MainParser.Sum, 0); }
		public ExprUnaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExprUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExprUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExprUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFunCallContext extends ExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExprFunCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExprFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExprFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExprFunCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprVarDblOpContext extends ExprContext {
		public Token dbl;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode DblPlus() { return getToken(MainParser.DblPlus, 0); }
		public TerminalNode DblMinus() { return getToken(MainParser.DblMinus, 0); }
		public ExprVarDblOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExprVarDblOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExprVarDblOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExprVarDblOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNullContext extends ExprContext {
		public TerminalNode Null() { return getToken(MainParser.Null, 0); }
		public ExprNullContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExprNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExprNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExprNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIntegerContext extends ExprContext {
		public TerminalNode Integer() { return getToken(MainParser.Integer, 0); }
		public ExprIntegerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExprInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExprInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExprInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolContext extends ExprContext {
		public TerminalNode Boolean() { return getToken(MainParser.Boolean, 0); }
		public ExprBoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExprBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExprBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExprBool(this);
			else return visitor.visitChildren(this);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new ExprUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(210);
				((ExprUnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Sum || _la==Sub) ) {
					((ExprUnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(211);
				expr(18);
				}
				break;
			case 2:
				{
				_localctx = new ExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				match(LPa);
				setState(213);
				expr(0);
				setState(214);
				match(RPa);
				}
				break;
			case 3:
				{
				_localctx = new ExprVecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				vector2();
				}
				break;
			case 4:
				{
				_localctx = new ExprVarDblOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				var();
				setState(218);
				((ExprVarDblOpContext)_localctx).dbl = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DblPlus || _la==DblMinus) ) {
					((ExprVarDblOpContext)_localctx).dbl = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				{
				_localctx = new ExprVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				var();
				}
				break;
			case 6:
				{
				_localctx = new ExprFunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				functionCall();
				}
				break;
			case 7:
				{
				_localctx = new ExprColorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(Color);
				}
				break;
			case 8:
				{
				_localctx = new ExprDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(Double);
				}
				break;
			case 9:
				{
				_localctx = new ExprBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(Boolean);
				}
				break;
			case 10:
				{
				_localctx = new ExprIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(Integer);
				}
				break;
			case 11:
				{
				_localctx = new ExprStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				match(String);
				}
				break;
			case 12:
				{
				_localctx = new ExprArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(Array);
				}
				break;
			case 13:
				{
				_localctx = new ExprSecondsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				match(Seconds);
				}
				break;
			case 14:
				{
				_localctx = new ExprMillisecondsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(Milliseconds);
				}
				break;
			case 15:
				{
				_localctx = new ExprNullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				match(Null);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultDivModContext(new ExprContext(_parentctx, _parentState));
						((ExprMultDivModContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(234);
						((ExprMultDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Mult) | (1L << Div) | (1L << Mod))) != 0)) ) {
							((ExprMultDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(235);
						((ExprMultDivModContext)_localctx).e2 = expr(18);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						((ExprAddSubContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(237);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Sum || _la==Sub) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(238);
						((ExprAddSubContext)_localctx).e2 = expr(17);
						}
						break;
					case 3:
						{
						_localctx = new ExprCompContext(new ExprContext(_parentctx, _parentState));
						((ExprCompContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(240);
						((ExprCompContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DblEqual) | (1L << EqLess) | (1L << EqGreater) | (1L << NtEqual) | (1L << Less) | (1L << Greater))) != 0)) ) {
							((ExprCompContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(241);
						((ExprCompContext)_localctx).e2 = expr(15);
						}
						break;
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MainParser.ID, 0); }
		public TerminalNode LPa() { return getToken(MainParser.LPa, 0); }
		public TerminalNode RPa() { return getToken(MainParser.RPa, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(ID);
			setState(248);
			match(LPa);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(249);
				args();
				}
			}

			setState(252);
			match(RPa);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					attr();
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MainParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MainParser.ID, i);
		}
		public List<TerminalNode> DblDots() { return getTokens(MainParser.DblDots); }
		public TerminalNode DblDots(int i) {
			return getToken(MainParser.DblDots, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(MainParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MainParser.Comma, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ID);
			setState(260);
			match(DblDots);
			setState(261);
			expr(0);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(262);
				match(Comma);
				setState(263);
				match(ID);
				setState(264);
				match(DblDots);
				setState(265);
				expr(0);
				}
				}
				setState(270);
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

	public static class TypedArgsContext extends ParserRuleContext {
		public List<TypeIDContext> typeID() {
			return getRuleContexts(TypeIDContext.class);
		}
		public TypeIDContext typeID(int i) {
			return getRuleContext(TypeIDContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(MainParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MainParser.Comma, i);
		}
		public TypedArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterTypedArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitTypedArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitTypedArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedArgsContext typedArgs() throws RecognitionException {
		TypedArgsContext _localctx = new TypedArgsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typedArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			typeID();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(272);
				match(Comma);
				setState(273);
				typeID();
				}
				}
				setState(278);
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

	public static class TypeIDContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(MainParser.Type, 0); }
		public TerminalNode ID() { return getToken(MainParser.ID, 0); }
		public TypeIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterTypeID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitTypeID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitTypeID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIDContext typeID() throws RecognitionException {
		TypeIDContext _localctx = new TypeIDContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(Type);
			setState(280);
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

	public static class VarContext extends ParserRuleContext {
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	 
		public VarContext() { }
		public void copyFrom(VarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarArrContext extends VarContext {
		public ExprContext index;
		public TerminalNode ID() { return getToken(MainParser.ID, 0); }
		public TerminalNode LRp() { return getToken(MainParser.LRp, 0); }
		public TerminalNode RRp() { return getToken(MainParser.RRp, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public VarArrContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterVarArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitVarArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitVarArr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarIdContext extends VarContext {
		public TerminalNode ID() { return getToken(MainParser.ID, 0); }
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public VarIdContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterVarId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitVarId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitVarId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_var);
		try {
			int _alt;
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new VarArrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(ID);
				setState(283);
				match(LRp);
				setState(284);
				((VarArrContext)_localctx).index = expr(0);
				setState(285);
				match(RRp);
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(286);
						attr();
						}
						} 
					}
					setState(291);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new VarIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(ID);
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(293);
						attr();
						}
						} 
					}
					setState(298);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
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

	public static class AttrContext extends ParserRuleContext {
		public TerminalNode Pointer() { return getToken(MainParser.Pointer, 0); }
		public TerminalNode ID() { return getToken(MainParser.ID, 0); }
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(Pointer);
			setState(302);
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

	public static class Vector2Context extends ParserRuleContext {
		public Token xVal;
		public Token yVal;
		public TerminalNode LBr() { return getToken(MainParser.LBr, 0); }
		public TerminalNode Comma() { return getToken(MainParser.Comma, 0); }
		public TerminalNode RBr() { return getToken(MainParser.RBr, 0); }
		public List<TerminalNode> Integer() { return getTokens(MainParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(MainParser.Integer, i);
		}
		public Vector2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterVector2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitVector2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitVector2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vector2Context vector2() throws RecognitionException {
		Vector2Context _localctx = new Vector2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_vector2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(LBr);
			setState(305);
			((Vector2Context)_localctx).xVal = match(Integer);
			setState(306);
			match(Comma);
			setState(307);
			((Vector2Context)_localctx).yVal = match(Integer);
			setState(308);
			match(RBr);
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
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u0139\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\7\2?\n\2\f\2\16"+
		"\2B\13\2\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\5\5W\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\5\bi\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t"+
		"s\n\t\f\t\16\tv\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u0088\n\r\f\r\16\r\u008b\13\r\3\r\3\r\5\r\u008f"+
		"\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u0098\n\16\f\16\16\16\u009b"+
		"\13\16\3\16\5\16\u009e\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u00a8\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00c3\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ca\n\23\3\23\3\23\3"+
		"\23\5\23\u00cf\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00ea\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25"+
		"\u00f5\n\25\f\25\16\25\u00f8\13\25\3\26\3\26\3\26\5\26\u00fd\n\26\3\26"+
		"\3\26\7\26\u0101\n\26\f\26\16\26\u0104\13\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u010d\n\27\f\27\16\27\u0110\13\27\3\30\3\30\3\30\7\30"+
		"\u0115\n\30\f\30\16\30\u0118\13\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\7\32\u0122\n\32\f\32\16\32\u0125\13\32\3\32\3\32\7\32\u0129\n\32"+
		"\f\32\16\32\u012c\13\32\5\32\u012e\n\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\2\3(\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\66\2\b\3\2+,\3\2\b\t\3\2)*\3\2$%\3\2&(\4\2-/\61\63\2\u0152"+
		"\2@\3\2\2\2\4E\3\2\2\2\6G\3\2\2\2\bV\3\2\2\2\nZ\3\2\2\2\f_\3\2\2\2\16"+
		"c\3\2\2\2\20m\3\2\2\2\22w\3\2\2\2\24{\3\2\2\2\26\177\3\2\2\2\30\u0082"+
		"\3\2\2\2\32\u0092\3\2\2\2\34\u00a1\3\2\2\2\36\u00a9\3\2\2\2 \u00ac\3\2"+
		"\2\2\"\u00b2\3\2\2\2$\u00ce\3\2\2\2&\u00d0\3\2\2\2(\u00e9\3\2\2\2*\u00f9"+
		"\3\2\2\2,\u0105\3\2\2\2.\u0111\3\2\2\2\60\u0119\3\2\2\2\62\u012d\3\2\2"+
		"\2\64\u012f\3\2\2\2\66\u0132\3\2\2\28?\5\b\5\29?\5\16\b\2:?\5\4\3\2;?"+
		"\5\6\4\2<?\5\24\13\2=?\5&\24\2>8\3\2\2\2>9\3\2\2\2>:\3\2\2\2>;\3\2\2\2"+
		"><\3\2\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\3\3\2\2\2B@\3\2\2"+
		"\2CF\5\34\17\2DF\5$\23\2EC\3\2\2\2ED\3\2\2\2F\5\3\2\2\2GH\7\21\2\2HM\7"+
		"\35\2\2IL\5 \21\2JL\5\"\22\2KI\3\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2M"+
		"N\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\36\2\2Q\7\3\2\2\2RW\5\n\6\2SW\5\f\7"+
		"\2TW\5\20\t\2UW\5(\25\2VR\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2WX\3\2"+
		"\2\2XY\7#\2\2Y\t\3\2\2\2Z[\7\6\2\2[\\\7\64\2\2\\]\7\60\2\2]^\5(\25\2^"+
		"\13\3\2\2\2_`\5\62\32\2`a\7\60\2\2ab\5(\25\2b\r\3\2\2\2cd\7\3\2\2de\7"+
		"\6\2\2ef\7\64\2\2fh\7\37\2\2gi\5.\30\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2j"+
		"k\7 \2\2kl\5\32\16\2l\17\3\2\2\2mn\7\64\2\2no\t\2\2\2ot\5(\25\2pq\7!\2"+
		"\2qs\5(\25\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\21\3\2\2\2vt\3\2"+
		"\2\2wx\7\4\2\2xy\5(\25\2yz\7#\2\2z\23\3\2\2\2{|\7\7\2\2|}\5(\25\2}~\7"+
		"#\2\2~\25\3\2\2\2\177\u0080\t\3\2\2\u0080\u0081\7#\2\2\u0081\27\3\2\2"+
		"\2\u0082\u0089\7\35\2\2\u0083\u0088\5\b\5\2\u0084\u0088\5\4\3\2\u0085"+
		"\u0088\5\6\4\2\u0086\u0088\5\24\13\2\u0087\u0083\3\2\2\2\u0087\u0084\3"+
		"\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008e\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008c\u008f\5\22\n\2\u008d\u008f\5\26\f\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\36"+
		"\2\2\u0091\31\3\2\2\2\u0092\u0099\7\35\2\2\u0093\u0098\5\b\5\2\u0094\u0098"+
		"\5\4\3\2\u0095\u0098\5\6\4\2\u0096\u0098\5\24\13\2\u0097\u0093\3\2\2\2"+
		"\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u009b"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009e\5\22\n\2\u009d\u009c\3\2\2\2\u009d\u009e\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7\36\2\2\u00a0\33\3\2\2\2\u00a1"+
		"\u00a2\7\r\2\2\u00a2\u00a3\7\37\2\2\u00a3\u00a4\5(\25\2\u00a4\u00a5\7"+
		" \2\2\u00a5\u00a7\5\30\r\2\u00a6\u00a8\5\36\20\2\u00a7\u00a6\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\35\3\2\2\2\u00a9\u00aa\7\16\2\2\u00aa\u00ab\5\30"+
		"\r\2\u00ab\37\3\2\2\2\u00ac\u00ad\7\13\2\2\u00ad\u00ae\5(\25\2\u00ae\u00af"+
		"\7\f\2\2\u00af\u00b0\5(\25\2\u00b0\u00b1\5\30\r\2\u00b1!\3\2\2\2\u00b2"+
		"\u00b3\7\13\2\2\u00b3\u00b4\7\64\2\2\u00b4\u00b5\5\30\r\2\u00b5#\3\2\2"+
		"\2\u00b6\u00b7\7\17\2\2\u00b7\u00b8\7\37\2\2\u00b8\u00b9\7\6\2\2\u00b9"+
		"\u00ba\7\64\2\2\u00ba\u00bb\7\5\2\2\u00bb\u00bc\7\64\2\2\u00bc\u00bd\7"+
		" \2\2\u00bd\u00cf\5\30\r\2\u00be\u00bf\7\17\2\2\u00bf\u00c2\7\37\2\2\u00c0"+
		"\u00c3\5\n\6\2\u00c1\u00c3\5\f\7\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7#\2\2\u00c5\u00c6\5(\25\2\u00c6"+
		"\u00c9\7#\2\2\u00c7\u00ca\5(\25\2\u00c8\u00ca\5\f\7\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7 \2\2\u00cc"+
		"\u00cd\5\30\r\2\u00cd\u00cf\3\2\2\2\u00ce\u00b6\3\2\2\2\u00ce\u00be\3"+
		"\2\2\2\u00cf%\3\2\2\2\u00d0\u00d1\7\n\2\2\u00d1\u00d2\7\64\2\2\u00d2\'"+
		"\3\2\2\2\u00d3\u00d4\b\25\1\2\u00d4\u00d5\t\4\2\2\u00d5\u00ea\5(\25\24"+
		"\u00d6\u00d7\7\37\2\2\u00d7\u00d8\5(\25\2\u00d8\u00d9\7 \2\2\u00d9\u00ea"+
		"\3\2\2\2\u00da\u00ea\5\66\34\2\u00db\u00dc\5\62\32\2\u00dc\u00dd\t\5\2"+
		"\2\u00dd\u00ea\3\2\2\2\u00de\u00ea\5\62\32\2\u00df\u00ea\5*\26\2\u00e0"+
		"\u00ea\7\25\2\2\u00e1\u00ea\7\23\2\2\u00e2\u00ea\7\22\2\2\u00e3\u00ea"+
		"\7\24\2\2\u00e4\u00ea\7\65\2\2\u00e5\u00ea\7\30\2\2\u00e6\u00ea\7\26\2"+
		"\2\u00e7\u00ea\7\27\2\2\u00e8\u00ea\7\20\2\2\u00e9\u00d3\3\2\2\2\u00e9"+
		"\u00d6\3\2\2\2\u00e9\u00da\3\2\2\2\u00e9\u00db\3\2\2\2\u00e9\u00de\3\2"+
		"\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e0\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9"+
		"\u00e2\3\2\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e5\3\2"+
		"\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00f6\3\2\2\2\u00eb\u00ec\f\23\2\2\u00ec\u00ed\t\6\2\2\u00ed\u00f5\5"+
		"(\25\24\u00ee\u00ef\f\22\2\2\u00ef\u00f0\t\4\2\2\u00f0\u00f5\5(\25\23"+
		"\u00f1\u00f2\f\20\2\2\u00f2\u00f3\t\7\2\2\u00f3\u00f5\5(\25\21\u00f4\u00eb"+
		"\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7)\3\2\2\2\u00f8\u00f6\3\2\2\2"+
		"\u00f9\u00fa\7\64\2\2\u00fa\u00fc\7\37\2\2\u00fb\u00fd\5,\27\2\u00fc\u00fb"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0102\7 \2\2\u00ff"+
		"\u0101\5\64\33\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3"+
		"\2\2\2\u0102\u0103\3\2\2\2\u0103+\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106"+
		"\7\64\2\2\u0106\u0107\7\"\2\2\u0107\u010e\5(\25\2\u0108\u0109\7!\2\2\u0109"+
		"\u010a\7\64\2\2\u010a\u010b\7\"\2\2\u010b\u010d\5(\25\2\u010c\u0108\3"+
		"\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"-\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0116\5\60\31\2\u0112\u0113\7!\2\2"+
		"\u0113\u0115\5\60\31\2\u0114\u0112\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117/\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011a\7\6\2\2\u011a\u011b\7\64\2\2\u011b\61\3\2\2\2\u011c\u011d\7\64"+
		"\2\2\u011d\u011e\7\32\2\2\u011e\u011f\5(\25\2\u011f\u0123\7\33\2\2\u0120"+
		"\u0122\5\64\33\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3"+
		"\2\2\2\u0123\u0124\3\2\2\2\u0124\u012e\3\2\2\2\u0125\u0123\3\2\2\2\u0126"+
		"\u012a\7\64\2\2\u0127\u0129\5\64\33\2\u0128\u0127\3\2\2\2\u0129\u012c"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012d\u011c\3\2\2\2\u012d\u0126\3\2\2\2\u012e\63\3\2\2"+
		"\2\u012f\u0130\7\34\2\2\u0130\u0131\7\64\2\2\u0131\65\3\2\2\2\u0132\u0133"+
		"\7\35\2\2\u0133\u0134\7\24\2\2\u0134\u0135\7!\2\2\u0135\u0136\7\24\2\2"+
		"\u0136\u0137\7\36\2\2\u0137\67\3\2\2\2\36>@EKMVht\u0087\u0089\u008e\u0097"+
		"\u0099\u009d\u00a7\u00c2\u00c9\u00ce\u00e9\u00f4\u00f6\u00fc\u0102\u010e"+
		"\u0116\u0123\u012a\u012d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}