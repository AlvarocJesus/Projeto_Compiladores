package projeto.analisador_lexico;

import java.text.CharacterIterator;

public class MathOperator extends AFD {
    @Override
    public Token evaluate(CharacterIterator code, int linha, int column) {
        switch (code.current()) {
            case '+':
                code.next();
                return new Token("SOMA", "+", linha, column);
            case '-':
                code.next();
                return new Token("SUB", "-", linha, column);
            case '*':
                code.next();
                return new Token("MUL", "*", linha, column);
            case '/':
                code.next();
                return new Token("DIV", "/", linha, column);
            case '(':
                code.next();
                return new Token("LPAREN", "(", linha, column);
            case ')':
                code.next();
                return new Token("RPAREN", ")", linha, column);
            case '{':
                code.next();
                return new Token("LCHAVE", "{", linha, column);
            case '[':
                code.next();
                return new Token("LCOLCHETE", "[", linha, column);
            case ']':
                code.next();
                return new Token("rCOLCHETE", "]", linha, column);
            case '}':
                code.next();
                return new Token("RCHAVE", "}", linha, column);
            case '=':
                code.next();
                return new Token("ATRIBUICAO", "=", linha, column);
            case ';':
                code.next();
                return new Token("FIM", ";", linha, column);
            default:
                return null;
        }
    }
}
