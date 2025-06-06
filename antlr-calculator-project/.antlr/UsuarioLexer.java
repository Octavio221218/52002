// Generated from c://Users//valle//Downloads//guevaraAnalizador//52002//antlr-calculator-project//Usuario.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class UsuarioLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEANO=1, CADENA=2, NUMERO=3, IDENTIFICADOR=4, USUARIO=5, IGUAL=6, PUNTOCOMA=7, 
		LBRACE=8, RBRACE=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEANO", "CADENA", "NUMERO", "IDENTIFICADOR", "USUARIO", "IGUAL", 
			"PUNTOCOMA", "LBRACE", "RBRACE", "WS"
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


	public UsuarioLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Usuario.g4"; }

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
		"\u0004\u0000\nQ\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000$\b\u0000\u0001\u0001\u0001\u0001\u0005\u0001(\b\u0001\n\u0001\f"+
		"\u0001+\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u00020\b\u0002"+
		"\u000b\u0002\f\u00021\u0001\u0003\u0001\u0003\u0005\u00036\b\u0003\n\u0003"+
		"\f\u00039\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0004"+
		"\tL\b\t\u000b\t\f\tM\u0001\t\u0001\t\u0000\u0000\n\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0001\u0000\u0005\u0003\u0000\n\n\r\r\"\"\u0001\u000009\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  U\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003"+
		"%\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u00073\u0001"+
		"\u0000\u0000\u0000\t:\u0001\u0000\u0000\u0000\u000bB\u0001\u0000\u0000"+
		"\u0000\rD\u0001\u0000\u0000\u0000\u000fF\u0001\u0000\u0000\u0000\u0011"+
		"H\u0001\u0000\u0000\u0000\u0013K\u0001\u0000\u0000\u0000\u0015\u0016\u0005"+
		"v\u0000\u0000\u0016\u0017\u0005e\u0000\u0000\u0017\u0018\u0005r\u0000"+
		"\u0000\u0018\u0019\u0005d\u0000\u0000\u0019\u001a\u0005a\u0000\u0000\u001a"+
		"\u001b\u0005d\u0000\u0000\u001b\u001c\u0005e\u0000\u0000\u001c\u001d\u0005"+
		"r\u0000\u0000\u001d$\u0005o\u0000\u0000\u001e\u001f\u0005f\u0000\u0000"+
		"\u001f \u0005a\u0000\u0000 !\u0005l\u0000\u0000!\"\u0005s\u0000\u0000"+
		"\"$\u0005o\u0000\u0000#\u0015\u0001\u0000\u0000\u0000#\u001e\u0001\u0000"+
		"\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%)\u0005\"\u0000\u0000&(\b"+
		"\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000"+
		")\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000,-\u0005\"\u0000\u0000-\u0004\u0001\u0000"+
		"\u0000\u0000.0\u0007\u0001\u0000\u0000/.\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"2\u0006\u0001\u0000\u0000\u000037\u0007\u0002\u0000\u000046\u0007\u0003"+
		"\u0000\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u00008\b\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u0000:;\u0005u\u0000\u0000;<\u0005s\u0000\u0000<"+
		"=\u0005u\u0000\u0000=>\u0005a\u0000\u0000>?\u0005r\u0000\u0000?@\u0005"+
		"i\u0000\u0000@A\u0005o\u0000\u0000A\n\u0001\u0000\u0000\u0000BC\u0005"+
		"=\u0000\u0000C\f\u0001\u0000\u0000\u0000DE\u0005;\u0000\u0000E\u000e\u0001"+
		"\u0000\u0000\u0000FG\u0005{\u0000\u0000G\u0010\u0001\u0000\u0000\u0000"+
		"HI\u0005}\u0000\u0000I\u0012\u0001\u0000\u0000\u0000JL\u0007\u0004\u0000"+
		"\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0006"+
		"\t\u0000\u0000P\u0014\u0001\u0000\u0000\u0000\u0006\u0000#)17M\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}