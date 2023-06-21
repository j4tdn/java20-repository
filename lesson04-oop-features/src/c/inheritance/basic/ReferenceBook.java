package c.inheritance.basic;

public class ReferenceBook extends Book {
	private float tax;
	
	public ReferenceBook() {
	
	}

	public ReferenceBook(String id, String name, String publisher, float tax) {
		super(id, name, publisher);
//		this.setId(id);
//		this.setName(name);
//		this.setPublisher(publisher);
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
		return "ReferenceBook [Id=" + getId() + ", Name=" + getName() + ", Publisher=" + getPublisher()
				+ ", tax(%)=" + tax + "]";
	}
	
}
