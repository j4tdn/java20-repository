package c4.inheritance.multiple.interfaces;

public interface Mother {
	
	int age = 10;
	
	default void cooking() {
		System.out.println("I Mother --> cooking good");
	}
	
//	default String cooking(boolean isChef) {
//		return "I Mother --> cooking good";
//	}
	
	default void playBadminton() {
		System.out.println("I Mother --> play badminton");
	}
}