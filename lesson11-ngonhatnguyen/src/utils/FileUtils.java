package utils;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FileUtils {
	private FileUtils() {
		
	}
	
	public static List<String> readLine(String path) {
		try {
			return Files.readAllLines(Paths.get(path));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}
}
