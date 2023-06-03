package controlling;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		// Random 1 số nguyên ngẫu nhiên(5, 18), kiểm tra
		// số đó có phải là số lẻ không
		// if (expression) {} expression: boolean
		// if (expression == true) {} <==> if (expression) {}
		// if (expression == false) {} <==> if (!expression) {}
		
		Random rd = new Random();
		int n = rd.nextInt(5, 18);
		
		System.out.println("n --> " + n);
		boolean isOdd = (n % 2 != 0);
		
		String text = "";
		if (isOdd) {
			text = n + " is an odd number !!!";
		} else {
			text = n + " is an even number !!!";;
		}
		System.out.println("text1 --> " + text);
		
		// Khi nào dùng toán tử 3 ngôi
		// Khi biểu thức thực hiện trong if/else ngắn(thường là 1 dòng)
		text = isOdd ? n + " is an odd number !!!" 
			         : n + " is an even number !!!";
		System.out.println("text2 --> " + text);
	}
}
