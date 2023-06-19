package polymorphism.method;

public class Ex02Child extends Ex02Parent {
	int digit = 2222;

	String text = "Ex02 Ex02Child text";

	void log() {
		System.out.println("Ex02 Ex02Child log");
	}

	@Override
	public String toString() {
		return "Ex02Child [digit=" + digit + ", text=" + text + "]";
	}
}
