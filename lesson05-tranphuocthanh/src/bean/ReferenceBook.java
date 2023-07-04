package bean;

public class ReferenceBook extends Book {
	private double tax;

	public ReferenceBook() {
	}

	public ReferenceBook(String id, double price, String publisher, double tax) {
		super(id, price, publisher);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	@Override
	public String toString() {
		return "ReferenceBook [id=" + getId() + ", price=" + getPrice() 
			+ ", publisher=" + getPublisher() + ",tax=" + tax + "]";
	}
}
