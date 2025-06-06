// Generated from c://Users//valle//Downloads//guevaraAnalizador//52002//antlr-calculator-project//Usuario.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class UsuarioParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEANO=1, CADENA=2, NUMERO=3, IDENTIFICADOR=4, USUARIO=5, IGUAL=6, PUNTOCOMA=7, 
		LBRACE=8, RBRACE=9, WS=10;
	public static final int
		RULE_programa = 0, RULE_usuario = 1, RULE_atributo = 2, RULE_valor = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "usuario", "atributo", "valor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'usuario'", "'='", "';'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEANO", "CADENA", "NUMERO", "IDENTIFICADOR", "USUARIO", "IGUAL", 
			"PUNTOCOMA", "LBRACE", "RBRACE", "WS"
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
	public String getGrammarFileName() { return "Usuario.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UsuarioParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(UsuarioParser.EOF, 0); }
		public List<UsuarioContext> usuario() {
			return getRuleContexts(UsuarioContext.class);
		}
		public UsuarioContext usuario(int i) {
			return getRuleContext(UsuarioContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsuarioListener ) ((UsuarioListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsuarioListener ) ((UsuarioListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				usuario();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USUARIO );
			setState(13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UsuarioContext extends ParserRuleContext {
		public TerminalNode USUARIO() { return getToken(UsuarioParser.USUARIO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(UsuarioParser.IDENTIFICADOR, 0); }
		public TerminalNode LBRACE() { return getToken(UsuarioParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UsuarioParser.RBRACE, 0); }
		public List<AtributoContext> atributo() {
			return getRuleContexts(AtributoContext.class);
		}
		public AtributoContext atributo(int i) {
			return getRuleContext(AtributoContext.class,i);
		}
		public UsuarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usuario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsuarioListener ) ((UsuarioListener)listener).enterUsuario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsuarioListener ) ((UsuarioListener)listener).exitUsuario(this);
		}
	}

	public final UsuarioContext usuario() throws RecognitionException {
		UsuarioContext _localctx = new UsuarioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_usuario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(USUARIO);
			setState(16);
			match(IDENTIFICADOR);
			setState(17);
			match(LBRACE);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFICADOR) {
				{
				{
				setState(18);
				atributo();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(RBRACE);
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
	public static class AtributoContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(UsuarioParser.IDENTIFICADOR, 0); }
		public TerminalNode IGUAL() { return getToken(UsuarioParser.IGUAL, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(UsuarioParser.PUNTOCOMA, 0); }
		public AtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsuarioListener ) ((UsuarioListener)listener).enterAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsuarioListener ) ((UsuarioListener)listener).exitAtributo(this);
		}
	}

	public final AtributoContext atributo() throws RecognitionException {
		AtributoContext _localctx = new AtributoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atributo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(IDENTIFICADOR);
			setState(27);
			match(IGUAL);
			setState(28);
			valor();
			setState(29);
			match(PUNTOCOMA);
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
	public static class ValorContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(UsuarioParser.CADENA, 0); }
		public TerminalNode NUMERO() { return getToken(UsuarioParser.NUMERO, 0); }
		public TerminalNode BOOLEANO() { return getToken(UsuarioParser.BOOLEANO, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsuarioListener ) ((UsuarioListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsuarioListener ) ((UsuarioListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\n\"\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0004\u0000\n\b"+
		"\u0000\u000b\u0000\f\u0000\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0014\b\u0001\n\u0001\f\u0001"+
		"\u0017\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0000\u0000"+
		"\u0004\u0000\u0002\u0004\u0006\u0000\u0001\u0001\u0000\u0001\u0003\u001f"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0002\u000f\u0001\u0000\u0000\u0000\u0004"+
		"\u001a\u0001\u0000\u0000\u0000\u0006\u001f\u0001\u0000\u0000\u0000\b\n"+
		"\u0003\u0002\u0001\u0000\t\b\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000"+
		"\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000"+
		"\u0000\f\r\u0001\u0000\u0000\u0000\r\u000e\u0005\u0000\u0000\u0001\u000e"+
		"\u0001\u0001\u0000\u0000\u0000\u000f\u0010\u0005\u0005\u0000\u0000\u0010"+
		"\u0011\u0005\u0004\u0000\u0000\u0011\u0015\u0005\b\u0000\u0000\u0012\u0014"+
		"\u0003\u0004\u0002\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0017"+
		"\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0001\u0000\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0015"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0005\t\u0000\u0000\u0019\u0003\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0005\u0004\u0000\u0000\u001b\u001c\u0005"+
		"\u0006\u0000\u0000\u001c\u001d\u0003\u0006\u0003\u0000\u001d\u001e\u0005"+
		"\u0007\u0000\u0000\u001e\u0005\u0001\u0000\u0000\u0000\u001f \u0007\u0000"+
		"\u0000\u0000 \u0007\u0001\u0000\u0000\u0000\u0002\u000b\u0015";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}