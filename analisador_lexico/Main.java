package projeto.analisador_lexico;

import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        List<Token> tokens = null;

        int linha = 1;
        ArrayList<String> operacoes = new Main().Arquivo();

        for (String operacao : operacoes) {
            // System.out.println("Lendo a operação: " + operacao);
            // System.out.println();
            // int coluna = 1;

            Lexer lexer = new Lexer(operacao, linha);
            tokens = lexer.getTokens();

            // isso pode sair daqui de dentro
            /*
             * for (int i = 0; i < operacao.length(); i++) {
             * 
             * System.out.println("Code: " + operacao.charAt(i) + "\tLinha: " + fimLinha +
             * "\tColuna: " + coluna);
             * 
             * if (operacao.charAt(i) == '\r' || operacao.charAt(i) == '\n' ||
             * operacao.charAt(i) == ';') {
             * System.out.println("achou fim da linha");
             * }
             * coluna++;
             * }
             */

            linha++;
            for (Token token : tokens) {
                System.out.println(token);
            }
        }
    }

    public ArrayList<String> Arquivo() {
        ArrayList<String> operacoes = new ArrayList<String>();
        try {
            FileReader arquivo = new FileReader("src/main/java/teste.txt");
            BufferedReader br = new BufferedReader(arquivo);

            String linha;

            while ((linha = br.readLine()) != null) {
                operacoes.add(linha);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return operacoes;
    }
}