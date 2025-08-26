import java.util.Scanner;

public class Converted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user input
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

    // conversions
        double distanceInYards = distanceInFeet / 3;        
        double distanceInMiles = distanceInYards / 1760;    
        // output
        System.out.println("The distance is " + distanceInYards + " yards and " + distanceInMiles + " miles");
    }
}
