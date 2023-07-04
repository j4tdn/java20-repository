package bean;

public class ReferBook extends Book{
	private float tax;
	public ReferBook() {
	}
	public ReferBook(String id, float salesPrices, String publisher, float tax) {
		super(id, salesPrices, publisher);
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
		return "ReferBook [id =" + getId() 
				+ ", salesPrices =" + getSalesPrices()
				+ ", publisher =" + getPublisher() 
				+ ", tax =" + getTax() + " ]";
	}
}
