import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Handle negative numbers (convert to positive)
        if (number < 0) {
            number = -number;
        }

        // Special case: if number = 0
        if (number == 0) {
            System.out.println("Number of digits: 1");
        } else {
            int count = 0;

            // Step 2: Loop until number becomes 0
            while (number != 0) {
                number /= 10;   // remove last digit
                count++;        // increase count
            }

            // Step 3: Print result
            System.out.println("Number of digits: " + count);
        }
    }
}
