/*Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
Hint => 
Take a, b, and c as input values to find the roots of x.
The roots are computed using the following formulae
delta = b2+ 4*a*c
If delta is positive the find the two roots using formulae 
root1 of x = (-b + delta)/(2*a) 
root1 of x = (-b - delta)/(2*a)
If delta is zero then there is only one root of x  
root of x = -b/(2*a)
If delta is negative return empty array or nothing 
Write a Method to find find the roots of a quadratic equation and return the roots
*/

import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients a, b, c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Validate a != 0 for quadratic
        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero for a quadratic equation.");
            return;
        }

        // Find roots
        double[] roots = findRoots(a, b, c);

        // Display roots
        if (roots.length == 2) {
            System.out.printf("Two roots are: %.4f and %.4f\n", roots[0], roots[1]);
        } else if (roots.length == 1) {
            System.out.printf("One root is: %.4f\n", roots[0]);
        } else {
            System.out.println("No real roots exist.");
        }
    }

    // Method to find roots of quadratic equation and return as array
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots
            return new double[0];
        }
    }
}
