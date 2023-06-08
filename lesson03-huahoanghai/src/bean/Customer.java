package bean;

public class Customer {
	private String id;
	private String name;
	private String phone;
	private String adddress;
	
	public Customer() {
		
	}

	public Customer(String id, String name, String phone, String adddress) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.adddress = adddress;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdddress() {
		return adddress;
	}

	public void setAdddress(String adddress) {
		this.adddress = adddress;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", adddress=" + adddress + "]";
	}
	
}
