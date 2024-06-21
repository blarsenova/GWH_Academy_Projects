package Interpreters;

import Interpreters.Lexer.TokenType;

import java.util.ArrayList;

public class RunningClass {

    public static void main(String[] args) {

        String input = """
                config "num_users"= 300
                update "num_users" = 55
                """;

        Lexer lexer1 = new Lexer(input);
        for (Lexer.Token token: lexer1){
            System.out.println(token);
        }

      /*  ArrayList<Lexer.Token> tokens = new ArrayList<>();
        tokens.add(new Lexer.Token(Lexer.TokenType.CONFIG, "Configs"));
        tokens.add(new Lexer.Token(Lexer.TokenType.STRING, "num users"));
        tokens.add(new Lexer.Token(Lexer.TokenType.ASSIGNMENT, "="));
        tokens.add(new Lexer.Token(Lexer.TokenType.NUMBER, "139"));

        for (Lexer.Token token:tokens){
            System.out.println(token);
      */
    }
}
