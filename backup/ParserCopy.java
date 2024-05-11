package backup;

import java.util.List;

import Token;

public class ParserCopy {
  List<Token> tokens;
  Token token;

  public ParserCopy(List<Token> tokens) {
    this.tokens = tokens;
  }

  public Token nextToken() {
    if (tokens.size() > 0)
      return tokens.remove(0);

    return null;
  }

  private void erro(String regra) {
    System.out.println("Regra: " + regra);
    System.out.println("Token: " + token);
    System.out.println("token invalido: " + token.getLexema());
    System.exit(0); // encerra parser
  }

  public void main() {
    token = nextToken();

    if (firstToken()) {
      if (matchT("EOF")) {
        System.out.println("Sintaticamente correto");
      } else {
        erro("Deu errado!!!!");
      }
    }
  }

  private boolean firstToken() {
    if (matchLFirst("fazDeNovo")) {
      if (fazDeNovo()) {
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
    } else if (tipoVariavelFirst()) {
      if (atribuicaoVariavel()) {
        firstToken();
        return true;
      }
    } else if (matchTFirst("COMENTARIO")) {
      if (comentario()) {
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

    erro("firstToken");
    return false;
  }

  // Alterar esse cara
  private boolean depende() {
    if (matchL("depende") && matchL("(") && condicao() && matchL(")") && matchL("{") && expressao() && matchL("}")
        && matchL("planoB") && matchL("{") && expressao() && matchL("}")) {
      return true;
    }

    erro("depende");
    return false;
  }

  private boolean atribuicaoVariavel() {
    if (tipoVariavel() && matchT("ID") && operador() && tipoValorVariavel() && matchL(";")) {
      return true;
    }

    erro("atribuicaoVariavel");
    return false;
  }

  // While
  private boolean fazDeNovo() {
    System.out.println("\nFaz de novo");
    System.out.println("Token: " + token);
    if (matchL("fazDeNovo") && matchL("(") && condicao() && matchL(")") && matchL("{") && expressao() && matchL("}")
        && matchL(";")) {

      return true;
    }
    erro("fazDeNovo");
    return false;
  }

  // for
  private boolean eOSeuNegocio() {

    if (matchL("eOSeuNegocio") && matchL("(") && tipoVariavel() && matchL(";") && condicao() && matchL(";")
        && contador() && matchL(")") && matchL("{") && expressao() && matchL("}")) {
      return true;
    }

    erro("eOSeuNegocio");
    return false;
  }

  private boolean olhaSo() {
    if (printar()) {
      return true;
    }

    erro("olhaSo");
    return false;
  }

  private boolean matchLFirst(String lexema) {
    System.out.println("\nMatchLFirst");
    System.out.println("Token: " + token);
    System.out.println("Lexema: " + lexema);
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

  private boolean matchTFirst(String tipo) {
    if (token.getTipo().equals(tipo)) {
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

  // Talvez mudar algo aqui
  private boolean condicao() {
    if (tipoValorVariavel() && operador() && (matchT("NUM") || matchT("ID"))) {
      return true;
    }

    erro("Condicao" + token);
    return false;
  }

  private boolean tipoVariavelFirst() {
    if (matchLFirst("taOk") || matchLFirst("gaviao") || matchLFirst("caixaPreta")) {
      return true;
    }

    return false;
  }

  private boolean tipoVariavel() {
    if (matchL("taOk") || matchL("gaviao") || matchL("caixaPreta")) {
      return true;
    }

    return false;
  }

  private boolean tipoValorVariavel() {
    if (matchT("ID") || matchT("NUM") || matchT("FLUTUANTE") || matchT("STRING")) {
      return true;
    }

    return false;
  }

  private boolean printar() {
    if (matchL("olhaSo") && matchL("(") && tipoValorVariavel() && matchL(")") && matchL(";")) {
      token = nextToken();
      return true;
    }

    erro("printar");
    return false;
  }

  private boolean expressao() {
    if (matchT("ID") && matchL("=") && matchT("NUM") && matchL(";")) {
      return true;
    }

    return false;
  }

  private boolean operador() {
    if (matchL(">") || matchL("<") || matchL("==") || matchL("!=") || matchL("=") || matchL("||") || matchL("&&")) {
      return true;
    }

    erro("Operador: " + token);
    return false;
  }

  private boolean operadorMath() {
    if (matchL("-") || matchL("+") || matchL("*") || matchL("/") || matchL("==")) {
      return true;
    }

    erro("operador");
    return false;
  }

  private boolean contador() {
    if (matchL("ID") && operadorMath() && operadorMath()) {
      token = nextToken();
      return true;
    }

    erro("contador");
    return false;
  }

  private boolean comentario() {
    if (matchT("COMENTARIO")) {
      return true;
    }

    erro("comentario");
    return false;
  }
}
