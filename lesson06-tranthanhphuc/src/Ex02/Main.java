package Ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validPassword = false;

        while (!validPassword) {
            try {
                System.out.print("Nhập mật khẩu: ");
                String password = scanner.nextLine();
                validatePassword(password);
                System.out.println("Đăng ký tài khoản thành công!");
                validPassword = true;
            } catch (RuntimeException ae) {
            	ae.printStackTrace();
            }
        }

        scanner.close();
    }

    public static void validatePassword(String password) {
        // Kiểm tra độ dài mật khẩu
        if (password.length() < 8 || password.length() > 256) {
            throw new RuntimeException("Mật khẩu phải có từ 8 đến 256 ký tự.");
        }

        // Kiểm tra chữ cái thường
        if (!password.matches(".*[a-z].*")) {
            throw new RuntimeException("Mật khẩu phải chứa ít nhất 1 ký tự chữ cái thường.");
        }

        // Kiểm tra chữ cái in hoa
        if (!password.matches(".*[A-Z].*")) {
            throw new RuntimeException("Mật khẩu phải chứa ít nhất 1 ký tự chữ cái in hoa.");
        }

        // Kiểm tra số
        if (!password.matches(".*\\d.*")) {
            throw new RuntimeException("Mật khẩu phải chứa ít nhất 1 số.");
        }

        // Kiểm tra ký tự đặc biệt
        if (!password.matches(".*[^a-zA-Z0-9].*")) {
            throw new RuntimeException("Mật khẩu phải chứa ít nhất 1 ký tự đặc biệt.");
        }
    }
}

