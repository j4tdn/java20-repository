package view;

import java.util.Scanner;

public class Ex01Mutiple {
	public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int maxAttempts = 5;
        int attempts = 0;
        int N = 0;

        while (attempts < maxAttempts) {
            System.out.print("nhap n: ");
            String input = ip.nextLine();

            try {
                N = Integer.parseInt(input);
                System.out.println(isMultipleOfTwo(N));
                break;
            } catch (NumberFormatException e) {
                System.out.println("nhap loi: vui long nhap lai.");
            }

            attempts++;
        }

        if (attempts == maxAttempts) {
            System.out.println("Đã vượt quá số lần nhập. Thoát chương trình.");
        }

        
    }

    public static boolean isMultipleOfTwo(int number) {
        return (number % 2 == 0);
    }
}