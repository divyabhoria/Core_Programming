package level_03;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input marks for each subject
        System.out.print("Enter marks in Physics: ");
        double phy = input.nextDouble();

        System.out.print("Enter marks in Chemistry: ");
        double chem = input.nextDouble();

        System.out.print("Enter marks in Maths: ");
        double maths = input.nextDouble();

        // Compute average percentage
        double average = (phy + chem + maths) / 3.0;

        // Determine grade and remarks
        String grade = "";
        String remarks = "";

        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Output
        System.out.println("\n----- Result -----");
        System.out.printf("Average Mark: %.2f\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}

