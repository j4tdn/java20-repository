package c1.intheritance.classs;

public class RefrenceBook extends Book {
	
	private float tax;
	public RefrenceBook() {
	
	}
	
	public RefrenceBook(String id, String name, String publisher, float tax) {
		super(id, name, publisher);
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
		return "RefrenceBook [tax=" + tax + ", getId()=" + getId() + ", getName()=" + getName() + ", getPublisher()="
				+ getPublisher() + "]";
	}
	
}
