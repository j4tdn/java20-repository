package view;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    static List<Integer> list;
    public static void main(String[] args) throws Exception {
        list = new ArrayList<>();

        Scanner sc = null;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("D:\\JAVA20\\5. Frontend\\lesson23-nguyenhongthuy\\java\\input.txt");
            sc = new Scanner(fileInputStream);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                getNumberAddList(line + " ");
            }
            Collections.sort(list);

            fileOutputStream = new FileOutputStream("D:\\JAVA20\\5. Frontend\\lesson23-nguyenhongthuy\\java\\output.txt");
            for(int number : list){
                byte b[] = (number + "\n").getBytes();
                fileOutputStream.write(b);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            fileInputStream.close();
            fileOutputStream.close();
            sc.close();
        }
		
        System.out.println(list);

	}

	public static void getNumberAddList(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				temp += str.charAt(i);
			} else {
				if (temp.length() > 0)
					list.add(Integer.valueOf(temp));
				temp = "";
			}
		}
	}
}
