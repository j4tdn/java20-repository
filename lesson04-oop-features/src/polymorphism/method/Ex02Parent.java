package polymorphism.method;

public class Ex02Parent {
	int digit = 22;
	String text = "Ex02 parent text";
	
	void log() {
		System.out.println("Ex02 parent log");
	}

	@Override
	public String toString() {
		return "Ex02Parent [digit=" + digit + ", text=" + text + "]";
	}
	
}
