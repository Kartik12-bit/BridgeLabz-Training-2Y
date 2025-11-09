package com.temperature.converter;

import java.util.Scanner;

public class TemperatureConverter {

    static void convert(double value, char unit) throws InvalidTemperatureException {
        if (unit == 'C' || unit == 'c') {
            if (value < -273.15)
                throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");
            double f = (value * 9 / 5) + 32;
            System.out.println("Fahrenheit: " + f);
        } else if (unit == 'F' || unit == 'f') {
            if (value < -459.67)
                throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");
            double c = (value - 32) * 5 / 9;
            System.out.println("Celsius: " + c);
        } else {
            System.out.println("Invalid unit entered.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();
        System.out.print("Enter unit (C/F): ");
        char unit = sc.next().charAt(0);

        try {
            convert(temp, unit);
        } catch (InvalidTemperatureException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
