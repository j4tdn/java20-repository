package ex05_00p;

public class ReferBook extends Book {

	private double tax;
	

	public ReferBook() {
		// TODO Auto-generated constructor stub
	}
	
	public ReferBook(String id, double salePrices, String publisher, double tax) {
		super(id, salePrices, publisher);
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
		return "Book [id=" + getId() + ", salePrices=" + getSalePrices() + ", publisher=" + getPublisher() + ", tax="
				+ getTax() + "]";
	}
	
	
	
	
}
