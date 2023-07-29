package logic;
import java.util.Scanner;

public class Ex01FirstDegreeEquation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập hệ số a và b: ");
		double a, b;
		
		while(true) {
			try {
				a = Double.parseDouble(sc.nextLine());
				b = Double.parseDouble(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("Nhập sai! Nhập lại: ");
			}
		}
		double x = solveFirstEqua(a, b);
		System.out.println("Kết quả x = " + x);
		sc.close();
	}
	
	public static double solveFirstEqua(double a, double b) {
		if(a == 0) {
			System.out.println("Phương trình vô nghiệm");
			throw new ArithmeticException("Nhập lại a khác 0!!!");
		}
		return -b/a;
	}
}
