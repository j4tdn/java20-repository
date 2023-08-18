package view;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
	Viết chương trình nhập vào chuỗi TIẾNG VIỆT có dấu bất kì sau đó xuất ra kết quả 
	là chuỗi không dấu.
	Input:  Em có yêu anh không anh để anh biết còn chờ
		    Em xin lỗi em đã có thái độ không đúng với anh
	Output: Em co yeu anh khong de anh biet con cho
		    Em xin loi em da co thai do khong dung voi anh	
 */

public class Ex03 {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("nhập chuỗi: ");
		String input = ip.nextLine();
		String nfd = Normalizer.normalize(input, Form.NFD);
		
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		String output = pattern.matcher(nfd).replaceAll("");
		System.out.println(output);
	}
}
