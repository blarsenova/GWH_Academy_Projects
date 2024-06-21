package Interpreters;

import java.util.ArrayList;

public class RunningClass {

    public static void main(String[] args) {

        String input = """
                configs "num_users"= 300
                update "num_users" = 55
                """;

        Lexer lexer = new Lexer(input);

        ArrayList<Lexer.Token> tokens = new ArrayList<>();
        tokens.add(new Lexer.Token(Lexer.TokenType.CONFIG, "Configs"));
        tokens.add(new Lexer.Token(Lexer.TokenType.STRING, "num users"));
        tokens.add(new Lexer.Token(Lexer.TokenType.ASSIGNMENT, "="));
        tokens.add(new Lexer.Token(Lexer.TokenType.NUMBER, "139"));

        for (Lexer.Token token:tokens){
            System.out.println(token);
        }
    }
}
