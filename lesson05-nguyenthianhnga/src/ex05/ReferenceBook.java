package ex05;

public class ReferenceBook extends Book{
	private double tax;

	public ReferenceBook() {
		super();
	}
	
	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public ReferenceBook(String bookCode, double price, String publisher, double tax) {
		super(bookCode, price, publisher);
		this.tax = tax;
	}

	@Override
	public double intoMoney() {
		 return getPrice() * (1 + tax/100);
	}

	@Override
	public String toString() {
		return super.toString()+ "ReferenceBook [tax=" + tax+ "%"+ ", intoMoney()=" + intoMoney() + "]";
	}
	
	
}
