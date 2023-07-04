package viewBook;

public class Book {
	private String Id;
	private double price;
	private String author;

	public Book() {
	}

	public Book(String id, double price, String author) {
		Id = id;
		this.price = price;
		this.author = author;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [Id=" + Id + ", price=" + price + ", author=" + author + "]";
	}
	
}
