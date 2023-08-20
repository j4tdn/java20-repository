package pattern.singleton;

/**
 * Singleton class: Là class chỉ cho phép tạo ra duy nhất
 * 1 đối tượng trong class đó
 *
 */
public class Singleton {
	
	// INSTANCE is unique object of Singleton class
	private static Singleton INSTANCE = null;
	
	private int value;
	
	private Singleton() {	
	}
	
	public static Singleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
