import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
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

        Parser parser = new Parser(tokens);
        parser.main();
    }

    public String Arquivo() throws IOException {
        String data = new String(
                Files.readAllBytes(Paths.get("teste.txt")),
                StandardCharsets.UTF_8);
        return data;
    }
}