package string.immutable;

public class Ex01StringImmutableDemo {
	public static void main(String[] args) {
		String so1 = new String("hello");
		String so2 = new String("nice");
		String so3 = new String("hello");
		System.out.println(so1 + " " + hash(so1));
		System.out.println(so2 + " " + hash(so2));
		System.out.println(so3 + " " + hash(so3));
		
		System.out.println("\n===================\n");
		
		//String: literal 
		//storage: heap - constant Pool
		String s1 = "welcome";
		String s2 = "student";
		String s3 = "welcome";
		
		System.out.println(s1 + " " + hash(s1));
		System.out.println(s2 + " " + hash(s2));
		System.out.println(s3 + " " + hash(s3));
		
		
		
		//immutable
		//should use String literal
	}
	private static int hash(String string) {
		return System.identityHashCode(string);
	}
}
