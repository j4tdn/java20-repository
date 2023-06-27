package b.polymorphism.method;

public class Ex02OverringDemo {
	public static void main(String[] args) {
		Ex02Parent p1 = new Ex02Parent();
	    System.out.println("p1 digit --> "+ p1.digit);
	    System.out.println("p1 text --> " + p1.text);
	    p1.log();
	    
	    Ex02Child c1 = new Ex02Child();
	    System.out.println("p1 digit --> "+ c1.digit);
	    System.out.println("p1 text --> " + c1.text);
	    c1.log();
	    //pc1 is Ex02Parent at compile
	    // pc1 is Ex02Child at runtime
	    Ex02Parent pc1 = new Ex02Child();
	    System.out.println("p1 digit --> "+ pc1.digit);
	    System.out.println("p1 text --> " + pc1.text);
	    pc1.log();
	}
}
