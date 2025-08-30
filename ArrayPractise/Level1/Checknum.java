import java.util.Scanner;

public class Checknum {
    public static void main(String[] args) {
        // Define an array to store 5 numbers
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);

        // Take user input for each element of the array
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        // Loop through the array and check each number
        for(int i = 0; i < arr.length; i++) {
            // Check if positive, negative or zero
            if(arr[i] > 0) {
                // If positive, check if even or odd
                if(arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is positive and even.");
                } else {
                    System.out.println(arr[i] + " is positive and odd.");
                }
            } else if(arr[i] < 0) {
                System.out.println(arr[i] + " is negative.");
            } else {
                System.out.println("Zero found at position " + (i + 1));
            }
        }

        // Compare the first and last elements in the array
        int first = arr;
        int last = arr[arr.length - 1];

        System.out.print("Comparing first and last elements: ");
        if(first == last) {
            System.out.println("First and last elements are equal.");
        } else if(first > last) {
            System.out.println("First element is greater than last element.");
        } else {
            System.out.println("First element is less than last element.");
        }

        // Close the scanner object
        input.close();
    }
}
