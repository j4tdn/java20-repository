package ex05tradebooks;

public class TextBook extends Book {
	private BookStatus status;
	
	public TextBook() {
		
	}

	public TextBook(String id, double price, String publisher, BookStatus status) {
		super(id, price, publisher);
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
		return "TextBook [Id=" + getId() + ", Price=" + getPrice() + ", Publisher=" + getPublisher()
				+ ", status=" + status + "]";
	}
	
}
