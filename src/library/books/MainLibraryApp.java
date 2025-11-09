package library;

import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class MainLibraryApp {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling", "ISBN12345");
        System.out.println("Added new book: " + book1.getDetails());

        Member member1 = new Member("Kartik", 101);
        System.out.println("Registered new member: " + member1.getDetails());

        Transaction t1 = new Transaction(book1, member1, "issue");
        t1.processTransaction();
    }
}
