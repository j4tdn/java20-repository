package c.finallyz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import javax.imageio.spi.IIORegistry;

public class Ex01TryCatchFinallyDemo {
	public static void main(String[] args) throws IOException {
		String[] employees = mockData();
		File file = new File("data.txt");
		
		System.out.println("__Start writing file__");
		
		try {
			writeFile(file, employees);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("__Finished__");
		
	}
	
	private static void writeFile(File file, String[] employees) throws IOException {
		if (!file.exists()) {
			throw new FileNotFoundException("File " + file.getName() + "is not existed !!!");
		}
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			for (String employee: employees) {
				String[] tokens = employee.split(", ");
				int age = Integer.parseInt(tokens[2]);
				int salaryFactor = (age - 18) * 2;
				
				String line = tokens[0] + ", " + tokens[1] + ", " + salaryFactor;

				fw.write(line + "\n");
				
				System.out.println("Log info >> write content ' " + line + " ' to file " + file.getName());
				
			}

//			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();

		}
		finally {
			if(fw != null) {
				System.out.println("closing file " + file.getName());
				fw.close();
				
			}
		}
	}
	
	
	private static String[] mockData() {
		return new String[] {
				"1, Le A, 26",
				"2, Le B, 19",
				"3, Le C, 20",
				"4, Le D, 18",
				"5, Le E, 21",
				"6, Le F, 23",
				"7, Le G, 34o",
				"8, Le H, 22"
		};
	}

}
