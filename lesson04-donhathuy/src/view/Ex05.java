package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter lengths array: ");
		int n = Integer.parseInt(ip.nextLine());
		System.out.println("Enter elements array: ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(ip.nextLine());
		}
		System.out.println("Before: "+Arrays.toString(arr));
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (levelNumber(arr[i]) > levelNumber(arr[j]) ) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		System.out.println("After sort: "+Arrays.toString(arr));
		ip.close();
	}
	public static int levelNumber(int number) {
		int result = 0;
		for(int i = 1; i<= number; i++) {
			if (number % i == 0) {
				result++;
			}
		}
		return result;
	}
}
