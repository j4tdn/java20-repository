package ex05_00p;

public class Book {

	
	private String id;
	private double salePrices;
	private String publisher;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String id, double salePrices, String publisher) {
		super();
		this.id = id;
		this.salePrices = salePrices;
		this.publisher = publisher;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalePrices() {
		return salePrices;
	}

	public void setSalePrices(double salePrices) {
		this.salePrices = salePrices;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", salePrices=" + salePrices + ", publisher=" + publisher + "]";
	}
	
	

}
