package backup;

import java.util.List;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainCopy {
    public static void main(String[] args) throws IOException {
        List<TokenSintatico> tokens = null;

        String codigoFonte = new MainCopy().Arquivo();

        Lexer lexer = new Lexer(codigoFonte);
        tokens = lexer.getTokens();

        for (TokenSintatico token : tokens) {
            System.out.println(token);
        }

        System.out.println("\nAnalisador Sintático\n");
        ParserCopy parser = new Parser(tokens);
        parser.main();
    }

    public String Arquivo() throws IOException {
        String data = new String(
                Files.readAllBytes(Paths.get("teste.me")),
                StandardCharsets.UTF_8);
        return data;
    }
}