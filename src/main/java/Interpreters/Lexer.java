package Interpreters;

import java.util.ArrayList;
import java.util.List;

public class Lexer {


    private final List<Token> tokens;
    private final String input;


    public Lexer(String input) {
        this.input = input;
        this.tokens= new ArrayList<Token>();
        tokenize();
    }

    private void tokenize() {
    }

    private static class Token{


    }
}
