package com.exam.submission;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExamSubmission {

    static void submitExam(String fileName, LocalDateTime submissionTime)
            throws LateSubmissionException, InvalidFileFormatException {

        LocalDateTime deadline = LocalDateTime.of(2025, 11, 10, 23, 59);
        if (!fileName.endsWith(".pdf"))
            throw new InvalidFileFormatException("Submission failed: invalid file format");
        if (submissionTime.isAfter(deadline))
            throw new LateSubmissionException("Submission failed: late submission");

        System.out.println("Submission successful: " + fileName);
    }

    public static void main(String[] args) {
        try {
            String file = "assignment.pdf";
            LocalDateTime time = LocalDateTime.now();
            submitExam(file, time);
        } catch (LateSubmissionException | InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Exam submission process completed.");
        }
    }
}
