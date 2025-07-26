package level_03;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();

        // Step 2: Convert height to meters
        double heightM = heightCm / 100.0;

        // Step 3: Calculate BMI
        double bmi = weight / (heightM * heightM);

        // Step 4: Determine status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Step 5: Output result
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);

        input.close();
    }
}
