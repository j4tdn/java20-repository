package c.inheritance.basic;

public class TextBook extends Book {


	private BookStatus status;
	private float discount;

	public TextBook() {

	}

	public TextBook(String id, String name, String pulisher, BookStatus status, float discount) {
		//this.setId(id);
		//this.setName(name);
		//this.setPulisher(pulisher);
		super(id, name, pulisher);
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
		return "TextBook [status=" + status + ", discount=" + discount + ", getId()=" + this.getId() + ", getName()="
				+ getName() + ", getPulisher()=" + getPulisher() + "]";
	}


	
	
}
