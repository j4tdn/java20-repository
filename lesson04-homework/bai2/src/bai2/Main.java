package bai2;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
        
        List<Integer> divisibleBy7 = new ArrayList<>();
        List<Integer> divisibleBy5 = new ArrayList<>();
        List<Integer> others = new ArrayList<>();
        
        for (int number : numbers) {
            if (number % 7 == 0 && number % 5 == 0) {
                divisibleBy7.add(number);
                divisibleBy5.add(number);
            } else if (number % 7 == 0) {
                divisibleBy7.add(number);
            } else if (number % 5 == 0) {
                divisibleBy5.add(number);
            } else {
                others.add(number);
            }
        }
        
        List<Integer> result = new ArrayList<>();
        result.addAll(divisibleBy7);
        result.addAll(others);
        result.addAll(divisibleBy5);
        
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
