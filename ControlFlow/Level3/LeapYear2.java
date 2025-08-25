import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Leap year calculation works only for years >= 1582.");
        } else {
           
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year (Approach 2)");
            } else {
                System.out.println(year + " is NOT a Leap Year (Approach 2)");
            }
        }

        sc.close();
    }
}
