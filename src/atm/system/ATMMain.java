package atm.system;

import java.util.Scanner;

public class ATMMain {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        try {
            atm.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
