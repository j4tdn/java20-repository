package ex05;

public class TextBook extends Book{
	private Status status;

	public TextBook() {
		super();
	}

	public TextBook(String bookCode, double price, String publisher, Status status) {
		super(bookCode, price, publisher);
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	 @Override
	    public double intoMoney() {
	        if (status.equals(Status.OLD)) {
	            return getPrice() * 0.7;
	        } else {
	            return getPrice();
	        }
	    }

	@Override
	public String toString() {
		return  super.toString() + "TextBook [status=" + status + ", intoMoney()=" + intoMoney() + "]";
	}
	
}
