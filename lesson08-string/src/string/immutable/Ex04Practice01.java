package string.immutable;

public class Ex04Practice01 {
	public static void main(String[] args) {
		String s = "  welcome  to  String  lesson ";
		String s1 = "12.8.2023";
		System.out.println("chieu dai s: " + s.length());
		
		System.out.println("noi chuoi s1 vao s: " + (s + " " + s1));
		System.out.println("noi chuoi s1 vao s: " + s.concat(" ").concat(s1));
		System.out.println("noi chuoi s1 vao s: " + String.join(" ", s,s1));
		
		System.out.println("lay ki tu thu 3: " + s.charAt(3));
		
		System.out.println("\n duyet tung ky tu trong chuoi: ");
		for(int i = 0; i< s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println();
		for(char letter : s.toCharArray()) {
			System.out.print(letter + " ");
		}
		System.out.println();
		System.out.println("duyet tung khoang trang trong chuoi s: ");
		
		//cat khoang trang thua 2 dau 
		s = s.trim().replaceAll("\\s+", " ");
		System.out.println("s preced: " + s);
		String word = "";
		int start = 0;
		for(int i = 0; i< s.length(); i++) {
			char letter = s.charAt(i);
			if(letter == ' ') {
				word = s.substring(start, i);
				System.out.println(word);
				start = i + 1;
			}else if(i == s.length() - 1) {
				word = s.substring(start, s.length());
				System.out.println(word);
			}
		}
		System.out.println();
		String[] tokens = s.trim().split("\\s{1,}");
		for(String token: tokens) {
			System.out.print("token: " + token + " ");
		}
		
		System.out.println("vi tri dau tien xuat hien ki tu e: " + s.indexOf('e'));
		System.out.println("vi tri dau tien xuat hien ki tu e: " + s.lastIndexOf('e'));
		
		String bookName = "SGK-123";
		System.out.println("kiem tra chuoi s1 co phai la bat dau khong: ");
		System.out.println(bookName.startsWith("STK"));
		System.out.println(bookName.startsWith("SGK"));
		System.out.println(bookName.endsWith("123"));
		System.out.println("kiem tra su ton tai: " + bookName.contains("SGK"));
	}
}
