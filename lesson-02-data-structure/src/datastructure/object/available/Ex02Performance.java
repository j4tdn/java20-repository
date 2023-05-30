package datastructure.object.available;

import java.security.PublicKey;

public class Ex02Performance {

	public static void main(String[] args) {
		long N = 3000000000l; // 1 triệu
		
		
		long start = System.currentTimeMillis();
		for (long i = 1; i <= N; i++) {
			Integer iA = new Integer(99);
			Integer iB = new Integer(99);
			
		}
		long end = System.currentTimeMillis();
		System.out.println("duration = " + (end -start) + "(ms)");

		System.out.println("--------");
		
		
		start = System.currentTimeMillis();
		for (long i = 1; i <= N; i++) {
			Integer iA = 9;
			Integer iB = 99;
			
		}
		end = System.currentTimeMillis();

		System.out.println("duration = " + (end -start) + "(ms)");

	}


}
