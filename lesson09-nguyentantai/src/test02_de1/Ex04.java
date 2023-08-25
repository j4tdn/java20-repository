package test02_de1;

import java.util.Scanner;

public class Ex04 {
    public static boolean isValidPassword(String password, String username) {
        if (password.length() < 8) {
            return false;
        }
        if (!password.matches(".*\\d.*")) {
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }
        if (!password.matches(".*[~!@#$%^&*].*")) {
            return false;
        }
        int duplicates = 0;
        for (char c : password.toCharArray()) {
            if (username.contains(String.valueOf(c))) {
                duplicates++;
            }
        }
        if (duplicates > 3) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        String password = "";
        while (true) {
            System.out.print("Enter password: ");
            password = scanner.nextLine();
            if (isValidPassword(password, username)) {
                System.out.println("Account registered successfully!");
                break;
            } else {
                System.out.println("Account registration failed. Please check password requirements.");
            }
        }
        scanner.close();
    }
}
