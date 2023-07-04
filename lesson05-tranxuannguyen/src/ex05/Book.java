package ex05;

public abstract class Book {
	
	private String id;
	private int price;
	private String publishing;
	
	public Book() {
	}

	public Book(String id, int price, String publishing) {
		this.id = id;
		this.price = price;
		this.publishing = publishing;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublishing() {
		return publishing;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", publishing=" + publishing + "]";
	}
	
}
