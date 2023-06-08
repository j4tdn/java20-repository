package ex03SaddleElement;

import java.util.Random;
import java.util.Scanner;

public class AppUtils {
	private AppUtils() {}
	public static int[][] importMatrixRandom(int m, int n) {
		Scanner ip = new Scanner(System.in);
		Random rd = new Random();
		int[][] arr = new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = rd.nextInt(1, 99);
			}
		}
		ip.close();
		return arr;
	}
	
	public static void printMatrix(int[][] arr) {
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2 + "\t");
			}
			System.out.println();
		}
	}
	
	public static boolean existSaddleElement(int[][] arr) {
		for (int[]rowArr : arr) {
			int row = 0;
			for (int is : rowArr) {
				int[] colArr =  new int[arr.length];
				for (int column = 0; column < arr.length; column++) {
					colArr[column] = arr[column][row];
					}
				if (isMax(colArr, is ) && isMin(rowArr, is)) {
					return true;
					}
				row++;
				}			
			}
		return false;

	}
	public static boolean isMax(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (num < arr[i]) {
				return false ;
			}
		}
		return true;
	}
	public static boolean isMin(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (num > arr[i]) {
				return false ;
			}
		}
		return true;
	}
}
