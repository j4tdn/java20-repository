package bean;

//code with Builder Pattern style -->unable
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

	// u1.firstName(...)
	// clone u1 to new one
	// set new one with new value of first name
	// return new one
	// after . first name --> u1 won't change
	public UserHigherAdv firstName(String firstName) {
		UserHigherAdv newOne = clone();
		newOne.firstName = firstName;
		return newOne;
	}

	public UserHigherAdv lastName(String lastName) {
		UserHigherAdv newOne = clone();
		newOne.lastName = lastName;
		return newOne;
	}

	public UserHigherAdv age(int age) {
		UserHigherAdv newOne = clone();
		newOne.age = age;
		return newOne;
	}

	public UserHigherAdv phone(String phone) {
		UserHigherAdv newOne = clone();
		newOne.phone = phone;
		return newOne;
	}

	public UserHigherAdv address(String address) {
		UserHigherAdv newOne = clone();
		newOne.address = address;
		return newOne;
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
