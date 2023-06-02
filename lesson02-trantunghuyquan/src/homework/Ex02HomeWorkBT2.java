package homework;

import java.util.Scanner;

public class Ex02HomeWorkBT2 {
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
					if (isPowerOfTwo (n)) {
						System.out.println(+n + " là lũy thừa 2");
					} else {
						System.out.println(+n + " Không phải là lũy thừa của 2");
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
}
