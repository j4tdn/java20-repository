package bean;

public class Book {
	private String id;
	private float salesPrices;
	private String publisher;
	
	public Book() {
	}

	public Book(String id, float salesPrices, String publisher) {
		super();
		this.id = id;
		this.salesPrices = salesPrices;
		this.publisher = publisher;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getSalesPrices() {
		return salesPrices;
	}

	public void setSalesPrices(float salesPrices) {
		this.salesPrices = salesPrices;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id 
					+ ", salesPrices=" + salesPrices 
					+ ", publisher=" + publisher + "]";
	}
	
}
