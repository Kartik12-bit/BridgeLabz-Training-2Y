import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        // Check if the input is a positive integer
        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int factorial = 1;

            // Compute factorial using a for loop
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            // Print the result
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
    }
}