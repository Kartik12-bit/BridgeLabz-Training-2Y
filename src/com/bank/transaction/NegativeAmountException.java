package com.bank.transaction;

public class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}
