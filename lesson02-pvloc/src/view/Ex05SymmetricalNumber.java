package view;

public class Ex05SymmetricalNumber {
     public static void main(String[] args) {
    	 int number = 15651;

 		System.out.println(number + " is symectric --> " + isSymetric(number));
 	}

 	private static boolean isSymetric(int number) {
 		return number == reverse(number);
 	}

 	private static int reverse(int number) {
 		int reverse = 0;
 		while (number != 0) {
 			reverse = reverse * 10 + number % 10;
 			number /= 10;
 		}
 		return reverse;
 	
	}
}
