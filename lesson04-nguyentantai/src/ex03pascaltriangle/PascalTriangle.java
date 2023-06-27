package ex03pascaltriangle;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số hàng của tam giác Pascal: ");
        int n = sc.nextInt();

        // Khởi tạo mảng hai chiều để lưu tam giác Pascal
        int[][] pascalTriangle = new int[n][n];

        // Tính toán và gán giá trị cho tam giác Pascal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascalTriangle[i][j] = 1;
                } else {
                    pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
                }
            }
        }

        // In ra tam giác Pascal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalTriangle[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}