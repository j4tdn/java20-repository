package exercise5;

enum bookStatus{
	OLD, NEW
}

public class TextBook extends Book{
	private bookStatus status;
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}

	public TextBook(String bookID, int price, String publisher, bookStatus status) {
		super(bookID, price, publisher);
		this.status = status;
	}

	public bookStatus getStatus() {
		return status;
	}

	public void setStatus(bookStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TextBook [getStatus()=" + getStatus() + ", getBookID()=" + getBookID() + ", getPrice()=" + getPrice()
				+ ", getPublisher()=" + getPublisher() + ", toString()=" + super.toString() + "]";
	}
}
