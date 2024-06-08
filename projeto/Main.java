package projeto;

import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import Lexico.Token;
import Lexico.Lexer;
import Sintatico.Parser;

public class Main {
  public static void main(String[] args) throws IOException {
    List<Token> tokens = null;

    String codigoFonte = new Main().Arquivo();

    Lexer lexer = new Lexer(codigoFonte);
    tokens = lexer.getTokens();

    File file = new File("projeto/Saida.java");

    try {
      // Cria um PrintStrem para escrever no arquivo
      PrintStream print = new PrintStream(file);

      // Redireciona saida padrao (System.out) para o arquivo projeto/Main.java
      System.setOut(print);

      // Chama Analisador Sintatico
      Parser parser = new Parser(tokens);
      parser.main();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

  }

  public String Arquivo() throws IOException {
    String data = new String(
        Files.readAllBytes(
            Paths.get("C://Users/AlvaroCJesus/OneDrive - FEI/FEI/Ciclo_6/Compiladores/projeto/projeto/teste.me")),
        StandardCharsets.UTF_8);
    return data;
  }
}