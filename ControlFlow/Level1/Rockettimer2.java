import java.util.Scanner;

public class Rockettimer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the countdown start value
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();

        // Countdown using a for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }
}