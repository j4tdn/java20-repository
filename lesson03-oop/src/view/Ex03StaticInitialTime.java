package view;

import bean.Car;

public class Ex03StaticInitialTime {

	static int staticVar1;

	int nonStaticVar1;

	public static void main(String[] args) {
		
		//how many objects will be created in the code below
		Integer a = 10;
		String b = new String("hello");
		float c = 10.2f;
		Double d = 7d;
		Car c1 = null;
		System.out.println(c1.getColor());
		Car c2 = new Car();
		Car c3 = c2;
		String f = "Wellcome";
	}

	static void staticMethod1() {
		staticVar1 = 5;
		// cannot use this in a static method
	}

	void nonStaticMethod1() {
		staticVar1 = 5;
		nonStaticVar1 = 5;

	}

}
