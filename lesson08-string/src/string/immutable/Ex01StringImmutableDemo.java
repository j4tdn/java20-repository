package string.immutable;

public class Ex01StringImmutableDemo {

	public static void main(String[] args) {

		// String object
		// Storage: HEAP
		String so1 = new String("hello");
		String so2 = new String("nice");
		String so3 = new String("hello");

		System.out.println(so1 + " --> " + hash(so1));
		System.out.println(so2 + " --> " + hash(so2));
		System.out.println(so3 + " --> " + hash(so3));

		System.out.println("\n===========================\n");

		// String literak
		// Storage: HEAP -> Constant Pool
		String sl1 = "welcome";
		String sl2 = "student";
		String sl3 = "welcome";
		String sl4 = "welcome";
		
		System.out.println("sl3 " + sl3 + " --> " + hash(sl3));
		
		sl3 = "class";
		
		System.out.println("sl1 " + sl1 + " --> " + hash(sl1));
		System.out.println("sl2 " + sl2 + " --> " + hash(sl2));
		System.out.println("sl3 " + sl3 + " --> " + hash(sl3));
		System.out.println("sl4 " + sl4 + " --> " + hash(sl4));
		
		// Should use: LITERAL

	}

	private static int hash(String so1) {
		return System.identityHashCode(so1);
	}

}
