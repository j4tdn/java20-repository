package c4.inheritance.multiple.classs;

public class MultipleClassesInheritanceDemo {
	public static void main(String[] args) {
		// Father: Cooking, running
		// Mother: Cooking, playBadminton
		// Child extends Father
		// Class extends class --> 'not required to override'
		// Solving: When multiple super classes have the same declaration method
		// --> require to override
		Child c1 = new Child();
		c1.cooking();
		c1.running();
	}
}
