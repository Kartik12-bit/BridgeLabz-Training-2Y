package library.books;
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isIssued;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isIssued = false;
    }
    public void issueBook() {
        if (!isIssued) isIssued = true;
    }
    public void returnBook() {
        if (isIssued) isIssued = false;
    }
    public boolean isIssued() {
        return isIssued;
    }
    public String getDetails() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}
