package com.product.review;

class InvalidRatingException extends Exception {
    public InvalidRatingException(String message) {
        super(message);
    }
}