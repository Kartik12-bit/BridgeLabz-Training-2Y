import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the number of persons as input
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        // Create arrays to store weight (kg), height (meters), BMI, and weight status
        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] status = new String[numPersons];

        // Get weight and height for each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();
            System.out.println("Enter height (meters) for person " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < numPersons; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            // Determine weight status based on BMI
            if (bmis[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 25) {
                status[i] = "Normal weight";
            } else if (bmis[i] >= 25 && bmis[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display the results
        System.out.println("\nPerson\tHeight(m)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s%n",
                    i + 1, heights[i], weights[i], bmis[i], status[i]);
        }

        scanner.close();
    }
}