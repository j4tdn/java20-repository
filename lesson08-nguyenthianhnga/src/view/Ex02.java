package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter fullname: ");
			String fullName = sc.nextLine();
			if(fullName.matches("[A-Za-z ]+")) {
				System.out.println("Valid");
				System.out.println("Fullname is formated: "+format(fullName));
			}
		}catch(IllegalArgumentException iae) {
			System.out.println("Invaid");
		}
	}
	private static String format(String fullName)
	{
		String[] words = fullName.split("\\s+");
        StringBuilder formattedName = new StringBuilder();
        for (String word : words) {
        	 if (!word.isEmpty()) {
                 String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                 formattedName.append(capitalizedWord).append(" ");
             }
         }
        return formattedName.toString().trim();
        }
	}

