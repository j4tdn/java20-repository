package Ex02DominoChainLength;

import java.util.Scanner;

public class Ex02DominoChainLength {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so luong quan domino: ");
		int N = sc.nextInt();
		int[][] table = new int[2][N];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++) {
				if(i == 0) {
					System.out.print("Nhap chieu cao quan thu " + (j + 1) + ": ");
					table[i][j] = sc.nextInt();
				}
				if(i == 1) {
					System.out.print("Nhap vi tri quan thu " + (j + 1) + ": ");
					table[i][j] = sc.nextInt();
				}
			}
		}
		
		
	}
}
