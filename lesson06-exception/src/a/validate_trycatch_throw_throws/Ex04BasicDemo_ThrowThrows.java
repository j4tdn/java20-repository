package a.validate_trycatch_throw_throws;

import java.io.File;
import java.io.IOException;

public class Ex04BasicDemo_ThrowThrows {

	public static void main(String[] args) {
		try {
			File file = createFile("data.txt");
			System.out.println("file --> " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}							
		System.out.println("** __ Finished __ **");
	}

	private static File createFile(String path) throws IOException {
		File file = new File(path);

		if (!file.exists()) {
			boolean isSuccess = file.createNewFile();
			if (isSuccess)
				System.out.println(">>> File " + file.getName() + " is created successful");
		} else
			System.out.println(">>> File " + file.getName() + " is existed!");

		return file;
	}

}
