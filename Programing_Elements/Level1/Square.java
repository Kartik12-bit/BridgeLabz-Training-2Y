import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
        // calculation
        double side = perimeter / 4;
        // output
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
