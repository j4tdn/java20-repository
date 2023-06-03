package lesson02;

import java.util.Scanner;

public class Ex05PalindromeNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int number;
		do {
			System.out.print("Nhập vào số nguyên 2 chữ số: ");
			if(ip.hasNextInt())
			{
			number	= ip.nextInt();
			if(number>=10 )
			{
				boolean isPalindrome = checkPalindrome(number);
                System.out.println(number + " là số " + (isPalindrome ? "đối xứng" : "không đối xứng"));
				break;
			}else {
				System.out.println("Vui lòng nhập 2 chữ số");
			}		
			}else {
				System.out.println("Nhập sai định dạng");
				ip.next();
			}
		}while(true);
		ip.close();
	}
	private static boolean checkPalindrome(int number) {
		int reverse = 0;
		int temp = number;
		while(temp!=0)
		{
			int remainder = temp%10;
			reverse = reverse*10 + remainder;
			temp=temp/10;
		}
		return number == reverse;
	}
}
