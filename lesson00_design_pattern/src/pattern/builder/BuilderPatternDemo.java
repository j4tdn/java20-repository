package pattern.builder;

import bean.User;
import bean.UserAdv;

public class BuilderPatternDemo {

	/*
	 * Builder Pattern is a construction pattern
	 * + build/create complex objects(has many attributes)
	 * + build out an immutable(impossible to update data at HEAP) object
	 * + create one construction process replace for many representations(many overload constructor)
	 * 
	 * + students(100 elements H1) --> students(point > 7)
	 * + --> immutable object	
	 * + remove point <= 7 students(70 elements H1)
	 * 
	 * immutable
	 *    . create many constructors with enough parameters required
	 *    a, b
	 *    a, c
	 *    a, b, c
	 *    b, c
	 *    --> too many constructors
	 *    --> cannot create duplicate constructor with same data type & amount
	 * 
	 * + builder pattern --> create just one constructor to create an immutable object
	 */
	public static void main(String[] args) {
		// required: firstName, lastName, phone
		User u1 = User.builder().withFirstName("Le")
								.withLastName("Teo")
								.withPhone("2344234")
								.build();
		
		System.out.println("u1 --> " + u1);
	
		// required: firstName, age, address
		User u2 = User.builder()
				.withFirstName("Le")
				.withLastName("Quang")
				.withPhone("39847234")
				.build();
		
		System.out.println("u2 --> " + u2);
		
		// required: firstName, lastName, address
		UserAdv ua1 = UserAdv.of()
					 .withFirstName("Hoang")
					 .withLastName("Teo")
					 .withAddress("Viet Nam");
		System.out.println("ua1 --> " + ua1);
	}
}
