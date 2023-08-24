package string.mutable;

public class Ex01StringMutableDemo {
	
	public static void main(String[] args) {
		
		// immutable
		String s = "hello";
		System.out.println("s --> " + System.identityHashCode(s));
		s = s + " world";
		System.out.println("s --> " + System.identityHashCode(s));
		
		// mutable
		StringBuilder sb = new StringBuilder("Spring");
		System.out.println("sb(" + sb + ") --> " + System.identityHashCode(sb));
		sb.append(" ").append("Framework");
		System.out.println("sb(" + sb + ") --> " + System.identityHashCode(sb));
		
		// Best Practice
		
		
	}

}
