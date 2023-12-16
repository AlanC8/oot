package Employees;

public class Book {
    private String title;
    private int bookId;
    private int numberOfPages;
    private String author;

    public Book(String title, int bookId, int numberOfPages, String author) {
        this.title = title;
        this.bookId = bookId;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
