package view;

import java.util.Arrays;

import functional.Condition;

import static utils.ArrayUtils.*;

public class Ex02ArrayStategyPattern {
	public static void main(String[] args) {
		/*
		  cho 1 danh sach cac phan tu so nguyen duong [1,20]
		  require: tim nhung phan tu le trong mang
		  			tim nhung phan tu chan trong mang 
		  			tim nhung phan tu la so nguyen to trong mang 
		  			tim nhung phan tu la so hanh phuc trong mang 
		 */
		
		int[] numbers = {2, 9, 3, 7, 17, 22, 40, 56, 44};
		generate("phan tu le trong mang ", getNumbers(numbers, number -> number % 2 != 0));
		generate("phan tu chan trong mang ", getNumbers(numbers, number -> number % 2 == 0));
		generate("phan tu so nguyen to trong mang ", getNumbers(numbers, number -> isPrime(number)));
	
	// xác định các biểu thức (hàm, chiến lược) truyền vào sẽ có input, output là gì 
	// tìm được strategy 
		
	// tên hàm bất kỳ
	// tên biến bất kỳ
	// quan trọng: tham số kiểu dữ liệu gì
	// 				kiểu trả về kiểu dữ liệu gì 
	// tạo ra 1 Functional Interface để chứa strategy(abstract method trong interface)
	// public interface Condition{
	// 		boolean test(int number);
		
	// lấy FI là tham số truyền vào 
	// ai muốn truyền biểu thức gì vào thì override hàm trừu trượng trong FI đó
	// --> giống như mình đang truyền hàm thành tham số 
	}
	private static int[] getNumbers(int[] numbers, Condition condition) {
		int[] result = new int[numbers.length];
		int count = 0;
		for(int number: numbers) {
			if(condition.test(number)) {
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
