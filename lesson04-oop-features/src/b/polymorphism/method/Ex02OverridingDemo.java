package b.polymorphism.method;

public class Ex02OverridingDemo {
	public static void main(String[] args) {
		Ex02Parent p1 = new Ex02Parent();
		System.out.println("p1 digit --> " + p1.digit);
		System.out.println("p1 text --> " + p1.text);
		p1.log();
		
		System.out.println("\n====================\n");
		
		Ex02Child c1 = new Ex02Child();
		System.out.println("c1 digit --> " + c1.digit);
		System.out.println("c1 text --> " + c1.text);
		c1.log();
		
		System.out.println("\n====================\n");
		Ex02Parent cp1 = new Ex02Child();
		System.out.println("cp1 digit --> " + cp1.digit);
		System.out.println("cp2 digit --> " + cp1.text);
		cp1.log();
	}
}
