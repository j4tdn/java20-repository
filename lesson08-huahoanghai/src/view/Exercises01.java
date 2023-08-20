package view;

import java.util.Scanner;

public class Exercises01 {

	public static void main(String[] args) {
		 Scanner ip = new Scanner(System.in);

	       
	        System.out.print("Nhập vào một chuỗi : ");
	        String inputString = ip.nextLine();

	        printSingleCharacter(inputString);
	        
	        printCharacterPerLine(inputString);
	        
	        String input = reverseString(inputString);
	        
	        System.out.println(" từ đảo ngược: " + input );
	        
	        System.out.println(" kí tự đảo ngược --> " );
	        reverseStringCharacter(inputString);

	}
	
	private static void printSingleCharacter(String input) {
		System.out.println("In ra từng kí tự");
		for(char letter : input.toCharArray()) {
			System.out.println(letter);
		}
	}
	
	private static void printCharacterPerLine(String input) {
		System.out.println("In ra từng từ");
		
		
		input = input.trim().replaceAll("\\s+", " ");
		
		String[] tokens = input.trim().split(" ");
		
		for(String letter : tokens) {
			System.out.println(letter);
		}
	}
	
	private static String reverseString(String input) {
		
		if (input.isEmpty()) {
	        return input;
	    } else {
	        return reverseString(input.substring(1)) + input.charAt(0);
	    }
	}
	

	private static void reverseStringCharacter(String input) {
    
    
		String reversed = reverseString(input);
    
		for (char letter : reversed.toCharArray()) {
        System.out.println(letter);
   
		}
}
	
}
