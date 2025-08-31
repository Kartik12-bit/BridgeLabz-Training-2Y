/* Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less
Hint => 
Write a Method to Check whether the number is positive or negative
Write a Method to check whether the number is even or odd
Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2 
In the main program, Loop through the array using the length call the method isPositive() and if positive call method isEven() and print accordingly 
If the number is negative, print negative. 
Finally compare the first and last element of the array by calling the method compare() and display if they are equal, greater, or less
*/

import java.util.Scanner;

public class NumberAnalysis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        // Input 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Analyze each number
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is positive and even.");
                } else {
                    System.out.println(numbers[i] + " is positive and odd.");
                }
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }

        // Compare first and last elements
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("First element (" + numbers[0] + ") is greater than last element (" + numbers[numbers.length - 1] + ").");
        } else if (comparisonResult == 0) {
            System.out.println("First element (" + numbers[0] + ") is equal to last element (" + numbers[numbers.length - 1] + ").");
        } else {
            System.out.println("First element (" + numbers[0] + ") is less than last element (" + numbers[numbers.length - 1] + ").");
        }
    }

    // Method to check if number is positive
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check if number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers: return 1 if num1 > num2, 0 if equal, -1 if num1 < num2
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }
}
