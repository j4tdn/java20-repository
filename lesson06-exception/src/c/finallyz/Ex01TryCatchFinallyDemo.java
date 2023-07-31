package c.finallyz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01TryCatchFinallyDemo {
	public static void main(String[] args) {
		String[] employees = mockData();
		File file = new File("data.txt");
		
		System.out.println("** __ Start writing file ... __ **");
		
		try {
			writeFile(file, employees);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("** __ Finished ... __ **");
	}
	
	private static void writeFile(File file, String[] employees) throws IOException {
		if (!file.exists()) {
			throw new FileNotFoundException("File " + file.getName() + "is not existed!!!");
		}

		FileWriter fw = new FileWriter(file);
		try {
			// open-connect to the file
			for (String employee : employees) {
				String[] tokens = employee.split(", ");
				int age = Integer.parseInt(tokens[2]);
				int salaryFactor = (age - 18) * 2;
				
				String line = tokens[0] + ", " + tokens[1] + ", " + salaryFactor;
				fw.write(line + "\n");
				
				System.out.println("LOG info >> write content '" + line + "' to file " + file.getName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				System.out.println("closing file " + file.getName());
				fw.close();
			}	
		}
	}
	
	private static String[] mockData() {
		return new String[] {
					"1, Le Na, 28",
					"2, Le Teo, 19",
					"3, Le Na 2, 20",
					"4, Le Na 3, 26",
					"5, Le Na 4, 26",
					"6, Le Na 5, 30",
					"7, Le Na 6, 20",
					"8, Le Na 7, 19"
		};
	}
}
