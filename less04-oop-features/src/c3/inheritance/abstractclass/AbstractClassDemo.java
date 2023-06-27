package c3.inheritance.abstractclass;

public class AbstractClassDemo {
	
	public static void main(String[] args) {
		EmailService es1 = new EmailService() {
			
			@Override
			void login() {
				System.out.println("ES1 --> login");
			}
		};
		es1.login();
	}
}
