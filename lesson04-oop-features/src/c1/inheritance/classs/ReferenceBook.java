package c1.inheritance.classs;

public class ReferenceBook extends Book{
	
	private float tax;

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}
	
	

	public ReferenceBook(String id, String name, String pulisher, float tax) {
		super(id, name, pulisher);
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook [tax=" + tax + ", getId()=" + getId() + ", getName()=" + getName() + ", getPulisher()="
				+ getPulisher() + "]";
	}
	
	
}
