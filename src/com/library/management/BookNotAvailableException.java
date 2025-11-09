package com.library.management;

public class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}
