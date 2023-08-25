package exam;

import java.util.HashSet;
import java.util.Set;

public class Ex02HappyNumber {
	public static void main(String[] args) {
		int number =44;
		 boolean isHappy = isHappyNumber(number);
		 System.out.println("--- IS HAPPY NUMBER ---");
		  if (isHappy) {
	            System.out.println(number + " is a happy number.");
	        } else {
	            System.out.println(number + " is a FA number.");
	        }
		
	}
	/*
	 44!=1 -> add(44) in visited ->getNextNumber(44) 
	 32!=0 -> add(32) in visited ->getNextNumber(32)
	 ...
	 -->number ==1 ->return 1;
	 --> vòng lặp vô hạn -> false
	 	
	
	 */
	public static boolean isHappyNumber(int number) {
	    Set<Integer> visited = new HashSet<>();
	    while (number != 1 && !visited.contains(number)) {
	        visited.add(number);
	        number = getNextNumber(number);//44->32->13->10->1
	    }
	    return number == 1;
	}

	public static int getNextNumber(int number) {
	    int sum = 0;
	    while (number > 0) {
	        int digit = number % 10;
	        sum += digit * digit;
	        number /= 10;
	    }

	    return sum;
	}
	
}
