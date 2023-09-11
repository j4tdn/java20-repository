package c3.intgeritance.abstractclass;

public class BussinessEmailServiceImpl extends EmailService {
	
	@Override
	void login() {
		System.out.println("BussinessEmailServiceImpl --> login");
		
	}
	@Override
	void login2Steps() {
		System.out.println("BussinessEmailServiceImpl --> login2tep");
	}
	
	
}
