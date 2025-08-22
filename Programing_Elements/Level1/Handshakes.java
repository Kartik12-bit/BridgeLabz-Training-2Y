import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // maximum handshkes calculation
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // output
        System.out.println("The maximum number of posible handshakes is " + maxHandshakes);
    }
}
