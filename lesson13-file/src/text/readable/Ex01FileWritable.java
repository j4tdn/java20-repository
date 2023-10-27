package text.readable;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;

import utils.FileUtils;

public class Ex01FileWritable {
	private static final String PATH = "class/data/mock.txt";
	
	public static void main(String[] args) {
		
		// write file -> bufferWrite, fileWrite
		//Read file -> file, FileReader, BufferReader
		File file = FileUtils.createNewFile(PATH);
		if(file.exists()) {
			var list = mockStringList();
			try {
				Files.write(file.toPath(), list, StandardOpenOption.APPEND);
				System.out.println("write file " + file.getName() + "success!!");
				
				//awt --> open file
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
	}
	private static List<String> mockStringList(){
		return List.of(
				"11,le A, 25, 100",
				"22,le B, 27, 300",
				"33,le C, 26, 600",
				"44,le D, 22, 150",
				"55,le F, 23, 240"
			);
	}
}
