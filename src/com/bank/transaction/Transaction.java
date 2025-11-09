package com.bank.transaction;

import java.util.Random;

public class Transaction {

    static double balance = 5000.00;


    public static void processTransaction(double amount)
            throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {

        Random rand = new Random();
        int randomOutcome = rand.nextInt(3);


        if (amount < 0) {
            throw new NegativeAmountException("Transaction failed: Amount cannot be negative!");
        } else if (amount > balance) {
            throw new InsufficientFundsException(" Transaction failed: Insufficient funds!");
        } else if (randomOutcome == 1) {
            throw new NetworkFailureException("Network error! Please try again later.");
        } else {
            balance -= amount;
            System.out.println(" Transaction successful! Remaining balance: ₹" + balance);
        }
    }

    public static void main(String[] args) {
        System.out.println(" Welcome to the Banking Transaction System!");
        double amount = 3000.0; // you can change this to test

        try {
            processTransaction(amount);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("🙏 Thank you for using our banking services!");
        }
    }
}
