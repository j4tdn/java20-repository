package controlling;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		//RanDom 1 số nguyên ngẫu nhiên kiểm tra xem có phải là số lẻ hay không
		Random rd = new Random();
		int n = rd.nextInt(5,18);
		System.out.println("n-->" + n);
		boolean isOdd = (n % 2 != 0);
		
		String text = "";
		
		if(isOdd == true)
		{
			System.out.println(n+" is an odd number !!!");
		}
		else {
		System.out.println(n + "is an event number !!!");
			}
		//Khi nào dùng toán tử 3 ngôi
		//Khi biểu thức thực hiện trog if/else ngắn
		text = isOdd ? n + "is an odd number !!!"
				:n + "is an event number !!!";
		System.out.println(text);
	}
}
