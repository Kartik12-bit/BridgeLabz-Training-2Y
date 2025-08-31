/*Create a program to find the maximum number of handshakes among students.
Hint => 
Get integer input for the numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
Display the number of possible handshakes.
 */

import java.util.Scanner;

public class Handshake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students from user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate maximum possible handshakes
        int handshakes = calculateHandshakes(numberOfStudents);

        // Display result
        System.out.println("The maximum number of possible handshakes is: " + handshakes);
    }

    // Method to calculate handshakes using the formula (n * (n - 1)) / 2
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
