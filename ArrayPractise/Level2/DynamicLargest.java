import java.util.Scanner;

public class DynamicLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initial max digits array can hold
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits from number and dynamically resize array if needed
        while (number != 0) {
            // If digits array is full, increase size by 10
            if (index == maxDigit) {
                maxDigit += 10;  // Increase maxDigit by 10
                
                // Create a new array with increased size
                int[] temp = new int[maxDigit];
                
                // Copy existing digits to new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                
                // Assign digits array to be the new larger array
                digits = temp;
            }

            digits[index] = number % 10;  // Get last digit
            number = number / 10;          // Remove last digit
            index++;
        }

        // Initialize largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Loop through stored digits to find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // old largest becomes second largest
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        scanner.close();
    }
}
