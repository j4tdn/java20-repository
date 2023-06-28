package c4.inheritance.multiple.interfaces;

public class MultipleInterfacesInheritanceDemo {
	public static void main(String[] args) {
		/*
		 * From JDK 1.8 --> Inteface method could have body part if method has key +
		 * default + static + private 1.9
		 * 
		 * with method has body --> not required to override in sub types if super
		 * interfaces have duplicate default method with different body
		 * Sub type needs to override default method
		 * --> Using body from I1, I2 or both, also itself
		 */

		// static type
		// dynamic type
		// design pattern --> strategy pattern
		
		Child c1 = new Child();
		c1.cooking();
		//c1.running();
		c1.playBadminton();
		c1.coding();
	}
}
