package view;

public class Exercises07 {

	public static void main(String[] args) {
        String s = "aaabaaabbaaaaa";
        int maxLength = maxConsecutiveLength(s);
        int minLength = minConsecutiveLength(s);
        
        System.out.println("Độ dài lớn nhất của dãy con đúng: " + maxLength);
        System.out.println("Độ dài nhỏ nhất của dãy con đúng: " + minLength);
    }
    
    public static int maxConsecutiveLength(String s) {
        int maxLen = 1;
        int currentLen = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentLen++;
                maxLen = Math.max(maxLen, currentLen);
            } else {
                currentLen = 1;
            }
        }
        
        return maxLen;
    }
    
    public static int minConsecutiveLength(String s) {
        int minLen = Integer.MAX_VALUE;
        int currentLen = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentLen++;
            } else {
                minLen = Math.min(minLen, currentLen);
                currentLen = 1;
            }
        }
        
        return Math.min(minLen, currentLen);
    }
}
