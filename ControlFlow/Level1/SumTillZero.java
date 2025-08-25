import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to add to the sum. Enter 0 or a negative number to stop.");

        while (true) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            // Check if the user entered 0 or a negative number
            if (num <= 0) {
                break; // Exit the loop
            }

            sum += num; // Add the number to the sum
        }

        System.out.println("The total sum is: " + sum);
        
}