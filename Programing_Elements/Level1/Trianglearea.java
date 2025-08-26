import java.util.Scanner;

public class Trianglearea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user input
        System.out.print("Enter the base of the triangle in inches: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double height = input.nextDouble();

        // area in square inches
        double areaInches = 0.5 * base * height;

        // convert to square centimeters
        double areaCm = areaInches * 2.54 * 2.54; // cm² = in² * (2.54)^2

        // output
        System.out.println("The area of the triangle is " + areaInches + " square inches and " + areaCm + " square centimeters.");

       
    }
}
