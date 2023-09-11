package patern.builder;

import bean.User;
import bean.UserAdv;
import bean.UserHigerAdv;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		/*
		 Builder Pattern is a construction patern
		 +build/create complex object(has many attribues)
		 +build out an imutable(impossible to update data aat HEAP)
		 +create one constructor process replace for many representations(many
		 +imuable 
		 -create many constructors with enough paramenters required
		 a, b
		 a, c
		 a, b, c
		 b, c
		 --> too many constructor
		  
		 
		 * */
		//required:fisrtName, age ,address
		
		User u1 =User.builder()
					 .withFirstName("Le")
					 .withLastName("Teo")
					 .withPhone("1446")
					 .build();
		System.out.println("u1 --->" + u1);
	
		//required : firstName, age, address
		UserAdv ua1 = UserAdv.of()
					  .withFirstName("Hoang")
					  .withAge(15)
					  .withAddress("Viet Nam");
	System.out.println("ua1 --->" + ua1);
	
	// required: firstName, lastName, address
			UserHigerAdv uha1 = UserHigerAdv.of()
					.withFirstName("Le")
					.withLastName("Ben")
					.withAddress("Viet Nam");
			
			System.out.println("uha1 address --> " + System.identityHashCode(uha1));
			System.out.println("uha1 --> " + uha1);
			
			UserHigerAdv uha2 = uha1.withLastName("Benjamin");
			
			System.out.println("uha2 address --> " + System.identityHashCode(uha2));
			System.out.println("uha2 --> " + uha2);
	}
}
