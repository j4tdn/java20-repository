package view;

import java.util.Random;
import java.util.Scanner;

public class Ex03PhanTuYenNgua {
	static Random rd = new Random();
	static Scanner ip = new Scanner(System.in);
	static int min;

	public static void main(String[] args) {
		System.out.print("enter M, N size: ");
		int M = ip.nextInt();
		int N = ip.nextInt();
		int[][] a = new int[M][N];
		init(a, M, N);
		out(a, M, N);
		
		boolean result = solve(a, M, N);
		if (result == false) System.out.println(result);
		else System.out.println(result + " --> " + min);
	}

	private static boolean solve(int[][] a, int M, int N) {
		for (int i = 0; i < M; i++) {
			int column = 0;
			min = Integer.MAX_VALUE;
			for (int j = 0; j < N; j++) {
				if (a[i][j] <= min) {
					min = a[i][j];
					column = j;
				}
			}
			int count = 0;
			for (int k = 0; k < M; k++) {
				if (min > a[k][column]) {
					count++;
				} 
				if (count == M-1) return true;
			}
		}
		return false;
	}

	private static void init(int[][] a, int M, int N) {
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				a[i][j] = rd.nextInt(1, 100);
			}
		}
	}

	private static void out(int[][] a, int M, int N) {
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
