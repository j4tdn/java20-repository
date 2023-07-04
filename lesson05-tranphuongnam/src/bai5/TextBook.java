package bai5;

public class TextBook extends Book{
	private BookStatus bookStatus;

	public TextBook(String id, float price, String publisher, BookStatus bookStatus) {
		super(id, price, publisher);
		this.bookStatus = bookStatus;
	}

	public BookStatus getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(BookStatus bookStatus) {
		this.bookStatus = bookStatus;
	}

	@Override
	public String toString() {
		return "TextBook [bookStatus=" + bookStatus + ", toString()=" + super.toString() + "]";
	}
	
	
}
