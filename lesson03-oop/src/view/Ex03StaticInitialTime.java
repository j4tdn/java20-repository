package view;

public class Ex03StaticInitialTime {
	
	static int staticVar1;
	
	int nonStaticVar1;
	
	public static void main(String[] args) {
		
	}
	static void staticMethod1() {
		staticVar1 = 5;
		//can not use this in a static method
	}
	 void nonStaticMethod1() {
		 nonStaticVar1 = 5;
	 }
}
