package exercises;

import java.util.Random;

public class Ex10Random5NumberUnduplicated {
	private static int[] random5NumberUnduplicated(int min, int max) {
		int[] arr = new int[5];
		Random rd = new Random();
		for (int i = 0; i < 5; i++) {
			arr[i] = min + rd.nextInt(max - min + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = min + rd.nextInt(max - min + 1);
				}
			}
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("5 số ngẫu nhiên thuộc [20, 30] không trùng nhau:");
		int[] array = random5NumberUnduplicated(20, 30);
		printArray(array);
	}
}
