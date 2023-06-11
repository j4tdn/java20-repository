package view;

public class Ex03StaticInitialTime {
	static int staticVar1;
	static int staticVar2;
	
	int nonStaticVar1;
	
	public static void main(String[] args) {
		// how many object (1 object : 1 ô nhớ trên HEAP)
	}
	
	static void staticMethod() {
		staticVar1 = 5;
		// nonStaticVar1 = 5;
		// cannot use this in a static method
	}
	
	void nonStaticMethod1() {
		staticVar1 = 5;
		nonStaticVar1 = 5;
	}
}
