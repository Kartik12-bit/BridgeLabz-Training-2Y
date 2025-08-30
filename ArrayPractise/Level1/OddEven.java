import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number (positive integer)
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than zero.");
            scanner.close();
            return; // Exit the program
        }

        // Initialize arrays to store odd and even numbers
        int size = number / 2 + 1; // Maximum possible size for odd or even numbers
        int[] oddNumbers = new int[size];
        int[] evenNumbers = new int[size];

        // Indexes to keep track of next position in odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;

        // Loop from 1 to number and separate odd and even
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // Even number
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                // Odd number
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Print even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
