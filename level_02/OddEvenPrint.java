import java.util.Scanner;

public class OddEvenPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number < 1) {
            System.out.println("Please enter a natural number greater than 0.");
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is even number");
            else
                System.out.println(i + " is odd number");
        }
    }
}
