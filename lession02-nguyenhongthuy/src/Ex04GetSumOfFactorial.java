

import java.util.Random;

/*
 * Viết chương trình tính tổng giải thừa của các số nguyên dương S = a! +b! + c! + d!
 * Biết rằng a,b,c,d là các số nguyên ngẫu nhiên từ 10 đến 20  [10, 20]
 */
public class Ex04GetSumOfFactorial {
	public static long getSumOfFactorials(int a, int b, int c, int d) {
		return Ex03GetFactorial.getFactorial(a) + Ex03GetFactorial.getFactorial(b) + Ex03GetFactorial.getFactorial(c) + Ex03GetFactorial.getFactorial(d);
	}
	
	public static void main(String[] args) {
		 Random rd = new Random();
		 
		 int a, b, c, d;
		 a = rd.nextInt(10, 21);
		 b = rd.nextInt(10, 21);
		 c = rd.nextInt(10, 21);
		 d = rd.nextInt(10, 21);
		 
		 long s = getSumOfFactorials(a, b, c, d);
		 System.out.println(a + "! + " + b + "! + " + c + "! + " + d +"! = " + s);
	}
}
