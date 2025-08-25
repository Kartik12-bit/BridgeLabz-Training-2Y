import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Variables
        int sum = 0;
        int originalNumber = number;

        // Step 3: Loop through digits and calculate sum
        while (originalNumber > 0) {
            int digit = originalNumber % 10; // extract last digit
            sum += digit;                    // add to sum
            originalNumber /= 10;            // remove last digit
        }

        // Step 4: Check Harshad condition
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }
    }
}
