package ex03;

public class FindMaxNumberInString {
	public static void main(String[] args) {
        String str = "12abu02muzk586cyx";
        int maxNumber = findMaxNumber(str);
        System.out.println("max number in string: " + maxNumber);
    }

    public static int findMaxNumber(String str) {
        int maxNumber = 0;
        int currentNumber = 0;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (Character.isDigit(a)) {
                currentNumber = currentNumber * 10 + Character.getNumericValue(a);
            } else if (currentNumber > 0) {
                maxNumber = Math.max(maxNumber, currentNumber);
                currentNumber = 0;
            }
        }
        return Math.max(maxNumber, currentNumber);
    }
}
