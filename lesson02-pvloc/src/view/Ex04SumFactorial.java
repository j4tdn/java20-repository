package view;

import utils.InputUtils;

public class Ex04SumFactorial {
      public static void main(String[] args) {
    	  int a = InputUtils.random(1, 6);
  		int b = InputUtils.random(1, 6);
  		int c = InputUtils.random(5, 10);

  		System.out.println("a --> " + a);
  		System.out.println("b --> " + b);
  		System.out.println("c --> " + c);

  		System.out.println("fact(a) --> " + fact(a));
  		System.out.println("fact(b) --> " + fact(b));
  		System.out.println("fact(c) --> " + fact(c));

  		int sum = fact(a) + fact(b) + fact(c);
  		System.out.println("sum factorial of " + a + ", " + b + ", " + c + "  --> " + sum);
  	}

  	// validation --> n! > MAX --> error(re-enter) (convert long)
  	private static int fact(int n) {
  		// n! = n*(n-1)*(n-2)*...2
  		System.out.println("========================");
  		int f = 1;
  		while (n > 1) {
  			int prev = f;
  			f *= n--;
  			System.out.println("f(" + n + ") --> " + f);
  			if (f < prev) {
  				System.out.println("factorial exceed max int ");
  				return Integer.MAX_VALUE;
  			}
  		}
  		return f;
  	}
	}

