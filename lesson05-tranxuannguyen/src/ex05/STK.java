package ex05;

public class STK extends Book{
	private float tax;
	
	public STK() {
	}

	public STK(String id, int price, String publishing, float tax) {
		super(id, price, publishing);
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
		return "STK [getId()=" + getId() 
				+ ", getPrice()=" + getPrice() 
				+ ", getPublishing()="+ getPublishing() 
				+ "tax=" + tax + "]";
	}
	
}
