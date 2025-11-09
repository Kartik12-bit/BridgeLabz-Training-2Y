package com.product.review;
import java.util.*;
public class ProductReviewSystem {

    // method to submit review
    public static void submitReview(int rating, String comment)
            throws InvalidRatingException, EmptyReviewException {

        if (rating < 1 || rating > 5) {
            throw new InvalidRatingException(" Rating must be between 1 and 5!");
        }

        if (comment == null || comment.trim().isEmpty()) {
            throw new EmptyReviewException(" Review comment cannot be empty!");
        }

        System.out.println(" Review submitted successfully!");
        System.out.println(" Rating: " + rating);
        System.out.println(" Comment: " + comment);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("️ Welcome to the Product Review System!");
        System.out.print("Enter your rating (1–5): ");

        try {
            int rating = sc.nextInt();
            sc.nextLine(); // clear newline buffer
            System.out.print("Enter your comment: ");
            String comment = sc.nextLine();

            submitReview(rating, comment);
        }
        catch (InvalidRatingException e) {
            System.out.println(e.getMessage());
        }
        catch (EmptyReviewException e) {
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("️ Please enter a valid number for rating!");
        }
        finally {
            System.out.println(" Thanks for your feedback!");
            sc.close();
        }
    }
}