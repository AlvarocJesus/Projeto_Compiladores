package projeto.analisador_lexico;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Token> tokens = null;
        // String data = "[(1.5+56) / 2];\n // calcula alguma coisa\r int u = ({a+b});";
        // String data = "float x = 1.1\n int y = 5\nfloat z = 2.2\nint w = 10\nint
        // result = x * y + z - w\nresult = result * 2\nresult = result / 2\nreturn 4";
        String data = "gaviao x = 1.1\n taOk y = 5\n gaviao z = 2.2\n taOk= 10\n taOk result = x * y + z";
        Lexer lexer = new Lexer(data);
        tokens = lexer.getTokens();

        for (Token token : tokens) {
            System.out.println(token);
        }
    }
}
