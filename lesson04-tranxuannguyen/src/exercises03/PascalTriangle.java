package exercises03;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        int[][] triangle = new int[n][n];

        
        for (int i = 0; i < n; i++) {
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
	}
}
