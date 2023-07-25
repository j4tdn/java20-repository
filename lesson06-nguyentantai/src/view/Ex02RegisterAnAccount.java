package view;

import java.util.Scanner;

public class Ex02RegisterAnAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidPassword = false;

        while (!isValidPassword) {
            System.out.print("Hãy nhập mật khẩu: ");
            String password = scanner.nextLine();

            try {
                validatePassword(password);
                isValidPassword = true;
                System.out.println("Mật khẩu đã hợp lệ.Chúc mừng bạn đã đăng ký tài khoản thành công!");
            } catch (PasswordException e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }

        scanner.close();
    }

    public static void validatePassword(String password) throws PasswordException {
        if (password.length() < 8 || password.length() > 256) {
            throw new PasswordException("Mật khẩu phải có ít nhất 8 ký tự và nhiều nhất 256 ký tự.");
        }

        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialCharacter = true;
            }
        }

        if (!hasLowerCase) {
            throw new PasswordException("Mật khẩu phải chứa ít nhất 1 chữ cái thường.");
        }
        if (!hasDigit) {
            throw new PasswordException("Mật khẩu phải chứa ít nhất 1 số.");
        }
        if (!hasSpecialCharacter) {
            throw new PasswordException("Mật khẩu phải chứa ít nhất 1 ký tự đặt biệt.");
        }
    }
}

class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}
