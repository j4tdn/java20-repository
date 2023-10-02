package pattern.singleton;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		System.out.println("s1 value --> " + s1.getValue());
		System.out.println("s1 hash --> " + System.identityHashCode(s1));
		
		System.out.println("\n-------------------------\n");
		
		Singleton s2 = Singleton.getInstance();
		s2.setValue(10);
		System.out.println("s1 value --> " + s2.getValue());
		System.out.println("s1 hash --> " + System.identityHashCode(s2));
		
		//Calendar code style giống Singleton
	}
}
