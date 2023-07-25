package view;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bean.InvalidException;

public class Exercises03 {
	
	private static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        
            while (true) {
                System.out.println("Please enter your email address:\n ");
                String email = ip.nextLine();
                try {
                    validateEmail(email);
                    System.out.println("Valid email address: " + email);
                    break; // If email is valid, break the loop.
                } catch (InvalidException e) {
                    System.out.println(e.getMessage());
                }
            }
        
            ip.close();
        
    }

    private static void validateEmail(String email) throws InvalidException {

    	 String regex = "^[a-zA-Z0-9._%+-]+[a-zA-Z0-9]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    	
         if (!email.matches(regex) || email.startsWith(".") || email.contains("..") || email.endsWith(".")) {
             throw new InvalidException("Invalid email address! Please enter a valid email address.");
         }
    }
}

