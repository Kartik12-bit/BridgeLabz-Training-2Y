/* Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
Hint => 
All the steps are the same as the problem 8 except the marks are stored in a 2D array
Use the 2D array to calculate the percentages, and grades of the students */


import java.util.Scanner;

public class StudentGradesWith2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of students input
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Subjects count fixed to 3: Physics, Chemistry, Maths
        int subjects = 3;

        // Marks stored in a 2D array: rows = students, columns = subjects
        int[][] marks = new int[n][subjects];
        double[] percentage = new double[n];
        String[] grades = new String[n];

        // Input marks for each student and subject, with validation
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < subjects; j++) {
                String subjectName = "";
                switch (j) {
                    case 0 -> subjectName = "Physics";
                    case 1 -> subjectName = "Chemistry";
                    case 2 -> subjectName = "Maths";
                }
                marks[i][j] = getValidMark(scanner, subjectName);
            }

            // Calculate total for percentage
            int total = 0;
            for (int j = 0; j < subjects; j++) {
                total += marks[i][j];
            }
            percentage[i] = total / (double) subjects;

            // Calculate grade based on percentage
            grades[i] = computeGrade(percentage[i]);
        }

        // Display the results
        System.out.println("\nReport:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grades[i]);
        }
    }

    public static int getValidMark(Scanner scanner, String subject) {
        int mark;
        while (true) {
            System.out.print("  " + subject + ": ");
            mark = scanner.nextInt();
            if (mark >= 0) {
                break;
            }
            System.out.println("    Please enter a non-negative value.");
        }
        return mark;
    }

    public static String computeGrade(double percent) {
        if (percent >= 80) return "A";
        else if (percent >= 70) return "B";
        else if (percent >= 60) return "C";
        else if (percent >= 50) return "D";
        else if (percent >= 40) return "E";
        else return "R";
    }
}
