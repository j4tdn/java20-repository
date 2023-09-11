package c.finalyy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01TryCatchFinallyDemo {

	public static void main(String[] args) {
		String[] employees = mockData();
		File file = new File("data.txt");
		System.out.println("Startt Writting File");
		
		try {
			writeFile(file, employees);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		
		
		System.out.println("******Finish*****");
	}
	private static void writeFile(File file,String[] employees) throws IOException {
		if(!file.exists()) {
			throw new FileNotFoundException("File"+file.getName()+"is not exited !!!");
		}
		FileWriter fw = new FileWriter(file);
		try {
			
			
			for(String employee:employees) {
				String[] tokens = employee.split(", ");
				int age = Integer.parseInt(tokens[2]);
				int salaryFactor = (age -18) * 2;
				
				String line = tokens[0] + ", " + tokens[1] + "," + salaryFactor;
				fw.write(line + "\n");
				
				System.out.println("LOG info >> write content " + line + " 'to file "+ file.getName());
				
			}
			
		}catch (IOException e) {
			e.printStackTrace();
			
		}
		finally {
			if(fw !=null) {
				System.out.println("Closing File " + file.getName());
				fw.close();
			}
		}
		
				
	}
	
	private static String[] mockData() {
		return new String[] {
		"1, Le BOng, 28",
		"2, Le Ngan, 56",
		"3, Le Tho, 19",
		"4, Tran Bang, 35",
		"5, Le Trach, 2o",
		"6, Van Tach, 42",
		"7, Le Uach, 32"
		};
	}
}
