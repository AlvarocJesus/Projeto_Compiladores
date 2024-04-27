import java.util.List;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Token> tokens = null;

        String codigoFonte = new Main().Arquivo();

        Lexer lexer = new Lexer(codigoFonte);
        tokens = lexer.getTokens();

        for (Token token : tokens) {
            System.out.println(token);
        }

        // Parser parser = new Parser(token);
        // parser.main();
    }

    public String Arquivo() throws IOException {
        String data = new String(
                Files.readAllBytes(Paths.get("E://FEI/Ciclo_6/Compiladores/projeto/analisador_lexico/teste.txt")),
                StandardCharsets.UTF_8);
        return data;
    }
}