package pattern.singleton;

public class Singleton {
	
	private static Singleton INSTANCE = null;
	
	private int value;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if (INSTANCE == null)
			INSTANCE = new Singleton();
		return INSTANCE;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
}
