package b.polymorphism.method;

public class Ex02OverridingDemo {
	public static void main(String[] args) {
		Ex02Parent p1 = new Ex02Parent();
		System.out.println("Digit: " + p1.digit);
		System.out.println("Text: " + p1.text);
		p1.log();
		
		System.out.println("============");
		
		Ex02Child c1 = new Ex02Child();
		System.out.println("Digit: " + c1.digit);
		System.out.println("Text: " + c1.text);
		c1.log();
		
		System.out.println("============");
		
		Ex02Parent pc1 = new Ex02Child();
		System.out.println("Digit: " + pc1.digit);
		System.out.println("Text: " + pc1.text);
		pc1.log();
	}
}
