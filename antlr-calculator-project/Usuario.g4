grammar Usuario;

programa: usuario+ EOF;

usuario: USUARIO IDENTIFICADOR LBRACE atributo* RBRACE;

atributo: IDENTIFICADOR IGUAL valor PUNTOCOMA;

valor: CADENA
     | NUMERO
     | BOOLEANO;

BOOLEANO: 'verdadero' | 'falso';
CADENA: '"' (~["\r\n])* '"';
NUMERO: [0-9]+;
IDENTIFICADOR: [a-zA-Z_][a-zA-Z0-9_]*;

USUARIO: 'usuario';
IGUAL: '=';
PUNTOCOMA: ';';
LBRACE: '{';
RBRACE: '}';
WS: [ \t\r\n]+ -> skip;
