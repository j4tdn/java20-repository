package bean;

public class UserAdv {
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;

	// shorten way to create new instance
	public static UserAdv of() {
		return new UserAdv();
	}

	public UserAdv firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public UserAdv lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public UserAdv age(int age) {
		this.age = age;
		return this;
	}

	public UserAdv phone(String phone) {
		this.phone = phone;
		return this;
	}

	public UserAdv address(String address) {
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

	@Override
	public String toString() {
		return "UserAdv [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}
}
