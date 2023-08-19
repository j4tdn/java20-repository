package pattern.singleton;

/*
 *  singleton: la class chi cho phep tao ra 1 doi tuong trong class do
 */
public class Singleton {
	//instance is unique object of Singleton class
	private static Singleton instance = null;
	private int value;
	
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
