package homework08;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // nhập từ bàn phím
		String input;
		while(true) {
			System.out.print("Enter string: ");
			input = sc.nextLine();
			if(checkInput(input)) {
				break;
			}
		}
		sc.close();
		System.out.println("input --> " + input);
		System.out.println( capitalizeFirstLetter(input));
	}

	private static boolean checkInput(String input) {
		if (input.matches("^[a-zA-Z\\s]+$")) {
			return true;
		}
		return false;
	}
	
	private static String capitalizeFirstLetter(String input) {
		String[] tokens = input.trim().split("\\s");
		for(int i = 0; i < tokens.length; i++) {
			char c = Character.toUpperCase(tokens[i].charAt(0));
			tokens[i] = String.valueOf(c).concat(tokens[i].substring(1, tokens[i].length()).toLowerCase());
		}
		return String.join(" ", tokens);
	}
}
