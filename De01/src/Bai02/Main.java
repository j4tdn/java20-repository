package Bai02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số cần kiểm tra: ");
        int number = scanner.nextInt();

        boolean isSpecial = isSpecialNumber(number);

        if (isSpecial) {
            System.out.println(number + " là số đặc biệt.");
        } else {
            System.out.println(number + " không là số đặc biệt.");
        }
    }

    public static boolean isSpecialNumber(int n) {
        int sum = 0;
        int i = 1;

        while (sum < n) {
            sum += i;
            i++;
        }

        return sum == n;
    }
}
