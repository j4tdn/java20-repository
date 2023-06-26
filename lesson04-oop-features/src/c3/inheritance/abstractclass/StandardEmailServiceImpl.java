package c3.inheritance.abstractclass;

public class StandardEmailServiceImpl extends EmailService{

	@Override
	void login() {
		System.out.println("StandardEmailServiceImpl --> login");
		
	}
	@Override
	void login2Steps() {
		System.out.println("StandardEmailServiceImpl --> login2Steps");
	}
}
