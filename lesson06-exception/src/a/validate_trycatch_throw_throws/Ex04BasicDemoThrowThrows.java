package a.validate_trycatch_throw_throws;

import java.io.File;
import java.io.IOException;

public class Ex04BasicDemoThrowThrows {
	public static void main(String[] args) {
		try {
			File file = createFile("data.txt");
			System.out.println("file --> " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("finish...");
	}
	/*
	 	trong 1 hàm 
	 	+nếu ném ra runtime/ unchecked Exceprtion(throw new)
	 	thì chỗ khai báo hàm không bắt buộc throws
	 		chỗ gọi jamf không bắt buôi phhair xử lý(throw(S), try_catch);
	 		
	 	+nếu ném ra complie/ checked Exceprtion(throw new)
	 	thì chỗ khai báo hàm bắt buộc throws
	 		chỗ gọi jamf bắt buôi phhair xử lý(throw(S), try_catch)
	 	vd: boolean createNewFile() throw IOException;
	 */
	//path: [folder] + fileName
	private static File createFile(String path) throws IOException {
		File file = new  File(path);
		if(!file.exists()) {
			boolean isucces = file.createNewFile();   
			if(isucces) {
				System.out.println(">> file" + file.getName() + " Is creative succesfl");

			}
		}
		else {
			System.out.println(">> file" + file.getName() + " Is Exittc");
		}
		return file;
	}
}
