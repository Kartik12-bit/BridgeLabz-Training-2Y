/*Write a program to take 2 numbers and print their quotient and reminder
Hint => 
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number 
public static int[] findRemainderAndQuotient(int number, int divisor)
*/

import java.util.Scanner;

public class Quotent&Remainder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dividend and divisor
        System.out.print("Enter the dividend (number): ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
            return;
        }

        // Find quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }

    // Method to find remainder and quotient
    // Returns array: [quotient, remainder]
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }
}
