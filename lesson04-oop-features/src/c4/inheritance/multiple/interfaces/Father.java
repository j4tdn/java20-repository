package c4.inheritance.multiple.interfaces;

public interface Father {
	int age = 20; //public static final -> hạn chế dùng
	default void cooking() {
		System.out.println("I father --> cooking bad");
	}
	default void running() {
		System.out.println("I father --> running...");
	}
}
