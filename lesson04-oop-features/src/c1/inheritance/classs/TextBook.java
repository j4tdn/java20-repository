package c1.inheritance.classs;

public class TextBook extends Book{
	private BookStatus status;
	private float discount;
	
	public TextBook() {
		
	}
	
	//Để gọi hàm khởi tạo --> sử dụng àm this() hoặc super()
	//this(..) --> gọi các hàm khởi tạo của kiểu hiện tại
		//this(null, null, null, BookStatus.NEW, 0);
	//super(..) --> gọi các hàm khởi tạo của kiểu cha
		//super(id, name, publisher);
 	public TextBook(String id, String name, String publisher, BookStatus status, float discount) {
		super(id, name, publisher);
		this.status = status;
		this.discount = discount;
	}

	public BookStatus getStatus() {
		return status;
	}

	public void setStatus(BookStatus status) {
		this.status = status;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "TextBook [ id=" + getId() + ", name=" + getName() + ", publisher =" + getPublisher() + ", status=" + status + ", discount=" + discount + "]";
	}

	
	
}
