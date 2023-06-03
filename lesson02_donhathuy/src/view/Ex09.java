package view;

public class Ex09 {
	public static void main(String[] args) {
		int n;
		int dem = 0;
		for (n= 1; n <=10000; n++) {
			if (Ex08.isPrime(n)) {
				dem = dem +1;
				if (dem == 200) break;
			}
				
		}
		System.out.println("200th prime number is: "+ n);
	}

}
