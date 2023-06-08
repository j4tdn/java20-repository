package bean;

import java.util.Arrays;

public class SaddleElement {
	private int column;
	private int row;
	private int[][] arraySaddle;
	
	public SaddleElement() {
		
	}
	public SaddleElement(int row, int column) {
		this.column = column;
		this.row = row;
		this.arraySaddle = new int[row][column];
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int[][] getArraySaddle() {
		return arraySaddle;
	}
	public void setArraySaddle(int[][] arraySaddle) {
		this.arraySaddle = arraySaddle;
	}
	@Override
	public String toString() {
		return "SaddleElement [column=" + column + ", row=" + row + ", arraySaddle=" + Arrays.toString(arraySaddle)
				+ "]";
	}
	
}
