import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input number from the user
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // Starting array size to store factors
        int maxFactors = 10;
        int[] factors = new int[maxFactors];
        int index = 0;

        // Loop through from 1 to number to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // i is a factor if remainder is 0
                
                // If the array is full, increase its size by doubling it
                if (index == maxFactors) {
                    maxFactors *= 2; // double the size
                    int[] temp = new int[maxFactors];

                    // Copy existing factors to new larger array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; // assign temp array back to factors
                }

                // Store the found factor and move to next index
                factors[index] = i;
                index++;
            }
        }

        // Display all the factors found
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        scanner.close();
    }
}
