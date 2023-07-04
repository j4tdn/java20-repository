package ex03;

import java.util.Scanner;

public class Ex03 {
    public static int getMaxValidNumber(String s) {
        int max = -1;
        int current = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                current = current * 10 + (c - '0');
            } else {
                if (current > max) {
                    max = current;
                }
                current = 0;
            }
        }
        if (current > max) {
            max = current;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi kí tự: ");
        String s = scanner.nextLine();
        System.out.println(getMaxValidNumber(s));
    }
}
