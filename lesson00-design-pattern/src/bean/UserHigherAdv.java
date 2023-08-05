package bean;

// Code follow builder style --> unable

public class UserHigherAdv {
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;

	// Shorten way to create new instance
	public static UserHigherAdv of() {
		return new UserHigherAdv();
	}

	// u1.firstName
	// clone u1 to new one
	// set new one with new value of firstName
	// return new one
	// after .firstName u1 -> won't change
	
	
	public UserHigherAdv FirstName(String firstName) {
		UserHigherAdv userNewOne = clone();
		userNewOne.firstName = firstName;
		return userNewOne;
	}
	public UserHigherAdv LastName(String lastName) {
		UserHigherAdv userNewOne = clone();
		userNewOne.lastName = lastName;
		return userNewOne;
	}

	public UserHigherAdv Age(int age) {
		UserHigherAdv userNewOne = clone();
		userNewOne.age = age;
		return userNewOne;
	}

	public UserHigherAdv Phone(String phone) {
		UserHigherAdv userNewOne = clone();
		userNewOne.phone = phone;
		return userNewOne;
	}

	public UserHigherAdv Address(String address) {
		UserHigherAdv userNewOne = clone();
		userNewOne.address = address;
		return userNewOne;
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
		UserHigherAdv userNewOne = new UserHigherAdv();
		userNewOne.firstName = this.firstName;
		userNewOne.lastName = this.lastName;
		userNewOne.age = this.age;
		userNewOne.phone = this.phone;
		userNewOne.address = this.address;
		userNewOne.firstName = firstName;
		return userNewOne;
	}
	
	@Override
	public String toString() {
		return "UserHigherAdv [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

}
