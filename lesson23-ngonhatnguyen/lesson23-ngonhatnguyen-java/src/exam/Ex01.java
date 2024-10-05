package exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		
	String inputFilePath = "D:\\JAVA20\\5. FrontEnd\\lesson23-ngonhatnguyen\\lesson23-ngonhatnguyen-java\\input.txt";
    String outputFilePath = "D:\\JAVA20\\5. FrontEnd\\lesson23-ngonhatnguyen\\lesson23-ngonhatnguyen-java\\output.txt";
	
    try {
        // Đọc dữ liệu từ file input.txt
        BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
        int n = Integer.parseInt(reader.readLine());
        System.out.println(n);
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            strings.add(reader.readLine());
        }
        reader.close();

        // Trích xuất và sắp xếp các số từ xâu
        List<Integer> numbers = result(strings);

        // Ghi dãy số đã sắp xếp vào file output.txt
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
        for (int number : numbers) {
            writer.write(String.valueOf(number));
            writer.newLine();
        }
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
 private static List<Integer> result(List<String> strings) {
        List<Integer> numbers = new ArrayList<>();
        for (String str : strings) {
            String[] numberAsStr = str.split("[^0-9]+");
            for (String number : numberAsStr) {
            	if (!number.isEmpty() && Integer.parseInt(number) != 0) {
                    numbers.add(Integer.parseInt(number));
                }
            }
        }
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        return numbers;
    }
}
