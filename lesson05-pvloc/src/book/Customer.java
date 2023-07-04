package book;

public class Customer {
	int id, phoneNumber;
	String name, address;
	
	public Customer() {
	}

	public Customer(int id, int phoneNumber, String name, String address) {
		super();
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", phoneNumber=" + phoneNumber + ", name=" + name + ", address=" + address + "]";
	}

	
	
}