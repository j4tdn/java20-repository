package pattern.builder;

import bean.User;
import bean.UserAdv;
import bean.UserHigherAdv;

public class BuilderPatternDemo {
	
	/**
	 Builder Pattern is a construction pattern
	 + build/create complex objects(has many attributes)
	 + build out an immutable(impossible to update data at HEAP) object
	 + create one construction process replace for many representations(many overload constructors)
	 
	 + students(100 elements H1) --> students(point > 7)
	 + --> immutable object
	 + remove point <= 7 students(70 elements H1)
	 
	 + immutable
	   . create many constructors with enough parameters required
	     a, b
	     a, c
	     a, b, c
	     b, c
	     --> too many constructor
	     --> cannot create duplicate constructor with same data type & amount
	 
	 + builder pattern --> create just one construction to create an immutable object
	 */
	public static void main(String[] args) {
		
		// required: firstName, lastName, phone
		User u1 = User.builder()
				.withFirstName("Le")
				.withLastName("Teo")
				.withPhone("2345678")
				.build();
		
		System.out.println("u1 --> " + u1);
		
		// required: firstName, age, address
		User u2 = User.builder()
				.withFirstName("Le")
				.withAge(20)
				.withAddress("Da Nang")
				.build();
		
		System.out.println("u2 --> " + u2);
		
		// required: firstName, lastName, address
		UserAdv ua1 = UserAdv.of()
				.firstName("Hoang")
				.lastName("Teo")
				.address("Viet Nam");
		
		ua1.firstName("Hoang Updated");
		System.out.println("ua1 --> " + ua1);
		
		// required: firstName, lastName, address
		UserHigherAdv uha1 = UserHigherAdv.of()
				.firstName("Le")
				.lastName("Ben")
				.address("Viet Nam");
		
		System.out.println("uha1 address --> " + System.identityHashCode(uha1));
		System.out.println("uha1 --> " + uha1);
		
		UserHigherAdv uha2 = uha1.lastName("Benjamin");
		
		System.out.println("uha2 address --> " + System.identityHashCode(uha2));
		System.out.println("uha2 --> " + uha2);
	}
}