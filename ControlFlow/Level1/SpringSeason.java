//Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. z

import java.util.Scanner;

class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter month (e.g., 3 for March): ");
        int month = input.nextInt();
        System.out.print("Enter day: ");
        int day = input.nextInt();

           // Checking if it's spring season
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}