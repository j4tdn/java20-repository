package a.validate_trycatch_throw_throws;

import java.time.Year;
import java.util.Scanner;

import org.w3c.dom.Text;

public class Ex01DemoMain_Validation {
	
	/**
	 * 1.Enter a year of birth >> calculate age of candidate
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your year of birth: " );
		
		//Cách 1: Xử lý exception với validation (tiền xử lý)
		
		String text = sc.nextLine();
		while(!text.matches("\\d+")){
			System.out.println("Enter a valid number, please: ");
			text = sc.nextLine();
		}
		int yearOfBirth = Integer.parseInt(text);
		
		System.out.println("Age --> " + (Year.now().getValue() - yearOfBirth ));
	
		sc.close();
	}
	
}
