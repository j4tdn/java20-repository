package bai3;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của tam giác Pascal: ");
        int n = scanner.nextInt();

        // Tạo mảng lưu tam giác Pascal
        int[][] pascalTriangle = new int[n][];
        
        for (int i = 0; i < n; i++) {
            pascalTriangle[i] = new int[i+1];
            
            // Gán giá trị cho phần tử đầu tiên và cuối cùng
            pascalTriangle[i][0] = 1;
            pascalTriangle[i][i] = 1;
            
            // Tính giá trị các phần tử còn lại
            for (int j = 1; j < i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];
            }
        }

        // In tam giác Pascal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalTriangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}