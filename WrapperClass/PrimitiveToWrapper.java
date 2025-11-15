package WrapperClass;
import java.util.Scanner;

public class PrimitiveToWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();   // primitive int

        // Converting primitive to wrapper (Integer)
        Integer obj = Integer.valueOf(num);

        // Displaying values
        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper object value: " + obj);
    }
}
