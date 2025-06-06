import UsuarioVisitor from "./generated/UsuarioVisitor.js";

class CustomUsuarioVisitor extends UsuarioVisitor {
  visitPrograma(ctx) {
    // ctx.usuario() devuelve un array de nodos usuario
    return (typeof ctx.usuario === "function" ? ctx.usuario() : []).map(
      (usuarioCtx) => this.visit(usuarioCtx)
    );
  }

  visitUsuario(ctx) {
    // ctx.IDENTIFICADOR puede ser función o array
    let nombreUsuario = null;
    if (typeof ctx.IDENTIFICADOR === "function") {
      const id = ctx.IDENTIFICADOR();
      nombreUsuario = Array.isArray(id) ? id[0].getText() : id?.getText();
    } else if (
      Array.isArray(ctx.IDENTIFICADOR) &&
      ctx.IDENTIFICADOR.length > 0
    ) {
      nombreUsuario = ctx.IDENTIFICADOR[0].getText();
    }
    // ctx.atributo puede ser función o array
    let atributos = [];
    if (typeof ctx.atributo === "function") {
      const attrs = ctx.atributo();
      atributos = Array.isArray(attrs)
        ? attrs.map((attr) => this.visit(attr))
        : [];
    } else if (Array.isArray(ctx.atributo)) {
      atributos = ctx.atributo.map((attr) => this.visit(attr));
    }
    return { nombreUsuario, atributos };
  }

  visitAtributo(ctx) {
    let clave = null;
    if (typeof ctx.IDENTIFICADOR === "function") {
      const id = ctx.IDENTIFICADOR();
      clave = Array.isArray(id) ? id[0].getText() : id?.getText();
    } else if (
      Array.isArray(ctx.IDENTIFICADOR) &&
      ctx.IDENTIFICADOR.length > 0
    ) {
      clave = ctx.IDENTIFICADOR[0].getText();
    }
    const valor = this.visit(ctx.valor());
    return { clave, valor };
  }

  visitValor(ctx) {
    if (ctx.CADENA && typeof ctx.CADENA === "function" && ctx.CADENA()) {
      return ctx.CADENA().getText().slice(1, -1);
    }
    if (ctx.NUMERO && typeof ctx.NUMERO === "function" && ctx.NUMERO()) {
      return Number(ctx.NUMERO().getText());
    }
    if (ctx.BOOLEANO && typeof ctx.BOOLEANO === "function" && ctx.BOOLEANO()) {
      return ctx.BOOLEANO().getText() === "verdadero";
    }
    return null;
  }
}

export default CustomUsuarioVisitor;
