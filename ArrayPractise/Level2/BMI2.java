
/* Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
Hint => 
Take input for a number of persons
Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
       double[][] personData = new double[number][3];
       String[] weightStatus = new String[number];
Take input for weight and height of the persons and for negative values, ask the user to enter positive values
Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
Display the height, weight, BMI and status of each person */


import java.util.Scanner;

public class BMIMultiDimArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take number of persons as input
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        // Create a 2D array: rows = number of persons, columns = 3 (weight, height, BMI)
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Input weight and height for each person with validation
        for (int i = 0; i < number; i++) {
            double weight, height;

            // Input and validate weight (> 0)
            while (true) {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                weight = scanner.nextDouble();
                if (weight > 0) {
                    break;
                }
                System.out.println("Invalid input! Weight must be positive.");
            }
            personData[i][0] = weight; // Store weight

            // Input and validate height (> 0)
            while (true) {
                System.out.print("Enter height (meters) for person " + (i + 1) + ": ");
                height = scanner.nextDouble();
                if (height > 0) {
                    break;
                }
                System.out.println("Invalid input! Height must be positive.");
            }
            personData[i][1] = height; // Store height
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < number; i++) {
            double bmi = personData[i][0] / (personData[i][1] * personData[i][1]);
            personData[i][2] = bmi; // Store BMI

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results in a formatted table
        System.out.println("\nPerson\tWeight(kg)\tHeight(m)\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s%n",
                              i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}



