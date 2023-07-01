package ex03pascaltriangle;

import java.util.Scanner;

public class Ex03Demo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng của tam giác Pascal: ");
        int n = scanner.nextInt();

        int[][] pascalTriangle = new int[n+2][];
        
        for (int i = 0; i < n+2; i++) {
            pascalTriangle[i] = new int[i + 1];
            pascalTriangle[i][0] = 1;
            
            for (int j = 1; j < i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }
            
            pascalTriangle[i][i] = 1;
        }
        
        // In tam giác Pascal
        for (int i = 1; i < n+2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalTriangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
