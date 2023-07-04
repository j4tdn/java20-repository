package ex05;

public class Customer {
	private String customerId;
    private String fullName;
    private String phoneNumber;
    private String address;
    
    public Customer() {
}

	public Customer(String customerId, String fullName, String phoneNumber, String address) {
		this.customerId = customerId;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
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
		return "Customer [customerId=" + customerId + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + "]";
	}   
}
