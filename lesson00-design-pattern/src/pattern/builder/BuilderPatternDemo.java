package pattern.builder;

import bean.User;

public class BuilderPatternDemo {
	/**
	 * Builder Pattern is a constructor pattern
	 *  + build/ create complex objects (has many attributes)
	 *  + build out immutable (impossible to update data at HEAP) object
	 *  + create one construction process replace for many representation (many overload constructors)
	 *  
	 *  + students (100 elements H1) --> students(point > 7)
	 *  + --> immutable object
	 *  + remove point <= 7 students (70 elements H1)
	 *  
	 *  + immutable
	 *  	. create many constructors with enough parameters required
	 *  		a, b
	 *  		a, c
	 *  		a, b, c
	 *  		--> too many constructor
	 *  		--> cannot create duplicate constructor with same data type ^ amount
	 *  
	 *  builder pattern --> create just one constructor to create an immutable object
	 */
	public static void main(String[] args) {
		
		//required: firstName, lastName
		User u1 = User.builder()
					.withFirstName("Teo")
					.withLastName("Le")
					.build();
		
		System.out.println("u1 --> " + u1);
		
		//required: firstName, lastName, age, address
		User u2 = User.builder()
				.withFirstName("Teo")
				.withLastName("Le")
				.withAge(20)
				.withAddress("Da Nang")
				.build();
		System.out.println("u2 --> " + u2);
	}
}
