import java.util.List;

public static class Parser {
  List<Token> tokens;
  Token token;

  public Parser(List<Token> tokens) {
    this.tokens = tokens;
  }

  public Token nextToken() {
    if (tokens.size() > 0)
      return tokens.remove(0);

    return null;
  }

  private void erro(String regra) {
    System.out.println("Regra: " + regra);
    System.out.println("token invalido: " + token.getLexema());
    System.exit(0); // encerra parser
  }

  /*
   * public void main() {
   * token = nextToken();
   * 
   * if (whiles() && matchT("EOF")) {
   * System.out.println("Sinteticamente correto");
   * } else {
   * erro("main");
   * }
   * }
   */

  // Sei que ta funfando
  public void main() {
    token = nextToken();

    if (whiles()) {
      if (matchT("EOF")) {
        System.out.println("Sintaticamente correto");
      } else {
        erro("Fudeu de veeeeez!!!!");
      }
    }
  }

  /*
   * private boolean ifelse() {
   * if (matchL("if") && condicao() && matchL("then") && expressao() &&
   * matchL("else") && expressao()) {
   * return true;
   * }
   * 
   * erro("ifelse");
   * return false;
   * }
   * 
   * private boolean matchL(String lexema) {
   * if (token.getLexema().equals(lexema)) {
   * token = nextToken();
   * return true;
   * }
   * 
   * return false;
   * }
   * 
   * private boolean matchT(String tipo) {
   * if (token.getTipo().equals(tipo)) {
   * token = nextToken();
   * return true;
   * }
   * 
   * return false;
   * }
   * 
   * private boolean condicao() {
   * if (matchT("id") && operador() && matchT("num")) {
   * return true;
   * }
   * 
   * erro("condicao");
   * return false;
   * }
   * 
   * private boolean expressao() {
   * if (matchT("id") && matchL("=") && matchT("num")) {
   * return true;
   * }
   * 
   * erro("expressao");
   * return false;
   * }
   * 
   * private boolean operador() {
   * if (matchL(">") || matchL("<") || matchL("==")) {
   * return true;
   * }
   * 
   * erro("operador");
   * return false;
   * }
   * 
   * // While
   * private boolean whiles() {
   * if (matchL("while") && condicao() && matchL(":") && expressao()) {
   * return true;
   * }
   * 
   * erro("while");
   * return false;
   * }
   */
  // !Oficial
  private boolean dependes() {
    if (matchL("depende") && condicao() && matchL("then") && expressao() && matchL("else") && expressao()) {
      return true;
    }

    erro("depende");
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
    System.out.println("Token: " + token);
    System.out.println("Token: " + token.getTipo());
    if (token.getTipo().equals(tipo)) {
      token = nextToken();
      return true;
    }

    return false;
  }

  private boolean condicao() {
    if (matchT("ID") && operador() && matchT("NUM")) {
      return true;
    }

    erro("condicao");
    return false;
  }

  private boolean expressao() {
    if (matchT("ID") && matchL("=") && matchT("NUM") && matchL(";")) {
      return true;
    }

    erro("expressao");
    return false;
  }

  private boolean operador() {
    if (matchL(">") || matchL("<") || matchL("==")) {
      return true;
    }

    erro("operador");
    return false;
  }

  private boolean operadorMath() {
    if (matchL("-") || matchL("+") || matchL("*") || matchL("/") || matchL("==")) {
      return true;
    }

    erro("operador");
    return false;
  }

  // While
  private boolean fazDeNovos() {
    if (matchL("fazDeNovo") && matchL("(") && condicao() && matchL(")") && matchL("{") && expressao() && matchL("}")) {

      return true;
    }
    erro("fazDeNovo");
    return false;
  }

  // for
  private boolean eOSeuNegocios() {
    if (matchL("eOSeuNegocio") && matchL("(") && condicao() && matchL(")") && matchL("{") && expressao()
        && matchL("}")) {
      return true;
    }

    erro("eOSeuNegocio");
    return false;
  }
}