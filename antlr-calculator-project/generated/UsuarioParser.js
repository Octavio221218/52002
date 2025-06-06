// Generated from Usuario.g4 by ANTLR 4.13.1
// jshint ignore: start
import antlr4 from 'antlr4';
import UsuarioListener from './UsuarioListener.js';
import UsuarioVisitor from './UsuarioVisitor.js';

const serializedATN = [4,1,10,34,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,1,0,4,0,
10,8,0,11,0,12,0,11,1,0,1,0,1,1,1,1,1,1,1,1,5,1,20,8,1,10,1,12,1,23,9,1,
1,1,1,1,1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,3,0,0,4,0,2,4,6,0,1,1,0,2,4,31,0,9,
1,0,0,0,2,15,1,0,0,0,4,26,1,0,0,0,6,31,1,0,0,0,8,10,3,2,1,0,9,8,1,0,0,0,
10,11,1,0,0,0,11,9,1,0,0,0,11,12,1,0,0,0,12,13,1,0,0,0,13,14,5,0,0,1,14,
1,1,0,0,0,15,16,5,1,0,0,16,17,5,5,0,0,17,21,5,8,0,0,18,20,3,4,2,0,19,18,
1,0,0,0,20,23,1,0,0,0,21,19,1,0,0,0,21,22,1,0,0,0,22,24,1,0,0,0,23,21,1,
0,0,0,24,25,5,9,0,0,25,3,1,0,0,0,26,27,5,5,0,0,27,28,5,6,0,0,28,29,3,6,3,
0,29,30,5,7,0,0,30,5,1,0,0,0,31,32,7,0,0,0,32,7,1,0,0,0,2,11,21];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class UsuarioParser extends antlr4.Parser {

    static grammarFileName = "Usuario.g4";
    static literalNames = [ null, "'usuario'", null, null, null, null, "'='", 
                            "';'", "'{'", "'}'" ];
    static symbolicNames = [ null, null, "BOOLEANO", "CADENA", "NUMERO", 
                             "IDENTIFICADOR", "IGUAL", "PUNTOCOMA", "LBRACE", 
                             "RBRACE", "WS" ];
    static ruleNames = [ "programa", "usuario", "atributo", "valor" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = UsuarioParser.ruleNames;
        this.literalNames = UsuarioParser.literalNames;
        this.symbolicNames = UsuarioParser.symbolicNames;
    }



	programa() {
	    let localctx = new ProgramaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, UsuarioParser.RULE_programa);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 9; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 8;
	            this.usuario();
	            this.state = 11; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===1);
	        this.state = 13;
	        this.match(UsuarioParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	usuario() {
	    let localctx = new UsuarioContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, UsuarioParser.RULE_usuario);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 15;
	        this.match(UsuarioParser.T__0);
	        this.state = 16;
	        this.match(UsuarioParser.IDENTIFICADOR);
	        this.state = 17;
	        this.match(UsuarioParser.LBRACE);
	        this.state = 21;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===5) {
	            this.state = 18;
	            this.atributo();
	            this.state = 23;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 24;
	        this.match(UsuarioParser.RBRACE);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	atributo() {
	    let localctx = new AtributoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, UsuarioParser.RULE_atributo);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 26;
	        this.match(UsuarioParser.IDENTIFICADOR);
	        this.state = 27;
	        this.match(UsuarioParser.IGUAL);
	        this.state = 28;
	        this.valor();
	        this.state = 29;
	        this.match(UsuarioParser.PUNTOCOMA);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	valor() {
	    let localctx = new ValorContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, UsuarioParser.RULE_valor);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 31;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 28) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

UsuarioParser.EOF = antlr4.Token.EOF;
UsuarioParser.T__0 = 1;
UsuarioParser.BOOLEANO = 2;
UsuarioParser.CADENA = 3;
UsuarioParser.NUMERO = 4;
UsuarioParser.IDENTIFICADOR = 5;
UsuarioParser.IGUAL = 6;
UsuarioParser.PUNTOCOMA = 7;
UsuarioParser.LBRACE = 8;
UsuarioParser.RBRACE = 9;
UsuarioParser.WS = 10;

UsuarioParser.RULE_programa = 0;
UsuarioParser.RULE_usuario = 1;
UsuarioParser.RULE_atributo = 2;
UsuarioParser.RULE_valor = 3;

class ProgramaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = UsuarioParser.RULE_programa;
    }

	EOF() {
	    return this.getToken(UsuarioParser.EOF, 0);
	};

	usuario = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(UsuarioContext);
	    } else {
	        return this.getTypedRuleContext(UsuarioContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof UsuarioListener ) {
	        listener.enterPrograma(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof UsuarioListener ) {
	        listener.exitPrograma(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof UsuarioVisitor ) {
	        return visitor.visitPrograma(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class UsuarioContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = UsuarioParser.RULE_usuario;
    }

	IDENTIFICADOR() {
	    return this.getToken(UsuarioParser.IDENTIFICADOR, 0);
	};

	LBRACE() {
	    return this.getToken(UsuarioParser.LBRACE, 0);
	};

	RBRACE() {
	    return this.getToken(UsuarioParser.RBRACE, 0);
	};

	atributo = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(AtributoContext);
	    } else {
	        return this.getTypedRuleContext(AtributoContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof UsuarioListener ) {
	        listener.enterUsuario(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof UsuarioListener ) {
	        listener.exitUsuario(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof UsuarioVisitor ) {
	        return visitor.visitUsuario(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class AtributoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = UsuarioParser.RULE_atributo;
    }

	IDENTIFICADOR() {
	    return this.getToken(UsuarioParser.IDENTIFICADOR, 0);
	};

	IGUAL() {
	    return this.getToken(UsuarioParser.IGUAL, 0);
	};

	valor() {
	    return this.getTypedRuleContext(ValorContext,0);
	};

	PUNTOCOMA() {
	    return this.getToken(UsuarioParser.PUNTOCOMA, 0);
	};

	enterRule(listener) {
	    if(listener instanceof UsuarioListener ) {
	        listener.enterAtributo(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof UsuarioListener ) {
	        listener.exitAtributo(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof UsuarioVisitor ) {
	        return visitor.visitAtributo(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ValorContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = UsuarioParser.RULE_valor;
    }

	CADENA() {
	    return this.getToken(UsuarioParser.CADENA, 0);
	};

	NUMERO() {
	    return this.getToken(UsuarioParser.NUMERO, 0);
	};

	BOOLEANO() {
	    return this.getToken(UsuarioParser.BOOLEANO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof UsuarioListener ) {
	        listener.enterValor(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof UsuarioListener ) {
	        listener.exitValor(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof UsuarioVisitor ) {
	        return visitor.visitValor(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




UsuarioParser.ProgramaContext = ProgramaContext; 
UsuarioParser.UsuarioContext = UsuarioContext; 
UsuarioParser.AtributoContext = AtributoContext; 
UsuarioParser.ValorContext = ValorContext; 
