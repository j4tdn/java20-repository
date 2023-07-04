package exercises5;

public class Books {
	private String id;
	private double price;
	private String publisher;
	
	public Books() {
	}

	public Books(String id, double price, String publisher) {
		this.id = id;
		this.price = price;
		this.publisher = publisher;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Books [id=" + id + ", price=" + price + ", publisher=" + publisher + "]";
	}
	
	
}
