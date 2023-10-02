package view;

import bean.Car;

public class Ex03StaticInitialTime {

	static int staticVar1;

	int nonStaticVar1;

	public static void main(String[] args) {
		// how many objects(heap memory cell) will be created in the code below
		Integer a = 10; // H1
		String b = new String("hello"); // H2
		float c = 10.2f;
		Double d = 7d; // H3
		Car c1 = null;
		System.out.println(c1.getColor()); // NPE
		Car c2 = new Car(); // H4
		Car c3 = c2;
		String f = "welcome"; // H5
	}

	static void staticMethod() {
		staticVar1 = 5;
		// nonStaticVar1 = 5; --> error --> vì static method được gọi thông qua class
		// biến nonStatic là thông qua object --> nên nó không được xác định cụ thể
		// cannot use this in a static method
	}

	void nonStaticMethod() {
		staticVar1 = 5;
		nonStaticVar1 = 5;
	}
}
