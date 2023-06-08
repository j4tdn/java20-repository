package saddle_point;

public class Matrix {
	  private int[][] data;
	    private int rows;
	    private int cols;

	    public Matrix(int rows, int cols) {
	        this.rows = rows;
	        this.cols = cols;
	        data = new int[rows][cols];
	    }

	    public int getRows() {
	        return rows;
	    }

	    public int getCols() {
	        return cols;
	    }

	    public void set(int row, int col, int value) {
	        data[row][col] = value;
	    }

	    public int get(int row, int col) {
	        return data[row][col];
	    }

	    public boolean isSaddlePoint(int row, int col) {
	        int value = get(row, col);
	        for (int i = 0; i < rows; i++) {
	            if (get(i, col) > value) {
	                return false;
	            }
	        }
	        for (int j = 0; j < cols; j++) {
	            if (get(row, j) < value) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        for (int[] row : data) {
	            for (int value : row) {
	                sb.append(value).append(" ");
	            }
	            sb.append("\n");
	        }
	        return sb.toString();
	    }
	   
}
