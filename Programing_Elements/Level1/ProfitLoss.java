public class ProfitLoss {
    public static void main(String[] args) {
        // variable declaration
        int costPrice = 129;
        int sellingPrice = 191;
        // callculation for profit and porfit percentage
        int profit = sellingPrice - costPrice;
        double profitPercent = (profit * 100.0) / costPrice;
        // final output 
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                           "The Profit is INR " + profit + " and the Profit Percentage is " + String.format("%.2f", profitPercent) + "%");
    }
}
