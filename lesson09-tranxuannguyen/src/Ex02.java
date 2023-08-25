public class Ex02{
	public static void main(String[] args) {
        int number = 44;
        boolean isHappy = isHappyNumber(number);

        if (isHappy) {
            System.out.println(number + " is a Happy Number.");
        } else {
            System.out.println(number + " is FA Number.");
        }
    }
	
    public static boolean isHappyNumber(int number) {
        int i = number;
        int j = number;

        do {
            i = calculateNextNumber(i);
            j = calculateNextNumber(calculateNextNumber(j));
        } while (i != j);
        
        return i == 1;
    }

    private static int calculateNextNumber(int number) {
        int nextNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            nextNumber += digit * digit;
            number /= 10;
        }
        return nextNumber;
    }
}