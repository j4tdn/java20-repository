package c4.inheritance.multiple.interfaces;

public interface Father {

	int age = 5;
	
	default void cooking() {
		System.out.println("I Father --> cooking bad");
	}

	default void running() {
		System.out.println(" I Father --> running...");
	}
}
