

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Bước 1: Đọc dữ liệu từ file input.txt
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            int n = Integer.parseInt(reader.readLine().trim()); // Đọc số lượng xâu
            List<Integer> numbers = new ArrayList<>();
            
            // Bước 2: Trích xuất các số từ xâu
            for (int i = 0; i < n; i++) {
                String line = reader.readLine().trim();
                StringBuilder currentNumber = new StringBuilder();
                
                for (int j = 0; j < line.length(); j++) {
                    char ch = line.charAt(j);
                    
                    if (Character.isDigit(ch)) {
                        // Nếu ký tự là số, thêm nó vào currentNumber
                        currentNumber.append(ch);
                    } else {
                        // Khi gặp ký tự không phải số và currentNumber có dữ liệu, chuyển thành số
                        if (currentNumber.length() > 0) {
                            numbers.add(Integer.parseInt(currentNumber.toString()));
                            currentNumber.setLength(0); // Reset lại để tiếp tục trích xuất số mới
                        }
                    }
                }
                
                // Kiểm tra nếu còn số trong currentNumber khi kết thúc chuỗi
                if (currentNumber.length() > 0) {
                    numbers.add(Integer.parseInt(currentNumber.toString()));
                }
            }
            reader.close();
            
            // Bước 3: Sắp xếp các số theo thứ tự không giảm
            Collections.sort(numbers);
            
            // Bước 4: Ghi kết quả vào file output.txt
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