import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }

        int minAgeIdx = 0, maxHeightIdx = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIdx]) minAgeIdx = i;
            if (heights[i] > heights[maxHeightIdx]) maxHeightIdx = i;
        }

        System.out.println("Youngest friend is " + names[minAgeIdx] + " (" + ages[minAgeIdx] + " years)");
        System.out.println("Tallest friend is " + names[maxHeightIdx] + " (" + heights[maxHeightIdx] + " cm)");
    }
}
