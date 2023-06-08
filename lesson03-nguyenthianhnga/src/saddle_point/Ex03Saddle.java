package saddle_point;

import java.util.Scanner;

public class Ex03Saddle {
	 public static void main(String[] args) {
	        Scanner ip = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int m = ip.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int n = ip.nextInt();
	        Matrix matrix = new Matrix(m, n);
	        System.out.println("Enter the elements of the matrix:");
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                matrix.set(i, j, ip.nextInt());
	            }
	        }
	        System.out.println("The input matrix is:");
	        System.out.println(matrix);
	        boolean found = false;
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                if (matrix.isSaddlePoint(i, j)) {
	                    System.out.println("The saddle point is located at row " + (i + 1) + ", column " + (j + 1) + ".");
	                    found = true;
	                }
	            }
	        }
	        if (!found) {
	            System.out.println("The input matrix does not have a saddle point.");
	        }
	        ip.close();
	    }
}
