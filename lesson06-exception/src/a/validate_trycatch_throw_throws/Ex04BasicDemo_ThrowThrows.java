package a.validate_trycatch_throw_throws;

import java.io.File;
import java.io.IOException;

public class Ex04BasicDemo_ThrowThrows {
	public static void main(String[] args) {
		// viết hàm tạo ra 1 file
		try {
			File file = createFile("data.txt");
			System.out.println("file --> " + file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("**__Finished__**");
	}

	/*
	 * Trong 1 hàm: + Nếu ném ra 'runtime/unchecked' exception(throw new ....) thì
	 * chố khai báo hàm không bắt buộc phải throws chỗ gọi hàm không bắt buộc phải
	 * 'XỬ Lí(throw(s) , try_catch)' VD : devide(int a,int b)
	 * 
	 * + Nếu ném ra 'compile/checked' exception(throw new ....) thì chố khai báo hàm
	 * bắt buộc phải throws chỗ gọi hàm bắt buộc phải 'XỬ Lí(throw(s) , try_catch)'
	 * VD : boolean createNewFile() throws IOException
	 */
	// path: [folder] + filename
	private static File createFile(String path) throws IOException {
		File file = new File(path);
		if (!file.exists()) {
			boolean isSuccess = file.createNewFile();
			if (isSuccess) {
				System.out.println(">>> File " + file.getName() + " is create sucess");
			} else {
				System.out.println(">>> File " + file.getName() + "is existed ! ");
			}
		}

		return file;
	}
}
