package excersises;

public class Ex03EmailValidation {
	 public static void main(String[] args) {
		String[] emails = {"abc-d@gmail.com", "adc.def@mail.com", 
					"abc@mail.com", "abc_def@mail.com",
					"aaaa-@mail.com",
					"abc...@mail.com"
		};
		//valid email: prefix @ domain
		// prefix: lower letters, period, underscore, dash
		// letters, period, underscore, dash follows by at least one letter
		
		//? optional --> {0,1}
		//[set, or} not cares order
		String emailRegex = "[a-z]+[_.-]?[a-z]+@[a-z]+.[a-z]+";
		for(String email: emails) {
			System.out.println(email + "====> " + email.matches(emailRegex));
		}
	 }
	 
}
