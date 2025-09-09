/*Q2. Bank Account Management
■ Scenario:
A bank wants to create a simple account management system. Each account has:
- Account Number
- Account Holder Name
- Balance
The bank should be able to:
1. Deposit money.
2. Withdraw money (only if sufficient balance exists).
3. Display account details.

■ Sample Input:
Enter account details:
Account No: 5001
Account Holder: Kiran
Initial Balance: 1000
Deposit Amount: 500
Withdraw Amount: 300
Withdraw Amount: 1500
■ Expected Output:
Account Details:
Account No: 5001
Account Holder: Kiran
Balance: 1000
After depositing 500:
Balance: 1500
After withdrawing 300:
Balance: 1200
Withdrawal of 1500 failed. Insufficient balance!
Final Balance: 1200
*/

import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("After depositing " + amount + ":");
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw money
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal of " + amount + " failed. Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else {
            balance -= amount;
            System.out.println("After withdrawing " + amount + ":");
            System.out.println("Balance: " + balance);
        }
    }

    // Display account details
    void displayAccountDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Account No: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input account details
        System.out.println("Enter account details:");
        System.out.print("Account No: ");
        int accNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Account Holder: ");
        String accHolder = sc.nextLine();
        System.out.print("Initial Balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(accNo, accHolder, initialBalance);

        // Display initial details
        account.displayAccountDetails();

        // Deposit
        System.out.print("\nDeposit Amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        // Withdraw 1
        System.out.print("\nWithdraw Amount: ");
        double withdrawAmount1 = sc.nextDouble();
        account.withdraw(withdrawAmount1);

        // Withdraw 2
        System.out.print("\nWithdraw Amount: ");
        double withdrawAmount2 = sc.nextDouble();
        account.withdraw(withdrawAmount2);

        // Final Balance
        System.out.println("\nFinal Balance: " + account.balance);
    }
}
