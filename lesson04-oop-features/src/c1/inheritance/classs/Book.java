package c1.inheritance.classs;

public class Book {
	
	private String id;
	private String name;
	private String pulisher;
	
	public Book() {

	}

	

	public Book(String id, String name, String pulisher) {
		this.id = id;
		this.name = name;
		this.pulisher = pulisher;
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

	public String getPulisher() {
		return pulisher;
	}

	public void setPulisher(String pulisher) {
		this.pulisher = pulisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", pulisher=" + pulisher + "]";
	}
	
	
}
