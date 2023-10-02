package bean;

/**
 * Theory: Builder support to create immutable object for it's own class (e.g --> User)
 * In reality: Create instance for Builder --> with value from Builder to User
 * 			   --> Amount of attributes in Builder and it's own class are the same
 * 
 * 
 * 
 * 
 * public class User{
 * ...
 * 
 * 		public static class Builder{
 * 		...
 * 		}
 * 
 * }
 * User.builder() --> create builder instance
 * 	   .with.with --> setter for builder
 * 	   .build	  --> convert builder to User
 * 
 * User u1 = User.builder
 * 				 .withFirstName(...)
 * 				 .withLastName(...)
 * 				 .build();
 * 
 * u1 --> should be immutable
 * + no setter
 * + private attribute (advance --> private, using reflection to change value)
 * + no constructor
 * 
 */
public class User {
	private final String firstName;
	private final String lastName;
	private final int age;
	private final String phone;
	private final String address;
	
	//Builder will help to create immutable instance for User
	
	public User(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.address = builder.address;
		this.age = builder.age;
		this.phone = builder.phone;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	//Provide withters, no withters( no change - immutable)
	// Assign/ with value will be supported by Builder
		
	public String withFirstName() {
		return firstName;
	}

	public String withLastName() {
		return lastName;
	}

	public int withAge() {
		return age;
	}

	public String withPhone() {
		return phone;
	}

	public String withAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

	//static --> User.directly
	//non-static --> new User().Builder
	//			 --> new User() user object to init value for User
	
	//nested class
	
	public static class Builder{
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
		
		//after create builder object & setters
		//assign builder to it's own class
		public User build() {
			return new User(this);
		}
	}
}
