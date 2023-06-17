package view;

import bean.Car;

public class Ex03StaticInitialTime {
	// timing: loading static before non-static
	
	static int staticVar1;
	
	int nonStaticVar1;
	
	static void staticMethod1() {
		staticVar1 = 5;
		// nonStaticVar1 = 5;
		// cannot use "this" in a static method
	}
	
	void nonStaticMethod1() {
		staticVar1 = 5;
		nonStaticVar1 = 5;
	}
	
	public static void main(String[] args) {
		// How many objects(heap memory cell) will be created in the code below
		Integer a = 10; // H1
		String b = new String("Hello"); // H2
		float c = 10.2f;
		Double d = 7d; // H3
		Car c1 = null;
		System.out.println(c1.getColor()); // Null pointer exception
		Car c2 = new Car(); // H4
		Car c3 = c2;
		String f = "welcome"; // H5
	}
}
