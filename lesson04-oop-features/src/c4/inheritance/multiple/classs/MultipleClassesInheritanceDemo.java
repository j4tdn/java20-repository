package c4.inheritance.multiple.classs;

public class MultipleClassesInheritanceDemo {
	public static void main(String[] args) {
		
		//class extends class --> not require to override 
		//solving: when multiple super classes have the same declaration method
		//--> require to override
		
		//java does not support multiple extends 
		Child c1 = new Child();
		c1.cooking();
		c1.running();
	}
}
