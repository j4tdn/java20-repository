package text.readable;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import utils.FileUtils;

public class Ex01FileWritable {
	
	private static final String PATH = "class//data//mock.txt";
	
	public static void main(String[] args) {
		// Write file --> BufferWriter, FileWriter
		// Read file  --> File, FileReader, BufferReadder
		
		File file = FileUtils.createFile(PATH);
		
		if(file.exists()) {
			var path = file.toPath();
			var list = mockStringList();
			try {
				Files.write(path,list); //StandardOpenOption.APPEND
				System.out.println("Write file " + file.getName() + " success !!!");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static List<String> mockStringList(){
		return List.of(
				"1, Le A, 28, 1098",
				"2, Le B, 29, 1076",
				"3, Le C, 21, 1043",
				"4, Le D, 23, 1120",
				"5, Le E, 25, 1020"
		);
	}
}
