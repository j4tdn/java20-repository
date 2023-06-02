import java.util.Scanner;

public class Ex02IsPowerOf2 {
	public static Integer inputN() {
		Scanner n = new Scanner(System.in);
		for (int i = 0; i<5; i++) {
			System.out.println("Nhap N: ");
			if(!n.hasNextInt()) {
				n.next();
			}else {
				int N = n.nextInt();
				if (N>0)
					return N;
			}
		}
		return null;
	}
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
		Integer N = inputN();
		if (N==null) {
			System.out.println("N da nhap khong hop le");
		}else {
			if(isPowerOf2(N)) {
				System.out.println("true");
			}else 
				System.out.println("false");
		}
	}
}
