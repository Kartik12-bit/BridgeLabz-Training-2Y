package com.vehicle.maintenance;

public class ServiceOverdueException extends Exception {
    public ServiceOverdueException(String message) {
        super(message);
    }
}
