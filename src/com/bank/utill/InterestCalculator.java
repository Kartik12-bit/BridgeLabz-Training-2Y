package com.bank.utill;

public class InterestCalculator {
    public double calculateSimpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public double calculateCompoundInterest(double p, double r, double t) {
        return p * (Math.pow((1 + r / 100), t)) - p;
    }
}
