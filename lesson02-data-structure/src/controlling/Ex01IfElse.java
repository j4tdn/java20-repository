package controlling;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		// Random a random number, số đó có phải số lẻ ?
		
		Random rd = new Random();
		int n = rd.nextInt(5,18);
		System.out.println("n --> " + n);
		
		boolean isOdd = !(n % 2 == 0);
		boolean check = false; //Hàng giả
		
		//if(expression){
		//	do something here
		//}
		if(check) {
			System.out.println("FALSE MILK");
		} 
		if(!check) {
			System.out.println("TRUE MILK");
		}
		if(isOdd) {
			System.out.println(n + " is an odd number");
		} else {
			System.out.println(n + " is an even number");
		}
		
		// Khi nào dùng toán tử 3 ngôi -> khi biểu thức if/else ngắn -> 1 dòng 
		String text = isOdd ? "is ODD number" : "is EVEN number";
		System.out.println("Text --> " + text);
	}
}
