package com.exam.system;

import java.io.IOException;
import java.util.Scanner;

public class OnlineExamSystem {

    public static void validateStudent(String studentId) throws InvalidStudentException {
        if (!"STU123".equalsIgnoreCase(studentId)) {
            throw new InvalidStudentException(" Invalid Student ID: " + studentId);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your Student ID: ");
            String id = sc.nextLine();

            SubmitExam.submitExam(id);
        }
        catch (InvalidStudentException e) {
            System.out.println(" Student Validation Failed: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println(" Submission Failed: " + e.getMessage());
        }
        finally {
            System.out.println(" Exam submission process completed.");
            sc.close();
        }
    }
}
