package Ex02;

import java.util.Scanner;

public class Name {
	
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Nhập vào họ tên:");
     String hoTen = sc.nextLine();

     String hoaDau = "";
     String[] tu = hoTen.split(" "); 
     for (String s : tu) {
         if (!s.isEmpty()) { 
             s = s.toLowerCase(); 
             s = s.replaceFirst(s.substring(0, 1), s.substring(0, 1).toUpperCase()); 
             hoaDau += s + " "; 
         }
     }

     System.out.println("Họ tên là : ");
     System.out.println(hoaDau.trim()); 
 	}
}
