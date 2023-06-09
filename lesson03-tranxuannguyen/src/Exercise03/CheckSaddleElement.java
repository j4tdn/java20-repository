package Exercise03;

import java.util.Random;
import java.util.Scanner;

public class CheckSaddleElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

        System.out.print("Nhập số hàng: ");
        int m = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Ma trận:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rd.nextInt(1,99);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
            	
                int minRow = matrix[i][0];
                for (int k = 1; k < n; k++) {
                    if (matrix[i][k] < minRow) {
                        minRow = matrix[i][k];
                    }
                }

                int maxCol = matrix[0][j];
                for (int k = 1; k < m; k++) {
                    if (matrix[k][j] > maxCol) {
                        maxCol = matrix[k][j];
                    }
                }

                if (matrix[i][j] == minRow && matrix[i][j] == maxCol) {
                    System.out.printf("Phần tử yên ngựa tại vị trí (%d, %d): %d\n", i, j, matrix[i][j]);
                    return;
                }
            }
        }
        System.out.println("Không có phần tử yên ngựa trong ma trận.");
	}
}
