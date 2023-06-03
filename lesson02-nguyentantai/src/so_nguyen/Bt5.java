package so_nguyen;

import java.util.Scanner;

public class Bt5 {
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
		
		// ép kiểu để so sánh với số nguyên
		int number = Integer.parseInt(numberAsText);
		// nhập vào phải là số nguyên dương
		while (number<10) {
			System.out.println("Nhap lai so nguyen duong N: ");
			numberAsText = sc.nextLine();
			number = Integer.parseInt(numberAsText);
		}
		int giatri = number;
		int daonguoc = 0;
		while (giatri!=0) {
			// vd 121 : 
			// L1 :   daonguoc = 0 * 10 + 121 % 10 =  0 + 1
			// L2 :   daonguoc = 1 * 10 + 12 % 10 = 10 + 2
			// L3 :   daonguoc = 12 * 10 + 1 % 10 = 120 + 1
			daonguoc = daonguoc * 10 + giatri % 10;
			giatri = giatri / 10;
		}
		if (daonguoc == number) {
			System.out.println("đây là số đối xứng");
		}else {
			System.out.println("đây không phải là số đối xứng");
		}
		
	}
}
