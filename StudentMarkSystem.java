/* Scenario Question :
    Q1. Student Marks System
■ Scenario:
A school wants a program to manage student marks. Each student has:
- Name
- Roll Number
- Marks in 3 subjects
The system should be able to:
1. Store details of students.
2. Display student details.
3. Calculate and show the total marks for each student.
■ Sample Input:
Enter number of students: 2
Enter details for Student 1:
Name: Rohan
Roll No: 101
Marks in 3 subjects: 78 85 90
Enter details for Student 2:
Name: Priya
Roll No: 102
Marks in 3 subjects: 88 76 92
■ Expected Output:
Student Details:
Name: Rohan
Roll No: 101
Marks: 78, 85, 90
Total Marks: 253
Name: Priya
Roll No: 102
Marks: 88, 76, 92
Total Marks: 256
*/

import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    int[] marks = new int[3];

    // Constructor
    Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Calculate total marks
    int calculateTotal() {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return total;
    }

    // Display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println();
    }
}

public class StudentMarksSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];

        // Input for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Roll No: ");
            int roll = sc.nextInt();

            int[] marks = new int[3];
            System.out.print("Marks in 3 subjects: ");
            for (int j = 0; j < 3; j++) {
                marks[j] = sc.nextInt();
            }
            sc.nextLine(); // consume newline

            students[i] = new Student(name, roll, marks);
        }

        // Display all student details
        System.out.println("\nStudent Details:");
        for (Student s : students) {
            s.displayDetails();
        }
    }
}

