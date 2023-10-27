package test.readable;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import utils.FileUtils;

public class Ex01FileWriable {
		
	private static final String PATH = "class//data//mock.txt";
	
	
	public static void main(String[] args) {
		File file =FileUtils.createFile(PATH);
		
		if(file.exists())
			
		{
			
			var path = file.toPath();
			var list = mockStringList();
			try {
				Files.write(path,list);
				System.out.println("Write file "+file.getName()+"success ");
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//Write file --> File, FileWrite, BufferWriter
	//Read file --> File, Read, BufferReader
	
	
	private static List<String> mockStringList()
	{
		return List.of(
				"1,Le A,28, 1000",
				"2,Le B,12, 2000",
				"3,Le C,26, 3000",
				"4,Le D,37, 4000",
				"5,Le E,52, 5000"
				
				
				);
	}
	
}
