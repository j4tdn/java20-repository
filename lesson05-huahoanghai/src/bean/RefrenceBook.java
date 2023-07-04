package bean;

public class RefrenceBook extends Book {
	private float tax;
	public RefrenceBook() {
		
	}
	public RefrenceBook(String id, long price, String publisher, float tax) {
		super(id, price, publisher);
		this.tax = tax;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "RefrenceBook [tax=" + tax + "]";
	}
	
}
