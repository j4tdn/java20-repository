package c4.inheritance.multiple.interfaces;

public interface Father {
	
	default void cooking() {
		System.out.println("I Father --> cooking bad");
	}
	
	private void running() {
		System.out.println("I Father --> running");
	}
	
}
