package bean;

public class Customer {
	private String idCus;
	private String name;
	private String phone;
	private String adress;
	public Customer() {
		
	}
	public Customer(String idCus, String name, String phone, String adress) {
		super();
		this.idCus = idCus;
		this.name = name;
		this.phone = phone;
		this.adress = adress;
	}
	public String getIdCus() {
		return idCus;
	}
	public void setIdCus(String idCus) {
		this.idCus = idCus;
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
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Customer [idCus=" + idCus + ", name=" + name + ", phone=" + phone + ", adress=" + adress + "]";
	}
	
}
