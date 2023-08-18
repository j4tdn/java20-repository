package exercises;

public class Ex07 {
	public static void main(String[] args) {
		String str = "111mmssddssaaaa"; // Xâu kí tự S

		int currentCount = 1;
		int maxCount = 1;
		int minCount = str.length();
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				currentCount++;
				if (currentCount > maxCount) {
					maxCount = currentCount;
				}
			} else {
				if (currentCount < minCount) {
					minCount = currentCount;
				}
				currentCount = 1;
			}
		}
		minCount = Math.min(currentCount, minCount);
		System.out.println("Max count: " + maxCount);
		System.out.println("Min count: " + minCount);
	}
}
