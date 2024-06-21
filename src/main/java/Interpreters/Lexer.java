package Interpreters;

import java.util.ArrayList;
import java.util.List;

public class Lexer {


    private final List<Token> tokens;
    private final String input;


    public Lexer(String input) {
        this.input = input;
        this.tokens = new ArrayList<Token>();
        tokenize();
    }

    private void tokenize() {

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
        CONFIG, UPDATE, COMPUTE, SHOW, CONFIGS, STRING, NUMBER, IDENTIFIER, ASSIGNMENT, REFERENCES
    }
}
