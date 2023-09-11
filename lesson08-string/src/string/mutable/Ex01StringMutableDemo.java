package string.mutable;

public class Ex01StringMutableDemo {

	public static void main(String[] args) {
		
		//imutable
		String s = "hello";
		System.out.println("s--> "+ System.identityHashCode(s));
		
		s = s + "word";
		System.out.println("s--> "+ System.identityHashCode(s));
		
		//mutable
		//StringBuilder/StringBuffer
		StringBuilder sb = new StringBuilder("Spring");
		
		System.out.println("sb( "+ sb +")--> "+ System.identityHashCode(s));
		
		sb.append(" ")
		  .append("Framword")
		  .deleteCharAt(0)
		  .setCharAt(0, 'P');
		System.out.println("sb( "+ sb +")--> "+ System.identityHashCode(s));
	
		//Best Practice
		//Khi bài toán dùng + chuỗi
		// Ví dụ: a + b --> Dùng string bình thương
		//Khi có mảng , danh sách nhiều phẩn tử muốn + chuỗi -->StringBuffer/StringBuider
		//để hạn chế tạo ra ô nhớ mới cho String
	
	}
}
