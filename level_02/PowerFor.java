import java.util.Scanner;

public class PowerFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int number = input.nextInt();

        System.out.print("Enter power (non-negative): ");
        int power = input.nextInt();

        if (power < 0) {
            System.out.println("Invalid power.");
            input.close();
            return;
        }

        int result = 1;

        // Use for loop to compute power
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.println(number + " raised to the power " + power + " is " + result);

        input.close();
    }
}
