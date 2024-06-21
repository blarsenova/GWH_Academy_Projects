package Interpreters;

import java.util.ArrayList;

public class RunningClass {

    public static void main(String[] args) {
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
