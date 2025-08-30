
/* Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
Hint => 
Take the input for a number
Find the count of digits in the number
Find the digits in the number and save them in an array
Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
Display the frequency of each digit in the number */


import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number as string to handle any length easily
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        // Step 1: Extract digits into an array
        int length = number.length();
        int[] digits = new int[length];
        for (int i = 0; i < length; i++) {
            // Convert each character to digit
            digits[i] = number.charAt(i) - '0';
        }

        // Step 2: Frequency array of size 10, for digits 0 to 9
        int[] frequency = new int[10];

        // Step 3: Count frequency
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Step 4: Display frequency of each digit present in the number
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }
    }
}
