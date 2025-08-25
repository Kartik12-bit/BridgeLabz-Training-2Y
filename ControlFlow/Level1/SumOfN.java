import java.until.Scanner;
class SumOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user input
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        // calculate sum of first n natural numbers
        int sum = n * (n + 1) / 2;

        // display the result
        if (n%2==0){
            System.out.println("The sum of " + n + "natural numbers is: " + sum);
        } else {
        System.out.println("The number is not a natural number");
        }
    }
}