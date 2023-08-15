package bean;

// code with builder pattern style --> unable 
public class UserHighAdv {

	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;

	// short way to create new instance
	public static UserHighAdv of() {
		return new UserHighAdv();
	}

	/*
	 * u1.firstName(...)
	 * clone u1 to new one
	 * set new one with new value of firstName
	 * return new one
	 * after .firstName --> u1 won't change
	 */
	
	public UserHighAdv clone() {
		UserHighAdv newOne = new UserHighAdv();
		newOne.firstName = this.firstName;
		newOne.lastName = this.lastName;
		newOne.age = this.age;
		newOne.phone = this.phone;
		newOne.address = this.address;
		return newOne;
	}
	
	public UserHighAdv firstName(String firstName) {
		UserHighAdv newOne = clone();
		newOne.firstName = firstName;
		return newOne;
	}

	public UserHighAdv lastName(String lastName) {
		UserHighAdv newOne = clone();
		newOne.lastName = lastName;
		return newOne;
	}

	public UserHighAdv age(int age) {
		UserHighAdv newOne = clone();
		newOne.age = age;
		return newOne;
	}

	public UserHighAdv phone(String phone) {
		UserHighAdv newOne = clone();
		newOne.phone = phone;
		return newOne;
	}

	public UserHighAdv address(String address) {
		UserHighAdv newOne = clone();
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

	@Override
	public String toString() {
		return "UserHighAdv [firstName = " + firstName + ", lastName = " + lastName + ", age = " + age + ", phone = "
				+ phone + ", address = " + address + "]";
	}

}
