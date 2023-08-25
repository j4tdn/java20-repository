package test09;

import java.util.Scanner;

public class Ex02_SoHanhPhuc {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Nhập một số nguyên dương: ");
			int so = scanner.nextInt();
			if (laSoHanhPhuc(so)) {
			    System.out.println(so + " là số hạnh phúc.");
			} else {
			    System.out.println(so + " không là số hạnh phúc(FA).");
			}
		}
    }
	private static int tinhTongBinhPhuongChuSo(int n) {
        int total = 0;
        while (n > 0) {
            int digit = n % 10;
            total += digit * digit;
            n /= 10;
        }
        return total;
    }

    private static boolean laSoHanhPhuc(int n) {
        while (n != 1 && n != 4) {
            n = tinhTongBinhPhuongChuSo(n);
        }
        return n == 1;
    }
}
