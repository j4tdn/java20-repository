package b.polymorphism.method;

public class EX02Parent {
	int digit =22 ;
	String text = "EX02 Parent text";
	void log() {
		System.out.println("EX02 parent log");
	}
	@Override
	public String toString() {
		return "EX02Parent [digit=" + digit + ", text=" + text + "]";
	}
	
}
