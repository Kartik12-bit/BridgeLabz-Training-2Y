import java.util.Scanner;

public class SumOfNat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number (n): ");
        int n = scanner.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            // Compute sum using the formula
            int formulaSum = n * (n + 1) / 2;

            // Compute sum using a for loop
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            // Display results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + sum);

            // Compare results
            if (sum == formulaSum) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There is a difference in the computations.");
            }
        }
    }
}