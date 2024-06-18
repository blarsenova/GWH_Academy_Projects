package DSL;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        //Add 3, 5
        //Sub 33, 8
        //Mult 5, 8
        //Div 72, 9

        Scanner scanner = new Scanner(System.in);
        String rawexpression = scanner.nextLine();
        String[] xpression = rawexpression.split(" ");
        if (xpression.length!=3) {
            throw new IllegalArgumentException("Input doesn't satisfy language rules " + rawexpression);
        }

        try {
            String operator = xpression[0];
            int operand1 = Integer.parseInt(xpression[1]);
            int operand2 = Integer.parseInt(xpression[2]);
            int result = calculate(operator, operand1, operand2);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();

    }

        scanner.close();
    }

    private static int calculate(String operator, int operand1, int operand2) {
        switch (operator) {
            case "ADD":
                return operand1 + operand2;
            case "SUB":
                return operand1 - operand2;
            default:
                throw new UnsupportedOperationException("Unsupported operation " +operator);

        }
    }
}
