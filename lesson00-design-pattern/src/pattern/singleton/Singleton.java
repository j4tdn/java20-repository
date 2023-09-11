package pattern.singleton;
/**
 * Singleton class: là class chỉ cho phép tọa ra 
 * duy nhất 1 đối tượng trong class đó
 * */
public class Singleton {
	
	private static Singleton INSTANCE =null;
	
	private int value;  // current time
	
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(INSTANCE == null) {
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
