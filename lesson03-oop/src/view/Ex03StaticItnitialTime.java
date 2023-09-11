package view;

public class Ex03StaticItnitialTime {
	
	//timming: loading static --> non-static
	
	
	static int staticVar1;
	static int staticVar2;
		int nonStaticVar1;
		int nonStaticVar2;
	public static void main(String[] args) {
		//how many object will be create in the code below
		
		
	}
	static void staticMetod1() {
		staticVar1 = 5;
		//cannot use this in a static method
	}
	 void nonStaticMetod1() {
		 staticVar1 = 5;
		 nonStaticVar1=5;
	}
}
