
package final_test;
import java.io.*;
import java.util.*;

public class FindNumberInString {
    public static void main(String[] args) {
        try {
            // Đọc dữ liệu từ file input.txt
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            int n = Integer.parseInt(reader.readLine().trim()); // số lượng chuỗi
            List<Integer> numbers = new ArrayList<>();
            
            // Tìm số
            for (int i = 0; i < n; i++) {
            	String line = reader.readLine().trim();
            	String currentNumber = "";
                
                for (int j = 0; j < line.length(); j++) {
                    char ch = line.charAt(j);
                    
                    if (Character.isDigit(ch)) {
                        // nếu là số -> thêm vào chuỗi current
                        currentNumber += ch;
                    } else {
                        // K phải số -> Reset chuỗi current, thêm vào array nếu nó chứa số
                        if (currentNumber.length() > 0) {
                            numbers.add(Integer.parseInt(currentNumber.toString()));
                            currentNumber = ""; // Reset
                        }
                    }
                }
                
                // Kiểm tra nếu còn số trong currentNumber khi kết thúc chuỗi
                if (currentNumber.length() > 0) {
                    numbers.add(Integer.parseInt(currentNumber.toString()));
                }
            }
            reader.close();
            
            // Sort
            Collections.sort(numbers);
            
            // Output
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            for (int num : numbers) {
                writer.write(Integer.toString(num));
                writer.newLine();
            }
            writer.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}