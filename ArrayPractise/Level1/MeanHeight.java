import java.util.Scanner;

public class MeanHeight{
    public static void main(String[] args) {
        // Array to store heights of 11 players
        double[] heights = new double[11];
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter height for each player
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Calculate the sum of all heights
        double sum = 0.0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // Calculate mean height
        double mean = sum / heights.length;

        // Display the mean height to the user
        System.out.println("Mean height of the football team is: " + mean);

        scanner.close();
    }
}
