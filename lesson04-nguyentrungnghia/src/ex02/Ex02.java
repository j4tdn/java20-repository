package ex02;

import java.util.Random;

public class Ex02 {
	
	public static void main(String[] args) {
		Random rd = new Random();
		int[] numbers = new int[rd.nextInt(5, 101)];
		setArray(numbers);
		printArray(numbers);
		System.out.println("======= AFTER SWAP =======");
		int[] sortedArray = sortArray(numbers);
		printArray(sortedArray);
	}

	// Hàm gán giá trị ngẫu nhiên cho mảng
	static void setArray(int[] numbers) {
		Random rd = new Random();
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = rd.nextInt(1, 100);
	}

	// Hàm in mảng ra màn hình
	static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		System.out.println();
	}

	// Hàm đưa các phần tử chia hết cho 7 ra đầu mảng
	//                                  5 ra cuối mảng
	//                                  7 và 5 hoặc các phần tử còn lại ra giữa mảng
	static int[] sortArray(int[] numbers) {
		int[] sortedArray = new int[numbers.length];
		int start = 0;
		int end = numbers.length - 1;
		
		for (int i = 0; i < numbers.length; i++) {
			if ((numbers[i] % 7 == 0) && (numbers[i] % 5 != 0)) {
				sortedArray[start] = numbers[i];
				start++;
			} else if ((numbers[i] % 5 == 0) && (numbers[i] % 7 != 0)) {
				sortedArray[end] = numbers[i];
				end--;
			}
		}
		
		for (int i = 0; i < numbers.length; i++) 
			if (((numbers[i] % 7 == 0) && (numbers[i] % 5 == 0)) || ((numbers[i] % 7 != 0) && (numbers[i] % 5 != 0))) {
				sortedArray[start] = numbers[i];
				start++;
			}
		
		return sortedArray;
	}

}
