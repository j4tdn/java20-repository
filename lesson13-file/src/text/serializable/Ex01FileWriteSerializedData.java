package text.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.DataModel;
import utils.FileUtils;

public class Ex01FileWriteSerializedData {
	public static void main(String[] args) {
		
		File file = FileUtils.createNewFile("class/data/security.txt"); 
		if(file.exists()) {
			System.out.println("Start write file");
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			
			try {
				fos = new FileOutputStream(file);
				oos = new ObjectOutputStream(oos);
				
				//require list<T> needs to be serialized
				var list = DataModel.mockApple();
				oos.writeObject(list);
				System.out.println("write file" + file.getName() + "successfull" + list.size());
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					oos.close();
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		}
		System.out.println("finish...");
	}
}
