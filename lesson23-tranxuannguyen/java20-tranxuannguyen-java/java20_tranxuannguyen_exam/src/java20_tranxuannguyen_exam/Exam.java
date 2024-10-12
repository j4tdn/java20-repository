package java20_tranxuannguyen_exam;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Exam {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            int n = Integer.parseInt(reader.readLine().trim());

            // Làm được nhưng chưa vận được được các method trong stream khá nhanh
            // Em mày mò stream flatMap code sẽ gọn hơn nhé
            for (int i = 0; i < n; i++) {
                String line = reader.readLine().trim();
                numbers.addAll(extractNumbers(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Collections.sort(numbers);
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            for (Integer number : numbers) {
                writer.write(number.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static List<Integer> extractNumbers(String s) {
        List<Integer> numbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
        
        while (matcher.find()) {
            String numStr = matcher.group();
            int number = Integer.parseInt(numStr);
            numbers.add(number);
        }
        
        return numbers;
    }
}
