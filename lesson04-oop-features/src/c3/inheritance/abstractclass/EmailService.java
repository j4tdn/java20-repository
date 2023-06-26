package c3.inheritance.abstractclass;

public abstract class EmailService {
	
	abstract void login();
	
	void login2Steps() {
		System.out.println("EmailService --> login2Steps");
	}
	
}
