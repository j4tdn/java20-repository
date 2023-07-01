package c4.inheritance.mutiple.interfaces;

public interface Father {
	default void cooking() {
		System.out.println("I Father --> cooking bad");
	}
	
	default void running() {
		System.out.println("I Father --> running ...");
	}
}
