import antlr4 from "antlr4";
import fs from "fs";
import UsuarioLexer from "./generated/UsuarioLexer.js";
import UsuarioParser from "./generated/UsuarioParser.js";
import CustomUsuarioVisitor from "./CustomUsuarioVisitor.js";

// Leer archivo de entrada
const input = fs.readFileSync("input.txt", "utf8");
const chars = new antlr4.InputStream(input);
const lexer = new UsuarioLexer(chars);
const tokens = new antlr4.CommonTokenStream(lexer);
const parser = new UsuarioParser(tokens);
parser.buildParseTrees = true;

// ErrorListener personalizado para abortar en errores de sintaxis
class ThrowingErrorListener extends antlr4.error.ErrorListener {
  constructor() {
    super();
    this.hasError = false;
    this.errors = [];
  }
  syntaxError(recognizer, offendingSymbol, line, column, msg) {
    this.hasError = true;
    this.errors.push(`line ${line}:${column} ${msg}`);
  }
}

const errorListener = new ThrowingErrorListener();
parser.removeErrorListeners();
parser.addErrorListener(errorListener);

try {
  const tree = parser.programa();
  if (errorListener.hasError) {
    console.error("Error en la entrada:");
    errorListener.errors.forEach((e) => console.error(e));
    throw new Error("Entrada inválida");
  }
  console.log("Entrada válida.\n");

  // Tabla de tokens
  console.log("Tabla de tokens:");
  tokens.fill();
  tokens.tokens.forEach((token) => {
    const text = token.text;
    // Usar UsuarioLexer.symbolicNames para obtener el nombre del token
    const type = UsuarioLexer.symbolicNames[token.type] || "null";
    if (text !== "<EOF>") {
      console.log(`${text.padEnd(25)} ${type}`);
    }
  });

  // Árbol de derivación
  console.log("\nÁrbol de derivación:");
  console.log(tree.toStringTree(parser.ruleNames));

  // Visitor
  const visitor = new CustomUsuarioVisitor();
  const usuarios = visitor.visit(tree);

  // Generar código JS
  let jsCode = "";

  if (Array.isArray(usuarios)) {
    usuarios.forEach((usuario) => {
      const { nombreUsuario, atributos } = usuario;
      jsCode += `crearUsuario("${nombreUsuario}", [\n`;
      atributos.forEach(({ clave, valor }) => {
        const val = typeof valor === "string" ? JSON.stringify(valor) : valor;
        jsCode += `  { clave: "${clave}", valor: ${val} },\n`;
      });
      jsCode += `]);\n\n`;
    });
  }

  console.log("\nCódigo traducido a JavaScript:\n");
  console.log(jsCode);

  // Guardar archivo
  fs.mkdirSync("./generated", { recursive: true });
  fs.writeFileSync("./generated/output.js", jsCode);

  // Ejecutar JS generado
  console.log("Resultado de la ejecución:\n");
  eval(`
    function crearUsuario(nombre, atributos) {
      console.log("Creando usuario: " + nombre);
      atributos.forEach(({ clave, valor }) => {
        console.log("  " + clave + ": " + valor);
      });
    }
    ${jsCode}
  `);
} catch (e) {
  console.error("Error en la entrada.");
  console.error(e.message);
}
