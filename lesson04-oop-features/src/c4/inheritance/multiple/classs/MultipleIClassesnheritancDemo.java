package c4.inheritance.multiple.classs;

public class MultipleIClassesnheritancDemo {
	public static void main(String[] args) {
		// Father: cooking, running
		// Mother: playBadminton
		
		// Child: extends Father, Mother
		
		// class extends class --> not required to override
		// solving: when multiple super class have declaration method
		// ---> require to override

		// java doer not support
		Child c1 = new Child();
		c1.cooking();
		c1.running();
	}
}
