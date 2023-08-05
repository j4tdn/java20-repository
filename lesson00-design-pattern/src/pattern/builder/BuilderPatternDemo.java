package pattern.builder;

import bean.User;
import bean.UserAdv;
import bean.UserHigherAdv;

public class BuilderPatternDemo {
	/**
	 
	 Builder pattern is a construction pattern
	 + build/create complex objects(has many attributes)
	 + build out an immutable(impossible to update data at HEAP) object
	 + create one construction process replace for many representation(many overload constructor) 
	 
	 + students(100 students H1) --> student(point > 7)
	 + --> immutable object
	 + remove point <= 7 students (70 elements H1) -> Class after filter have 70 students left? -> error
	 
	 
	 + immutable
	 	.create mant constructors with enough parameters required
	 	a,b
	 	a,c
	 	a,b,c
	 	b,c
	 	--> too many constructors
	 	--> cannot create duplicate constructor with same data type & amount
	 	
	+ builder pattern -> create just one constructor to create an immutable object
	 
	 
	 */
	
	public static void main(String[] args) {
		//required firstName, lastName, phone
		User u1 = User.builder()
				.withFirstName("Lê")
				.withLastName("Tèo")
				.withPhone("123321312")
				.build();
		
		System.out.println(u1);
		
		//required firstName, lastName, address
		UserAdv ua1 = UserAdv.of()
							.FirstName("GOOD")
							.LastName("MORNING")
							.Address("AT DA NANG");
		System.out.println("before: " + ua1);
		ua1.LastName("AFTERNOON");
		System.out.println("after: " + ua1);
		
		UserHigherAdv uha1 = UserHigherAdv.of()
							.FirstName("GOOD")
							.LastName("MORNING")
							.Address("AT DA NANG");
		System.out.println("before: " + uha1);
		System.out.println(System.identityHashCode(uha1));
		uha1.LastName("AFTERNOON");
		System.out.println("after: " + uha1);
		System.out.println(System.identityHashCode(uha1));
	}
}
