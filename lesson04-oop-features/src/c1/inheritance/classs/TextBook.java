package c1.inheritance.classs;

public class TextBook extends Book{
	
	private BookStatus status;
	private float discount;
	
	public TextBook() {
	}
	//để gọi hàm khởi tọa --> sử dụng hàm this() hoặc hàm super()
	//this() --> gọi các hàm khởi tạo kiểu hiện tại
	//super() --> gọi các hàm khởi tạo của kiểu cha

	public TextBook(String id, String name, String publisher, BookStatus status, float discount) {
		super(id, name, publisher);
//		this.setId(id);
//		this.setName(name);
//		this.setPublisher(publisher);
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
		return "TextBook [getID=" + getId() + ", getName=" + getName() + ", getPublisher=" + getPublisher() + ", status="
				+ status + ", discount=" + discount + "]";
	}
	
}
