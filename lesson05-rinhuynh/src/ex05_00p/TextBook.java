package ex05_00p;

public class TextBook extends Book {


	private Boolean status;

	public TextBook() {
		// TODO Auto-generated constructor stub
	}

	public TextBook(String id, double salePrices, String publisher, Boolean status) {
		super(id, salePrices, publisher);
		this.status = status;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Book [id=" + getId() + ", salePrices=" + getSalePrices() + ", publisher=" + getPublisher() + ", status="
				+ getStatus() + "]";

	}

}
