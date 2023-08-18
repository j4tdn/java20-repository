package view;

import java.util.Scanner;

public class Ex02NameFormat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		do {
			System.out.print("Enter your name: ");
			name = sc.nextLine();
			if (!Ex01Spell.checkInputString(name)) {
				System.out.println("Your name just have letter!!!");
			}
		} while (!Ex01Spell.checkInputString(name));
		sc.close();
		
		System.out.println("Your name: \n" + nameFormat(name));
		
	}
	
	private static String nameFormat(String name) {
		char[] nFormat = new char[name.length()];
		name = name.trim().replaceAll("\\s+", " ").toLowerCase();
		for (int i = 0; i < name.length(); i++) {
			if (i == 0) {
				char letter = name.charAt(i);
				nFormat[i] = Character.toUpperCase(letter);
			} else if (name.charAt(i - 1) == ' ') {
				char letter = name.charAt(i);
				nFormat[i] = Character.toUpperCase(letter);
			} else {
				nFormat[i] = name.charAt(i);
			}
		}
		return new String(nFormat);
	}
}
