package a.validate_trycatch_throw_throws;

import java.io.File;
import java.io.IOException;

public class Ex04Demo_ThrowThrows {
	
	public static void main(String[] args) throws IOException {
		File file = createiFile("data1.txt");
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
	
	//Path: [Folder] + Filename
	private static File createiFile(String path) throws IOException {
		File file = new File(path);
		if(!file.exists()) {
			/*
			 Unhandled exception type IOException
			 2 quick fixes are available
			 	+ Add throws declaration
			 	+ Surround with try/catch
			 */
			boolean isSuccess = file.createNewFile();
			if(isSuccess) {
				System.out.println(">>> File " + file.getName() + " is created successfully");
			}
		} else {
			System.out.println("File " + file.getName() + " is existed!");
		}
		return file;
	}
}
