package bean;

public class TextBook extends Book{
	private BookStatus status;
	
	public TextBook() {
	}

	public TextBook(String id, float salesPrices, String publisher, BookStatus status) {
		super(id, salesPrices, publisher);
		this.status = status;
	}

	public BookStatus getStatus() {
		return status;
	}

	public void setStatus(BookStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TextBook [id =" + getId() 
				+ ", salesPrices =" + getSalesPrices()
				+ ", publisher =" + getPublisher() 
				+ ", status = " + getStatus() + " ]";
	}
	
	
}
