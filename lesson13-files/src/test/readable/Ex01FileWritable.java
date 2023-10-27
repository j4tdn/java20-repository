package test.readable;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;

import utils.FileUtils;

public class Ex01FileWritable {
	// File.separator
	
	private static final String ROOT = "class/data/";
	
	public static void main(String[] args) {
		// Write file --> File, FileWrite, BufferWriter
		// Read file --> File, FileReader, BufferReader
		
		String pathFile = ROOT.concat("mock-" + System.currentTimeMillis() + ".txt");
		
		File file = FileUtils.createFile(pathFile);
		
		if (file.exists()) {
			var path = file.toPath();
			var list = mockStringList();
			try {
				Files.write(path, list, StandardOpenOption.APPEND);
				System.out.println("Write file " + file.getName() + " success!!!");
				
				//
				Desktop.getDesktop().open(file);;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static List<String> mockStringList() {
		return List.of(
				"1, Le A, 28, 1000",
				"2, Le B, 12, 2000",
				"3, Le C, 26, 4000",
				"4, Le D, 37, 5000",
				"5, Le E, 52, 3000"
				);
	}
}
