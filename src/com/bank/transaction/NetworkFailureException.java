package com.bank.transaction;

public class NetworkFailureException extends Exception {
    public NetworkFailureException(String message) {
        super(message);
    }
}
