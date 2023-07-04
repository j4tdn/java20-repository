package bai5;

public class KhachHang {
	private String cusId;
	private String fullName;
	private String phone;
	private String address;
	
	public KhachHang() {
	}

	public KhachHang(String cusId, String fullName, String phone, String address) {
		super();
		this.cusId = cusId;
		this.fullName = fullName;
		this.phone = phone;
		this.address = address;
	}

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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
		return "KhachHang [cusId=" + cusId + ", fullName=" + fullName + ", phone=" + phone + ", address=" + address
				+ "]";
	}
	
	
}
