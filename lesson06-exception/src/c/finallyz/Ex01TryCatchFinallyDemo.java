package c.finallyz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.spi.IIORegistry;

public class Ex01TryCatchFinallyDemo {
	public static void main(String[] args) {
		String[] employees = mockData();
		File file = new File("data.txt");
	}
	
	private static void writeFile(File file, String[] employees) throws FileNotFoundException {
		if (!file.exists()) {
			throw new FileNotFoundException("File " + file.getName() + "is not existed !!!");
		}
		try {
			FileWriter fw = new FileWriter(file);
			for (String employee: employees) {
				String[] tokens = employee.split(", ");
				int age = Integer.parseInt(tokens[2]);
				int salaryFactor = (age - 18) * 2;
				
				String line = tokens[0] + ", " + tokens[1] + ", " + salaryFactor;
				fw.write(line + "\n");
				
				System.out.println("Log info >> write content ' " + line + " ' to file " + file.getName());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
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
				"7, Le G, 34",
				"8, Le H, 22"
		};
	}

}
