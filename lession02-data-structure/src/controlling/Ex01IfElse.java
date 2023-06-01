package controlling;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		//Random 1 số ngẫu nhiên từ (5,18), kiểm tra
		//số đó có phải số lẻ hay không
		
		Random rd = new Random();
		int n = rd.nextInt(5,18);
		System.out.println("n --> "+ n);
		boolean isOdd = (n%2 !=0);
		
		//if 
		
		//if(isOdd == true) <===> if (isOdd)
		//if(Expression == true) <==> if(Expression)
		if(isOdd == true)
		{
			System.out.println(n + " is an odd number!!");
		}
		else {
			System.out.println(n + " is an even number!!!");
		}
		
		
	}
}
