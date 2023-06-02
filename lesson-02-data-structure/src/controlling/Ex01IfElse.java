package controlling;

import java.util.Random;

public class Ex01IfElse {

	public static void main(String[] args) {
		// Ram don 1 số nguyên ngẫu nhiên, kiểm tra số đó có phải là số lẻ không
		Random rd = new Random();
		int n = rd.nextInt(5, 18);
		System.out.println("n --> " + n);
		boolean isOdd = (n % 2 != 0);

		// if (expression) {
		// do Something
		// }

		String text = "";
		if (isOdd) {
			text = n + " is an odd number";
		} else {
			text = n + " is an even odd number";
		}
		System.out.println(text);

		text = isOdd ? n + " is an odd number !!!" : n + " is an even number";
		System.out.println("text 2 --> " + text);
	}

}
