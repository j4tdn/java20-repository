

/*
 *  Viết chương trình(hàm) kiểm tra số nguyên N có phải là lũy thừa của 2 hay không
 *  Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
 *  (tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
 */
public class Ex02IsPowerOf2 {
	public static boolean isPowerOf2(int n) {
		while(n > 2) {
			if(n%2 != 0)
				return false;
			else
				n /= 2;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Integer n = Ex01IsMultiOf2.inputNumber();
		if(n == null)
			System.out.println("\nSo vua nhap khong hop le!!!");
		else {
			System.out.println("\nSo vua nhap la: " + n);
			String message = isPowerOf2(n) ? n + " la luy thua cua hai" : n + " khong phai luy thua cua 2";
			System.out.println(message);
		}
	}
}
