package view.d1.ex05;

public class ClassicalBook extends Book{
	
	

	private boolean status;
	
	public ClassicalBook() {
	}

	public ClassicalBook(String id, double salesPrice, String publisher, boolean status) {
		super(id, salesPrice, publisher);
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return 		getId() + ", " 
					+ getSalesPrice() + ", " 
					+ getPublisher() + ", "
					+ isStatus();
	}
}
