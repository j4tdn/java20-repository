package string.mutable;

public class Ex01StringMutabledemo {
	
	public static void main(String[] args) {
		
		// immutable
		String s = "hello";
		System.out.println("s --> " + System.identityHashCode(s));
		s = s + " world";	
		System.out.println("s --> " + System.identityHashCode(s));
		
		// mutable
		// StringBuilder / StringBuffer
		
		StringBuilder sb = new StringBuilder("Spring");
		System.out.println("sb(" + sb + ")--> " + System.identityHashCode(sb));
		sb.append(" ").append("Framework").deleteCharAt(0).setCharAt(0, 'P');
		System.out.println("sb(" + sb + ")--> "  + System.identityHashCode(sb));
		
		// best practice
		// khi bài toán dùng + chuỗi
		// a + b --> dùng normal string
		// khi có mảng, ds nhiều phần tử --> StringBuilder / StringBuffer
		// --> để hạn chế tạo ra ô nhớ mới
	}
}
