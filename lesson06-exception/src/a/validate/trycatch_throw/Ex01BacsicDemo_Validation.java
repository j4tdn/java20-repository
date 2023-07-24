package a.validate.trycatch_throw;

import java.time.Year;
import java.util.Scanner;

public class Ex01BacsicDemo_Validation {
  public static void main(String[] args) {
	 Scanner ip = new Scanner(System.in);
	  System.out.print("Enter your Year of Bỉth = ");
	  
	  // cach 1 : xu ly excep voi validation(tien xu ly)
	  String text  = ip.nextLine();
	  //validate cho text la day so hop le roi moi goi ham parseInt
	  while(!text.matches("\\d+")) {
		  System.out.print("Please enter a valid number = ");
		  text = ip.nextLine();
	  }
	  int yearOfBirth = Integer.parseInt(ip.nextLine());
	  
	  System.out.print("Arg -->" +(Year.now().getValue()- yearOfBirth+ 1));
	 ip.close();
}
}
