package ex02;

public class SpecialNumber {
	public static void main(String[] args) {
		int n = 7;
        if (isSpecialNumber(n)) {
            System.out.println(n + " is a special number.");
        } else {
            System.out.println(n + " is not a special number.");
        }
	}
	public static boolean isSpecialNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            if (sum == n) {
                return true;
            }
        }
        return false;
    }
}
