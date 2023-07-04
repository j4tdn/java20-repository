package ex02;

import java.util.Scanner;

public class Ex02 {
    public static boolean isSpecialNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            if (sum == n)
                return true;
            if (sum > n)
                return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();
        System.out.println(isSpecialNumber(n));
    }
}