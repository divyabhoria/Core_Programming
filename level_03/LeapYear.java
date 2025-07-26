import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("Year should be 1582 or later (Gregorian calendar).");
            input.close();
            return;
        }

        // Part 1: Multiple if-else statements
        System.out.println("=== Using multiple if-else statements ===");
        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is NOT a Leap Year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        // Part 2: Single if statement with multiple logical operators
        System.out.println("=== Using single if statement and logical operators ===");
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        input.close();
    }
}
