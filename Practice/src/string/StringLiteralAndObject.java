package string;

public class StringLiteralAndObject {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello1";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(2));
		System.out.println(s1 == s2);
	}
}
