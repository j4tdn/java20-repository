package view;


public class Ex03StaticInitialTime {
	
	//timing: loading static --> nonStatic ;
	static int staticvar1;
	int var1;
	
	public static void main(String[] args) {
		//how many objects(heap memory cell) will be created in the code below 
		
		//Car c1 = null; // ko tao doi tuong tren heap nhá :D
	
	}
	
	static void staticMethod1() {
		staticvar1 = 5;
		//var1 = 5;
		
		//cannot use this in a static method
	}
	
	void nonStaticMethod() {
		staticvar1 = 4;
		var1 = 5;
	}
}
