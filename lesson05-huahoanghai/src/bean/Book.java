package bean;

public class Book {
	private String id;
	private long price;
	private String publisher;
	public Book() {
		
	}
	public Book(String id, long price, String publisher) {
		super();
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
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
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
		return "Book [id=" + id + ", price=" + price + ", publisher=" + publisher + "]";
	}
	
}
