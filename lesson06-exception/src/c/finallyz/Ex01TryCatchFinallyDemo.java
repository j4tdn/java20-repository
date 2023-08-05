package c.finallyz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01TryCatchFinallyDemo {

	public static void main(String[] args) {
		String[] employees = mockData();
		File file = new File("data.txt");
		System.out.println("** _ Start write file ... _ **");

		try {
			writeFile(file, employees);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("** _ Finish ... _ **");
	}

	private static void writeFile(File file, String[] employees) throws IOException {
		if (!file.exists()) {
			throw new FileNotFoundException("File " + file.getName() + " is not existed !");
		}
		FileWriter fw = null;
		try {
			// open-connect to file
			fw = new FileWriter(file);
			for (String employee : employees) {
				String token[] = employee.split(",");
				int age = Integer.parseInt(token[2]);
				int salaryFactor = (age - 18) * 2;
				String line = token[0] + ", " + token[1] + ", " + salaryFactor;

				System.out.println("LOG into >> write content '" + line + "' to file " + file.getName());
				System.out.println("LOG info >> file size --> " + file.length());

				fw.write(line + "\n");
			}
			
		} catch (IOException e) { //TH này không catch được NumberFormatException 
			e.printStackTrace();
		} finally { //Always run
			if (fw != null) {
				fw.close();
				System.out.println("Closing file + " + file.getName());
			}
		}

		
	}

	private static String[] mockData() {
		return new String[] { "1, Le Na,29", "2, Le Teo,22", "3, Nguyen Nam,22", "4, Le Nam,16", "5, Le Ti,19",
				"5, Le Bi,21", "6, Le Ma,22", "7, Le Haha,24", "8, Le Hihi,2o", };
	}

}
