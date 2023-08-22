package view;

public class Ex03StaticInitialTime {
		// timing: loading static --> non-static
		
		static int staticVar1;
		
		int nonStaticVar1;
		int nonStaticVar2;
		
		public static void main(String[] args) {
			// how many objects will be created in the code below
			Integer a = 10; // H1
			String b = new String("hello"); // H2
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
