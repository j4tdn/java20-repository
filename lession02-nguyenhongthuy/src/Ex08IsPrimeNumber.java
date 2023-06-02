
/*
 * Viết chương trình(hàm) kiểm tra số nguyên N có phải là số nguyên tố hay không
 * Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
 * (tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
 */
public class Ex08IsPrimeNumber {
	public static boolean isPrimeNumber(int n) {
		if(n < 2)
			return false;
		for(int i = 2; i <= Math.sqrt(n); i++)
			if(n%i == 0)
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		Integer n = Ex01IsMultiOf2.inputNumber();
		if(n == null)
			System.out.println("\nSo vua nhap khong hop le!!!");
		else {
			System.out.println("\nn --> " + n);
			String message = isPrimeNumber(n) ? n + " la so nguyen to" : n + " khong phai so nguyen to";
			System.out.println(message);
		}
	}
}
