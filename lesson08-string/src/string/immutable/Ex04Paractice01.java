package string.immutable;

import java.lang.reflect.Array;

public class Ex04Paractice01 {

	public static void main(String[] args) {
		String s = "       welcome to string lesson  ";
		String s1 = "12.08.2023";
		System.out.println("Tinhs chieu dai chuoi S: "+s.length());
		
		System.out.println("Noi chuoi s1 vao chuoi s --> " + (s + "" + s1));

		
		System.out.println("Noi chuoi s1 vao chuoi s --> " + (s.concat(" ").concat(s1)));

		System.out.println("Noi chuoi s1 vao chuoi s --> " + String.join(" ", s, s1));
		
		//index: zero base
		System.out.println("Lấy kí tự tại vị trí index(3) trong chuỗi s --> " + s.charAt(3));
	
		System.out.println("\n*** Duyệt từng kí tự trong chuỗi ***");
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		for(char letter: s.toCharArray()) {
			System.out.println(letter);
		}
		
		System.out.println("Duyệt từng kí tự trong chuỗi , các từ cách nhau bởi 1 hoặc nhiều khoảng trắng");
		//cắt khoảng trắng thừa 2 đầu
		
		s = s.trim().replaceAll("\\s+", " ");
		
		System.out.println("s precees--> " + s);
		
		int start = 0;
		for(int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if(letter == ' ') {
				String word = s.substring(start, i);
				System.out.println(word);
				start = i+1;
			} else if (i == s.length() -1) {
				String word = s.substring(start, s.length());
				System.out.println(word);
			}
			
		}
		
		String[] tokens = s.trim().split("\\s+");
		System.out.println("token --> " + String.join("-", tokens));
		
		System.out.println("Tìm vị trí xuất hiện đầu tiên , của kí tự 'e' trong chuỗi s--> " + s.indexOf("e"));
		System.out.println("Tìm vị trí xuất hiện cuối cùng , của kí tự 'e' trong chuỗi s--> " + s.lastIndexOf("e"));
	
		
		String bookName = "SGK-123";
		System.out.println("Kiểm tra chuỗi có bắt đầu bằng ..? --> " +bookName.startsWith("SGK"));
		System.out.println("Kiểm tra chuỗi có kết thúc bằng ..? --> " +bookName.endsWith("123"));
		System.out.println("Kiểm tra sự tồn tại trong chuỗi ..? --> " +bookName.contains("123"));
	}
}
