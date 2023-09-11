package c4.inheritance.multiple.interfaces;

public interface Mother {
	default void cooking() {
		System.out.println("Mother-->cooking-->good ");
	}
	default void playBadminton() {
		System.out.println("Mother--> playBadminton");
	}
}
