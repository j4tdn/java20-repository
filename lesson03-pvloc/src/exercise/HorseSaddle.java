package exercise;

import java.util.Random;
import java.util.Scanner;

public class HorseSaddle {
    public static void main(String[] args) {
        Scanner yn = new Scanner(System.in);
        System.out.print("Nhập số hàng của bảng số: ");
        int m = yn.nextInt();
        System.out.print("Nhập số cột của bảng số: ");
        int n = yn.nextInt();
        int[][] arr = new int[m][n];

        // Nhập giá trị cho bảng số
        System.out.println("Nhập giá trị cho bảng số: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = yn.nextInt();
            }
        }

        // Kiểm tra phần tử yên ngựa
        for (int i = 0; i < m; i++) {
            int minIndex = 0;
            // Tìm phần tử nhỏ nhất trong hàng i
            for (int j = 1; j < n; j++) {
                if (arr[i][j] < arr[i][minIndex]) {
                    minIndex = j;
                }
            }
            Random rd = new Random();
            int randomRowIndex = rd.nextInt(m);
            // Kiểm tra phần tử nhỏ nhất trong hàng i có bằng phần tử ngẫu nhiên trong cột hay không
            if (arr[i][minIndex] == arr[randomRowIndex][minIndex]) {
                System.out.println("Phần tử yên ngựa là: " + arr[i][minIndex] + " ở vị trí [" + i + "][" + minIndex + "]");
            }
        }
    }
}