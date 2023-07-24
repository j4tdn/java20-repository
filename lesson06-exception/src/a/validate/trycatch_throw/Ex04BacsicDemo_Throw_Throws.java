package a.validate.trycatch_throw;

import java.io.File;
import java.io.IOException;

public class Ex04BacsicDemo_Throw_Throws {
     
	public static void main(String[] args) {
		try {
			File file = createFile("dtat.txt");
			System.out.println("file -->" + file);
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		System.out.println("**_finished__");
	}
	
	/**
	 * trong 1 ham
	 * + Neu nem ra runtime/ unchecked exception(throw new...)
	 *    thi cho khai bao ham khong bat buoc phao throws
	 *    cho goi ham khong bat buoc phai xu ly (throws(s), try_catch)
	 *    VD : int divide(int a, intb)
	 * 
	 * + Neu nem ra compile/ unchecked exception(throw new...)
	 *    thi cho khai bao ham khong bat buoc phai throws
	 *    cho goi ham bat buoc phai xu ly (throws(s), try_catch)
	 */
	private static File createFile(String path) throws IOException{
		File file = new File(path);
		if (!file.exists()) {
		 boolean isSuccess	= file.createNewFile();
		 if(isSuccess) {
			 System.out.println(">> file" + file.getName()+ "is created successful");
		 }
		}else {
		 System.out.println(">> File"+ file.getName()+" is existed !");
		}
		return file;
	}
}
