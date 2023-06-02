package view;

import java.util.Scanner;

public class Ex05IsSymmetrical {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		int maxAttempts = 5;
		int attempts = 0;
		String input;
	
		while (attempts < maxAttempts) {
			System.out.print("Nhập n: ");
			input = ip.nextLine();
			try {
				if (!isValidInput(input)) {
					 System.out.println("nhap sai: vui long nhap lai.");
	               
	            } else {
	               System.out.println(isSymmertrical(Integer.parseInt(input)));
	               break;
	            }

			} catch (Exception e) {
				 System.out.println("hap sai: vui long nhap lai.");
			}
            attempts++;
        }

        if (attempts == maxAttempts) {
            System.out.println("nhap loi!!!");
        }
			attempts++;
		

		if (attempts == maxAttempts) {
			System.out.println("nhap loi!!!");
		}
	}
	private static boolean isValidInput(String input) {
        if (input.length() == 1) {
            
            char c = input.charAt(0);
            if (Character.isDigit(c)) {
                return false; 
            }
        }

        return true;
	}
	private static boolean isSymmertrical(int n) {
		String number = String.valueOf(n);
		for (int i = 0; i < (number.length()) / 2; i++) {
			if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
