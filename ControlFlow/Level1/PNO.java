import java.util.Scanner;
class PNO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // check positive, negative or zero
        if (number > 0) {
            System.out.println(number + " is a positive number");
        } else if (number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println("The number is zero");
        }
    }
}