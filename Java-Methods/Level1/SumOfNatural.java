/*Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop
*/

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number n
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Calculate sum
        int sum = calculateSum(n);

        // Display the result
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }

    // Method to calculate sum of first n natural numbers using loop
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
