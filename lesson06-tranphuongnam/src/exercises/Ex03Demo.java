package exercises;

import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class Ex03Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;
        boolean _isValidEmail = false;
        while(!_isValidEmail) {
        	System.out.print("Nhập địa chỉ email: ");
			email = scanner.nextLine();
            try {
				if (isValidEmail(email)) {
				    System.out.println("Địa chỉ email hợp lệ: " + email);
				} else {
				    System.out.println("Địa chỉ email không hợp lệ. Vui lòng nhập lại.");
				}
				_isValidEmail = true;
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
        
        scanner.close();
    }

    public static boolean isValidEmail(String email) throws IOException {
        // Kiểm tra nếu email có ký tự @ và chỉ xuất hiện một lần.
        if (!email.contains("@") || email.indexOf("@") != email.lastIndexOf("@")) {
        	System.out.println("ERROR: @");
            throw new IOException("Error syntax email");
        }

        // Tách địa chỉ email thành phần prefix và domain.
        String[] parts = email.split("@");
        String prefix = parts[0];
        String domain = parts[1];

        // Kiểm tra tính hợp lệ của prefix và domain.
        if (isValidPrefix(prefix) && isValidDomain(domain)) {
            return true;
        }

        throw new IOException("Error email");
    }

    public static boolean isValidPrefix(String prefix) throws IOException {
        // Kiểm tra tính hợp lệ của prefix.
        String allowedChars = "abcdefghijklmnopqrstuvwxyz"
        		+ "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        		+ "0123456789"
        		+ "._-";

        // Kiểm tra ký tự đầu tiên.
        if (!Character.isLetterOrDigit(prefix.charAt(0))) {
        	System.out.println("PREFIX ERROR: first letter");
        	throw new IOException("First letter must be character");
        }

        // Kiểm tra ký tự cuối cùng.
        if (!Character.isLetterOrDigit(prefix.charAt(prefix.length() - 1))) {
        	System.out.println("PREFIX ERROR: last letter");
        	throw new IOException("Last letter must be character");
        }

        // Kiểm tra các ký tự giữa, không cho phép ký tự liền nhau là period, underscore, dash.
        for (int i = 1; i < prefix.length() - 1; i++) {
            char c = prefix.charAt(i);
            char prev = prefix.charAt(i - 1);
            if (c == '.' || c == '_' || c == '-') {
                if (!Character.isLetterOrDigit(prev)) {
                	System.out.println("PREFIX ERROR: ..");
                	throw new IOException("Not allowed more than 2 consecutive period, underscore, dash ");
                }
            } else if (!allowedChars.contains(String.valueOf(c))) {
            	System.out.println("PREFIX ERROR: not contain");
            	throw new IOException("Not allowed special characters");
            }
        }

        return true;
    }

    public static boolean isValidDomain(String domain) throws IOException{
        // Kiểm tra tính hợp lệ của domain.
    	if(!domain.equals("mail.com")){
    		throw new IOException("Email's domain must end with mail.com");
    	}
    	return true;
    }
}