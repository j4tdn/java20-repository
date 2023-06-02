import java.util.Scanner;

public class Ex08CheckPrimeNumber {
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
	public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		Integer N = inputN();
		if (N==null) {
			System.out.println("N da nhap khong hop le");
		}else {
			if (isPrime(N)) {
	            System.out.println(" --> true ");
	        } else {
	            System.out.println(" --> false ");
	        }
		}
	}

}
