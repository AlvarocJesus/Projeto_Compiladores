import java.util.List;

public class Parser {
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
    System.out.println("Token: " + token);
    System.out.println("token invalido: " + token.getLexema());
    System.exit(0); // encerra parser
  }

  public void main() {
    token = nextToken();

    if (firstToken()) {
      System.out.println("Deu certo a arvore");
      System.out.println("Token no comeco atual: " + token);
      if (matchT("EOF")) {
        System.out.println("Sintaticamente correto");
      } else {
        erro("Fudeu de veeeeez!!!!");
      }
    }
  }

  private boolean firstToken() {
    if (matchLFirst("fazDeNovo")) {
      System.out.println("Entrou na verificacao fazDeNovo");
      if (fazDeNovo()) {
        return true;
      }
    } else if (matchLFirst("depende")) {
      System.out.println("Entrou na verificacao depende");
      if (depende()) {
        return true;
      }
    } else if (matchLFirst("eOSeuNegocio")) {
      System.out.println("Entrou na verificacao eOSeuNegocio");
      if (eOSeuNegocio()) {
        return true;
      }
    } else if (tipoVariavelFirst()) {
      System.out.println("Entrou na verificacao tipoVariavelFirst");
      if (atribuicaoVariavel()) {
        return true;
      }
    } else if (matchTFirst("COMENTARIO")) {
      System.out.println("Entrou na verificacao comentario");
      if (comentario()) {
        return true;
      }
    }

    erro("firstToken");
    return false;
  }

  // Alterar esse cara
  private boolean depende() {
    if (matchL("depende") && matchL("(") && condicao() && matchL(")") && matchL("{") && expressao() && matchL("}")
        && matchL("planpB") && matchL("{") && expressao() && matchL("}")) {
      return true;
    }

    erro("depende");
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
    if (matchT("ID") && operador() && (matchT("NUM") || matchT("ID"))) {
      token = nextToken();
      return true;
    }

    erro("condicao");
    return false;
  }

  private boolean tipoVariavelFirst() {
    if (matchLFirst("taOk") || matchLFirst("gaviao") || matchLFirst("caixaPreta")) {
      return true;
    }

    erro("tipoVariavel");
    return false;
  }

  private boolean tipoVariavel() {
    if (matchL("taOk") || matchL("gaviao") || matchL("caixaPreta")) {
      token = nextToken();
      return true;
    }

    erro("tipoVariavel");
    return false;
  }

  private boolean tipoValorVariavel() {
    if (matchT("ID") || matchT("NUM") || matchT("STRING")) {
      token = nextToken();
      return true;
    }

    erro("tipoValorVariavel");
    return false;
  }

  private boolean atribuicaoVariavel() {
    System.out.println("Token atual: " + token);
    if (tipoVariavel() && operador() && tipoValorVariavel() && matchL(";")) {
      return true;
    }

    erro("atribuicaoVariavel");
    return false;
  }

  private boolean atribuicaoTaOk() {
    System.out.println("Token atual: " + token);
    if (matchL("taOk") && operador() && (matchT("ID") || matchT("NUM") || matchT("STRING"))) {
      return true;
    }

    erro("atribuicaoTaOk");
    return false;
  }

  private boolean atribuicaoGaviao() {
    if (matchT("ID") && matchL("=") && (matchT("ID") || matchT("NUM") || matchT("STRING") || matchT("FLUTUANTE"))
        && matchL(";")) {
      token = nextToken();
      return true;
    }

    erro("atribuicaoGaviao");
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
    if (printar() || matchT("ID") && matchL("=") && matchT("NUM") && matchL(";")) {
      token = nextToken();
      return true;
    }

    erro("expressao");
    return false;
  }

  private boolean operador() {
    if (matchL(">") || matchL("<") || matchL("==") || matchL("!=")) {
      token = nextToken();
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

  private boolean contador() {
    if (matchL("ID") && operadorMath() && operadorMath()) {
      token = nextToken();
      return true;
    }

    erro("contador");
    return false;
  }

  // While
  private boolean fazDeNovo() {
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

  private boolean comentario() {
    if (matchT("COMENTARIO")) {
      return true;
    }

    erro("comentario");
    return false;
  }
}