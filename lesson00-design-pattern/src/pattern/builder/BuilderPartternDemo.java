package pattern.builder;

import bean.User;
import bean.UserAdv;
import bean.UserHigherAdv;

public class BuilderPartternDemo {
	/**
	 Builder Pattern is a construction pattern
	 + build/create complex object( has many attributes)
	 + build out an immutable ( impossible to update data at HEAP) object
	 + create one construction process replace for many representations(many overload constructors)
	 
	 + student(100 elements H1) --> students(point > 7)
	 + remove point <= 7 student(70 elements H1)
	 
	 + immutable
	  . create many constructors with enough parameters required
	   a, b
	   a, c
	   a, b, c
	   a, c
	   
	   --> too many constructor
	   --> cannot create just one construction to create an immutable object
	 
	 + builder pattern --> create just one construction to create an immutable object
	 */
	
	public static void main(String[] args) {
		
		// required: firstName, lastName, phone
		User u1 = User.builder().withFirstName("Le").withLastName("Teo").withPhone("653825").build();
		
		System.out.println("u1 --> " + u1);
		
		// required: firstName, age, address
		User u2 = User.builder().withFirstName("Le").withAge(20).withAddress("Da Nang").build();
		
		System.out.println("u2 --> " + u2);
		
		
		//required: firstName, lastName, address
		UserAdv ua1 = UserAdv.of();
		ua1.firstName("Rin").lastName("Huynh").address("Da Nang");
		System.out.println("ua1 --> " + ua1);
		
		ua1.firstName("Rin updated");
		System.out.println("ua1 --> " + ua1);
		
		// required: firstName, lastName, address
		
		UserHigherAdv uha1 = UserHigherAdv.of().firstName("Hai").lastName("Dang").address("Da Nang");
		
		System.out.println("uha1 address --> " + System.identityHashCode(uha1));
		System.out.println("uha1 --> " + uha1);
		
		UserHigherAdv uha2 = uha1.lastName("Hai Hai");
		
		System.out.println("uha2 address --> " + System.identityHashCode(uha2));
		System.out.println("uha2 --> " + uha2);
		
	}
	

}
