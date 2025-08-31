/*Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results
Hint => 
Take the input for a number
Write a static Method to find the factors of the number and save them in an array and return the array. 
To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count. And the second loop save the factors into the array
Write a method to find the sum of the factors using factors array
Write a method to find the product of the factors using factors array
Write a method to find the sum of square of the factors using Math.pow() method
*/
import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Find factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Compute sum, product, and sum of squares
        int sum = sumOfFactors(factors);
        int product = productOfFactors(factors);
        double sumOfSquares = sumOfSquaresOfFactors(factors);

        // Display results
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }

    // Method to find factors of a number and return them in an array
    public static int[] findFactors(int num) {
        // First loop to count number of factors
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Initialize array with count size
        int[] factors = new int[count];
        int index = 0;

        // Second loop to save factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find product of factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
            // Optional: To avoid overflow you could use long or BigInteger if needed
        }
        return product;
    }

    // Method to find sum of squares of factors using Math.pow()
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumSq = 0;
        for (int factor : factors) {
            sumSq += Math.pow(factor, 2);
        }
        return sumSq;
    }
}
