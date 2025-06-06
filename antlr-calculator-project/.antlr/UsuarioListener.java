// Generated from c://Users//valle//Downloads//guevaraAnalizador//52002//antlr-calculator-project//Usuario.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UsuarioParser}.
 */
public interface UsuarioListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UsuarioParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(UsuarioParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsuarioParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(UsuarioParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsuarioParser#usuario}.
	 * @param ctx the parse tree
	 */
	void enterUsuario(UsuarioParser.UsuarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsuarioParser#usuario}.
	 * @param ctx the parse tree
	 */
	void exitUsuario(UsuarioParser.UsuarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsuarioParser#atributo}.
	 * @param ctx the parse tree
	 */
	void enterAtributo(UsuarioParser.AtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsuarioParser#atributo}.
	 * @param ctx the parse tree
	 */
	void exitAtributo(UsuarioParser.AtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link UsuarioParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(UsuarioParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UsuarioParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(UsuarioParser.ValorContext ctx);
}