package bean;

/**
 * 
 * Theory 		: Builder support to create an immutable object for its own class(e.g: User) 
 * In reality 	: Create instance for Builder -> set value from Builder to User
 * 				--> Amount of attributes in Builder and its own class are the same
 * 
 * public class User { 
 * 		... 
 * 		public 'static' class Builder {
 * 			
 * 		}
 * }
 * 
 * User.builder() -> create a builder instance
 * .with.with	  -> setter for builder
 * .build		  -> convert builder to user
 * 
 * User u1 = User.builder()
 * 				 .withFirstName("Tran")
 * 				 .withLastName("Nam")
 * 				 .build();
 * 
 * u1 -> should be immutable
 * + no setter 
 * + private attributes
 * (advance) -> private, using reflection to change value -> add final
 */

public class User {

	private final String firstName;
	private final String lastName;
	private final int age;
	private final String phone;
	private final String address;

	// Builder will help to create immutable instance for user

	
	public User(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}
	
	public static Builder builder() {
		return new Builder();
	}

	//Provide getters no setters(no change)
	
	//Assign/Set value will be supported by Builder
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
	
	// 'static' --> User . directly
	// 'non-static' --> new User().Builder
	//				--> use object to intialize value for User, don't need builder
	//				(conflicts)
	public static class Builder	{
		
		private String firstName;
		private String lastName;
		private int age;
		private String phone;
		private String address;
		
		private Builder() {			
		}

		public Builder withFirstName(String firstName) {
			this.firstName = firstName; 
			return this;
		}

		public Builder withLastName(String lastName) {
			this.lastName = lastName; 
			return this;
		}

		public Builder withAge(int age) {
			this.age = age; 
			return this;
		}

		public Builder withPhone(String phone) {
			this.phone = phone; 
			return this;
		}

		public Builder withAddress(String address) {
			this.address = address; 
			return this;
		}
		
		// After create builder object & setters
		// Assign Builder to its own class
		// this: current builder
		public User build() {
			return new User(this);
		}
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
	
}
