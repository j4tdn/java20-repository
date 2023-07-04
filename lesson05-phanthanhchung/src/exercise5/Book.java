package exercise5;


public class Book {
	private String bookID;
	private int price;
	private String publisher;
	
	public Book() {
	}

	public Book(String bookID, int price, String publisher) {
		super();
		this.bookID = bookID;
		this.price = price;
		this.publisher = publisher;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", price=" + price + ", publisher=" + publisher + "]";
	}
}
