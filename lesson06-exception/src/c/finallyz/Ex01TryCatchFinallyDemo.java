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
			throw new FileNotFoundException("File " + file.getName() + " is not existed !!!");
		}
		
		FileWriter fw = null;
		
		try {
			// open-connect to the file
			fw = new FileWriter(file);
			for (String employee: employees) {
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
				"3, Hoang Ban, 20",
				"4, Nguyen Teo, 26",
				"5, Pham Van, 26",
				"6, Le Van, 3o",
				"7, Le Cong, 20",
				"8, Le Nam Teo, 19"
		};
	}
}