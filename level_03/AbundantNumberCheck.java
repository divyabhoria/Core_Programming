package level_03;

import java.util.Scanner;

public class AbundantNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get integer input for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            input.close();
            return;
        }

        // Initialize sum of divisors to 0
        int sum = 0;

        // Loop through numbers from 1 to number-1 to find divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i; // Add divisor to sum
            }
        }

        // Check if sum of divisors is greater than the number itself
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }

        input.close();
    }
}
