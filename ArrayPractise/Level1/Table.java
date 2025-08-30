import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        // Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        // Array to store multiplication results from 1 to 10
        int[] table = new int[10];

        // Loop to calculate multiplication results and store in array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Loop to display the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        // Close the scanner object
        scanner.close();
    }
}
