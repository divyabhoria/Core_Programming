import java.util.Scanner;

public class MultiplesBelow100For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Number out of allowed range.");
            return;
        }

        System.out.print("Multiples of " + number + " below 100: ");
        for (int i = 1; i < 100; i++) {
            if (i % number == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
