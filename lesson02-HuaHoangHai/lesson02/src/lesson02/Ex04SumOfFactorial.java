package lesson02;

import java.util.Random;

public class Ex04SumOfFactorial {
	public static void main(String[] args) {
		  long S = 0L;
	        Random rd = new Random();

	        for (int i = 1; i <= 4; i++) {
	            int boundValue = rd.nextInt(10,20) ;
	            long result = calculateFactorial(boundValue);
	            S += result;
	            
	        }
	        
	        System.out.print("S = " + S);
	    }

	    private static long calculateFactorial(int n) {
	        long factorial = 1L;
	        for (int i = 1; i <= n; i++) {
	            factorial *= i;
	        }
	        System.out.println("n! = "+n+"!");
	        return factorial;
	    }
}
