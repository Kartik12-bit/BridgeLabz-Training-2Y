import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Array to store up to 10 double values
        double[] numbers = new double[10];
        // Variable to keep track of total sum
        double total = 0.0;
        // Index to keep track of how many numbers have been entered
        int index = 0;

        Scanner scanner = new Scanner(System.in);

        // Use an infinite loop to take inputs until conditions are met
        while(true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();

            // Stop if input is 0 or negative
            if(input <= 0) {
                break;
            }

            // Stop if the array is full (max 10 elements)
            if(index == 10) {
                break;
            }

            // Store the valid input in the array
            numbers[index] = input;
            index++; // Move to next index for next input
        }

        // Print all entered numbers
        System.out.println("Numbers entered are:");
        for(int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i]; // Add each number to total
        }

        // Display the total sum of all numbers
        System.out.println("Sum of all numbers: " + total);

        scanner.close();
    }
}
