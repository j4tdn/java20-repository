package utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {

	private FileUtils() {
	}
	
	//hello.txt --> lesson13-files/hello.txt
	//data/hello.txt --> lesson13-files/data/hello.txt
	public static File createNewFile(String path) {
		File file = new File(path);
		String filename = file.getAbsolutePath();

		if (file.exists()) {
			System.out.println("File " + filename + " \nis existed already");
		} else {
			File parent = file.getParentFile();
			if (!parent.exists()) {
				parent.mkdirs();
				System.out.println("Dir " + parent.getAbsolutePath() + " is created sucessful");
			}
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println("File " + filename + " is created " + (isSuccess ? "sucessful" : "failed"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return file;
	}

	public static void close(AutoCloseable... objectsTobeClose) {
		for(AutoCloseable autoCloseable:objectsTobeClose) {
			try {
				autoCloseable.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			
	}
}
