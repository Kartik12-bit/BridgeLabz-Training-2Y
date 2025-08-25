import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their weight in kg
        System.out.print("Enter your weight in kilograms (kg): ");
        double weight = scanner.nextDouble();

        // Prompt the user to enter their height in cm
        System.out.print("Enter your height in centimeters (cm): ");
        double heightInCm = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Convert height from cm to meters
        double heightInM = heightInCm / 100;

        // Calculate the BMI using the formula: BMI = weight / (height * height)
        double bmi = weight / (heightInM * heightInM);

        // Determine the weight status based on the BMI value
        String status;
        if (bmi >= 40.0) {
            status = "Obese";
        } else if (bmi >= 25.0) {
            status = "Overweight";
        } else if (bmi >= 18.5) {
            status = "Normal";
        } else {
            status = "Underweight";
        }

        // Display the results
        System.out.println("\n--- BMI Report ---");
        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("Your weight status is: " + status);
    }
}