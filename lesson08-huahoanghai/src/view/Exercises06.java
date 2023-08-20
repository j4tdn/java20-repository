package view;

import java.util.Scanner;

public class Exercises06 {
	
	public static void main(String[] args) {
        int position = 100; 
        int currentNumber = 1; 
        int digitsCount = 1; 
        
        while (position > 0) {
            if (position <= digitsCount) {
                System.out.println("Số ở vị trí thứ 100 là: " + getDigitAtPosition(currentNumber, position));
                break;
            }
            
            position -= digitsCount;
            currentNumber++;
            digitsCount = countDigits(currentNumber);
        }
    }
    
    // Hàm đếm số chữ số của một số nguyên dương
    public static int countDigits(int number) {
        return (int) Math.log10(number) + 1;
    }
    
   
    public static int getDigitAtPosition(int number, int position) {
        int digitsCount = countDigits(number);
        int reversedPosition = digitsCount - position;
        for (int i = 0; i < reversedPosition; i++) {
            number /= 10;
        }
        return number % 10;
    }
}

