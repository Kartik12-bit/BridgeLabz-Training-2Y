package com.online.order;

public class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}
