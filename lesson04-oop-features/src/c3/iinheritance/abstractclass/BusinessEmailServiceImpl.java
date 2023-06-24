package c3.iinheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService{

	@Override
	void login() {
		System.out.println("BusinessEmailServiceImpl--> BusinessEmailService2Step");
	}
	
	@Override
	void login2Step() {
		System.out.println("BusinessEmailServiceImpl--> login2Step");
	}
		
}
