package view;

import java.util.Arrays;

public class Ex04Sum {
	public static void main(String[] args) {
		int[] a1 = {1, 5, 8, 9, 2, 5, 9};
		System.out.println("a1 ==> " + Arrays.toString(a1));
		System.out.println("a1 sum ==> " + sum(a1));
		System.out.println("\n====================\n");
		int[] a2 = {4, 2, 6, 6, 4, 15, 1};
		System.out.println("a2 ==> " + Arrays.toString(a2));
		System.out.println("a1 sum ==> " + sum(a2));
	}
	
	private static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != getMinOfArray(arr) && arr[i] != getMaxOfArray(arr)) {
				int check = 0;
				for (int j = i - 1; j >= 0; j--) {
					if (arr[i] == arr[j]) {
						check++;
					}
				}
				if (check == 0) {
					sum += arr[i];
				}
			}
		}
		return sum;
	}
	
	private static int getMaxOfArray(int[] input) {
		int max = input[0];
		for(int n : input) {
			if(max < n)
				max = n;
		}
		return max;
	}
	private static int getMinOfArray(int[] input) {
		int min = input[0];
		for(int n : input) {
			if(min > n)
				min = n;
		}
		return min;
	}
}
