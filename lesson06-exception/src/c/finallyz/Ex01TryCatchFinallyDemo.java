package c.finallyz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01TryCatchFinallyDemo {
	public static void main(String[] args) {
		String[] employees = Mocdata();
		File file = new File("data.txt");
		System.out.println("------start write data--------");
		try {
			WriteData(file, employees);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("-------finish write data---------");
		
	}
	
	private static void WriteData(File file, String[] employees) throws IOException{
		if(!file.exists()) {
			throw new FileNotFoundException("file " + file.getName() + " is not existed!!!");
		}
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			for(String emloyee: employees) {
				String[] tokens = emloyee.split(", ");
				int age = Integer.parseInt(tokens[2]);
				int salaryFactor = (age - 18) * 2;
				
				String line = tokens[0] + ", " + tokens[1] + ", " + salaryFactor;		
				fw.write(line + "\n");
				System.out.println("Log info: write content " + line + "to file" + file.getName());
			}
			
			fw.close();
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
	
	private static String[] Mocdata() {
		return new String[] {
				"1, le na, 28",
				"2, le cong, 19",
				"3, le nam, 2o",
				"4, le teo, 26",
				"5, le na 2, 26",
				"6, le naM TEO, 30",
		};
	}
}
