package view;

import java.util.Scanner;

public class Ex06IsMinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = "";
		int[] arr = new int[3];
		int j = 0;
		
		for(int i = 0; i < 3; i++) {
			System.out.print("Nhap so thu nhat " + i + ": ");
			do {
				if(j == 1) {
					System.out.print("Nhap lai: ");
				}
				st = sc.nextLine();
				j++;
			} while (!st.matches("\\d+") || Integer.parseInt(st) >= 20);
			j = 0;
			arr[i] = Integer.parseInt(st);
		}	
		
		System.out.print("Day so vua nhap: ");
		for(int each: arr) {
			System.out.print(each + "  ");
		}
		
		System.out.println();
		System.out.println(isMin(arr) + " la so nho nhat trong day");
		System.out.println(isMax(arr) + " la so lon nhat trong day");
		sc.close();
	}
	private static int isMin(int[] numbers) {
		int i, min;
		min = numbers[0];
		for(i = 0; i < numbers.length; i++) {
			if(numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}
	private static int isMax(int[] numbers) {
		int i, max;
		max = numbers[0];
		for(i = 0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}
}
