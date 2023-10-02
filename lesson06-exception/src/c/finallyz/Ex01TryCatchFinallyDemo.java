package c.finallyz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01TryCatchFinallyDemo {
	public static void main(String[] args) {
		String[] employees = mockData();
		File file = new  File("data.txt");
		
		System.out.println("-----Start writing file-----");
		
		try {
			wrieFile(file, employees);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("---Finished---");
	}
	
	private static void wrieFile(File file, String[] employees) throws IOException {
		if(!file.exists()) {
			throw new FileNotFoundException("File " + file.getName() + " is not existed!!!");
		}
		FileWriter fw = null;
		try {
			//open connect to the file
			fw = new FileWriter(file);
			for(String employee : employees) {
				String[] tokens = employee.split(", ");
				int age = Integer.parseInt(tokens[2]);
				int salaryFactor = (age - 18) * 2;
				String line = tokens[0] + ", " + tokens[1] + ", " + salaryFactor;
				fw.write(line + "\n");
				System.out.println("LOG info >> write content '" + line + "' to file" + file.getName());
			}
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
			
		} finally {
			if(fw != null) {
				System.out.println("closing file " + file.getName());
				fw.close();
			}
		}
		
		
	}

	private static String[] mockData() {
		return new String[] {
				"1, Le Na, 26",
				"2, Le Teo, 19",
				"3, Hoang A, 13",
				"4, Nguyen B, 24",
				"5, Pham C, 12",
				"6, Le Nam, 67",
				"7, Le Na, 12g",
				"8, Le Na, 11",
				"9, Le Na, 56"
		};
	}
}
