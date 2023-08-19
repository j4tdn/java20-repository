package pattern.singleton;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		s1.setValue(567);
		System.out.println("s1: " + s1.getValue());
		System.out.println("s1 hash: " + System.identityHashCode(s1));
		System.out.println("===================");
		
		Singleton s2 = Singleton.getInstance();
		System.out.println("s2: " + s2.getValue());
		System.out.println("s2 hash: " + System.identityHashCode(s2));
	}
}
