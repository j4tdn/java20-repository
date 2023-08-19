package string;

import java.util.Scanner;

public class Ex06FindThe100thNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vị trí K: ");
        int k = scanner.nextInt();
        
        int number = findNumberAtPosition(k);
        System.out.println("Số ở vị trí " + k + " là: " + number);
    }
    
    public static int findNumberAtPosition(int k) {
        int digits = 1; // Độ dài của số
        int count = 9;  // Số lượng số có cùng độ dài
        int start = 1;  // Số bắt đầu của độ dài hiện tại
        
        while (k > count * digits) {
            k -= count * digits;
            digits++;
            count *= 10;
            start *= 10;
        }
        
        start += (k - 1) / digits;
        String numberStr = Integer.toString(start);
        int digitIndex = (k - 1) % digits;
        return Character.getNumericValue(numberStr.charAt(digitIndex));
    }
}
