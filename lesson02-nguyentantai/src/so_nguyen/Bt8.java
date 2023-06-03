package so_nguyen;

import java.util.Scanner;

public class Bt8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numberAsText = ""; // vì dùng do while nên numberAsTest = ""
        int i = 0;
		do {
			System.out.print("Nhap so nguyen duong N: ");
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
		for(int t = 2; t<(number-1); t++) {
			if(number%t==0) {
				System.out.print(number + " --> false");
				break;
			}else {
				System.out.print(number + " --> true");
				break;
			}
		}
	}
}
