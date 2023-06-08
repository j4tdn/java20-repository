package bean;

import java.util.Random;

public class Mang2Chieu {
	private int row;
	private int column;
	private int array[][];

	public Mang2Chieu() {
		array = new int[row][column];
	}

	public Mang2Chieu(int row, int column) {
		this.row = row;
		this.column = column;
		this.array = new int[row][column];
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
		return array;
	}

	public void setArray(int[][] array) {
		this.array = array;
	}

	public int[][] createArrayMember() {
		Random rd = new Random();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = rd.nextInt(99) + 1;
			}
		}
		return array;
	}

	public void printArray() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(array[i][j] + "   ");
			}
			System.out.println();
		}
	}

	public int maxColumn(int col) {
		int maxCol = array[0][col];
		for (int i = 0; i < row; i++) {
			if (array[i][col] > maxCol) {
				maxCol = array[i][col];
			}
		}
		return maxCol;
	}

	public int minRow(int r) {
		int minRow = array[r][0];
		for (int i = 0; i < column; i++) {
			if (array[r][i] < minRow) {
				minRow = array[r][i];
			}
		}
		return minRow;
	}

	public void timPhanTuYenNgua() {
		int m, n = 0;
		br: for (m = 0; m < row; m++) {
			for (n = 0; n < column; n++) {
				if (minRow(m) == maxColumn(n)) {
					System.out.println("Phần tử yên ngựa: A[" + m + "][" + n + "]");
					break br;
				}
			}
		}
		if (m == (row) && n == (column)) {
			System.out.println("Mảng này không có phần tử yên ngựa!");
		}
	}
}
