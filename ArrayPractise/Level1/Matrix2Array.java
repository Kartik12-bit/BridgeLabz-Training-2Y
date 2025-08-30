import java.util.Scanner;

public class Matrix2Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of rows and columns from the user
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        // Create the 2D array (matrix)
        int[][] matrix = new int[rows][columns];

        // Input elements of the 2D array
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at (" + i + "," + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a 1D array large enough to hold all elements of the 2D array
        int[] array = new int[rows * columns];
        int index = 0; // To keep track of current position in 1D array

        // Copy elements from 2D array to 1D array using nested loops
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Display the copied array elements
        System.out.println("Elements in the 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
