package com.library.management;

public class UserLimitExceededException extends Exception {
    public UserLimitExceededException(String message) {
        super(message);
    }
}
