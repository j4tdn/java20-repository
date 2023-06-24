package c3.inheritance.abstracclass;

public abstract class EmailService {
	
	abstract void login();
	
	void login2Steps() {
		System.out.println("EmailService --> login2Steps");
	}
}
