package P2;

public class Lexer {

    public static void main(String[] args) {

        /* <instruction> = <assignment>|<control_structure>|print <instruction>;
           <assignment> = <identifier> "=" <expression>;
           <identifier> =  <aTOz>;
<control_structure> = "if" <expression> "then" <instruction> ";" <else_clause> ";" "end"
           <else_clause> = "else" <instruction>
<expression> =  <identifier> | <number> | <identifier> <operator> <expression>
                | "(" <expression> <operator> <expression> ")"

 <aTOz> = "a" | "b" | "c" | "d" | "e" | "f" | "g" | "h" | "i" | "j" | "k" | "l" | "m" | "n" | "o" | "p" | "q" | "r" | "s" | "t" | "u" | "v" | "w" | "x" | "y" | "z"

            <number> = "0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
            <operator> = "ADD" | "MUL"|"SUB"|"DIV
            <print_instruction> = "print" <identifier>

      */
    }
}
