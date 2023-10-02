package controlling;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		//random một số nguyên ngẫu nhiên, kiểm tra số đó có phải là số lẻ không
		
		Random rd = new Random();
		
		int n = rd.nextInt(5, 18);
		
		System.out.println("n --> " + n);
		boolean isOdd = (n%2 != 0);
		
		//if(expression)
		//if(!expression)
		//if(expression == true)
		//if(isOdd)
			//System.out.println(n + " is an odd number !!!");
		//else
			//System.out.println(n + " is an even number !!!");
		
		
		//Khi nào dùng toán tử 3 ngôi --> Khi biểu thức thực hiện trong if/else ngắn (Thường là 1 dòng)
		String text = isOdd ? n + " is an odd number !!!" : n + " is an even number !!!";
		
		System.out.println(text);
		
	}
}
