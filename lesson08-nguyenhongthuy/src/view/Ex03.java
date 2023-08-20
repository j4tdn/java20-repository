package view;

import java.util.Scanner;
/**
 * Viết chương trình nhập vào chuỗi TIẾNG VIỆT có dấu bất kì sau đó xuất ra kết quả là chuỗi
	không dấu.
	
	Input: 	Em có yêu anh không để anh biết còn chờ
			Em xin lỗi em đã có thái độ không đúng với anh
	
	Output: Em co yeu anh khong de anh biet con cho
			Em xin loi em da co thai do khong dung voi anh
 */
public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String input = sc.nextLine();
		System.out.println("input --> " + input);
		
		String output = convertString(input);
		System.out.println("output --> " + output);
		sc.close();
	}
	
	private static String convertString(String input) {
		String str1 = "àảãáạăằẳẵắặâầẩẫấậèẻẽéẹêềểễếệìỉĩíịòỏõóọôồổỗốộơờởỡớợùủũúụưừửữứựỳỷỹýỵđ";
		String str2 = "aaaaaaaaaaaaaaaaaeeeeeeeeeeeiiiiiooooooooooooooooouuuuuuuuuuuyyyyyd";
		
		String output = "";
		for(char c : input.toCharArray()) {
			if(str1.contains(String.valueOf(c))) {
				c = str2.charAt(str1.indexOf(c));
			}
			output += c;
		}
		return output;
	}
}
