package bean;

//code with Builder pattern style --> able to change object after created
//not builder anymore
public class UserHigherAdv {
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;

	// shorten way to create new instance
	public static UserHigherAdv of() {
		
		return new UserHigherAdv();
	}

	public UserHigherAdv withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public UserHigherAdv withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public UserHigherAdv withAge(int age) {
		this.age = age;
		return this;
	}

	public UserHigherAdv withPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public UserHigherAdv withAddress(String address) {
		this.address = address;
		return this;
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

	public UserHigherAdv clone() {
		UserHigherAdv newOne = new UserHigherAdv();
		newOne.firstName = this.firstName;
		newOne.lastName = this.lastName;
		newOne.age = this.age;
		newOne.phone = this.phone;
		newOne.address = this.address;

		return newOne;
	}

	@Override
	public String toString() {
		return "UserAdv [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

}

