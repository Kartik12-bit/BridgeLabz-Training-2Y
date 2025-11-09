package com.online.order;

import java.util.Random;

public class OrderSystem {

    // Methood to plaace an order
    static void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random random = new Random();
        int result = random.nextInt(3); // 0, 1, or 2

        if (result == 0) {
            throw new OutOfStockException("The product is out of stock");
        } else if (result == 1) {
            throw new PaymentFailedException("Payment failed");
        } else {
            System.out.println("Order placed successfully");
        }
    }

    // Main method
    public static void main(String[] args) {
        System.out.println(" Welcome to the Online Store!");

        try {
            placeOrder();
        } catch (OutOfStockException e) {
            System.out.println("out of stock " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("payment failed " + e.getMessage());
        } finally {
            System.out.println(" Thank you ");
        }
    }
}
