package polymorphism.method;

public class Ex02Parent {
	int digit = 22;
	
	
	String text = "Ex02 parent text";
	
	void log() {
		System.out.println("Ex02 parent log");
	}
	
	void log_test() {
		System.out.println("Đây là rap việt");
	}

	@Override
	public String toString() {
		return "Ex02Parent [digit=" + digit + ", text=" + text + "]";
	}

}
