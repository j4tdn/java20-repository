package io;

import java.util.Random;

public class Ex02Random {
     public static void main(String[] args) {
		Random rd = new Random();
		
		/* 
		 * tạo ra 1 số nguyên ngẫu nhiên
		 * 
		 */
		int intValueWithoutRestriction = rd.nextInt();
		
		// tạo ra 1 số nguyên ngẫu nhiên [0 <n) n = (20)
		// [ là inclusive bao gồm số 0 đến giá trị cụ thể
		// ( exclusive
		 int upperBoundValue = rd.nextInt(20); // vs nếu dùng hàm này random số ngẫu nhiên
		                                       // min + rd.nexInt(max - min)
		 
		 //3. tạo ra 1 số nguyên ngẫu nhiên từ [a,b)
		 int boundValue = rd.nextInt(5, 20);
		 
		 System.out.println("intValueWithoutRestriction --> "+ intValueWithoutRestriction);
		 System.out.println("upperBoundValue -->" + upperBoundValue);
		 System.out.println("boundValue -->" + boundValue);
	}
}
