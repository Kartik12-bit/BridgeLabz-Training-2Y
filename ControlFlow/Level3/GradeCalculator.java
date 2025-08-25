import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Display the user to enter marks for each subject
        System.out.print("Enter marks for Physics (out of 100): ");
        int physicsMarks = input.nextInt();

        System.out.print("Enter marks for Chemistry (out of 100): ");
        int chemistryMarks = input.nextInt();

        System.out.print("Enter marks for Maths (out of 100): ");
        int mathsMarks = input.nextInt();

        // Calculate the total marks and percentage
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = (totalMarks / 300) * 100;

        // Determine the grade and remarks based on the percentage
        String grade;
        String remarks;

        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display the results
        System.out.println("\n--- Student Performance Report ---");
        System.out.printf("Average Mark: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}