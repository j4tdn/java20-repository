package string.immutable;

public class Ex03Test {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "he" + "llo";
		String s3 = new String("hello");
		String s4 = "welcome";
		String s5 = "to";
		String s6 = new String("welcome");
		String s7 = "welcome to";
		
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1 == s2); // true
		
		System.out.println();
		
		System.out.println(s1.equals(s3)); // true
		System.out.println(s1 == s3); // false
		
		System.out.println();

		System.out.println((s4 + s5).equals(s7)); // false
		System.out.println((s4 + s5) == s7); // false

		System.out.println();
		
		System.out.println(s4.equals(s6)); // true
		System.out.println(s4 == s6); // false
	}
}
