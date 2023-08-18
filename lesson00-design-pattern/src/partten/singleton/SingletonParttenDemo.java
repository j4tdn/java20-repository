package partten.singleton;

public class SingletonParttenDemo {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		s1.setValue(567);
		System.out.println("s1 value --> "+s1.getValue());
		System.out.println("s1 hash --> "+System.identityHashCode(s1));
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s2 value --> "+s2.getValue());
		System.out.println("s2 hash --> "+System.identityHashCode(s2));
		//calendar : code style giống Singleton
	}
}
