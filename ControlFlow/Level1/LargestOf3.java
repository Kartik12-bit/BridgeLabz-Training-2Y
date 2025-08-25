import java.util.Scanner;

class LargestOf3 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        // user input
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        // finding the Greatest number among 
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the Greatest number");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the Greatest number");
        } else {
            System.out.println(num3 + " is the Greatest number");
        }

    }
    }
}