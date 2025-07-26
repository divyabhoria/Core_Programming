package level_03;

import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Get integer input from user and store in 'number' variable
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Step 2: Initialize sum to 0 and store original number for comparison later
        int sum = 0;
        int originalNumber = number;

        // Step 3: Use while loop until 'number' becomes 0
        while (number != 0) {
            // Find each digit (remainder when divided by 10)
            int digit = number % 10;

            // Add cube of digit to sum
            sum += digit * digit * digit;

            // Remove last digit from number (integer division by 10)
            number = number / 10;
        }

        // Step 4: Check if sum is equal to original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }

        input.close();
    }
}
