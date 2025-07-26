package level_03;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for first number, second number, and operator
        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String op = input.next(); // reading operator as String

        // Loop from i=1 to i < second (as per hint, though usually calculator doesn't require loop)
        for (int i = 1; i < second; i++) {
            switch (op) {
                case "+":
                    System.out.println("Result of addition: " + (first + second));
                    break;

                case "-":
                    System.out.println("Result of subtraction: " + (first - second));
                    break;

                case "*":
                    System.out.println("Result of multiplication: " + (first * second));
                    break;

                case "/":
                    if (second != 0) {
                        System.out.println("Result of division: " + (first / second));
                    } else {
                        System.out.println("Error: Division by zero is undefined.");
                    }
                    break;

                default:
                    System.out.println("Invalid Operator.");
                    break;
            }
            break; // Since actual calculator needs operation done once, breaking after first iteration
        }

        input.close();
    }
}
