package exercises5;

public class Customer {
	private String idCustomer;
	private String fullName;
	private int phoneNumber;
	private String address;
	
	public Customer() {
	}

	public Customer(String idCustomer, String fullName, int phoneNumber, String address) {
		this.idCustomer = idCustomer;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [idCustomer=" + idCustomer + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + "]";
	}
}
