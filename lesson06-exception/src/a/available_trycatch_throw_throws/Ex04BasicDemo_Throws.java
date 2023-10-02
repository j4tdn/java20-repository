package a.available_trycatch_throw_throws;

import java.io.File;
import java.io.IOException;

public class Ex04BasicDemo_Throws {
	public static void main(String[] args) {
		
		try {
			File file = createFile("data.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("--Finished--");
	}
	
	/*
	 * Trong 1 hàm 
	 * 		+ Nếu mình ném ra 'runtime/untracked' exception (throw new ...)
	 * 		thì chỗ khai báo hàm không bắt buộc phải throws
	 * 			chỗ gọi hàm không bắt buộc phải 'xử lý trước (throw(s), try_catch)'
	 * 
	 * 		+ Nếu ném ra 'compile/checked' exception (throw new ...)
	 * 		thì chỗ khai báo hàm bắt buộc phải throws
	 * 			chỗ gọi bắt buộc phải 'xử lý trước (throw(s), try_catch)'
	 */
	
	//path: [folder] + filename
	private static File createFile(String path) throws IOException{
		File file = new File(path);
		if(!file.exists()) {
			//Unhandled exception type IOException
			//2 quick 
			boolean isSuccess = file.createNewFile();
			if(isSuccess) {
				System.out.println(">>> File " + file.getName() + " is created successful");
			}
			else {
				System.out.println(">>> File " + file.getName() + " is existed");
			}
		}
		return file;
	}
}
