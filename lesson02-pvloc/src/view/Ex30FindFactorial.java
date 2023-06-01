package view;

public class Ex30FindFactorial {
      public static void main(String[] args) {
    	
    			int n = 5;
    			System.out.println(n + "! = " + fact(n));
    		}

    		private static int fact(int n) {
    			// n! = n*(n-1)*(n-2)*...2
    			int f = 1;
    			while (n > 1) {
    				f *= n--;
    			}
    			return f;
    		}
	}

