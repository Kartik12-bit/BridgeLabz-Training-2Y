/*Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
Hint => 
Take user input for a number. 
Find the count of digits in the number. 
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order  
*/

import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the count of digits in the number
        int temp = number;
        int count = 0;
        if (temp == 0) {
            count = 1;  // Number 0 has 1 digit
        } else {
            while (temp != 0) {
                temp /= 10;
                count++;
            }
        }

        // Array to store digits
        int[] digits = new int[count];

        // Extract digits and store in digits array
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Create an array to store digits in reverse order
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        // Display the reversed array elements
        System.out.print("Reversed digits: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i]);
        }

        scanner.close();
    }
}
