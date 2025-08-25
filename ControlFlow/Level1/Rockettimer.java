import java.util.Scanner;

public class Rockettimer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the countdown start value
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();

        // Countdown using a while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement the counter
        }
    }
}