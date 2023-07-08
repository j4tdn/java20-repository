package Bai05;

public class ReferBook extends Book {
    private double tax;

    public ReferBook(String bookID, double price, String publisher, double tax) {
        super(bookID, price, publisher);
        this.tax = tax;
    }

    // Getters and setters

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
