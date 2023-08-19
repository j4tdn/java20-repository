package string.mutable;

public class Ex01StringMutableDemo {
	public static void main(String[] args) {
		//immutable
		
		
		//mutable
		//StringBuilder/StringBuffer
		
		StringBuilder sb = new StringBuilder("Spring");
		System.out.println("sb: " + System.identityHashCode(sb));
		sb.append("")
				.append("Framework")
				.deleteCharAt(0)
				.setCharAt(0, 'P');
		System.out.println("sb: " + System.identityHashCode(sb));
	
		/*best practice
			khi bai toan dung + chuoi
			a + b --> dung string binh thuong
			khi co mang, danh sach nhieu phan tu muon + chuoi --> StringBuilder/StringBuffer
			han che tao ra o nho moi
		*/ 
	}
}
