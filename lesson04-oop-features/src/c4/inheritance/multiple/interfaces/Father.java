package c4.inheritance.multiple.interfaces;

public interface Father {
	
	final int age = 10;
	
	default void cooking() {
		System.out.println("I Father --> cooking bad");
	}
	
	default void running() {
		System.out.println("I Father --> running ...");
	}
}
