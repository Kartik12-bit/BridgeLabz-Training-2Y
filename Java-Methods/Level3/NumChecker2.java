/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to find the sum of the digits of a number using the digits array
Method to find the sum of the squares of the digits of a number using the digits array. Use Math.pow() method
Method to Check if a number is a harshad number using a digits array. A number is called a Harshad number if it is divisible by the sum of its digits. For e.g. 21
Method to find the frequency of each digit in the number. Create a 2D array to store the frequency with digit in the first column and frequency in the second column.
*/
import java.util.Scanner;

public class NumberChecker2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        int[] digits = extractDigits(number, digitCount);
        System.out.print("Digits array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumDigits);

        double sumSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);

        boolean isHarshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad Number? " + isHarshad);

        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit frequencies:");
        System.out.println("Digit | Frequency");
        for (int i = 0; i < frequency.length; i++) {
            System.out.printf("  %d   |    %d\n", frequency[i][0], frequency[i][1]);
        }
    }

    // Method to count digits in number
    public static int countDigits(int num) {
        num = Math.abs(num);
        if (num == 0) return 1;

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // Extract digits into array
    public static int[] extractDigits(int num, int count) {
        num = Math.abs(num);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Sum of digits using digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Sum of squares of digits using Math.pow()
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Check if number is Harshad (divisible by sum of digits)
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        if (sum == 0) return false; // avoid division by zero
        return Math.abs(number) % sum == 0;
    }

    // Find frequency of each digit 0-9 in the digits array
    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;     // digit
            result[i][1] = freq[i]; // frequency
        }

        return result;
    }
}
