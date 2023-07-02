package c4.inheritance.multiple.classs;

public class MultipleClassesInheritanceDemo {
	public static void main(String[] args) {
		
		// Father: cooking, running
		// Mother: cooking, playBadminton
		
		// Child extends Father, Mother
		
		// class extends classs --> 'not required to override'
		
		Child c1 = new Child();
		c1.cooking();
		c1.running();
	}
}
