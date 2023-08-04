package bean;


/**
 * 
 Theory		: Builder support to create an immutable object for it's own class(e.g --> User)
 In reality : Create instance for Builder --> set value from Builder to User
 			--> Amount of attributes in Builder an it's own class are the same
 
 * 
 * 
 public class User{
 	...
 	public 'static' class Builder {
 	
 	}
 }
 
 User.builder() --> create builder instance
 
 
  User u1 = 
 */
public class User {
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;
	
	
	private User() {
		
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
		
		public User build() {
			
		}
		
		
	}
	
	

}
