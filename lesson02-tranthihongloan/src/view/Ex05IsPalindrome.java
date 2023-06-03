package view;

import java.util.Scanner;

public class Ex05IsPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = "";
		while(true) {
			do {
				System.out.print("Enter valid number: ");
				st = sc.nextLine();
			} while (!st.matches("\\d+") || st.length() < 2 || !isPalindrome(st));
			System.out.println(st + " is palindrome number!!!");
			sc.close();
		}
	}
	public static boolean isPalindrome(String Str) {
        // Lật ngược chuỗi
        StringBuilder reversedStr = new StringBuilder(Str).reverse();
      
        // So sánh số ban đầu với số lật ngược
        return Str.equals(reversedStr.toString());
    }
}
