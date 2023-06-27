package b.polymorphism.method;

public class Ex02Child extends Ex02Parent{

	int digit = 2222;
	
	String text = "Ex02 child text";
	
	void log() {
		System.out.println("Ex01 Child log");
	}
	@Override
	public String toString() {
		return "Ex02Child [digit=" + digit + ", text=" + text + "]";
	}
}
