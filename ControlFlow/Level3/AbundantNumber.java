import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize sum
        int sum = 0;

        // Step 3: Loop to find divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // check divisor
                sum += i;           // add divisor
            }
        }

        // Step 4: Check abundant condition
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }
    }
}
