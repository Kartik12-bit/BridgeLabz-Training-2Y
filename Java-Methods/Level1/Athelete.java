/* An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run
*/

import java.util.Scanner;

public class Athelete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sides of the triangle in meters
        System.out.print("Enter side 1 (meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 (meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 (meters): ");
        double side3 = scanner.nextDouble();

        // Compute and display the number of rounds for 5 km (5000 meters)
        int rounds = computeNumberOfRounds(side1, side2, side3, 5000);

        System.out.println("Number of rounds needed to complete 5 km run: " + rounds);
    }

    // Method to compute number of rounds for a given distance
    public static int computeNumberOfRounds(double s1, double s2, double s3, double totalDistance) {
        double perimeter = s1 + s2 + s3;
        // Calculate and round up for minimum required rounds
        int rounds = (int) Math.ceil(totalDistance / perimeter);
        return rounds;
    }
}
