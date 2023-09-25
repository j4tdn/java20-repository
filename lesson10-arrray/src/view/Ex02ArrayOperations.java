package view;

import java.util.Arrays;

import static utils.ArrayUtils.*;

public class Ex02ArrayOperations {
	public static void main(String[] args) {
		/*
		  cho 1 danh sach cac phan tu so nguyen duong [1,20]
		  require: tim nhung phan tu le trong mang
		  			tim nhung phan tu chan trong mang 
		  			tim nhung phan tu la so nguyen to trong mang 
		  			tim nhung phan tu la so hanh phuc trong mang 
		 */
		
		int[] numbers = {2, 9, 3, 7, 17, 22, 40, 56, 44};
		generate("phan tu le trong mang ", getOddNumbers(numbers));
		generate("phan tu chan trong mang ", getEvenNumber(numbers));
		generate("phan tu chan trong mang ", getPriceNumbers(numbers));
	}
	private static int[] getOddNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for(int number: numbers) {
			if(number % 2 != 0) {
			result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	private static int[] getEvenNumber(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for(int number: numbers) {
			if(number % 2 == 0) {
			result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	private static int[] getPriceNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for(int number: numbers) {
			if(isPrime(number)) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static boolean isPrime(int number) {
		if(number == 0 | number == 1) {
			return false;
		}
		for(int i= 2; i < Math.sqrt(number); i++) {
			if(i % 2 == 0) {
				return false;
			}
			
		}
		return true;
	}
	
}
