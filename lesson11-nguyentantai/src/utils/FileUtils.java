package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FileUtils {
	private FileUtils() {
		
	}
	public static List<String> readLines(String path) {
		try {
			return Files.readAllLines(Paths.get(path));
		}catch (IOException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}
}
