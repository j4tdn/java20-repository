package c4.inheritance.multiple.classs;

public class MultipleClassesInheritanceDemo {
	public static void main(String[] args) {
		// Father: cooking, running
		// Mother: cooking, playBadminton
		
		// Child extends Father, Mother
		// class extends class --> 'not required to override'
		// solving: when multiple super classes have the same declaration
		//
		
		Child c1 = new Child();
		c1.cooking();
		c1.running();
	}
}
