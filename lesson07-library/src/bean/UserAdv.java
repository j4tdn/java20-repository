package bean;

//code with Builder Pattern Slyte --> able to change object after created
//not builder anymore


public class UserAdv {
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;
	//shoetern way to create new instance
	public static UserAdv of() {
		return new UserAdv();
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public UserAdv withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public UserAdv withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public UserAdv withAge(int age) {
		this.age = age;
		return this;
	}
	public UserAdv withPhone(String phone) {
		this.phone = phone;
		return this;
	}
	public UserAdv withAddress(String address) {
		this.address = address;
		return this;
	}
	@Override
	public String toString() {
		return "UserAdv [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
}
