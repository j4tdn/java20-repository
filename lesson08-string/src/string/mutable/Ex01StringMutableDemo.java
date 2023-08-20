package string.mutable;

public class Ex01StringMutableDemo {
	
	public static void main(String[] args) {
		
		// immutable
		String s = "hello";
		System.out.println("s --> " + System.identityHashCode(s));
		
		s = s + " world";
		System.out.println("s --> " + System.identityHashCode(s));
		
		// mutable
		// StringBuilder/StringBuffer
		
		StringBuilder sb = new StringBuilder("Spring");
		
		System.out.println("sb(" + sb + ") --> " + System.identityHashCode(sb));
		
		sb.append(" ")
		  .append("Framework")
		  .deleteCharAt(0)
		  .setCharAt(0, 'P');
		System.out.println("sb(" + sb + ") --> " + System.identityHashCode(sb));
		
		/*
		 
		 Best Practice
		 
		 Khi bài toán dùng + chuỗi
		 Ví dụ: a + b --> Dùng string bình thường

		 Khi có mảng, danh sách nhiều phần tử muốn + chuỗi --> StringBuider/StringBuffer
		 để hạn chế tạo ra ô nhớ mới cho String
		 
		 */
	}
}