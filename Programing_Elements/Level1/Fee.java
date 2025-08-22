public class Fee {
    public static void main(String[] args) {
        // declaring the variables
        int fee = 125000;
        int discountPercent = 10;
        // calculatinf the discount and final fee
        double discount = fee * discountPercent / 100.0;  // discount amount
        double finalFee = fee - discount;                 // final fee after discount
        // final output
        System.out.println("The discount amount is INR " + discount +  " and final discounted fee is INR " + finalFee);
    }
}
