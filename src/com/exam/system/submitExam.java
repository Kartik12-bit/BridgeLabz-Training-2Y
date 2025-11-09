package com.exam.system;

import java.io.IOException;

public class SubmitExam {

    public static void submitExam(String studentId) throws InvalidStudentException, IOException {
        // validate student
        OnlineExamSystem.validateStudent(studentId);

        // simulate random IO error (like network failure)
        if (Math.random() < 0.3) {  // 30% chance for IO error
            throw new IOException("⚠️ Network error occurred during submission!");
        }

        System.out.println("✅ Exam submitted successfully for Student ID: " + studentId);
    }
}
