/*Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint => 
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)
*/

import java.util.Scanner;

public class Trigonometry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input angle in degrees
        System.out.print("Enter angle in degrees: ");
        double angleDegrees = scanner.nextDouble();

        // Calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angleDegrees);

        // Display results
        System.out.printf("Sine(%.2f°) = %.4f\n", angleDegrees, results[0]);
        System.out.printf("Cosine(%.2f°) = %.4f\n", angleDegrees, results[1]);
        System.out.printf("Tangent(%.2f°) = %.4f\n", angleDegrees, results[2]);
    }

    // Calculate sine, cosine, tangent from angle in degrees
    // Return array: [sine, cosine, tangent]
    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double angleRadians = Math.toRadians(angleDegrees);

        double sine = Math.sin(angleRadians);
        double cosine = Math.cos(angleRadians);
        double tangent = Math.tan(angleRadians);

        return new double[]{sine, cosine, tangent};
    }
}
