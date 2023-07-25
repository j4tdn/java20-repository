import java.util.Scanner;

public class Ex02RegisterAnAccount {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        boolean isValidPassword = false;

        while (!isValidPassword) {
            System.out.print("Hãy nhập mật khẩu: ");
            String password = sc.nextLine();
            try {
            	checkPassword(password);
                isValidPassword = true;
                System.out.println("Mật khẩu hợp lệ!");
            } catch (PasswordRequirements e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
        sc.close();
    }

    public static void checkPassword(String password) throws PasswordRequirements {
    	
        if (password.length() < 8 || password.length() > 256) {
            throw new PasswordRequirements("Mật khẩu phải có ít nhất 8 ký tự và nhiều nhất 256 ký tự!");
        }

        boolean lowerCase = false;
        boolean upperCase = false;
        boolean number = false;
        boolean specialCharacter = false;

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
            	lowerCase = true;
            } else if (Character.isUpperCase(c)) {
            	upperCase = true;
            } else if (Character.isDigit(c)) {
            	number = true;
            } else if (!Character.isLetterOrDigit(c)) {
            	specialCharacter = true;
            }
        }

        if (!lowerCase) {
            throw new PasswordRequirements("Mật khẩu phải chứa ít nhất 1 chữ cái thường!");
        }
        if (!upperCase) {
        	throw new PasswordRequirements("Mật khẩu phải chứa ít nhất 1 chữ cái in hoa!");
        }
        if (!number) {
            throw new PasswordRequirements("Mật khẩu phải chứa ít nhất 1 số!");
        }
        if (!specialCharacter) {
            throw new PasswordRequirements("Mật khẩu phải chứa ít nhất 1 ký tự đặt biệt!");
        }
    }
}

class PasswordRequirements extends Exception {
    public PasswordRequirements(String message) {
        super(message);
    }
}