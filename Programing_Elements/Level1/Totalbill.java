import java.util.Scanner;

public class Totalbill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user input
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt();
        // total price calculation
        double totalPrice = unitPrice * quantity;

    // output
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

    }
}
