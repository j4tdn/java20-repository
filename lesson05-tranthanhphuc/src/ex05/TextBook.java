package ex05;

public class TextBook {
	
	private String bookID;
    private double price;
    private String publisher;
    private String condition;

    public TextBook() {
}

	public TextBook(String bookID, double price, String publisher, String condition) {
		this.bookID = bookID;
		this.price = price;
		this.publisher = publisher;
		this.condition = condition;
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

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public String toString() {
		return "TextBook [bookID=" + bookID + ", price=" + price + ", publisher=" + publisher + ", condition="
				+ condition + "]";
	}
}
