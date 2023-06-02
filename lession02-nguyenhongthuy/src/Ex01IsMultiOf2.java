
import java.util.Scanner;

/*
 * Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
 * Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ 
 * (tối đa 5 lần)
 */
public class Ex01IsMultiOf2 {
	public static Integer inputNumber() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++ ) {
			System.out.print("Nhap so nguyen duong: ");
			if(!sc.hasNextInt()) 
				sc.next();
			else {
				int n = sc.nextInt();
				if(n > 0)
					return n;
			}
		}
		return null;
	}
	
	public static boolean isMultipleOf2(int n) {
		if(n%2 == 0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Integer n = inputNumber();
		if(n == null)
			System.out.println("\nSo vua nhap khong hop le!!!");
		else {
			System.out.println("\nSo vua nhap la: " + n);
			String message = isMultipleOf2(n) ? n + " la boi cua hai" : n + " khong phai boi cua 2";
			System.out.println(message);
		}
	}
}
