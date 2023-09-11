package b.polymorphism.method;

public class Ex02Child extends EX02Parent {
	int digit =2222 ;
	String text = "EX02 Child text";
	void log() {
		System.out.println("EX02 child log");
	}
	@Override
	public String toString() {
		return "Ex02Child [digit=" + digit + ", text=" + text + "]";
	}
}
