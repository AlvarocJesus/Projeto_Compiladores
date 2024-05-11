package backup;

public class TokenSintatico {
    private String lexema;
    private String tipo;
    private int linha, column;

    public TokenSintatico(String tipo, String lexema, int linha, int column) {
        this.lexema = lexema;
        this.tipo = tipo;
        this.linha = linha;
        this.column = column;
    }

    public String getLexema() {
        return lexema;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "<" + tipo + ", " + lexema + ", " + linha + ", " + column + ">";
    }
}
