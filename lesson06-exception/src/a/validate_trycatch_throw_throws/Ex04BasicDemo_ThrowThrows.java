package a.validate_trycatch_throw_throws;

import java.io.File;
import java.io.IOException;

public class Ex04BasicDemo_ThrowThrows {
	public static void main(String[] args) {
		try {
			File file = createFile("data.txt");
			System.out.println("file ---> " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("** __ Finished __ **");
	}
	/*
	 Trong 1 hàm
	 + Nếu ném ra runtim/unchecked exception(throw new..)
	 thì chỗ khai báo hàm không bắt buộc phải throws
	 	chỗ gọi hàm không bắt buộc phải xử lý (throws,try_catch)
	 VD: int divice(int a, int b)
	 
	 + Nếu ném ra compile/checked exception(throw new ..)
	 thì chỗ khai báo hàm bắt buộc phải throws
	 chỗ gọi hàm bắt buộc phảu xử lý(throws, try_catch)
	 VD: boolean createNewFile() throws IOExeption
	 */
	//path: folder + filename
	private static File createFile(String path) throws IOException {
		File file = new File(path);
		if (!file.exists()) {
			/*
			 * Unhandled exception type IOExeption
			 * 2 quick fixes are available
			 * +add throws declaration
			 * +surround with try/catch
			 */
			boolean isSuccess = file.createNewFile();
			if (isSuccess) {
				System.out.println(">>> file " + file.getName() + "is create successful");
			}
		}else {
			System.out.println(">>> File " + file.getName() + " is existed !");
		}
		return file;
	}
}
