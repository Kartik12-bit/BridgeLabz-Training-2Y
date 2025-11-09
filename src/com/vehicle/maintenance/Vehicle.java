package com.vehicle.maintenance;

import java.time.LocalDate;

public class Vehicle {

    private String ownerName;
    private LocalDate lastServiceDate;
    private LocalDate nextServiceDate;
    private int mileage;

    public Vehicle(String ownerName, LocalDate lastServiceDate, LocalDate nextServiceDate, int mileage) {
        this.ownerName = ownerName;
        this.lastServiceDate = lastServiceDate;
        this.nextServiceDate = nextServiceDate;
        this.mileage = mileage;
    }


    public void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
        LocalDate today = LocalDate.now();

        if (mileage < 0) {
            throw new InvalidMileageException(" Invalid mileage entered! Mileage cannot be negative.");
        }

        if (nextServiceDate.isBefore(today)) {
            throw new ServiceOverdueException("Service overdue! Please schedule a service immediately.");
        }

        System.out.println("  No maintenance needed currently.");
    }

    public static void main(String[] args) {

        Vehicle car = new Vehicle(
                "Kartik",
                LocalDate.of(2024, 6, 10),
                LocalDate.of(2025, 11, 20),
                12500
        );

        try {
            car.checkMaintenance();
        } catch (ServiceOverdueException e) {
            System.out.println(e.getMessage());
        } catch (InvalidMileageException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(" Maintenance check completed for " + car.ownerName + ".");
        }
    }
}
