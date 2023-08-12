package pattern.singleton;

public class test {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println("S1 hash --> " + System.identityHashCode(s1));
		System.out.println("S1 hash --> " + System.identityHashCode(s2));
	}
}
