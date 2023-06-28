package ex05;

import java.util.Random;

public class Ex05 {
	
	public static void main(String[] args) {
		Random rd = new Random();
		int[] numbers = new int[rd.nextInt(3, 21)];
		setArray(numbers);
		printArray(numbers);
		System.out.println("====== AFTER SWAP ======");
		sortArray(numbers);
		printArray(numbers);
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
	
	// Hàm tính level của 1 số tự nhiên
	static int getLevel(int number) {
		int level = 0;
		for (int i = 1; i <= number; i++)
			if (number % i == 0)
				level++;
		return level;
	}
	
	// Hàm sắp xếp mảng số nguyên theo level tăng dần (Bubble sort)
	static void sortArray(int[] numbers) {
		int n = numbers.length;
		boolean swapped;
		for (int i = 0; i < n; i++) {
			swapped = false;
			
			for (int j = 0; j < n - i - 1; j++) 
				if (getLevel(numbers[j]) > getLevel(numbers[j + 1])) {
					int tmp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = tmp;
					swapped = true;
				}
			
			if (!swapped)
				break;
		}
	}
	
}
