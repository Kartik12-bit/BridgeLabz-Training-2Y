/* Write a program to find the smallest and the largest of the 3 numbers.
Hint => 
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
public static int[] findSmallestAndLargest(int number1, int number2, int number3)
*/
import java.util.Scanner;

public class SmallLargest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();

        // Find smallest and largest
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display results
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
    }

    // Method to find smallest and largest among three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        if (number2 < smallest) {
            smallest = number2;
        } else if (number2 > largest) {
            largest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        } else if (number3 > largest) {
            largest = number3;
        }

        return new int[]{smallest, largest};
    }
}
