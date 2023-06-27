package ex05findlevelofnumber;

import java.util.Random;

import ex02.Ex02ChangeArray;
import ex02.IntNumber;

public class Ex05FindLevelOfNumber {
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(6 - 2) + 3;
		IntNumber[] arr = new IntNumber[n];

		for (int i = 0; i < n; i++) {
			arr[i] = new IntNumber(rd.nextInt(20 - 2) + 3);
		}
		Ex02ChangeArray.printArray(arr);
		
		System.out.println("\n======================================================\n");
		// tìm level của các phần tử trong mảng
		getLevelOfNumbers(arr);
		
		System.out.println("\n======================================================\n");
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (countCommonDivisor(arr[i]) > countCommonDivisor(arr[j])) {
					swap(arr[i], arr[j]);
				}
			}
		}
		
		System.out.println("Mảng sau khi sắp xếp theo level tăng dần");
		Ex02ChangeArray.printArray(arr);
	}

	private static void swap(IntNumber a, IntNumber b) {
		int tmp = a.getValue();
		a.setValue(b.getValue());
		b.setValue(tmp);
	}

	private static int countCommonDivisor(IntNumber a) {
		int count = 0;
		for (int i = 1; i <= a.getValue(); i++) {
			if (a.getValue() % i == 0) {
				count++;
			}
		}
		return count;
	}
	
	private static void getLevelOfNumbers(IntNumber... array) {
		for (IntNumber number : array) {
			System.out.println(number + " có level là " + countCommonDivisor(number));
		}
	}
}
