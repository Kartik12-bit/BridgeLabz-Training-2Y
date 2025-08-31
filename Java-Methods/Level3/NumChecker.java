/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to Find the count of digits in the number
Method to Store the digits of the number in a digits array
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
Method to check if the number is a armstrong number using the digits array. ​​Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE to initialize the variable.
Method to find the the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE to initialize the variable.
*/

import java.util.Scanner;

public class NumberChecker {

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

        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is Duck Number? " + isDuck);

        boolean isArmstrong = isArmstrongNumber(number, digits, digitCount);
        System.out.println("Is Armstrong Number? " + isArmstrong);

        int[] largestTwo = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestTwo[0] + ", Second largest digit: " + largestTwo[1]);

        int[] smallestTwo = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestTwo[0] + ", Second smallest digit: " + smallestTwo[1]);
    }

    // Count digits in number
    public static int countDigits(int num) {
        num = Math.abs(num);
        if (num == 0) return 1;

        int count = 0;
        while (num > 0) {
            count++;
            num /=10;
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

    // Check if Duck Number: number contains at least one non-zero digit (ignore leading zeros)
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // Check Armstrong number: sum of digits^count == number
    public static boolean isArmstrongNumber(int number, int[] digits, int count) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, count);
        }
        return sum == Math.abs(number);
    }

    // Find largest and second largest digits in array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest
