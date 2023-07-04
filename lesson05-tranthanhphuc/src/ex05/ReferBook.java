package ex05;

public class ReferBook {
	
	private String bookID;
    private double price;
    private String publisher;
    private double tax;
    
    public ReferBook() {
}

	public ReferBook(String bookID, double price, String publisher, double tax) {
		super();
		this.bookID = bookID;
		this.price = price;
		this.publisher = publisher;
		this.tax = tax;
	}

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

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferBook [bookID=" + bookID + ", price=" + price + ", publisher=" + publisher + ", tax=" + tax + "]";
	}
}
