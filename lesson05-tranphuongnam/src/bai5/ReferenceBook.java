package bai5;

public class ReferenceBook extends Book {
	private int tax;

	public ReferenceBook(String id, float price, String publisher, int tax) {
		super(id, price, publisher);
		this.tax = tax;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook [tax=" + tax + ", toString()=" + super.toString() + "]";
	}
	
}
