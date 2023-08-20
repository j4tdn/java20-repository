public class Ex07{

	public static void main(String[] args) {
        String S = "aaabaaabbaaaaa"; // Chuỗi ban đầu

        int maxLength = maxLengthOfConsecutiveSequence(S);
        int minLength = minLengthOfConsecutiveSequence(S);

		System.out.println("Độ dài lớn nhất của dãy con đúng: " + maxLength + " ''" + " [ ]");
        System.out.println("Độ dài nhỏ nhất của dãy con đúng: " + minLength + " ''" + " [ ]");
    }

    public static int maxLengthOfConsecutiveSequence(String S) {
        int maxLength = 0;
        int currentLength = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }

        maxLength = Math.max(maxLength, currentLength);

        return maxLength;
    }

    public static int minLengthOfConsecutiveSequence(String S) {
        int minLength = Integer.MAX_VALUE;
        int currentLength = 1;

        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                currentLength++;
            } else {
                minLength = Math.min(minLength, currentLength);
                currentLength = 1;
            }
        }

        minLength = Math.min(minLength, currentLength);

        return minLength;
    }
}