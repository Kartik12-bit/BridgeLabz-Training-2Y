package library.transactions;

import library.books.Book;
import library.members.Member;
public class Transaction {
    private Book book;
    private Member member;
    private String transactionType;
    public Transaction(Book book, Member member, String transactionType) {
        this.book = book;
        this.member = member;
        this.transactionType = transactionType;
    }
    public void processTransaction() {
        System.out.println("\n--- Transaction Details ---");
        System.out.println(member.getDetails());
        System.out.println(book.getDetails());
        if ("issue".equalsIgnoreCase(transactionType)) {
            if (!book.isIssued()) {
                book.issueBook();
                System.out.println("Book issued to member.");
            } else {
                System.out.println("Book is already issued.");
            }
        } else if ("return".equalsIgnoreCase(transactionType)) {
            if (book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned.");
            } else {
                System.out.println("Book was not issued.");
            }
        } else {
            System.out.println("Invalid transaction type.");
        }
    }
}
