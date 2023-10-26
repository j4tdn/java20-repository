package text.serializable;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import models.DataModels;
import utils.FileUtils;

public class Ex01FileWriteSerializabledData {

	public static void main(String[] args) {
		File file = FileUtils.createFile("class/data/security.txt");
		
		if (file.exists()) {
			System.out.println("==> start");
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			
			try {
				fos = new FileOutputStream(file);
				oos = new ObjectOutputStream(fos);
				
				var list = DataModels.mockApples();
				
				// write file, require list<T> need to be seriablized
				oos.writeObject(list);
				System.out.println("write file " + file.getName() + " successful(data size = " + list.size() + ")");
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				FileUtils.close(oos, fos);
			}
		}
		
		System.out.println("==> finished");
	}

}
