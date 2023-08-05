package bean;

// code with Builder Pattern style --> able to change object after created
// not builder anymore but code follow builder style

public class UserAdv {
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;
	
	
	//Shorten way to create new instance
	public static UserAdv of() {
		return new UserAdv();
	}

	

	public UserAdv FirstName(String firstName) {
		this.firstName = firstName; return this;
	}



	public UserAdv LastName(String lastName) {
		this.lastName = lastName; return this;
	}



	public UserAdv Age(int age) {
		this.age = age; return this;
	}



	public UserAdv Phone(String phone) {
		this.phone = phone; return this;
	}



	public UserAdv Address(String address) {
		this.address = address; return this;
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



	@Override
	public String toString() {
		return "UserAdv [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
	
}
