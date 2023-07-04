package bean;

public class TextBook extends Book {

	private BookStatus bookStatus;

	public TextBook() {
	}

	public TextBook(String id, double salePrices, String publisher, BookStatus bookStatus) {
		super(id, salePrices, publisher);
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
		return "Sách giáo khoa [Mã sách: " + getId() + ", Đơn giá: " + getSalePrices() + ", NXB: " + getPublisher()
				+ ", Tình trạng: " + bookStatus + "]";
	}

}
