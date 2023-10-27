package text.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import utils.FileUtils;

public class Ex02ReadSerializedFileData {
	public static void main(String[] args) {
		File file = FileUtils.createNewFile("class/data/security.txt"); 
		if(file.exists()) {
			System.out.println("start read file");
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			
			try {
				fis = new FileInputStream(file);
				ois = new ObjectInputStream(ois);
				
				
			var data = ois.readObject();
			System.out.println("Data at runtime" + data.getClass());
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}finally {
				FileUtils.close(ois, fis);
			}
			
		}
	}
}
