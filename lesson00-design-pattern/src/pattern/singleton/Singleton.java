package pattern.singleton;

public class Singleton {
	//INSTANCE is unique object of Singeton class
	private static Singleton INSTANCE;
	private int value;
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
