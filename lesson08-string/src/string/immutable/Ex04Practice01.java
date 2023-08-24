package string.immutable;

public class Ex04Practice01 {
	
	public static void main(String[] args) {
		String s = "  welcome to string  lesson  ";
		String s1 = "12.08.2023";
		
		// Tính chiều dài của chuỗi s
		System.out.println("Chiều dài của chuỗi s --> " + s.length());
		
		// Nối chuỗi s1 vào chuỗi s
		System.out.println("Nối chuỗi s1 vào chuỗi s --> " + (s + " " + s1));           // Cách 1
		System.out.println("Nối chuỗi s1 vào chuỗi s --> " + s.concat(" ").concat(s1)); // Cách 2
		System.out.println("Nối chuỗi s1 vào chuỗi s --> " + String.join(" ", s, s1)); // Cách 3
		
		// Lấy 1 ký tự tại vị trí index(3) trong chuỗi s
		System.out.println("Lấy 1 ký tự tại vị trí index = 3 trong chuỗi s --> " + s.charAt(3));
		
		// Duyệt từng ký tự trong chuỗi 
		System.out.println("\n*** Duyệt từng ký tự trong chuỗi ***");
		// Cách 1
		for (int i = 0; i < s.length(); i++) 
			System.out.println(s.charAt(i));
		// Cách 2
		for (char letter : s.toCharArray())
			System.out.println(letter);
		
		// Duyệt từng từ trong chuỗi, các từ cách nhau bởi 1 hoặc nhiều khoảng trắng 
		s = s.trim().replaceAll("\\s+", " ");
		System.out.println("s preceed --> " + s);
		int start = 0;
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (letter == ' ') {
				String word = s.substring(start, i);
				System.out.println(word);
				start = i + 1;
			} else if (i == s.length() - 1) {
				String word = s.substring(start, s.length());
				System.out.println(word);
			}
		}
		
		String[] tokens = s.split("[\\s+]");
		System.out.println(String.join("-", tokens));
		
		// Tìm vị trí - chỉ số xuất hiện đầu tiên, cuối cùng của ký tự 'a' trong chuỗi s
		System.out.println("Chỉ số xuất hiện đầu tiên của ký tự 'e' trong chuỗi s: " + s.indexOf("e"));
		System.out.println("Chỉ số xuất hiện cuối cùng của ký tự 'e' trong chuỗi s: " + s.lastIndexOf("e"));
		
		// Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không
		String bookName = "SGK-123";
	}

}
