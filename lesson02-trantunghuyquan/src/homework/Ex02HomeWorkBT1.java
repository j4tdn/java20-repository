package homework;

import java.util.Scanner;

public class Ex02HomeWorkBT1 {
	public static void main(String[] args) {
		int n;
		int dem = 0;
		Scanner sc = new Scanner(System.in);
		while (dem < 5) {
			try { // thử
				System.out.println("Nhập n : ");// nhập từ bàn phím
				n = Integer.parseInt(sc.nextLine());
				if (n > 0) {
					if (n % 2 == 0) {
						System.out.println(+n + " là bội số của 2");
					} else {
						System.out.println(+n + " Không phải là bội số của 2");
					}
					break; // dừng vòng lặp
				} else {
					dem++;
					System.out.println("Vui lòng nhập lại !");
				}
// lỗi nhập
			} catch (NumberFormatException exception) {
				dem++;
				System.out.println("Vui lòng nhập lại !");
			}
		}
	}
}
