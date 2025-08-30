import java.util.Scanner;

public class Table2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input number from user
        System.out.print("Enter a number to print its multiplication table (6 to 9): ");
        int number = scanner.nextInt();

        // Array to store multiplication results for multipliers 6 to 9
        int[] multiplicationResult = new int[4]; // for 6,7,8,9

        // Loop through multipliers 6 to 9 and store results
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display the results in the required format
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        scanner.close();
    }
}
