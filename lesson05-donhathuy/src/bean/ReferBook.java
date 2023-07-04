package bean;

public class ReferBook extends Book{
	private double tax;
	public ReferBook() {
	
	}
	public ReferBook(String id, double price, String publisher, double tax) {
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
		return "ReferBook [ Id=" + getId() + ", Price=" + getPrice() + ", Publisher="
				+ getPublisher() + ", tax =" + tax + "]";
	}
	 
}
