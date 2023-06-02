

import java.util.Scanner;
/*
 * Viết chương trình kiểu tra N có phải là số đối xứng hay không
 * Biết rằng N được nhập từ bàn phím là một số nguyên dương có tối thiểu 2 chữ số
 */
public class Ex05IsPalindrome {
	public static int inputNumber() {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap n(toi da 2 chu so): ");
			while(!sc.hasNextInt()) {
				System.out.print("Nhap n(toi da 2 chu so): ");
				sc.next();
			}
			n = sc.nextInt();
		}while(n < 10);
		return n;
	}
	
	public static boolean isPalindrome(int number) {
		int m = 0, temp;
		int n = number;
		while(n != 0) {
			temp = n%10;
			m = m*10 + temp;
			n /= 10;
		}
		if(m != number)
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		int n = inputNumber();
		System.out.println("\nn --> " + n);
		String message = isPalindrome(n) ? n + " la so doi xung!" : n + " khong phai so doi xung!";
		System.out.println(message);
	}
}
