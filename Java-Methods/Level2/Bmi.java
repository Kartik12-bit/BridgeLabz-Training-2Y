/*An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and and store it in the corresponding 2D array of 10 rows and 3 columns. The First Column storing the weight, the second column storing the height in cm and the third column is the BMI
Create a Method to find the BMI of every person and populate the array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method to determine the BMI status using the logic shown in the figure below. and return the array of all the persons BMI Status. 
 
*/

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array: 10 rows, 3 columns (weight, height, BMI)
        double[][] data = new double[10][3];

        // Input weight and height, calculate BMI and store
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter data for Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            double weight = scanner.nextDouble();
            System.out.print("Height (cm): ");
            double height = scanner.nextDouble();

            data[i][0] = weight;
            data[i][1] = height;
            data[i][2] = calculateBMI(weight, height);
        }

        // Get BMI statuses for all persons
        String[] statuses = determineBMIStatus(data);

        // Display results in table format
        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    (i + 1), data[i][0], data[i][1], data[i][2], statuses[i]);
        }
    }

    // Method to calculate BMI: BMI = weight / (height in meters)^2
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    // Method to determine BMI status based on BMI value
    // Returns array of status labels for all persons
    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 30) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        return statuses;
    }
}
