package exercise5;

public class ReferenceBook extends Book{
	private double tax;
	
	public ReferenceBook() {
		// TODO Auto-generated constructor stub
	}

	public ReferenceBook(String bookID, int price, String publisher, double tax) {
		super(bookID, price, publisher);
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
		return "ReferenceBook [getTax()=" + getTax() + ", getBookID()=" + getBookID() + ", getPrice()=" + getPrice()
				+ ", getPublisher()=" + getPublisher() + ", toString()=" + super.toString() + "]";
	}
	
	
}
