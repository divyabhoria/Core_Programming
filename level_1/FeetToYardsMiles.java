import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        double yards = feet / 3.0;
        double miles = yards / 1760.0;

        System.out.printf("The distance %.2f feet is %.2f yards and %.4f miles.\n", feet, yards, miles);
    }
}
