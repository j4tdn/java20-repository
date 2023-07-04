package bean;

public class Customer {

	private int id;
	private String fullName;
	private int phone;
	private String address;

	public Customer() {
	}

	public Customer(int id, String fullName, int phone, String address) {
		this.id = id;
		this.fullName = fullName;
		this.phone = phone;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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
		return "Khách hàng [Mã khách hàng: " + id + ", Họ tên: " + fullName + ", SĐT: " + phone + ", Địa chỉ: "
				+ address + "]";
	}

}
