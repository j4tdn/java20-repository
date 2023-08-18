package string.immutable;

import java.util.Arrays;
import java.util.Iterator;

public class Ex04Pratice01 {

//	• Tính chiều dài của chuỗi s
//	• Nối chuỗi s1 vào chuỗi s
//	• Lấy một ký tự tại vị trí index(3) trong chuỗi s
//	• Duyệt từng phần tử trong chuỗi
//	• Tìm vị trí – chỉ số xuất hiện đầu tiên, cuối cùng của kí tự “a” trong chuỗi s
	public static void main(String[] args) {
		String s = "      welcome       to     string     lesson   ";
		System.out.println("S length --> " + s.length());
		String s1 = "12.08.2023";

		System.out.println("Nối s1 vào s --> " + s + " " + s1);

		System.out.println("Nối s1 vào s --> " + s.concat(" ").concat(s1));

		System.out.println("Nối s1 vào s --> " + String.join(" ", s, s1));

		System.out.println("Lấy một ký tự tại vị trí index(3) trong chuỗi s --> " + s.charAt(3));
	
		// Duyệt từng kí tự trong chuỗi
		System.out.println("\n ***Duyệt từng phần tử trong chuỗi*** \n");
//		for(int i = 0 ; i < s.length();i++) {
//			System.out.println(s.charAt(i));
//		}
//		
//		for(char letter : s.toCharArray()) {
//			System.out.println(letter);
//		}
		
		// Duyệt từng từ trong chuỗi, các từ cách nhau bởi khoảng trắng
		System.out.println("*** Duyệt từng từ trong chuỗ ***");
		
		// Cắt khoảng trắng thừa ở 2 đầu
		s = s.trim().replaceAll("\\s+", " ");
		int start = 0;
		String word = "";
		System.out.println("prepared --> " + s);
		for(int i = 0 ; i < s.length();i++){
			char letter = s.charAt(i);
			if(letter == ' ' || i == s.length() - 1 ) {
				if(i == s.length() - 1) i++;
				word = s.substring(start, i);
				System.out.println(word);
				start = i + 1;
			}
		}
		
		String[] token = s.trim().split("\\s+"); //{1,}
		System.out.println("Tokens  --> " + String.join("-", token));
		
		System.out.println("Tìm vị trí xuất hiện đầu tiên, đầu tiên --> " + s.indexOf("e"));
		System.out.println("Tìm vị trí xuất hiện đầu tiên, cuối cùng --> " + s.lastIndexOf("e"));
		
		String bookName = "SGK-123";
		System.out.println("Kiểm tra chuỗi bắt đầu bằng ... ? --> " + bookName.startsWith("STK"));
		System.out.println("Kiểm tra chuỗi bắt đầu bằng ... ? --> " + bookName.startsWith("SGK"));
		System.out.println("Kiểm tra chuỗi có kết thúc bằng ... ? --> " + bookName.endsWith("123"));
		System.out.println("Kiểm tra chuỗi có kết thúc bằng ... ? --> " + bookName.contains("23"));
		
	}
}
