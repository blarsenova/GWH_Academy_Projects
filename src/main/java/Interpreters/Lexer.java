package Interpreters;

import java.util.ArrayList;
import java.util.List;

public class Lexer {


    private final List<Token> tokens;
    private final String input;
    private int currentCount;


    public Lexer(String input) {
        this.input = input;
        this.tokens = new ArrayList<Token>();
        this.currentCount = 0;
        tokenize();
    }

    private void tokenize() {
        while (currentCount < input.length()) {
            char ch = input.charAt(currentCount);
            switch (ch) {
                case ' ':
                case '\t':
                case '\n':
                case '\r':
                    currentCount++;
                    break;
                case '=':
                    tokens.add(new Token(TokenType.ASSIGNMENT, "=");
                    currentCount++;
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                    tokens.add(new Token(TokenType.OPERATOR, Character.toString(ch)));
                    currentCount++;
                    break;
                case '"':
                    tokens.add(new Token(STRING, readtoString()));
                    break;
                case '%':
                    tokens.add(new Token(TokenType.REFERENCES, readReference()));



            }

        }

    }

    private String readReference() {
        StringBuilder builder = new StringBuilder();
        currentCount++;
        while (currentCount < input.length() && isAlphaNumberic(input.charAt(currentCount))) {
            builder.append(input.charAt(currentCount));
            currentCount++;
        }
        return builder.toString();
    }

    private boolean isAlphaNumberic(char c) {
        return false;
    }

    private String readtoString() {
        StringBuilder builder = new StringBuilder();
        currentCount++;
        while (currentCount < input.length() && input.charAt(currentCount) != '"') {
            builder.append(input.charAt(currentCount));
            currentCount++;
        }
        return builder.toString();
    }

    static class Token {
        final TokenType type;
        final String value;

        Token(TokenType type, String value) {
            this.type = type;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Token{" +
                   "type=" + type +
                   ", value='" + value + '\'' +
                   '}';
        }
    }

    enum TokenType {
        CONFIG, UPDATE, COMPUTE, SHOW, CONFIGS, STRING, NUMBER, IDENTIFIER, ASSIGNMENT, REFERENCES, OPERATOR
    }
}
