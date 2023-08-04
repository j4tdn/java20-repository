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
		
		System.out.println("**__Finished__**");

	}
	
	private static File createFile(String path) throws IOException {
		File file = new File(path);
		if (!file.exists()) {
			boolean isSuccess = file.createNewFile();
			System.out.println(">>> File " + file.getName() + " is created successfull");
		}
		else {
			System.out.println(">>> File " + file.getName() + " is existed !");
		}
		return file;
	}
}
	
	/*
	 * Trong 1 hàm
	 * + Nếu ném ra  'runtime/unchecked' exception(throw new...)
	 * thì chỗ khai báo hàm không bắt buộc phải throws
	 * chỗ gọi hàm không bắt buộc phải 'xử lý (throw(s), try_catch)'
	 * vd: int divide( int a, int b)
	 * 
	 * 
	 * + Nếu ném ra  'compile/checked' exception(throw new...)
	 * thì chỗ khai báo hàm bắt buộc phải throws
	 * chỗ gọi hàm bắt buộc phải 'xử lý (throw(s), try_catch)'
	 * vd: boolean createNewFile() throws IOException
	 */
	
	
	// path: [Folder] + [filename