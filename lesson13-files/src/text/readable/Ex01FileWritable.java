package text.readable;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

import utils.FileUtils;

public class Ex01FileWritable {

	// File.separator
	private static final String ROOT =  "class/data/";
	
	public static void main(String[] args) {
		
		// write file --> File, FileWriter, BufferWriter 
		// Read file --> File, FileReader, BufferReader
		
		String pathFile = ROOT.concat("mock- " + System.currentTimeMillis() + ".txt");
		
		File file = FileUtils.createFile(ROOT);
		
		
		if (file.exists()) {

			var path = file.toPath();
			
			var list = mockStringList();
			try {
				
				Files.write(path, list, StandardOpenOption.APPEND );
				System.out.println("Write file " + file.getName() + " success!!!");
				
				// awt --> open file
				Desktop.getDesktop().open(file);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	private static List<String> mockStringList(){
		return List.of(
			"11, Le A, 28, 1000",
			"22, Le B, 38, 2000",
			"33, Le C, 48, 3000",
			"44, Le D, 58, 4000",
			"55, Le E, 68, 5000"
		);
	}
}
