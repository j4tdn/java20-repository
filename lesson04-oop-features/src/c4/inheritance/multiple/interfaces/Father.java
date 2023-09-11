package c4.inheritance.multiple.interfaces;

public interface Father { 
	
	default void cooking() {
		System.out.println("Father--> bad cooking");
	}
	default void running() {
	System.out.println("Father--> running...");	
	}
	
}
