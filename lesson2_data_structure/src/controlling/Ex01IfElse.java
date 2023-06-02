package controlling;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		//random một số nguyên ngẫu nhiên kiểm tra số đó phải là số lẻ không.
		Random rd = new Random();
		int n = rd.nextInt(5,18);
		System.out.println("n--> " +n);
		boolean isOdd = (n % 2 != 0);
		if (isOdd == true) {
			System.out.println(n+ " is an old number");
		}else {System.out.println(n+ " is an even number");
		}
		
		//toán tử 3 ngôi
		String text= isOdd ? n+ " is an old number"
				:n+ " is an even number";
		System.out.println(text);
	}
}
