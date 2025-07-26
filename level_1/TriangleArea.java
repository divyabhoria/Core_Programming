import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of triangle (in inches): ");
        double base = input.nextDouble();
        System.out.print("Enter height of triangle (in inches): ");
        double height = input.nextDouble();

        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516; // 1 square inch = 6.4516 cm^2

        System.out.printf("The area of triangle is %.2f square inches and %.2f square centimeters.\n", areaInInches, areaInCm);
    }
}
