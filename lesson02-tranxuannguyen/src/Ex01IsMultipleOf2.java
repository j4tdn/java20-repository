import java.util.Scanner;

public class Ex01IsMultipleOf2 {
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
	public static void main(String[] args) {
		Integer N = inputN();
		if (N==null) {
			System.out.println("N da nhap khong hop le");
		}else {
			if (N%2==0) {
				System.out.println("N la boi so cua 2");
			}else {
				System.out.println("N khong la boi cua 2");
			}
		}
	}

}
