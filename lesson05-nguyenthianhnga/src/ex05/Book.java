package ex05;

public abstract class Book {
	private String bookCode;
	private double price;
	private String publisher;

	public Book() {
		super();
	}

	public Book(String bookCode, double price, String publisher) {
		super();
		this.bookCode = bookCode;
		this.price = price;
		this.publisher = publisher;
	}

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
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
	 public abstract double intoMoney();
	@Override
	public String toString() {
		return "Book [bookCode=" + bookCode + ", price=" + price + ", publisher=" + publisher + "]";
	}
	
}
