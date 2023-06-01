package controlling;

import java.util.Random;

public class Ex01IfElse {
      public static void main(String[] args) {
		// cho random 1 số nguyên ngẫu  nhiên kiểm tra số đó có phải là số lẻ không
    	// if (expression biểu thức hoặc đoạn code) {
    	  //  if (expression == true) {} <==> if  if (expression){}
    	  //}
    	  Random rd = new Random();
    	  int n = rd.nextInt(5, 18);
    	  
    	  System.out.println("n --> "+ n);
    	  boolean isOdd = ( n % 2 != 0);
    	  
    	  String text = "";
    	  if (isOdd) {
    		  System.out.println(n + " is an odd number !!!");
    	  } else {
    		  System.out.println(n + "is an even number !!!");
    	  }
	}
}
