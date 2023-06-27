package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercises02 {
	public static void main(String[] args) {
	    Scanner ip = new Scanner(System.in);
	    int n;
	    do {
        System.out.print("Nhập số lượng chữ số N: ");
         n = ip.nextInt();
	    }while(n<5 || n>100);
	    
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Nhập dãy số nguyên:");
        for (int i = 0; i < n; i++) {
            System.out.print("Số thứ " + (i + 1) + ": ");
            int num = ip.nextInt();
            numbers.add(num);
        }

        ip.close();

        List<Integer> divisibleBy7 = new ArrayList<>();
        List<Integer> divisibleBy5 = new ArrayList<>();
        List<Integer> others = new ArrayList<>();

        for (int num : numbers) {
            if (num % 7 == 0 && num % 5 == 0) {
            	others.add(num);
            } else if (num % 7 == 0) {
                divisibleBy7.add(num);
            } else if (num % 5 == 0) {
                divisibleBy5.add(num);
            } else {
                others.add(num);
            }
        }

        List<Integer> result = new ArrayList<>();
        result.addAll(divisibleBy7);
        result.addAll(others);
        result.addAll(divisibleBy5);
        
        System.out.println("Kết quả:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
