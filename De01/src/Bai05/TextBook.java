package Bai05;

public class TextBook extends Book {
    private boolean isNew;

    public TextBook(String bookID, double price, String publisher, boolean isNew) {
        super(bookID, price, publisher);
        this.isNew = isNew;
    }

    // Getters and setters

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }
}