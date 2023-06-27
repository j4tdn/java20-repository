package c1.inheritance.classs;

public class ReferenceBook extends Book {
	private float tax;
	
	public ReferenceBook() {
	}

	public ReferenceBook(String id, String name, String publisher, float tax) {
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
		return "RefenceBook [getID=" + getId() + ", getName=" + getName() + ", getPublisher=" + getPublisher() + ", tax="
				+ tax + "]";
	}
	
}
