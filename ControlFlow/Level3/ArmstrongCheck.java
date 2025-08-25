import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize variables
        int sum = 0;
        int originalNumber = number;

        // Step 3: Loop through digits
        while (originalNumber != 0) {
            // Extract the last digit
            int digit = originalNumber % 10;

            // Add cube of the digit to sum
            sum += digit * digit * digit;

            // Remove last digit
            originalNumber /= 10;
        }

        // Step 4: Compare sum with original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }
    }
}
