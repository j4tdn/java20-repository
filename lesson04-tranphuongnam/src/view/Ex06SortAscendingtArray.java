package view;

import java.util.Random;

public class Ex06SortAscendingtArray {
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(3, 21); // Số lượng phần tử mảng
		int a[] = new int[n];
		for(int i = 0 ; i < n;i++) {
			a[i] = rd.nextInt(50);
		}
		for(int i : a) {
			System.out.print(i + " ");
		}
		sortAscArray(a);
		System.out.println("\n ----- Array after sorted by acsending -----");
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
	
	public static void sortAscArray(int a[]) {
		for(int i = 0 ; i< a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
