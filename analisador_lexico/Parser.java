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
        if (matchL("fazDeNovo")) {
            System.out.println("Entrou na verificacao fazDeNovo");
            return true;
        } else if (matchL("depende")) {
            System.out.println("Entrou na verificacao depende");
            return true;
        } else if (matchL("eOSeuNegocio")) {
            System.out.println("Entrou na verificacao eOSeuNegocio");
            return true;
        } else if (matchL("taOk")) {
            System.out.println("Entrou na verificacao TAOK");
            if (atribuicaoTaOk()) {
                return true;
            }
        } else if (matchL("gaviao")) {
            System.out.println("Entrou na verificacao gaviao");
            if (atribuicaoGaviao()) {
                return true;
            }
        }

        erro("firstToken");
        return false;
    }

    private boolean dependes() {
        if (matchL("depende") && matchL("(") && condicao() && matchL(")") && matchL("{") && expressao()
                && matchL("}") && matchL("else") && matchL("{") && expressao() && matchL("}")) {
            return true;
        }

        erro("depende");
        return false;
    }

    private boolean matchL(String lexema) {
        System.out.println("Token: " + token);
        System.out.println("Token Lexema: " + token.getLexema());
        if (token.getLexema().equals(lexema)) {
            token = nextToken();
            return true;
        }

        return false;
    }

    private boolean matchT(String tipo) {
        // System.out.println("Token: " + token);
        // System.out.println("Token: " + token.getTipo());
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

    private boolean tipoVariavel() {
        if (matchL("taOk") || matchL("gaviao") || matchL("caixaPreta")) {
            return true;
        }

        erro("tipoVariavel");
        return false;
    }

    private boolean atribuicaoVariavel() {
        System.out.println("Token atual: " + token);
        if ((matchL("taOk") || matchL("gaviao") || matchL("caixaPreta")) && operador()
                && (matchT("ID") || matchT("NUM") || matchT("STRING"))) {
            return true;
        }

        erro("atribuicaoTaOk");
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
        if (matchL("fazDeNovo") && matchL("(") && condicao() && matchL(")") && matchL("{") && expressao()
                && matchL("}")) {

            return true;
        }
        erro("fazDeNovo");
        return false;
    }

    // for
    private boolean eOSeuNegocios() {

        if (matchL("eOSeuNegocio") && matchL("(") && matchT("ID") && matchL(";") && condicao() && matchL(";")
                && matchT("ID") && operadorMath() && matchL(")") && matchL("{") && expressao() && matchL("}")) {
            return true;
        }

        erro("eOSeuNegocio");
        return false;
    }

}