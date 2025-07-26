import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number = input.nextInt();
        System.out.print("Enter power (non-negative): ");
        int power = input.nextInt();

        if (power < 0) {
            System.out.println("Invalid power.");
            return;
        }

        int result = 1;
        int counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }
        System.out.println(number + " raised to the power " + power + " is " + result);
    }
}
