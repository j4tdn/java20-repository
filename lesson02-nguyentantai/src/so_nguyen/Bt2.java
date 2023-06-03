package so_nguyen;

import java.util.Iterator;
import java.util.Scanner;

public class Bt2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numberAsText = ""; // vì dùng do while nên numberAsTest = ""
		int i = 0;
		
		// kiểm tra numberAsText là số
		do {
			System.out.println("Nhap so nguyen duong N: ");
			numberAsText = sc.nextLine();
			// nhập tối đa 5 lần
			i++;
			if (i>4) return;
			// \\d là số nguyên
			// + là 1 hoặc nhiều
			// matches là dạng format KDL
		} while (!numberAsText.matches("\\d+")); 
		
		int number = Integer.parseInt(numberAsText);
		// nhập vào phải là số nguyên dương
		if (number<=0) return;   
		if(number==1){
	    	     System.out.println("false");
	    }else{
	        int x = number/2;
	        int y = number%2;
	        while (x>0){
	        	if (y==1) {
	            System.out.println("false");
	            return;
	        	};
	        	if (x==1) {
		            System.out.println("true");
		            return;
		        	};
		    y = x%2;
			x = x/2;
	        }
		}
	}
}
