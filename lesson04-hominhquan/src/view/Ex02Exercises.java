package view;

import java.util.Arrays;

public class Ex02Exercises {
	public static void main(String[] args) {
		int[] arr = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		
		int[] arr7 = new int[arr.length];
		int[] arr5 = new int[arr.length];
		int[] ortherArr = new int[arr.length];
		
		int index7 = 0;
		int index5 = 0;
		int orther = 0;
		
		for(int num: arr) {
			if(num % 7 == 0 && num % 5 != 0) {
				arr7[index7++] = num;
			}else if(num % 5 == 0 && num % 7 != 0) {
				arr5[index5++] = num;
			}else {
				ortherArr[orther++] = num;
			}
			
		}
		int[] result = new int[arr.length];
		System.arraycopy(arr7, 0, result, 0, index7);
		System.arraycopy(ortherArr, 0, result, index7, orther);
		System.arraycopy(arr5, 0, result, index7 + orther, index5);
		
		System.out.println("Output: " + Arrays.toString(result));
	}
}
