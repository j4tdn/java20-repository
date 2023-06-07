package bean;

import java.util.Iterator;
import java.util.Scanner;

public class Matrix {
	private int row;
	private int column;
	private int[][] matrix;

	public Matrix() {
		matrix = new int[row][column];
	}

	public Matrix(int row, int column) {
		this.row = row;
		this.column = column;
		this.matrix = new int[row][column];
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

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}

	public void inputMatrix() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("----- Nhập phần tử ma trận -----");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("a[" + i + "][" + j + "]: ");
				this.matrix[i][j] = Integer.parseInt(scanner.nextLine());
			}
		}
	}

	public void printMatrix() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("----- Ma trận vừa nhập -----");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(this.matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public boolean hasSaddleElement() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				//Cho mặc định phần tử hiện tại là yên ngựa
				boolean isMaxInRow = true;
				boolean isMinInCol = true;
				
				//Check xem có nhỏ nhất trong cột không
				for (int k = 0; k < column; k++) {
					if(matrix[i][k] < matrix[i][j]) {
						isMinInCol = false;
						break;
					}
				}
				
				//Check xem có lớn nhất trong hàng không
				for (int k = 0; k < row; k++) {
					if(matrix[k][j] > matrix[i][j]) {
						isMaxInRow = false;
						break;
					}
				}
				
				//Nếu là yên ngựa thật -> true
				if(isMaxInRow && isMinInCol) {
					System.out.println(matrix[i][j]);
					return true;
				}
			}
		}
		
		//Không phải là yên ngựa -> false
		return false;
	}
}
