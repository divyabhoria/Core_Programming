package level_03;

import java.util.Scanner;

public class HarshadNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get integer input for the number
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Store original number for divisibility check later
        int originalNumber = number;

        // Initialize sum of digits to 0
        int sum = 0;

        // Calculate sum of digits using a while loop
        while (number != 0) {
            int digit = number % 10;  // Extract last digit
            sum += digit;             // Add digit to sum
            number = number / 10;     // Remove last digit
        }

        // Check divisibility of original number by sum of digits
        if (sum != 0 && originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

        input.close();
    }
}
