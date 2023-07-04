package ex05;

public class SGK extends Book{
	
	private String statusBook;
	
	public SGK() {
	}

	public SGK(String id, int price, String publishing, String statusBook) {
		super(id, price, publishing);
		this.statusBook = statusBook;
	}

	public String getStatusBook() {
		return statusBook;
	}

	public void setStatusBook(String statusBook) {
		this.statusBook = statusBook;
	}

	@Override
	public String toString() {
		return "SGK [getId()=" + getId() 
				+ ", getPrice()=" + getPrice()
				+ ", getPublishing()=" + getPublishing() 
				+ "statusBook=" + statusBook +"]";
	}
	
	
}
