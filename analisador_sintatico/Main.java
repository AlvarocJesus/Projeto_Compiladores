import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Token> tokens = new ArrayList<>();

    // tokens.add(new Token("RESERVADA_GAVIAO", "gaviao", 1, 1));
    // tokens.add(new Token("ID", "x", 1, 5));
    // tokens.add(new Token("ATRIBUICAO", "=", 1, 6));
    // tokens.add(new Token("FLUTUANTE", "1.1", 1, 7));
    // tokens.add(new Token("FIM", ";", 1, 9));
    // tokens.add(new Token("RESERVADA_TAOK", "taOk", 2, 1));
    // tokens.add(new Token("ID", "y", 2, 5));
    // tokens.add(new Token("ATRIBUICAO", "=", 2, 6));
    // tokens.add(new Token("NUM", "5", 2, 7));
    // tokens.add(new Token("FIM", ";", 2, 7));
    // tokens.add(new Token("RESERVADA_GAVIAO", "gaviao", 3, 1));
    // tokens.add(new Token("ID", "z", 3, 7));
    // tokens.add(new Token("ATRIBUICAO", "=", 3, 8));
    // tokens.add(new Token("FLUTUANTE", "2.2", 3, 9));
    // tokens.add(new Token("FIM", ";", 3, 11));
    // tokens.add(new Token("RESERVADA_TAOK", "taOk", 4, 1));
    // tokens.add(new Token("ID", "p", 4, 5));
    // tokens.add(new Token("ATRIBUICAO", "=", 4, 6));
    // tokens.add(new Token("NUM", "10", 4, 7));
    // tokens.add(new Token("FIM", ";", 4, 8));
    // tokens.add(new Token("COMENTARIO", "#essa é uma soma", 6, 1));
    // tokens.add(new Token("RESERVADA_TAOK", "taOk", 7, 1));
    // tokens.add(new Token("ID", "result", 7, 5));
    // tokens.add(new Token("ATRIBUICAO", "=", 7, 11));
    // tokens.add(new Token("NUM", "1", 7, 11));
    // tokens.add(new Token("FIM", ";", 7, 11));

    // tokens.add(new Token("COMENTARIO", "# esse é for", 9, 1));

    // tokens.add(new Token("RESERVADA_DEPENDE", "depende", 10, 1));
    // tokens.add(new Token("LPAREN", "(", 10, 7));
    // tokens.add(new Token("ID", "result", 10, 7));
    // tokens.add(new Token("MAIORQ", ">", 10, 13));
    // tokens.add(new Token("NUM", "2", 10, 14));
    // tokens.add(new Token("RPAREN", ")", 10, 14));

    // tokens.add(new Token("LCHAVE", "{", 10, 15));

    // tokens.add(new Token("ID", "a", 11, 3));
    // tokens.add(new Token("ATRIBUICAO", "=", 11, 4));
    // tokens.add(new Token("NUM", "1", 11, 5));
    // tokens.add(new Token("FIM", ";", 11, 5));
    // tokens.add(new Token("RCHAVE", "}", 12, 1));

    // tokens.add(new Token("RESERVADA_PLANOB", "planoB", 12, 2));
    // tokens.add(new Token("LCHAVE", "{", 12, 8));

    // tokens.add(new Token("ID", "b", 13, 2));
    // tokens.add(new Token("ATRIBUICAO", "=", 13, 3));
    // tokens.add(new Token("NUM", "2", 13, 4));
    // tokens.add(new Token("FIM", ";", 13, 4));

    // tokens.add(new Token("RCHAVE", "}", 14, 1));

    // tokens.add(new Token("COMENTARIO", "#if teste para ver um erro", 16, 1));

    // tokens.add(new Token("RESERVADA_DEPENDE", "depende", 17, 1));
    // tokens.add(new Token("LPAREN", "(", 17, 7));
    // tokens.add(new Token("ID", "result", 17, 7));
    // tokens.add(new Token("IGUAL", "==", 17, 13));
    // tokens.add(new Token("NUM", "2", 17, 14));
    // tokens.add(new Token("RPAREN", ")", 17, 14));
    // tokens.add(new Token("LCHAVE", "{", 17, 14));
    // tokens.add(new Token("ID", "c", 18, 2));
    // tokens.add(new Token("ATRIBUICAO", "=", 18, 3));
    // tokens.add(new Token("NUM", "3", 18, 4));
    // tokens.add(new Token("FIM", ";", 18, 4));
    // tokens.add(new Token("RCHAVE", "}", 19, 1));

    /* tokens.add(new Token("RESERVADA_FAZDENOVO", "fazDeNovo", 21, 1));
    tokens.add(new Token("LPAREN", "(", 21, 9));
    tokens.add(new Token("ID", "y", 21, 9));
    tokens.add(new Token("IGUAL", "==", 21, 10));
    tokens.add(new Token("NUM", "5", 21, 12));
    tokens.add(new Token("RPAREN", ")", 21, 12));
    tokens.add(new Token("LCHAVE", "{", 21, 13));
    tokens.add(new Token("ID", "y", 22, 2));
    tokens.add(new Token("ATRIBUICAO", "=", 22, 3));
    tokens.add(new Token("NUM", "5", 22, 4));
    tokens.add(new Token("FIM", ";", 22, 4));
    tokens.add(new Token("RCHAVE", "}", 23, 1)); */

    tokens.add(new Token("COMENTARIO", "# Teste 1 do nosso for", 25, 1));
    /*
     * 
     * tokens.add(new Token("RESERVADA_EOSEUNEGOCIO", "eOSeuNegocio", 26, 1));
     * tokens.add(new Token("LPAREN", "(", 26, 12));
     * tokens.add(new Token("RESERVADA_TAOK", "taOk", 26, 12));
     * tokens.add(new Token("ID", "i", 26, 16));
     * tokens.add(new Token("ATRIBUICAO", "=", 26, 17));
     * tokens.add(new Token("NUM", "0", 26, 18));
     * tokens.add(new Token("FIM", ";", 26, 18));
     * tokens.add(new Token("ID", "i", 26, 19));
     * tokens.add(new Token("MENORQ", "<", 26, 20));
     * tokens.add(new Token("NUM", "5", 26, 21));
     * tokens.add(new Token("FIM", ";", 26, 21));
     * tokens.add(new Token("ID", "i", 26, 22));
     * tokens.add(new Token("INCREMENTO_SOMA", "++", 26, 22));
     * tokens.add(new Token("RPAREN", ")", 26, 23));
     * tokens.add(new Token("LCHAVE", "{", 26, 24));
     * tokens.add(new Token("ID", "x", 27, 2));
     * tokens.add(new Token("ATRIBUICAO", "=", 27, 3));
     * tokens.add(new Token("NUM", "24", 27, 4));
     * tokens.add(new Token("FIM", ";", 27, 5));
     * tokens.add(new Token("RCHAVE", "}", 28, 1));
     */

    // tokens.add(new Token("COMENTARIO", "# Teste 2 do nosso for", 30, 1));

    tokens.add(new Token("RESERVADA_EOSEUNEGOCIO", "eOSeuNegocio", 31, 1));
    tokens.add(new Token("LPAREN", "(", 31, 12));
    tokens.add(new Token("RESERVADA_TAOK", "taOk", 31, 12));
    tokens.add(new Token("ID", "i", 31, 16));
    tokens.add(new Token("ATRIBUICAO", "=", 31, 17));
    tokens.add(new Token("NUM", "0", 31, 18));
    tokens.add(new Token("FIM", ";", 31, 18));
    tokens.add(new Token("ID", "i", 31, 19));
    tokens.add(new Token("MENORQ", "<", 31, 20));
    tokens.add(new Token("NUM", "5", 31, 21));
    tokens.add(new Token("FIM", ";", 31, 21));
    tokens.add(new Token("ID", "i", 31, 22));
    tokens.add(new Token("INCREMENTO_SOMA", "++", 31, 22));
    tokens.add(new Token("RPAREN", ")", 31, 23));
    tokens.add(new Token("LCHAVE", "{", 31, 24));
    tokens.add(new Token("ID", "x", 32, 2));
    tokens.add(new Token("ATRIBUICAO", "=", 32, 3));
    tokens.add(new Token("ID", "x", 32, 4));
    tokens.add(new Token("SOMA", "+", 32, 5));
    tokens.add(new Token("ID", "i", 32, 6));
    tokens.add(new Token("FIM", ";", 32, 6));
    tokens.add(new Token("RCHAVE", "}", 33, 1));

    
    //  tokens.add(new Token("RESERVADA_FAZDENOVO", "fazDeNovo", 12, 1));
    //  tokens.add(new Token("LPAREN", "(", 12, 9));
    //  tokens.add(new Token("ID", "x", 12, 9));
    //  tokens.add(new Token("DIFERENTE", "!=", 12, 10));
    //  tokens.add(new Token("ID", "y", 12, 12));
    //  tokens.add(new Token("RPAREN", ")", 12, 12));
    //  tokens.add(new Token("LCHAVE", "{", 12, 12));
    //  tokens.add(new Token("ID", "x", 14, 2));
    //  tokens.add(new Token("INCREMENTO_SOMA", "++", 14, 3));
    //  tokens.add(new Token("FIM", ";", 14, 5));
    //  tokens.add(new Token("RCHAVE", "}", 15, 1));
    

    /* tokens.add(new Token("RESERVADA_OLHASO", "olhaSo", 13, 2));
    tokens.add(new Token("LPAREN", "(", 13, 7));
    tokens.add(new Token("STRING", "Dentro do nosso while", 13, 7));
    tokens.add(new Token("RPAREN", ")", 13, 31));
    tokens.add(new Token("FIM", ";", 13, 31)); */

    tokens.add(new Token("EOF", "$", 33, 2));

    System.out.println("\nAnalisador Sintático\n");
    teste parser = new teste(tokens);
    parser.main();
  }
}
