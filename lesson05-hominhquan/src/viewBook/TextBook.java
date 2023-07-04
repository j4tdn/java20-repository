package viewBook;

public class TextBook extends Book{
	private Status status;
	
	public TextBook() {
	}

	public TextBook(String id, double price, String author, Status status) {
		super(id, price, author);
		
	}
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TextBook [status=" + status + ", getId()=" + getId() + ", getPrice()=" + getPrice() + ", getAuthor()="
				+ getAuthor() + "]";
	}
	
	
}
