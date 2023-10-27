package text.seirializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.DataModel;
import utils.FileUtils;

public class Ex01FileWriteSerializedData {
	public static void main(String[] args) {
		File file = FileUtils.createFile("class/data/security.txt");
		
		if(file.exists()) {	
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			
			try {
				fos = new FileOutputStream(file);
				oos = new ObjectOutputStream(fos);
				
				var list =  DataModel.mockApples();
				
				
				// write file, required list, list<T> needs to be serialized
				oos.writeObject(list);
				System.out.println("Write file " + file.getName() + " successfully (data size = " + list.size()+ ")");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				FileUtils.close(fos, oos);
			}
		}
		System.out.println("\nFINISHED ====>");
	}
}
