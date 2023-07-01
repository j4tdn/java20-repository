package c3.inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService {

	@Override
	void login() {
		System.out.println("BusinessEmailServiceImpl --> BusinessEmail");
	}
	
	@Override
	void login2Steps() {
		System.out.println("BusinessEmailServiceImpl --> login2Steps");
	}

}
