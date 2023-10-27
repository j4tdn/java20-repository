package utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {

	private FileUtils() {}
	public static File createFile(String filepath)
	{
		File file =new File(filepath);
		if(file.exists())
		{
			System.out.println("File "+file.getName()+" is exited !!!");
			return file;
			
		}
		File rootDir = file.getParentFile();
		if(rootDir.exists())
		{
			rootDir.mkdirs();
			System.out.println("Dir +" +rootDir.getName()+" is created ..");
		}
		try {
			boolean isSuccss =file.createNewFile();
			if(isSuccss)
			{
				System.out.println("File "+file.getName()+ "is created successful");
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
}
