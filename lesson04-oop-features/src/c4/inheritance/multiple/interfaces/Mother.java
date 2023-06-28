package c4.inheritance.multiple.interfaces;

public interface Mother {
	default void cooking() {
		System.out.println("I Mother --> cooking good");
	}

	default void playBadminton() {
		System.out.println("I Mother --> play badminton...");
	}
}
