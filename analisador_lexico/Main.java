package projeto.analisador_lexico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Token> tokens = null;
        // String data = "[(1.5+56) / 2];\n // calcula alguma coisa\r int u = ({a+b});";
        // String data = "float x = 1.1\n int y = 5\nfloat z = 2.2\nint w = 10\nint
        // result = x * y + z - w\nresult = result * 2\nresult = result / 2\nreturn 4";
        String data = "gaviao x = 1.1\n taOk y = 5\n gaviao z = 2.2\n taOk= 10\n taOk result = x * y + z";

        ArrayList<String> operacoes = new Main().Arquivo();
        for (String operacao : operacoes) {
            System.out.println(operacao);
        }

        Lexer lexer = new Lexer(data);
        tokens = lexer.getTokens();

        for (Token token : tokens) {
            System.out.println(token);
        }
    }

    public ArrayList<String> Arquivo() {
        ArrayList<String> operacoes = new ArrayList<>();
        try {
            FileReader arquivo = new FileReader("teste.txt");
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
