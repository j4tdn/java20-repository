package view;

import java.util.Scanner;

import bean.InvalidException;

public class Exercises02 {

	private static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        
            while (true) {
                System.out.println("Please enter your password: ");
                String password = ip.nextLine();
                try {
                    validatePassword(password);
                    System.out.println("Valid password.");
                    break; 
                } catch (InvalidException e) {
                    System.out.println(e.getMessage());
                }
            }
    
           ip.close();
    }

    private static void validatePassword(String password) throws InvalidException {
       
        if (password.length() < 8 || password.length() > 256) {
            throw new InvalidException("Invalid password! Password must have at least 8 characters and at most 256 characters.");
        }
        
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).+$";
        if (!password.matches(regex)) {
            throw new InvalidException("Invalid password! Password must contain at least one lowercase letter, one uppercase letter, one digit, and one special character.");
        }
    }
}

