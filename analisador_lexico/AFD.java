package projeto.analisador_lexico;

import java.text.CharacterIterator;

public abstract class AFD {
    public abstract Token evaluate(CharacterIterator code);
}
