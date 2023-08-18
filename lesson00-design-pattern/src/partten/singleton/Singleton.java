package partten.singleton;
/*
 * Là class cho phép tạo ra duy nhất 1 đối tượng cho class đó
 * 
 */
public class Singleton {
	//đối tượng duy nhất
	private static Singleton INSTANCE =null;
	private int value;
	private Singleton() {
		
	}
	public static Singleton getInstance()
	{
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
