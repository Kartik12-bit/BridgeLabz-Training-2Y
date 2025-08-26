import java.util.Scanner;

public class Discountfee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user se input lena
        System.out.print("Enter the Student Fee (INR): ");
        double fee = input.nextDouble();

        System.out.print("Enter the Discount Percent: ");
        double discountPercent = input.nextDouble();

        // calculation
        double discount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discount;

        // output
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
