package com.bank.main;

import com.bank.utill.*;
import static java.lang.Math.*;

public class BankApp {
    public static void main(String[] args) {
        InterestCalculator calc = new InterestCalculator();

        double p = 10000;
        double r = 7.5;
        double t = 2;

        double si = calc.calculateSimpleInterest(p, r, t);
        double ci = p * (pow((1 + r / 100), t)) - p;

        System.out.println("Principal: " + p);
        System.out.println("Rate: " + r + "%");
        System.out.println("Time: " + t + " years");
        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}
