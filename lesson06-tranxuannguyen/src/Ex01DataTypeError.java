import java.util.Scanner;

public class Ex01DataTypeError {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		while(true) {
			try {
				 System.out.println("Nhập a:");
				 a = Integer.parseInt(sc.nextLine());
				 System.out.println("Nhập b:");
				 b = Integer.parseInt(sc.nextLine());
				break;
			} catch (ArithmeticException | NumberFormatException e) {
					 System.out.println("\nKiểu dữ liệu không hợp lệ! Vui lòng nhập lại: \n");
			}
		}
		
		System.out.println(firstDegreeEquation(a, b));
		sc.close();
	}
	
	private static double firstDegreeEquation(int a, int b) {
		if(a == 0) {
			throw new ArithmeticException("Mẫu số không được bằng 0!");
		}else {
			return -b / a;
		}
	}
}