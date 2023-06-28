package bai2;

import java.util.ArrayList;
import java.util.List;

public class NumberSorting {
    public static void main(String[] args) {
        int[] numbers = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};

        List<Integer> divisibleBy7 = new ArrayList<>();
        List<Integer> divisibleBy5 = new ArrayList<>();
        List<Integer> otherNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 7 == 0 && number % 5 != 0) {
                divisibleBy7.add(number);
            } else if (number % 7 != 0 && number % 5 == 0) {
                divisibleBy5.add(number);
            } else {
                otherNumbers.add(number);
            }
        }

        // In các số chia hết cho 7 và không chia hết cho 5
        for (int number : divisibleBy7) {
            System.out.print(number + " ");
        }

        // In các số không chia hết cho 7 và không chia hết cho 5
        for (int number : otherNumbers) {
            System.out.print(number + " ");
        }

        // In các số chia hết cho 5 và không chia hết cho 7
        for (int number : divisibleBy5) {
            System.out.print(number + " ");
        }
    }
}