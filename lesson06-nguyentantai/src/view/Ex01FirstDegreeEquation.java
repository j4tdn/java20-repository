package view;

import java.util.Scanner;

public class Ex01FirstDegreeEquation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b;
		while (true) {
			try {
				System.out.println("Nhập hệ số a: ");
				a = Double.parseDouble(sc.nextLine());
				System.out.println("Nhập hệ số b: ");
				b = Double.parseDouble(sc.nextLine());
				
				if (a==0) {
					throw new IllegalArgumentException("Hệ số a không thể là số 0. Xin nhập lại");
				}
				double x = -b/a;
				System.out.println("x = " + x);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Dữ liệu sai. Xin nhập lại");
			}catch (IllegalArgumentException e) {
				System.out.println("Lỗi: " + e.getMessage());
			}catch (Exception e) {
				System.out.println("Lỗi không xác định: " + e.getMessage());
			}
		}
		sc.close();
	}
}
