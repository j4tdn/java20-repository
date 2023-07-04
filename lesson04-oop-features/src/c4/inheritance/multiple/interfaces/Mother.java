package c4.inheritance.multiple.interfaces;

public interface Mother {
	void cooking();
	
	default void playBadminton() {
		System.out.println();
	}
}
