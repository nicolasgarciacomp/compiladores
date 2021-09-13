// Generated from c:\Users\Nicolas\Desktop\Practica y Construccion de Compiladores\demo\src\main\java\com\example\id.g4 by ANTLR 4.8

package com.example;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class idParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, NUMERO=2, OTRO=3, PA=4, PC=5, LLA=6, LLC=7, PYC=8, COMA=9, ESP=10, 
		WS=11, TIPO=12, OPERACION_A=13, OPERADORES_R=14, OPERACION_L=15, OPERACION_N=16, 
		OP_A=17, OP_R=18, INST_A=19, INST_R=20, INST_R_=21, INST_N=22, WHILE=23, 
		INSTRUCCION=24;
	public static final int
		RULE_s = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"s"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'('", "')'", "'{'", "'}'", "';'", "','", "' '", 
			null, null, null, null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "NUMERO", "OTRO", "PA", "PC", "LLA", "LLC", "PYC", "COMA", 
			"ESP", "WS", "TIPO", "OPERACION_A", "OPERADORES_R", "OPERACION_L", "OPERACION_N", 
			"OP_A", "OP_R", "INST_A", "INST_R", "INST_R_", "INST_N", "WHILE", "INSTRUCCION"
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
	public String getGrammarFileName() { return "id.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public idParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public Token WHILE;
		public Token OP_A;
		public Token OP_R;
		public Token INST_A;
		public Token INST_R;
		public Token INST_N;
		public Token INSTRUCCION;
		public Token ID;
		public Token NUMERO;
		public Token OTRO;
		public TerminalNode WHILE() { return getToken(idParser.WHILE, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode OP_A() { return getToken(idParser.OP_A, 0); }
		public TerminalNode OP_R() { return getToken(idParser.OP_R, 0); }
		public TerminalNode INST_A() { return getToken(idParser.INST_A, 0); }
		public TerminalNode INST_R() { return getToken(idParser.INST_R, 0); }
		public TerminalNode INST_N() { return getToken(idParser.INST_N, 0); }
		public TerminalNode INSTRUCCION() { return getToken(idParser.INSTRUCCION, 0); }
		public TerminalNode ID() { return getToken(idParser.ID, 0); }
		public TerminalNode NUMERO() { return getToken(idParser.NUMERO, 0); }
		public TerminalNode OTRO() { return getToken(idParser.OTRO, 0); }
		public TerminalNode EOF() { return getToken(idParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2);
				((SContext)_localctx).WHILE = match(WHILE);
				 System.out.println("WHILE ->" + ((SContext)_localctx).WHILE.getText() + "<--"); 
				setState(4);
				s();
				}
				break;
			case OP_A:
				enterOuterAlt(_localctx, 2);
				{
				setState(5);
				((SContext)_localctx).OP_A = match(OP_A);
				 System.out.println("OP_A ->" + ((SContext)_localctx).OP_A.getText() + "<--"); 
				setState(7);
				s();
				}
				break;
			case OP_R:
				enterOuterAlt(_localctx, 3);
				{
				setState(8);
				((SContext)_localctx).OP_R = match(OP_R);
				 System.out.println("OP_R ->" + ((SContext)_localctx).OP_R.getText() + "<--"); 
				setState(10);
				s();
				}
				break;
			case INST_A:
				enterOuterAlt(_localctx, 4);
				{
				setState(11);
				((SContext)_localctx).INST_A = match(INST_A);
				 System.out.println("INST_A ->" + ((SContext)_localctx).INST_A.getText() + "<--"); 
				setState(13);
				s();
				}
				break;
			case INST_R:
				enterOuterAlt(_localctx, 5);
				{
				setState(14);
				((SContext)_localctx).INST_R = match(INST_R);
				 System.out.println("INST_R ->" + ((SContext)_localctx).INST_R.getText() + "<--"); 
				setState(16);
				s();
				}
				break;
			case INST_N:
				enterOuterAlt(_localctx, 6);
				{
				setState(17);
				((SContext)_localctx).INST_N = match(INST_N);
				 System.out.println("INST_N ->" + ((SContext)_localctx).INST_N.getText() + "<--"); 
				setState(19);
				s();
				}
				break;
			case INSTRUCCION:
				enterOuterAlt(_localctx, 7);
				{
				setState(20);
				((SContext)_localctx).INSTRUCCION = match(INSTRUCCION);
				 System.out.println("INSTRUCCION ->" + ((SContext)_localctx).INSTRUCCION.getText() + "<--"); 
				setState(22);
				s();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 8);
				{
				setState(23);
				((SContext)_localctx).ID = match(ID);
				 System.out.println("ID ->" + ((SContext)_localctx).ID.getText() + "<--"); 
				setState(25);
				s();
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 9);
				{
				setState(26);
				((SContext)_localctx).NUMERO = match(NUMERO);
				 System.out.println("NUMERO ->" + ((SContext)_localctx).NUMERO.getText() + "<--"); 
				setState(28);
				s();
				}
				break;
			case OTRO:
				enterOuterAlt(_localctx, 10);
				{
				setState(29);
				((SContext)_localctx).OTRO = match(OTRO);
				 System.out.println("Otro ->" + ((SContext)_localctx).OTRO.getText() + "<--"); 
				setState(31);
				s();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 11);
				{
				setState(32);
				match(EOF);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32&\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2$\n\2\3\2\2\2\3\2"+
		"\2\2\2.\2#\3\2\2\2\4\5\7\31\2\2\5\6\b\2\1\2\6$\5\2\2\2\7\b\7\23\2\2\b"+
		"\t\b\2\1\2\t$\5\2\2\2\n\13\7\24\2\2\13\f\b\2\1\2\f$\5\2\2\2\r\16\7\25"+
		"\2\2\16\17\b\2\1\2\17$\5\2\2\2\20\21\7\26\2\2\21\22\b\2\1\2\22$\5\2\2"+
		"\2\23\24\7\30\2\2\24\25\b\2\1\2\25$\5\2\2\2\26\27\7\32\2\2\27\30\b\2\1"+
		"\2\30$\5\2\2\2\31\32\7\3\2\2\32\33\b\2\1\2\33$\5\2\2\2\34\35\7\4\2\2\35"+
		"\36\b\2\1\2\36$\5\2\2\2\37 \7\5\2\2 !\b\2\1\2!$\5\2\2\2\"$\7\2\2\3#\4"+
		"\3\2\2\2#\7\3\2\2\2#\n\3\2\2\2#\r\3\2\2\2#\20\3\2\2\2#\23\3\2\2\2#\26"+
		"\3\2\2\2#\31\3\2\2\2#\34\3\2\2\2#\37\3\2\2\2#\"\3\2\2\2$\3\3\2\2\2\3#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}