/* import java.util.List;

public class teste {
  List<Token> tokens;
  Token token;

  public teste(List<Token> tokens) {
    this.tokens = tokens;
  }

  public Token nextToken() {
    if (tokens.size() > 0)
      return tokens.remove(0);

    return null;
  }

  private void erro(String regra) {
    System.out.println("Erro na regra: " + regra);
    System.out.println("Token inválido: " + token);
    System.exit(0); // Encerra o parser
  }

  public void main() {
    token = nextToken();

    if (firstToken()) {
      if (matchT("EOF")) {
        System.out.println("Sintaticamente correto");
      } else {
        erro("Fudeu de vez!!!!");
      }
    }
  }

  private boolean firstToken() {
    if (tipoVariavelFirst()) {
      if (atribVariavel()) {
        firstToken();
        return true;
      }
    } else {
      return true;
    }

    erro("Primeiro token inválido: " + token);
    return false;
  }

  private boolean atribVariavel() {
    if (tipoVariavel() && matchT("ID") && matchL("=") && variavel() && matchL(";")) {
      return true;
    }

    erro("Atribuição de variável inválida: " + token);
    return false;
  }

  private boolean tipoVariavel() {
    if (matchL("taOk") || matchL("gaviao") || matchL("caixaPreta")) {
      return true;
    }

    return false;
  }

  private boolean variavel() {
    if (matchT("ID") || matchT("NUM") || matchT("FLUTUANTE") || matchT("STRING")) {
      return true;
    }

    return false;
  }

  private boolean tipoVariavelFirst() {
    if (matchLFirst("taOk") || matchLFirst("gaviao") || matchLFirst("caixaPreta")) {
      return true;
    }

    return false;
  }

  private boolean matchLFirst(String lexema) {
    if (token.getLexema().equals(lexema)) {
      return true;
    }

    return false;
  }

  private boolean matchL(String lexema) {
    if (token.getLexema().equals(lexema)) {
      token = nextToken();
      return true;
    }

    return false;
  }

  private boolean matchT(String tipo) {
    if (token.getTipo().equals(tipo)) {
      token = nextToken();
      return true;
    }

    return false;
  }
} */

//  Meu código
import java.util.List;

public class teste {
  List<Token> tokens;
  Token token;

  public teste(List<Token> tokens) {
    this.tokens = tokens;
  }

  public Token nextToken() {
    if (tokens.size() > 0)
      return tokens.remove(0);

    return null;
  }

  private void erro(String regra) {
    System.out.println("Erro na regra: " + regra);
    System.out.println("Token inválido: " + token);
    System.out.println("token invalido: " + token.getLexema());
    System.exit(0); // encerra parser
  }

  public void main() {
    token = nextToken();

    if (firstToken()) {
      if (matchT("EOF")) {
        System.out.println("Sintaticamente correto");
      } else {
        erro("Fudeu de vez!!!!");
      }
    }
  }

  private boolean firstToken() {
    if (tipoVariavelFirst()) {
      if (atribVariavel()) {
        firstToken();
        return true;
      }
    } else if (matchTFirst("COMENTARIO")) {
      if (comentario()) {
        firstToken();
        return true;
      }
    } else if (matchLFirst("depende")) {
      if (depende()) {
        firstToken();
        return true;
      }
    } else if (matchLFirst("eOSeuNegocio")) {
      if (eOSeuNegocio()) {
        firstToken();
        return true;
      }
    } else if (matchLFirst("fazDeNovo")) {
      if (fazDeNovo()) {
        firstToken();
        return true;
      }
    } else if (matchLFirst("olhaSo")) {
      if (olhaSo()) {
        firstToken();
        return true;
      }
    } else {
      return true;
    }

    erro("FirstToken: " + token);
    return false;
  }

  // --------------------Atribuição Variavel--------------------
  private boolean atribVariavel() {
    if (tipoVariavel() && variavel() && matchL("=") && variavel() && matchL(";")) {
      return true;
    }

    erro("Atribuição de variável inválida: " + token);
    return false;
  }

  // --------------------Comentário--------------------
  private boolean comentario() {
    if (matchT("COMENTARIO")) {
      return true;
    }

    erro("Comentario: " + token);
    return false;
  }

  // --------------------Depende--------------------
  private boolean depende() {
    if (matchL("depende") && matchL("(") && condicao() && matchL(")") && matchL("{") && expressao() && matchL("}")
        && planoB()) {
      return true;
    }

    erro("Depende invalido: " + token);
    return false;
  }

  private boolean planoB() {
    if (matchL("planoB")) {
      if (matchL("{") && expressao() && matchL("}")) {
        return true;
      }
      erro("PlanoB invalido: " + token);
      return false;
    }

    return true; // ε
  }

  // --------------------EOSeuNegocio--------------------
  private boolean eOSeuNegocio() {
    if (matchL("eOSeuNegocio") && matchL("(") && varContador()
        && matchL(";") && condicao() && matchL(";") && incremento() && matchL(")") && matchL("{") && expressao()
        && matchL("}")) {
      return true;
    }

    erro("EOSeuNegocio invalido: " + token);
    return false;
  }

  // --------------------FazDeNovo--------------------
  private boolean fazDeNovo() {
    if (matchL("fazDeNovo") && matchL("(") && condicao() && matchL(")") && matchL("{") && expressao() && matchL("}")) {
      return true;
    }

    erro("FazDeNovo invalido: " + token);
    return false;
  }

  // --------------------OlhaSo--------------------
  private boolean olhaSo() {
    if (matchL("olhaSo") && matchL("(") && variavel() && matchL(")") && matchL(";")) {
      return true;
    }

    erro("OlhaSo invalido: " + token);
    return false;
  }

  // --------------------Funcoes intermediarias--------------------
  private boolean tipoVariavel() {
    if (matchL("taOk") || matchL("gaviao") || matchL("caixaPreta")) {
      return true;
    }

    erro("TipoVariavel: " + token);
    return false;
  }

  private boolean variavel() {
    if (matchT("ID") || matchT("NUM") || matchT("FLUTUANTE") || matchT("STRING")
        || (matchL("(") && mathExpressao() && matchL(")"))) {
      return true;
    }

    erro("Variavel: " + token);
    return false;
  }

  private boolean tipoVariavelFirst() {
    if (matchLFirst("taOk") || matchLFirst("gaviao") ||
        matchLFirst("caixaPreta")) {
      return true;
    }

    return false;
  }

  private boolean condicao() {
    if (variavel() && operador() && variavel()) {
      return true;
    }

    erro("Condicao invalida: " + token);
    return false;
  }

  private boolean operador() {
    if (matchL("<") || matchL(">") || matchL("<=") || matchL(">=") || matchL("==") || matchL("!=") || matchL("||")
        || matchL("&&") || matchL("--") || matchL("++") || matchL("+") || matchL("-") || matchL("*") || matchL("/")
        || matchL("=")) {
      return true;
    }

    erro("Operador invalido: " + token);
    return false;
  }

  private boolean expressao() {
    if ((matchT("ID") && operador() && matchL(";")) || (mathExpressao() && matchL(";"))
        || (variavel() && matchL("=") && variavel() && matchL(";"))) {
      return true;
    }

    /*
     * Assim da erro
     * if ((mathExpressao() && matchL(";")) || (matchT("ID") && operador() &&
     * matchL(";")) || (variavel() && matchL("=") && variavel() && matchL(";"))) {
     * return true;
     * }
     */

    /*
     * Assim tbm da erro
     * if ((variavel() && matchL("=") && variavel() && matchL(";")) || (matchT("ID")
     * && operador() && matchL(";")) || (mathExpressao() && matchL(";"))) {
     * return true;
     * }
     */

    erro("Expressao invalida" + token);
    return false;
  }

  private boolean mathExpressao() {
    if (math() && mathExpressaoLinha()) {
      return true;
    }

    erro("Math Expressao invalida: " + token);
    return false;
  }

  private boolean mathExpressaoLinha() {
    if (matchL("+") || matchL("-") || matchL("++")) {
      if (math() && mathExpressaoLinha()) {
        return true;
      }
      erro("Math Expressao 1 invalida: " + token);
      return false;
    }

    return true; // ε
  }

  private boolean math() {
    if (variavel() && mathLinha()) {
      return true;
    }

    erro("Math invalida: " + token);
    return false;
  }

  private boolean mathLinha() {
    if (matchL("*") || matchL("/")) {
      if (variavel() && mathLinha()) {
        return true;
      }
      erro("Math 1 invalida: " + token);
      return false;
    }

    return true; // ε
  }

  private boolean varContador() {
    if (tipoVariavel() && variavel() && matchL("=") && matchT("NUM")) {
      return true;
    }

    erro("VarContador invalido: " + token);
    return false;
  }

  private boolean incremento() {
    if (matchT("ID") && operador()) {
      if (matchT("NUM")) {
        return true;
      } else {
        return true; // ε
      }
    }

    erro("Incremento invalido: " + token);
    return false;
  }

  // --------------------Verificacao Dados--------------------
  private boolean matchLFirst(String lexema) {
    if (token.getLexema().equals(lexema)) {
      return true;
    }

    return false;
  }

  private boolean matchTFirst(String tipo) {
    if (token.getTipo().equals(tipo)) {
      return true;
    }

    return false;
  }

  private boolean matchL(String lexema) {
    if (token.getLexema().equals(lexema)) {
      token = nextToken();
      return true;
    }

    return false;
  }

  private boolean matchT(String tipo) {
    if (token.getTipo().equals(tipo)) {
      token = nextToken();
      return true;
    }

    return false;
  }

}
