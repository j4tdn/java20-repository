package Ex03Saddle;

import java.util.Random;

public class Matrix {
	private int row;
	private int column;
	private int a[][];

	public Matrix() {
		
	}

	public Matrix(int row, int column) {
		this.row = row;
		this.column = column;
		this.a = new int[row][column];
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int[][] getArray() {
		return a;
	}

	public void setArray(int[][] a) {
		this.a = a;
	}

	public int[][] matrixRandom() {
		Random rd = new Random();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				a[i][j] = rd.nextInt(98) + 1;
			}
		}
		return a;
	}

	public void printArray() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int maxColumn(int c) {
		int maxCol = a[0][c];
		for (int i = 0; i < row; i++) {
			if (a[i][c] > maxCol) {
				maxCol = a[i][c];
			}
		}
		return maxCol;
	}

	public int minRow(int r) {
		int minRow = a[r][0];
		for (int i = 0; i < column; i++) {
			if (a[r][i] < minRow) {
				minRow = a[r][i];
			}
		}
		return minRow;
	}

	public void findSaddleElements() {
		int m, n, t = 0;
		for (m = 0; m < row; m++) {
			for (n = 0; n < column; n++) {
				if (minRow(m) == maxColumn(n)) {
					System.out.println("Mảng này có phần tử yên ngựa: a[" + m + "][" + n + "]");
					t -= 1;
				}
			}
		}
		if (t > 0) {
			System.out.println("Mảng này không có phần tử yên ngựa!");
		}
	}
}