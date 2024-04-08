package projeto.analisador_lexico;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.List;

public class Lexer {
    private List<Token> tokens;
    private List<AFD> afds;
    private CharacterIterator code;
    private int lineError;

    public Lexer(String code, int lineError) {
        tokens = new ArrayList<>();
        this.code = new StringCharacterIterator(code);
        afds = new ArrayList<>();
        afds.add(new Comment());
        afds.add(new Reservada());
        afds.add(new MathOperator());
        afds.add(new Number());
        afds.add(new ID());
        afds.add(new StringText());
        this.lineError = lineError;
    }

    // Metodo para pular espaco em branco
    public void skipWhiteSpace() {
        while (code.current() == ' ' || code.current() == '\n' || code.current() == '\t') {
            code.next();
        }
    }

    public List<Token> getTokens() {
        boolean accepted;

        while (code.current() != CharacterIterator.DONE) {
            accepted = false;
            skipWhiteSpace();

            if (code.current() == CharacterIterator.DONE)
                break;

            for (AFD afd : afds) {
                int pos = code.getIndex();
                Token t = afd.evaluate(code, lineError, (code.getIndex() + 1));

                if (t != null) {
                    accepted = true;
                    tokens.add(t);
                    break;
                } else {
                    code.setIndex(pos);
                }
            }

            if (accepted)
                continue;

            throw new RuntimeException("Error: Token not recognized: " + code.current());
        }

        tokens.add(new Token("EOF", "$", lineError, (code.getIndex() + 1)));
        return tokens;
    }
}
