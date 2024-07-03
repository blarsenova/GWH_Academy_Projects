package Interpreters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lexer implements Iterable<Lexer.Token> {


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
                    tokens.add(new Token(TokenType.ASSIGNMENT, "="));
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
                    tokens.add(new Token(TokenType.STRING, readtoString()));
                    currentCount++;
                    break;
                case '%':
                    tokens.add(new Token(TokenType.REFERENCES, readReference()));
                    break;
                default:
                    if (isDigit(ch)) {
                        tokens.add(new Token(TokenType.NUMBER, readNumbers()));

                    } else if (isAlpha(ch)) {
                        String identifier = readIdentifier();
                        tokens.add(new Token(deriveTokenType(identifier), identifier));
                    } else {
                        throw new LexerException ("Unsupported character: "+ ch);
                    }
            }
        }
    }

    private TokenType deriveTokenType(String identifier) {
        switch (identifier){
            case "config":
                return TokenType.CONFIG;
            case "update":
                return  TokenType.UPDATE;
            case "compute":
                return TokenType.COMPUTE;
            case "show":
                return TokenType.SHOW;
            case "configs":
                return TokenType.CONFIGS;
            default:
                return TokenType.IDENTIFIER;

        }

    }

    private String readIdentifier() {

        StringBuilder builder = new StringBuilder();
        while (currentCount < input.length() && isAlphaNumberic(input.charAt(currentCount))) {
            builder.append(input.charAt(currentCount));
            currentCount++;
        }

        return builder.toString();

    }

    private String readNumbers() {

        StringBuilder builder = new StringBuilder();
        while (currentCount < input.length() && isDigit(input.charAt(currentCount))) {
            builder.append(input.charAt(currentCount));
            currentCount++;
        }

        return builder.toString();
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
        return isAlpha(c) | isDigit(c);

    }

    private boolean isDigit(char c) {
        return '0' <= c && c <= '9';
    }

    private boolean isAlpha(char c) {
        return ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || c == '_';
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

    @Override
    public Iterator<Token> iterator() {
        return tokens.iterator();
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
