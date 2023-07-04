package viewBook;

public class ReferenceBook extends Book{
	private double tax;
	
	public ReferenceBook() {
	}

	public ReferenceBook(String id, double price, String author, double tax) {
		super(id, price, author);
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
		return "ReferenceBook [tax=" + tax + ", getId()=" + getId() + ", getPrice()=" + getPrice() + ", getAuthor()="
				+ getAuthor() + "]";
	}
	
}
