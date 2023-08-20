package view;

import java.util.Scanner;

public class Exercises02 {

	 public static void main(String[] args) {
	        Scanner ip = new Scanner(System.in);

	        System.out.print("Nhập vào họ tên: ");
	        String fullName = ip.nextLine();

	        String formattedName = formatName(fullName);
	        System.out.println("Kết quả: " + formattedName);
	    }

	    public static String formatName(String fullName) {
	        String[] nameParts = fullName.split("\\s+");
	        StringBuilder formattedName = new StringBuilder();

	        for (String namePart : nameParts) {
	            if (!namePart.isEmpty()) {
	                formattedName.append(Character.toUpperCase(namePart.charAt(0)))
	                             .append(namePart.substring(1).toLowerCase())
	                             .append(" ");
	            }
	        }

	        return formattedName.toString().trim();
	    }
}
