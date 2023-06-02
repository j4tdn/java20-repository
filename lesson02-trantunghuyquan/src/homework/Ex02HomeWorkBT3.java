package homework;

import java.util.Scanner;

public class Ex02HomeWorkBT3 {
	public static void main(String[] args) {
		int n;
		int dem = 0;
		Scanner sc = new Scanner(System.in);
		while (dem < 5) {
			try { // thử
				System.out.println("Nhập n : ");// nhập từ bàn phím
				n = Integer.parseInt(sc.nextLine());
				if (n > 0) {
					// nội dung cần sửa
					System.out.println(tinhGiaiThua(n));
//					if (isPowerOfTwo(n)) {
//						System.out.println(+n + " là giai thừa của 2"); // return true;
//					} else {
//						System.out.println(+n + " Không phải là giai thừa của của 2");
//					}
					System.out.println(isPowerOfTwo(n));
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

	public static boolean isPowerOfTwo(int number) {
		if (number <= 0) {
			return false;
		}

		while (number > 1) {
			if (number % 2 != 0) {
				return false;
			}
			number /= 2;
		}

		return true;
	}
	public static int tinhGiaiThua(int number) {
        int giaiThua = 1;
        
        for (int i = 1; i <= number; i++) {
            giaiThua *= i;
        }
        
        return giaiThua;
    }
}
