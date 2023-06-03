package so_nguyen;

import java.util.Scanner;

public class Bt3 {
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
		int gt = 1;
		int h = number;
		int leng = number -1;
		for (int t = 0; t < leng; t++ ) {
			gt = gt * number;
			number--;
		}
		System.out.println(h + "! = " + gt);
	}
}
