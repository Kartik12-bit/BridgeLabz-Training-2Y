import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        // Checking the input ...if it is a positibe integer 
        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int factorial = 1;

            // using a for loop
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            // Printing the result
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
    }
}