package c1.inheritance.classs;

public class Book {
	private String id;
	private String name;
	private String publisher;
	
	public Book() {
	}

	public Book(String id, String name, String publisher) {
		//super();
		this.id = id;
		this.name = name;
		this.publisher = publisher;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", publisher=" + publisher + "]";
	}
	
	
	

}
