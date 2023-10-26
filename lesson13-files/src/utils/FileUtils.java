package utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {

	private FileUtils() {
		
	}
	
	// hello.txt --> lesson13-files/hello.txt
	// data/hello.txt --> lesson13-files/data/hello.txt
	
	public static File createFile(String filepath) {
		File file  = new File(filepath);
		if (file.exists()) {
			System.out.println("File " + file.getName() + " is existed...");
			return file;
		}
		
		File rootDir = file.getParentFile();
		if (!rootDir.exists()) {
			rootDir.mkdirs();
			System.out.println("Dir " + rootDir + " is created ...");
		}
		
		try {
			boolean isSuccess = file.createNewFile();
			if (isSuccess) {
				System.out.println("File " + file.getName() + " is created successful!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return file;
	}
	
	public static void close(AutoCloseable ...objectsToBeClosed) {
		for (AutoCloseable objectToBeClosed : objectsToBeClosed) {
			try {
				objectToBeClosed.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
