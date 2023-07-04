package viewBook;

public class Client {
	private String Id;
	private String name;
	private int phone;
	private String address;

	public Client() {
	}

	public Client(String id, String name, int phone, String address) {
		Id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Client [Id=" + Id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}

}
