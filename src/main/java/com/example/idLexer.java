// Generated from c:\Users\Nicolas\Desktop\Practica y Construccion de Compiladores\demo\src\main\java\com\example\id.g4 by ANTLR 4.8

package com.example;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class idLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, NUMERO=2, OTRO=3, PA=4, PC=5, LLA=6, LLC=7, PYC=8, COMA=9, ESP=10, 
		WS=11, TIPO=12, OPERACION_A=13, OPERADORES_R=14, OPERACION_L=15, OPERACION_N=16, 
		OP_A=17, OP_R=18, INST_A=19, INST_R=20, INST_R_=21, INST_N=22, WHILE=23, 
		INSTRUCCION=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "ID", "NUMERO", "OTRO", "PA", "PC", "LLA", "LLC", 
			"PYC", "COMA", "ESP", "WS", "TIPO", "OPERACION_A", "OPERADORES_R", "OPERACION_L", 
			"OPERACION_N", "OP_A", "OP_R", "INST_A", "INST_R", "INST_R_", "INST_N", 
			"WHILE", "INSTRUCCION"
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


	public idLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "id.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 12:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u012d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\4\6\4?\n\4\r\4\16"+
		"\4@\3\5\6\5D\n\5\r\5\16\5E\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\6\16Y\n\16\r\16\16\16Z\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17u\n\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0083\n\21\3\22\3\22\3\22\3\22\5\22"+
		"\u0089\n\22\3\23\3\23\3\24\3\24\5\24\u008f\n\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u0096\n\24\6\24\u0098\n\24\r\24\16\24\u0099\3\25\3\25\5\25\u009e"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u00a5\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\6\26\u00ac\n\26\r\26\16\26\u00ad\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\6\32\u00d2"+
		"\n\32\r\32\16\32\u00d3\3\32\3\32\3\32\3\32\6\32\u00da\n\32\r\32\16\32"+
		"\u00db\3\32\3\32\6\32\u00e0\n\32\r\32\16\32\u00e1\3\32\6\32\u00e5\n\32"+
		"\r\32\16\32\u00e6\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\6\33\u00ff"+
		"\n\33\r\33\16\33\u0100\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\5\33\u010f\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\6\33"+
		"\u0118\n\33\r\33\16\33\u0119\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0123"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u012a\n\33\5\33\u012c\n\33\2\2\34"+
		"\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37"+
		"\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\3\2\6\4\2C\\c|"+
		"\3\2\62;\5\2\13\f\17\17\"\"\6\2\'\',-//\61\61\2\u014d\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\3\67\3\2\2\2\59\3\2\2\2\7>\3\2\2\2\tC\3\2\2\2\13G\3\2\2\2\rI\3\2\2\2"+
		"\17K\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31U\3\2\2"+
		"\2\33X\3\2\2\2\35t\3\2\2\2\37v\3\2\2\2!\u0082\3\2\2\2#\u0088\3\2\2\2%"+
		"\u008a\3\2\2\2\'\u008e\3\2\2\2)\u009d\3\2\2\2+\u00a6\3\2\2\2-\u00b1\3"+
		"\2\2\2/\u00bb\3\2\2\2\61\u00c1\3\2\2\2\63\u00c7\3\2\2\2\65\u012b\3\2\2"+
		"\2\678\t\2\2\28\4\3\2\2\29:\t\3\2\2:\6\3\2\2\2;?\5\3\2\2<?\5\5\3\2=?\7"+
		"a\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\b\3"+
		"\2\2\2BD\5\5\3\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\n\3\2\2\2GH"+
		"\13\2\2\2H\f\3\2\2\2IJ\7*\2\2J\16\3\2\2\2KL\7+\2\2L\20\3\2\2\2MN\7}\2"+
		"\2N\22\3\2\2\2OP\7\177\2\2P\24\3\2\2\2QR\7=\2\2R\26\3\2\2\2ST\7.\2\2T"+
		"\30\3\2\2\2UV\7\"\2\2V\32\3\2\2\2WY\t\4\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2"+
		"\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\b\16\2\2]\34\3\2\2\2^_\7k\2\2_`\7p\2\2`u"+
		"\7v\2\2ab\7n\2\2bc\7q\2\2cd\7p\2\2du\7i\2\2ef\7h\2\2fg\7n\2\2gh\7q\2\2"+
		"hi\7c\2\2iu\7v\2\2jk\7f\2\2kl\7q\2\2lm\7w\2\2mn\7d\2\2no\7n\2\2ou\7g\2"+
		"\2pq\7e\2\2qr\7j\2\2rs\7c\2\2su\7t\2\2t^\3\2\2\2ta\3\2\2\2te\3\2\2\2t"+
		"j\3\2\2\2tp\3\2\2\2u\36\3\2\2\2vw\t\5\2\2w \3\2\2\2x\u0083\7>\2\2yz\7"+
		">\2\2z\u0083\7?\2\2{\u0083\7@\2\2|}\7@\2\2}\u0083\7?\2\2~\177\7?\2\2\177"+
		"\u0083\7?\2\2\u0080\u0081\7#\2\2\u0081\u0083\7?\2\2\u0082x\3\2\2\2\u0082"+
		"y\3\2\2\2\u0082{\3\2\2\2\u0082|\3\2\2\2\u0082~\3\2\2\2\u0082\u0080\3\2"+
		"\2\2\u0083\"\3\2\2\2\u0084\u0085\7(\2\2\u0085\u0089\7(\2\2\u0086\u0087"+
		"\7~\2\2\u0087\u0089\7~\2\2\u0088\u0084\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"$\3\2\2\2\u008a\u008b\7#\2\2\u008b&\3\2\2\2\u008c\u008f\5\7\4\2\u008d"+
		"\u008f\5\t\5\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\u0097\3\2"+
		"\2\2\u0090\u0091\5\31\r\2\u0091\u0092\5\37\20\2\u0092\u0095\5\31\r\2\u0093"+
		"\u0096\5\7\4\2\u0094\u0096\5\t\5\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0090\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a(\3\2\2\2\u009b\u009e\5\7\4\2"+
		"\u009c\u009e\5\t\5\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a0\5\31\r\2\u00a0\u00a1\5!\21\2\u00a1\u00a4\5\31\r\2"+
		"\u00a2\u00a5\5\7\4\2\u00a3\u00a5\5\t\5\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5*\3\2\2\2\u00a6\u00a7\5\7\4\2\u00a7\u00a8\5\31\r\2\u00a8"+
		"\u00a9\7?\2\2\u00a9\u00ab\5\31\r\2\u00aa\u00ac\5\'\24\2\u00ab\u00aa\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\5\25\13\2\u00b0,\3\2\2\2\u00b1\u00b2\5\r\7"+
		"\2\u00b2\u00b3\5)\25\2\u00b3\u00b4\5\17\b\2\u00b4\u00b5\5\31\r\2\u00b5"+
		"\u00b6\5#\22\2\u00b6\u00b7\5\31\r\2\u00b7\u00b8\5\r\7\2\u00b8\u00b9\5"+
		")\25\2\u00b9\u00ba\5\17\b\2\u00ba.\3\2\2\2\u00bb\u00bc\5)\25\2\u00bc\u00bd"+
		"\5\31\r\2\u00bd\u00be\5#\22\2\u00be\u00bf\5\31\r\2\u00bf\u00c0\5)\25\2"+
		"\u00c0\60\3\2\2\2\u00c1\u00c2\5%\23\2\u00c2\u00c3\5\31\r\2\u00c3\u00c4"+
		"\5\r\7\2\u00c4\u00c5\5)\25\2\u00c5\u00c6\5\17\b\2\u00c6\62\3\2\2\2\u00c7"+
		"\u00c8\7y\2\2\u00c8\u00c9\7j\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7n\2\2"+
		"\u00cb\u00cc\7g\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\5\31\r\2\u00ce\u00d1"+
		"\5\r\7\2\u00cf\u00d2\5)\25\2\u00d0\u00d2\5/\30\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\5\17\b\2\u00d6\u00d7\5\33\16\2\u00d7"+
		"\u00df\5\21\t\2\u00d8\u00da\5\33\16\2\u00d9\u00d8\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\5+\26\2\u00de\u00e0\3\2\2\2\u00df\u00d9\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3"+
		"\u00e5\5\33\16\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3"+
		"\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\5\23\n\2\u00e9"+
		"\64\3\2\2\2\u00ea\u00eb\5\35\17\2\u00eb\u00ec\5\31\r\2\u00ec\u00ed\5\7"+
		"\4\2\u00ed\u00ee\5\25\13\2\u00ee\u012c\3\2\2\2\u00ef\u00f0\5\35\17\2\u00f0"+
		"\u00f1\5\31\r\2\u00f1\u00f2\5\7\4\2\u00f2\u00f3\5\31\r\2\u00f3\u00f4\7"+
		"?\2\2\u00f4\u00f5\5\31\r\2\u00f5\u00f6\5\7\4\2\u00f6\u00f7\5\25\13\2\u00f7"+
		"\u012c\3\2\2\2\u00f8\u00f9\5\35\17\2\u00f9\u00fe\5\31\r\2\u00fa\u00fb"+
		"\5\7\4\2\u00fb\u00fc\7.\2\2\u00fc\u00fd\7\"\2\2\u00fd\u00ff\3\2\2\2\u00fe"+
		"\u00fa\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0103\5\7\4\2\u0103\u0104\5\25\13\2\u0104"+
		"\u012c\3\2\2\2\u0105\u0106\5\35\17\2\u0106\u0117\5\31\r\2\u0107\u0108"+
		"\5\7\4\2\u0108\u0109\5\31\r\2\u0109\u010a\7?\2\2\u010a\u010b\7\"\2\2\u010b"+
		"\u010e\3\2\2\2\u010c\u010f\5\7\4\2\u010d\u010f\5\t\5\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7.\2\2\u0111"+
		"\u0112\7\"\2\2\u0112\u0118\3\2\2\2\u0113\u0114\5\7\4\2\u0114\u0115\7."+
		"\2\2\u0115\u0116\7\"\2\2\u0116\u0118\3\2\2\2\u0117\u0107\3\2\2\2\u0117"+
		"\u0113\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u0129\3\2\2\2\u011b\u011c\5\7\4\2\u011c\u011d\5\31\r\2\u011d"+
		"\u011e\7?\2\2\u011e\u011f\7\"\2\2\u011f\u0122\3\2\2\2\u0120\u0123\5\7"+
		"\4\2\u0121\u0123\5\t\5\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0125\5\25\13\2\u0125\u012a\3\2\2\2\u0126\u0127\5"+
		"\7\4\2\u0127\u0128\5\25\13\2\u0128\u012a\3\2\2\2\u0129\u011b\3\2\2\2\u0129"+
		"\u0126\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u00ea\3\2\2\2\u012b\u00ef\3\2"+
		"\2\2\u012b\u00f8\3\2\2\2\u012b\u0105\3\2\2\2\u012c\66\3\2\2\2\34\2>@E"+
		"Zt\u0082\u0088\u008e\u0095\u0099\u009d\u00a4\u00ad\u00d1\u00d3\u00db\u00e1"+
		"\u00e6\u0100\u010e\u0117\u0119\u0122\u0129\u012b\3\3\16\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}