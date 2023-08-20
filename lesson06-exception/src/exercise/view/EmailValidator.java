package exercise.view;

public class EmailValidator {
	
	public static void main(String[] args) {
		String[] emails = {
				"abc-d@gmail.com", 
				"abc.def@mail.com", 
				"abc@mail.com", 
				"abc_def@mail.com",
				
				"aaa-@mail.com",
				"abc..def@mail.com",
				"abc-d@mail.com",
				"levanteo@gmail.com",
				"thanhtran@mail.com"
		};
		
		// valid email --> prefix @ domain
		
		// prefix: lower letters, period, underscore, dash
		//         period, underscore, dash follows by at least one letter
		
		// domain: 
		
		// ? --> optional --> {0,1}
		// [] --> set, or, not cares order
 		
		String emailRegex = "[a-z]+[_.-]?[a-z]+@[a-z]+.[a-z]+";
		
		System.out.println("regex: " + emailRegex);
		
		System.out.println();
		
		for (String email: emails) {
			System.out.println(email + " validate --> " + email.matches(emailRegex));
		}
	}
}