package level_03;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Handle case if number is 0, since while loop won't run then
        if (number == 0) {
            System.out.println("Number of digits: 1");
            input.close();
            return;
        }

        // For negative numbers, take absolute value
        number = Math.abs(number);

        int count = 0;

        // Iterate until number becomes 0, removing last digit in each iteration
        while (number != 0) {
            number = number / 10; // Remove last digit
            count++;              // Increment digit count
        }

        System.out.println("Number of digits: " + count);

        input.close();
    }
}

