package ex02;

import java.util.Scanner;

public class Ex02ChangeArray {
	public static void main(String[] args) {
		int n;
		IntNumber[] array;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số phần tử mảng: ");
		n = Integer.parseInt(sc.nextLine());
		
		array = new IntNumber[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
			array[i] = new IntNumber(Integer.parseInt(sc.nextLine()));
		}
		System.out.println("Input:");
		printArray(array);
		
		IntNumber[] array1 = changePos(array);
		System.out.println("Output:");
		printArray(array1);		
	}
	
	private static void swapFirstPos(IntNumber[] arr, int pos) {
		int tmp = arr[pos].getValue();
		for (int i = pos; i > 0; i--) {
			arr[i].setValue(arr[i-1].getValue());
		}
		arr[0].setValue(tmp);
	}
	
	private static void swapLastPos(IntNumber[] arr, int pos) {
		int tmp = arr[pos].getValue();
		for (int i = pos; i < arr.length - 1; i++) {
			arr[i].setValue(arr[i+1].getValue());
		}
		arr[arr.length - 1].setValue(tmp);
	}
	
	private static IntNumber[] changePos(IntNumber[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getValue() % 7 == 0 && arr[i].getValue() % 5 != 0) {
				swapFirstPos(arr, i);
			} else if (arr[i].getValue() % 5 == 0 && arr[i].getValue() % 7 != 0) {
				swapLastPos(arr, i);
			}
		}
		return arr;
	}
	
	public static void printArray(IntNumber[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}
}
