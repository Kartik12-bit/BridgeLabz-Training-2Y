package com.staticimportdemo;

import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        double a = 25.0;
        double b = -9.5;
        double x = 3.0, y = 4.0;

        System.out.println("√a = " + sqrt(a));
        System.out.println("a^2 = " + pow(a, 2));
        System.out.println("Maximum = " + max(a, b));
        System.out.println("Minimum = " + min(a, b));
        System.out.println("|b| = " + abs(b));
        System.out.println("Hypotenuse of (3,4): " + hypot(x, y));
    }
}
