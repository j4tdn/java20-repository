package ex03;

public class Ex03MaxValidNumber {
	public static void main(String[] args) {
		System.out.println(getMaxValidNumber("12abu02muzk586cyx")); 
		System.out.println(getMaxValidNumber("Uyk892nn1234uxo2")); 
		System.out.println(getMaxValidNumber("hi"));
	}
	public static int getMaxValidNumber(String str) {
	    int maxNumber = -1;
	    for (int i = 0; i < str.length(); i++) {
	        for (int j = i; j < str.length(); j++) {
	            String segment = str.substring(i, j + 1);
	            if (isNaturalNumber(segment)) {
	                int number = Integer.parseInt(segment);
	                if (number > maxNumber) {
	                    maxNumber = number;
	                }
	            }
	        }
	    }
	    return maxNumber;
	}

	public static boolean isNaturalNumber(String str) {
	    if (str.length() == 0 || str.charAt(0) == '0') {
	        return false;
	    }
	    for (int i = 0; i < str.length(); i++) {
	        if (!Character.isDigit(str.charAt(i))) {
	            return false;
	        }
	    }
	    return true;
	}
}
