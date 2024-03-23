package projeto.analisador_lexico;

import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        List<Token> tokens = null;
        // String data = "[(1.5+56) / 2];\n // calcula alguma coisa\r int u = ({a+b});";
        String data = "gaviao x = 1.1;\n taOk y = 5\nfloat z = 2.2\nint w = 10\nint result = x * y + z - w\nresult = result * 2\nresult = result / 2\ndepende";

        Lexer lexer = new Lexer(data);
        tokens = lexer.getTokens();

        for (Token token : tokens) {
            System.out.println(token);
        }

        ArrayList<String> operacoes = new Main().Arquivo();
        for (String operacao : operacoes) {
            System.out.println(operacao);
        }
    }

    public ArrayList<String> Arquivo() {
        ArrayList<String> operacoes = new ArrayList<>();
        try {
            FileReader arquivo = new FileReader("src/main/java/teste.txt");
            BufferedReader br = new BufferedReader(arquivo);

            String linha;

            while ((linha = br.readLine()) != null) {
                // System.out.println("Linha lida: " + linha);
                operacoes.add(linha);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return operacoes;
    }
}