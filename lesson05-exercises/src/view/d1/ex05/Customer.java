package view.d1.ex05;

public class Customer {
	private String Id;
	private String name;
	private String phone;
	private String address;
	
	public Customer() {
	}

	public Customer(String id, String name, String phone, String address) {
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
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
		return "Customer [Id=" + Id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
}
