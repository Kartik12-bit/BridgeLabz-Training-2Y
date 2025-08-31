/*Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero
*/

import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get integer input from user
        System.out.print("Enter an integer number: ");
        int num = scanner.nextInt();

        int result = checkNumberType(num);

        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    // Method: Returns 1 if positive, -1 if negative, 0 if zero
    public static int checkNumberType(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
