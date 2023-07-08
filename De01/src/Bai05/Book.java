package Bai05;

public class Book {
    private String bookID;
    private double price;
    private String publisher;

    public Book(String bookID, double price, String publisher) {
        this.bookID = bookID;
        this.price = price;
        this.publisher = publisher;
    }

    // Getters and setters

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}