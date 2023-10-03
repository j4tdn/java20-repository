package view;

import java.util.Arrays;

import functional.Condition;

import static utils.ArraysUtils.*;

public class Ex02ArrayOperationsStrategyPattern {
	public static void main(String[] args) {
		/*
		 Đề bài: Cho danh sách các số nguyên dương [1, 20]
		 Yêu cầu:
		 + Tìm những phần tử là số lẻ trong mảng
		 + Tìm những phần tử là số chẵn trong mảng
		 + Tìm những phần tử là số nguyên tố trong mảng
		 + Tìm những phần tử là số hạnh phúc trong mảng
		 */
		
		int[] numbers = {2, 9, 3, 7, 17, 22, 40, 56, 44};
		
		generate(
				"1. Tìm những phần tử là số lẻ trong mảng", 
				getNumbers(numbers, new Condition() { // anonymous class
					
					@Override
					public boolean test(int number) {
						return number % 2 != 0;
					}
				})
		);
		
		generate(
				"2. Tìm những phần tử là số chẵn trong mảng", 
				getNumbers(numbers, (int number) -> { // anonymous function
					return number % 2 == 0;
				})
		);
		
		generate(
				"3. Tìm những phần tử là số nguyên tố trong mảng", 
				getNumbers(numbers, (int number) -> { // anonymous function
					return isPrime(number);
				})
		);
		
	}
	/*
	 isPrime(number)
	 number % 2 == 0
	 number % 2 != 0
	
	 Xác định các biểu thức(hàm) truyền vào sẽ có input, output là gì
	 Từ input, output tìm được chiến lược(strategy)
	
	 Như VD
	 + input : int number
	 + output: boolean
	 ---> strategy: boolean strategy(int number)

	 + tên hàm bất kỳ
	 + tên biến bất kỳ
	 + quan trọng: tham số(1-n) kiểu dữ liệu gì
	             : kiểu trả về kiểu dữ liệu gì
	
	 Trong Java ko hỗ trợ truyền tham số qua hàm là một hàm khác
	 Tham số chỉ được phép KDL NT, ĐT
	
	 Tạo ra 1 Functional Interface để chứa strategy(abstract method trong interface) đó
	 public interface Condition {
	 	boolean test(int number);
	 }
	 
	 Lấy FI là tham số truyền vào hàm
	 Ai muốn truyền biểu thức gì vào thì override hàm trừu tượng trong FI
	 --> giống như mình đang truyền hàm thành tham số
	 
	 */
	
	private static int[] getNumbers(int[] numbers, Condition condition) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number: numbers) {
			if (condition.test(number)) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static boolean isPrime(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
}