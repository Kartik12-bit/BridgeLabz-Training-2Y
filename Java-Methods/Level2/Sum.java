/*Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 
Hint => 
Take the user input number and check whether it's a Natural number
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
Compare the two results and print the resul
*/

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number n
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
            return;
        }

        // Calculate sum using recursion
        int recursiveSum = sumUsingRecursion(n);

        // Calculate sum using formula
        int formulaSum = sumUsingFormula(n);

        // Print both results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Compare and validate results
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("There is a discrepancy between methods.");
        }
    }

    // Recursive method to find sum of n natural numbers
    public static int sumUsingRecursion(int n) {
        if (n == 1) {  // Base case
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find sum using formula n*(n+1)/2
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}
