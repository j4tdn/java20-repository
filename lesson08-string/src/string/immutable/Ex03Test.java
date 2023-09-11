package string.immutable;

public class Ex03Test {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "he" + "llo";
		String s3 = new String("hello");
		String s4 = "welcome";
		String s5 = " to";
		String s6 = new String("welcome");
		String s7 = "welcome to";
		
		
		System.out.println(s1.equals(s2));//T
		System.out.println(s1 == s2);//T
		
		System.out.println("\n============\n");
		
		System.out.println(s1.equals(s3));//T
		System.out.println(s1 == s3);//F
		
		System.out.println("\n============\n");
		
		System.out.println((s4+s5).equals(s7));//T
		System.out.println((s4+s5) == s7);//F
		
		System.out.println("\n============\n");
		
		System.out.println(s4.equals(s6));//T
		System.out.println(s4 == s6);//F
	}
}
