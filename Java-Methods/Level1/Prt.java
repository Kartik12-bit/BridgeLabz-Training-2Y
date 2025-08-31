/*Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => 
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___
*/

import java.util.Scanner;

public class Prt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double interest = calculateSimpleInterest(principal, rate, time);

        // Output the result
        System.out.printf(
            "The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f, and Time %.2f\n",
            interest, principal, rate, time
        );
    }

    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return principal * rate * time / 100;
    }
}
