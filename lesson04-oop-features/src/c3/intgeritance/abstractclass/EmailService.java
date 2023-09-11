package c3.intgeritance.abstractclass;

public abstract class EmailService {
	
	abstract void login();
	
	void login2Steps() {
		System.out.println("EmailService --> login2Steps");
	}
	
	
}
