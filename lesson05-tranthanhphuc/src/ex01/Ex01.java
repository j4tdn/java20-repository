package ex01;

import java.util.Scanner;

public class Ex01 {
    public static boolean isPowerOf(int n, int base) {
        if (n == 1)
            return true;
        if (n % base != 0)
            return false;
        return isPowerOf(n / base, base);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();
        System.out.print("Nhập số nguyên khác: ");
        int base = scanner.nextInt();
        System.out.println(isPowerOf(n, base));
    }
}
