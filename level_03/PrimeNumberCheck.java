package level_03;
import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer greater than 1: ");
        int number = input.nextInt();

        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
            input.close();
            return;
        }

        boolean isPrime = true; // Assume number is prime initially

        // Check divisibility from 2 up to number - 1
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false; // Found a divisor
                break;           // No need to check further
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }

        input.close();
    }
}
