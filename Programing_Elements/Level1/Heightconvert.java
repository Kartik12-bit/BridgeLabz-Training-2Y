import java.util.Scanner;

public class Heightconvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user input
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // cm to inches
        double totalInches = heightCm / 2.54;

        // feet and inches 
        int feet = (int)(totalInches / 12);   
        double inches = totalInches % 12;     

        // output
        System.out.println("Your Height in cm is " + heightCm +  " while in feet is " + feet + " and inches is " + String.format("%.2f", inches));
        
    }
}
