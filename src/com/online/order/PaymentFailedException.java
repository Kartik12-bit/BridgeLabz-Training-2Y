package com.online.order;

public class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}
