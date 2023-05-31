package controlling;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		// Random 1 số nguyên ngẫu nhiên [5,18), kiểm tra
		// số đó vó phải là số lẻ không
		Random rd = new Random();
		int n = 5 + rd.nextInt(18 - 5);
		
		System.out.println("n --> " + n);
		boolean isOdd = (n % 2 != 0);
		
		// if (expression) {
		//	  do something
		// } // expression : boolean
		// if (expression == true) {} <==> if (expression) {}		
		// if (expression == false) {} <==> if (!expression) {}		
		if (isOdd) {
			System.out.println(n + " is an odd number!");
		} else {
			System.out.println(n + " is an even number!");			
		}
		
		String text;
		// Khi nào dùng toán tử 3 ngôi
		// khi biểu thức thực hiện trong if/elsse ngắn (thường là 1 dòng)
		text = isOdd ? n + " is an odd number!"
					 : n + " is an even number!";
		System.out.println("text --> " + text);
	}
}
