import java.util.Scanner;

public class Ex05CheckSymmetricalNumber {
	public static Integer inputN() {
		Scanner n = new Scanner(System.in);
		for (int i = 0; i<5; i++) {
			System.out.print("Nhap N: ");
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
	public static boolean isSymmetricalNumbe(int n) {
        String str = Integer.toString(n);
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		Integer n = inputN();
		if (n==null) {
			System.out.println("N da nhap khong hop le");
		}else {
			if (isSymmetricalNumbe(n)) {
	            System.out.println("--> true ");
	        } else {
	            System.out.println("--> false ");
	        }
		}
	}
}
