package bean;

//code with Builder Pattern Slyte --> able to change object after created
//not builder anymore


public class UserHigerAdv {
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;
	//shoetern way to create new instance
	public static UserHigerAdv of() {
		return new UserHigerAdv();
	}
	
	//u1.firtName(..)
	//clone u1 to new one
	//set new one with new value of fisrt name
	//return new one
	//after firtst name -->u1 won't change
	
	
	
	
	
	
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
	public UserHigerAdv withFirstName(String firstName) {
		UserHigerAdv newOne = clone();
		this.firstName = firstName;
		return this;
	}
	public UserHigerAdv withLastName(String lastName) {
		UserHigerAdv newOne = clone();
		this.lastName = lastName;
		return this;
	}
	public UserHigerAdv withAge(int age) {
		UserHigerAdv newOne = clone();
		this.age = age;
		return this;
	}
	public UserHigerAdv withPhone(String phone) {
		UserHigerAdv newOne = clone();
		this.phone = phone;
		return this;
	}
	public UserHigerAdv withAddress(String address) {
		UserHigerAdv newOne = clone();
		this.address = address;
		return this;
	}
	public UserHigerAdv clone() {
		UserHigerAdv newOne = new UserHigerAdv();
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
