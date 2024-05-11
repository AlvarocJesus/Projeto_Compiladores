package backup;

import java.util.ArrayList;
import java.util.List;

public class MainSintatico {
  public static void main(String[] args) {
    List<TokenSintatico> tokens = new ArrayList<>();

    tokens.add(new TokenSintatico("RESERVADA_GAVIAO", "gaviao", 1, 1));
    tokens.add(new TokenSintatico("ID", "x", 1, 5));
    tokens.add(new TokenSintatico("ATRIBUICAO", "=", 1, 6));
    tokens.add(new TokenSintatico("FLUTUANTE", "1.1", 1, 7));
    tokens.add(new TokenSintatico("FIM", ";", 1, 9));
    tokens.add(new TokenSintatico("RESERVADA_TAOK", "taOk", 2, 1));
    tokens.add(new TokenSintatico("ID", "y", 2, 5));
    tokens.add(new TokenSintatico("ATRIBUICAO", "=", 2, 6));
    tokens.add(new TokenSintatico("NUM", "5", 2, 7));
    tokens.add(new TokenSintatico("FIM", ";", 2, 7));
    tokens.add(new TokenSintatico("RESERVADA_GAVIAO", "gaviao", 3, 1));
    tokens.add(new TokenSintatico("ID", "z", 3, 7));
    tokens.add(new TokenSintatico("ATRIBUICAO", "=", 3, 8));
    tokens.add(new TokenSintatico("FLUTUANTE", "2.2", 3, 9));
    tokens.add(new TokenSintatico("FIM", ";", 3, 11));
    tokens.add(new TokenSintatico("RESERVADA_TAOK", "taOk", 4, 1));
    tokens.add(new TokenSintatico("ID", "p", 4, 5));
    tokens.add(new TokenSintatico("ATRIBUICAO", "=", 4, 6));
    tokens.add(new TokenSintatico("NUM", "10", 4, 7));
    tokens.add(new TokenSintatico("FIM", ";", 4, 8));
    tokens.add(new TokenSintatico("COMENTARIO", "#essa é uma soma", 6, 1));
    tokens.add(new TokenSintatico("RESERVADA_TAOK", "taOk", 7, 1));
    tokens.add(new TokenSintatico("ID", "result", 7, 5));
    tokens.add(new TokenSintatico("ATRIBUICAO", "=", 7, 11));
    tokens.add(new TokenSintatico("NUM", "1", 7, 11));
    tokens.add(new TokenSintatico("FIM", ";", 7, 11));

    tokens.add(new TokenSintatico("COMENTARIO", "# esse é for", 9, 1));

    tokens.add(new TokenSintatico("RESERVADA_DEPENDE", "depende", 10, 1));
    tokens.add(new TokenSintatico("LPAREN", "(", 10, 7));
    tokens.add(new TokenSintatico("ID", "result", 10, 7));
    tokens.add(new TokenSintatico("MAIORQ", ">", 10, 13));
    tokens.add(new TokenSintatico("NUM", "2", 10, 14));
    tokens.add(new TokenSintatico("RPAREN", ")", 10, 14));

    tokens.add(new TokenSintatico("LCHAVE", "{", 10, 15));

    tokens.add(new TokenSintatico("ID", "a", 11, 3));
    tokens.add(new TokenSintatico("ATRIBUICAO", "=", 11, 4));
    tokens.add(new TokenSintatico("NUM", "1", 11, 5));
    tokens.add(new TokenSintatico("FIM", ";", 11, 5));
    tokens.add(new TokenSintatico("RCHAVE", "}", 12, 1));

    tokens.add(new TokenSintatico("RESERVADA_PLANOB", "planoB", 12, 2));
    tokens.add(new TokenSintatico("LCHAVE", "{", 12, 8));

    tokens.add(new TokenSintatico("ID", "b", 13, 2));
    tokens.add(new TokenSintatico("ATRIBUICAO", "=", 13, 3));
    tokens.add(new TokenSintatico("NUM", "2", 13, 4));
    tokens.add(new TokenSintatico("FIM", ";", 13, 4));

    tokens.add(new TokenSintatico("RCHAVE", "}", 14, 1));

    tokens.add(new TokenSintatico("COMENTARIO", "#if teste para ver um erro", 16, 1));

    tokens.add(new TokenSintatico("RESERVADA_DEPENDE", "depende", 17, 1));
    tokens.add(new TokenSintatico("LPAREN", "(", 17, 7));
    tokens.add(new TokenSintatico("ID", "result", 17, 7));
    tokens.add(new TokenSintatico("IGUAL", "==", 17, 13));
    tokens.add(new TokenSintatico("NUM", "2", 17, 14));
    tokens.add(new TokenSintatico("RPAREN", ")", 17, 14));
    tokens.add(new TokenSintatico("LCHAVE", "{", 17, 14));
    tokens.add(new TokenSintatico("ID", "c", 18, 2));
    tokens.add(new TokenSintatico("ATRIBUICAO", "=", 18, 3));
    tokens.add(new TokenSintatico("NUM", "3", 18, 4));
    tokens.add(new TokenSintatico("FIM", ";", 18, 4));
    tokens.add(new TokenSintatico("RCHAVE", "}", 19, 1));

    tokens.add(new TokenSintatico("RESERVADA_FAZDENOVO", "fazDeNovo", 21, 1));
    tokens.add(new TokenSintatico("LPAREN", "(", 21, 9));
    tokens.add(new TokenSintatico("ID", "y", 21, 9));
    tokens.add(new TokenSintatico("IGUAL", "==", 21, 10));
    tokens.add(new TokenSintatico("NUM", "5", 21, 12));
    tokens.add(new TokenSintatico("RPAREN", ")", 21, 12));
    tokens.add(new TokenSintatico("LCHAVE", "{", 21, 13));
    tokens.add(new TokenSintatico("ID", "y", 22, 2));
    tokens.add(new TokenSintatico("ATRIBUICAO", "=", 22, 3));
    tokens.add(new TokenSintatico("NUM", "5", 22, 4));
    tokens.add(new TokenSintatico("FIM", ";", 22, 4));
    tokens.add(new TokenSintatico("RCHAVE", "}", 23, 1));

    tokens.add(new TokenSintatico("COMENTARIO", "# Teste 1 do nosso for", 25, 1));

    tokens.add(new TokenSintatico("RESERVADA_EOSEUNEGOCIO", "eOSeuNegocio", 26, 1));
    tokens.add(new TokenSintatico("LPAREN", "(", 26, 12));
    tokens.add(new TokenSintatico("RESERVADA_TAOK", "taOk", 26, 12));
    tokens.add(new TokenSintatico("ID", "i", 26, 16));
    tokens.add(new TokenSintatico("ATRIBUICAO", "=", 26, 17));
    tokens.add(new TokenSintatico("NUM", "0", 26, 18));
    tokens.add(new TokenSintatico("FIM", ";", 26, 18));
    tokens.add(new TokenSintatico("ID", "i", 26, 19));
    tokens.add(new TokenSintatico("MENORQ", "<", 26, 20));
    tokens.add(new TokenSintatico("NUM", "5", 26, 21));
    tokens.add(new TokenSintatico("FIM", ";", 26, 21));
    tokens.add(new TokenSintatico("ID", "i", 26, 22));
    tokens.add(new TokenSintatico("INCREMENTO_SOMA", "++", 26, 22));
    tokens.add(new TokenSintatico("RPAREN", ")", 26, 23));
    tokens.add(new TokenSintatico("LCHAVE", "{", 26, 24));
    tokens.add(new TokenSintatico("ID", "x", 27, 2));
    tokens.add(new TokenSintatico("ATRIBUICAO", "=", 27, 3));
    tokens.add(new TokenSintatico("NUM", "24", 27, 4));
    tokens.add(new TokenSintatico("FIM", ";", 27, 5));
    tokens.add(new TokenSintatico("RCHAVE", "}", 28, 1));

    tokens.add(new TokenSintatico("COMENTARIO", "# Teste 2 do nosso for", 30, 1));

    tokens.add(new TokenSintatico("RESERVADA_EOSEUNEGOCIO", "eOSeuNegocio", 31, 1));
    tokens.add(new TokenSintatico("LPAREN", "(", 31, 12));
    tokens.add(new TokenSintatico("RESERVADA_TAOK", "taOk", 31, 12));
    tokens.add(new TokenSintatico("ID", "i", 31, 16));
    tokens.add(new TokenSintatico("ATRIBUICAO", "=", 31, 17));
    tokens.add(new TokenSintatico("NUM", "0", 31, 18));
    tokens.add(new TokenSintatico("FIM", ";", 31, 18));
    tokens.add(new TokenSintatico("ID", "i", 31, 19));
    tokens.add(new TokenSintatico("MENORQ", "<", 31, 20));
    tokens.add(new TokenSintatico("NUM", "5", 31, 21));
    tokens.add(new TokenSintatico("FIM", ";", 31, 21));
    tokens.add(new TokenSintatico("ID", "i", 31, 22));
    tokens.add(new TokenSintatico("INCREMENTO_SOMA", "++", 31, 22));
    tokens.add(new TokenSintatico("RPAREN", ")", 31, 23));
    tokens.add(new TokenSintatico("LCHAVE", "{", 31, 24));
    tokens.add(new TokenSintatico("ID", "x", 32, 2));
    tokens.add(new TokenSintatico("ATRIBUICAO", "=", 32, 3));
    tokens.add(new TokenSintatico("ID", "x", 32, 4));
    tokens.add(new TokenSintatico("SOMA", "+", 32, 5));
    tokens.add(new TokenSintatico("ID", "i", 32, 6));
    tokens.add(new TokenSintatico("FIM", ";", 32, 6));
    tokens.add(new TokenSintatico("RCHAVE", "}", 33, 1));

    tokens.add(new TokenSintatico("RESERVADA_FAZDENOVO", "fazDeNovo", 12, 1));
    tokens.add(new TokenSintatico("LPAREN", "(", 12, 9));
    tokens.add(new TokenSintatico("ID", "x", 12, 9));
    tokens.add(new TokenSintatico("DIFERENTE", "!=", 12, 10));
    tokens.add(new TokenSintatico("ID", "y", 12, 12));
    tokens.add(new TokenSintatico("RPAREN", ")", 12, 12));
    tokens.add(new TokenSintatico("LCHAVE", "{", 12, 12));
    tokens.add(new TokenSintatico("ID", "x", 14, 2));
    tokens.add(new TokenSintatico("INCREMENTO_SOMA", "++", 14, 3));
    tokens.add(new TokenSintatico("FIM", ";", 14, 5));
    tokens.add(new TokenSintatico("RCHAVE", "}", 15, 1));

    tokens.add(new TokenSintatico("RESERVADA_OLHASO", "olhaSo", 13, 2));
    tokens.add(new TokenSintatico("LPAREN", "(", 13, 7));
    tokens.add(new TokenSintatico("STRING", "Dentro do nosso while", 13, 7));
    tokens.add(new TokenSintatico("RPAREN", ")", 13, 31));
    tokens.add(new TokenSintatico("FIM", ";", 13, 31));

    tokens.add(new TokenSintatico("EOF", "$", 33, 2));

    System.out.println("\nAnalisador Sintático\n");
    Parser parser = new Parser(tokens);
    parser.main();
  }
}
