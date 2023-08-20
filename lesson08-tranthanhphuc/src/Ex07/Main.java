package Ex07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập xâu kí tự S: ");
        String S = scanner.nextLine(); 
        
        int maxLength = calculateMaxLength(S);
        int minLength = calculateMinLength(S);
        
        System.out.println("Độ dài lớn nhất của dãy con đúng: " + maxLength);
        System.out.println("Độ dài nhỏ nhất của dãy con đúng: " + minLength);
    }
    
    public static int calculateMaxLength(String S) {
        int maxCount = 1;
        int currentCount = 1;
        
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 1;
            }
        }
        
        return maxCount;
    }
    
    public static int calculateMinLength(String S) {
        int minCount = Integer.MAX_VALUE;
        int currentCount = 1;
        
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                currentCount++;
            } else {
                minCount = Math.min(minCount, currentCount);
                currentCount = 1;
            }
        }
        
        minCount = Math.min(minCount, currentCount);
        
        return minCount;
    }
}
