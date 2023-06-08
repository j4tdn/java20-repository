package bean;

import java.util.Random;

public class Matrix {
	 private int[][] data;
	    private int rows;
	    private int columns;
	    
	    public Matrix(int rows, int columns) {
	        this.rows = rows;
	        this.columns = columns;
	        data = new int[rows][columns];
	    }

	    public void generateRandomMatrix() {
	        Random random = new Random();

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                data[i][j] = random.nextInt(1,99);
	            }
	        }
	    }

	    public void printMatrix() {
	        System.out.println("Matrix: ");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(data[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	    
	    public boolean hasSaddlePoint() {
	        for (int i = 0; i < rows; i++) {
	            int minInRow = data[i][0];
	            int minColumnIndex = 0;

	            for (int j = 1; j < columns; j++) {
	                if (data[i][j] < minInRow) {
	                    minInRow = data[i][j];
	                    minColumnIndex = j;
	                }
	            }

	            boolean isSaddlePoint = true;
	            for (int k = 0; k < rows; k++) {
	                if (data[k][minColumnIndex] > minInRow) {
	                    isSaddlePoint = false;
	                    break;
	                }
	            }

	            if (isSaddlePoint) {
	                System.out.println("Điểm yên ngựa tìm thấy là: " + i + minColumnIndex);
	                return true;
	            }
	        }

	        System.out.println("Không có điểm yên ngựa!!!");
	        return false;
	    }
}
