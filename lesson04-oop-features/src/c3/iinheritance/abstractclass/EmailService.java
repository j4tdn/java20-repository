package c3.iinheritance.abstractclass;


public abstract class EmailService {
	
	abstract void login();	
	
	void login2Step() {
		System.out.println("EmailService --> login2Stép");
	}
}
