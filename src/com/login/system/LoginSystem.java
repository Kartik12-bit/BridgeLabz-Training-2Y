package com.login.system;

import java.util.Scanner;

public class LoginSystem {

    static void validate(String user, String pass) throws InvalidCredentialsException {
        String validUser = "kartik";
        String validPass = "12345";

        if (!user.equals(validUser) || !pass.equals(validPass)) {
            throw new InvalidCredentialsException("Invalid username or password!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.print("Enter username: ");
            String user = sc.nextLine();

            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            try {
                validate(user, pass);
                System.out.println("✅ Login Successful! Welcome " + user + "!");
                loggedIn = true;
            } catch (InvalidCredentialsException e) {
                System.out.println("❌ " + e.getMessage());
                System.out.println("Please try again.\n");
            }
        }

        sc.close();
    }
}
