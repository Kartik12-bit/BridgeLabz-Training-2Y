/*Write a program to find the factors of a number and perform various tasks using the factors array
Hint => 
Method to find factors of a number and return them as an array. Note there are 2 for loops: one for the count and another for finding the factor and storing in the array
Method to find the greatest factor of a Number using the factors array
Method to find the sum of the factors using factors array and return the sum
Method to find the product of the factors using factors array and return the product
Method to find the product of the cube of the factors using the factors array. Use Math.pow() 
*/

import java.util.Scanner;

public class Factor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        int greatest = greatestFactor(factors);
        int sum = sumOfFactors(factors);
        long product = productOfFactors(factors);
        double productOfCubes = productOfCubeOfFactors(factors);

        System.out.println("Greatest factor: " + greatest);
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Product of cubes of factors: " + productOfCubes);
    }

    // Method to find factors and return as array
    public static int[] findFactors(int num) {
        // First find count
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        // Store factors in array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Find greatest factor
    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max) max = f;
        }
        return max;
    }

    // Sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    // Product of factors (use long to avoid overflow)
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    // Product of cubes of factors
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1.0;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }
}
