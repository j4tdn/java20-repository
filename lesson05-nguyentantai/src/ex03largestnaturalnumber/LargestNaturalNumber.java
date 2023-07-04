package ex03largestnaturalnumber;

public class LargestNaturalNumber {
	public static int getMaxValidNumber(String str) {
		int maxNumber = 0;
		int currentNumber = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) {
				currentNumber = currentNumber * 10 + Character.getNumericValue(c);
			}else {
				if (currentNumber > maxNumber) {
					maxNumber = currentNumber;
				}
				currentNumber = 0;
			}
		}
		if (currentNumber > maxNumber) {
			maxNumber = currentNumber;
		}
		return maxNumber;
	}
	
	public static void main(String[] args) {
		System.out.println(getMaxValidNumber("12abu02muzk586cyx"));
		System.out.println(getMaxValidNumber("Uyk892nn1234uxo2"));
	}
}
