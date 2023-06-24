package controlling;

import java.util.Scanner;

public class Ex05WhileDoWhile {
	
	
	public static void main(String[] args) {
//		int n = 8;
		int i = 0;
		while(i < 8) {
			System.out.print(i + "");
			i++;
		}
		
		System.out.println("\n=====");
		i =1;
		while(true) {
			System.out.print(i + "");
			i++;
			if(i == 8) {
				break;
			}
		}
		System.out.println("\n=====");
		i = 1;
		do {
			System.out.print(i + "");
			i++;
		}while(i < 8);
		
		//nhap vao cai so nguyen hop le kiem tra so do co phai so nguyen to hay khong,
		//neu nhap sai yeu cau nhap lai
		
		Scanner ip = new Scanner(System.in);
		
		//ip.nextline() : asd a21 12asd thi fail;
		//nguyen nhan : do nguoi dung nhap sai 
		//require: nhap vao tat ca cac ki tu phai la so 
		//cach xu ly: c1 : validation
				//kiemr tra ip.nextline() laf hop le truoc khi Integer.parseInt
					//c2 : cho nhap thoai mai --> sai --> Integer.parseInt(ip.nextline()) quang loi exception
					// dung code bat loi exception do va yeu cau nguoi dung nhap lai
		
		
		String text = "";
		//validation text is a number
		do{
			System.out.println("enter number(valid): ");
			text = ip.nextLine();
		}while(!isNumber(text));
		
		int number = Integer.parseInt(text);
		System.out.println("is Prime: " + isPrime(number));
		ip.close();
		
		//thoát hàm main --> return; (kết thúc hàm trả về void)
		//thoát chương trình --> system.exit();
	}
	
	//ip.nextline() : asd a21 12asd thi fail;
	private static boolean isNumber(String text) {
		for(int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if(!Character.isDigit(letter)) {
				return false;
			}
			
		}
		return true;
	}
	private static boolean isPrime(int number) {
		
		for(int i =2 ; i < number; i++) {
			if(number % i == 0) {
				return false;
			}
			
		}
		return number < 2 ? false : true;
	}
}
