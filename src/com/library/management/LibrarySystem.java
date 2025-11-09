package com.library.management;

import java.util.*;

public class LibrarySystem {
    static Map<String, Boolean> books = new HashMap<>();
    static Map<String, List<String>> userRecords = new HashMap<>();

    static {
        books.put("Java Basics", true);
        books.put("Python Essentials", true);
        books.put("C++ Fundamentals", true);
        books.put("Data Structures", true);
        books.put("Algorithms", true);
    }

    static void borrowBook(String user, String book) throws BookNotAvailableException, UserLimitExceededException {
        if (!books.containsKey(book) || !books.get(book))
            throw new BookNotAvailableException("Book not available: " + book);

        List<String> borrowed = userRecords.getOrDefault(user, new ArrayList<>());
        if (borrowed.size() >= 5)
            throw new UserLimitExceededException("User has reached the borrowing limit: " + user);

        borrowed.add(book);
        userRecords.put(user, borrowed);
        books.put(book, false);
        System.out.println(user + " borrowed " + book);
    }

    static void returnBook(String user, String book) throws InvalidReturnException {
        List<String> borrowed = userRecords.get(user);
        if (borrowed == null || !borrowed.contains(book))
            throw new InvalidReturnException("Invalid return: " + book + " not borrowed by " + user);

        borrowed.remove(book);
        books.put(book, true);
        System.out.println(user + " returned " + book);
    }

    public static void main(String[] args) {
        try {
            borrowBook("Kartik", "Java Basics");
            borrowBook("Kartik", "Python Essentials");
            returnBook("Kartik", "Java Basics");
            borrowBook("Kartik", "Java Basics");
            returnBook("Kartik", "C++ Fundamentals");
        } catch (BookNotAvailableException | InvalidReturnException | UserLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("System check completed.");
        }
    }
}
