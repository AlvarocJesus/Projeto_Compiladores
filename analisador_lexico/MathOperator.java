package projeto.analisador_lexico;

import java.text.CharacterIterator;

public class MathOperator extends AFD {
    @Override
    public Token evaluate(CharacterIterator code) {
        switch (code.current()) {
            case '+':
                code.next();
                return new Token("SOMA", "+");
            case '-':
                code.next();
                return new Token("SUB", "-");
            case '*':
                code.next();
                return new Token("MUL", "*");
            case '/':
                code.next();
                return new Token("DIV", "/");
            case '(':
                code.next();
                return new Token("LPAREN", "(");
            case ')':
                code.next();
                return new Token("RPAREN", ")");
            case '{':
                code.next();
                return new Token("LCHAVE", "{");
            case '[':
                code.next();
                return new Token("LCOLCHETE", "[");
            case ']':
                code.next();
                return new Token("rCOLCHETE", "]");
            case '}':
                code.next();
                return new Token("RCHAVE", "}");
            case '=':
                code.next();
                return new Token("ATRIBUICAO", "=");
            case ';':
                code.next();
                return new Token("FIM", ";");
            default:
                return null;
        }
    }
}
