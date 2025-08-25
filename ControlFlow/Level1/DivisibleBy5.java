import java.util.Scanner;

class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // check divisibility by 5
        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5");
        } else {
            System.out.println(number + " is not divisible by 5");
        }
    }
}