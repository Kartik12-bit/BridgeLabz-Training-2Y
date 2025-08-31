/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum of their proper divisors
Method to find the number is an abundant number. A number is called an abundant number if the sum of its proper divisors is greater than the number itself
Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper divisors is less than the number itself
Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself
*/

import java.util.Scanner;

public class NumberChecker5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.println("Is Perfect Number? " + isPerfect(number));
        System.out.println("Is Abundant Number? " + isAbundant(number));
        System.out.println("Is Deficient Number? " + isDeficient(number));
        System.out.println("Is Strong Number? " + isStrong(number));
    }

    // Sum of proper divisors (excluding the number itself)
    public static int sumOfProperDivisors(int num) {
        int sum = 1; // 1 is a proper divisor of all positive integers > 1
        if (num == 1) return 0; // 1 has no proper divisors other than itself

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Check perfect number: sum of proper divisors == number
    public static boolean isPerfect(int num) {
        return sumOfProperDivisors(num) == num;
    }

    // Check abundant number: sum of proper divisors > number
    public static boolean isAbundant(int num) {
        return sumOfProperDivisors(num) > num;
    }

    // Check deficient number: sum of proper divisors < number
    public static boolean isDeficient(int num) {
        return sumOfProperDivisors(num) < num;
    }

    // Check strong number: sum of factorials of digits == number
    public static boolean isStrong(int num) {
        int sumFact = 0;
        int n = num;

        while (n > 0) {
            int digit = n % 10;
            sumFact += factorial(digit);
            n /= 10;
        }

        return sumFact == num;
    }

    // Calculate factorial of digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 2; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }
}
