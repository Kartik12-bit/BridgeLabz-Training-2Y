import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        // Create an array to store the ages of 10 students
        int[] ages = new int;
        Scanner sc = new Scanner(System.in);

        // Loop to get input for each student
        for(int i = 0; i < ages.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Check voting eligibility for each student
        for(int i = 0; i < ages.length; i++) {
            // If age is negative, it is not valid
            if(ages[i] < 0) {
                System.out.println("Invalid age entered for student " + (i + 1));
            }
            // If age is 18 or above, student can vote
            else if(ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            }
            // If age is below 18, student cannot vote
            else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
        sc.close();
    }
}
