import java.util.Scanner;

public class StudentGradesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Take input for number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // b. Create arrays to store marks, percentage, and grade
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        String[] grades = new String[n];

        // For each student, take subject marks with validation
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            physics[i] = getValidMark(scanner, "Physics");
            chemistry[i] = getValidMark(scanner, "Chemistry");
            maths[i] = getValidMark(scanner, "Maths");

            // d. Calculate percentage and grade
            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;
            grades[i] = computeGrade(percentage[i]);
        }

        // e. Display the marks, percentages, and grades of each student
        System.out.println("\nReport:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%s\n",
                    (i + 1), physics[i], chemistry[i], maths[i], percentage[i], grades[i]);
        }
    }

    // Helper to validate mark input
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

    // Compute grade based on guidelines
    public static String computeGrade(double percent) {
        if (percent >= 80) return "A";
        else if (percent >= 70) return "B";
        else if (percent >= 60) return "C";
        else if (percent >= 50) return "D";
        else if (percent >= 40) return "E";
        else return "R";
    }
}
