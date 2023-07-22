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
	
	/*
	 Trong 1 hàm
	 + Nếu ném ra 'runtime/unchecked' exception(throw new ...)
	   thì chỗ khai báo hàm không bắt buộc phải throws
	       chỗ gọi hàm không bắt buộc phải 'xử lý(throw(s), try_catch)'
	   VD: int divide(int a, int b)
	 
	 + Nếu ném ra 'compile/checked' exception(throw new ...)
	   thì chỗ khai báo hàm bắt buộc phải throws
	       chỗ gọi hàm bắt buộc phải 'xử lý(throw(s), try_catch)'
	   VD: boolean createNewFile() throws IOException
	 */
	
	// path: [folder] + filename
	private static File createFile(String path) throws IOException {
		File file = new File(path);
		if (!file.exists()) {
			/*
			 Unhandled exception type IOException
			 2 quick fixes are available
			 + Add throws declaration
			 + Surround with try/catch
			 */
			boolean isSuccess = file.createNewFile();
			if (isSuccess) {
				System.out.println(">>> File " + file.getName() + " is created successful");
			}
		} else {
			System.out.println(">>> File " + file.getName() + " is existed !");
		}
		return file;
	}
	
}
