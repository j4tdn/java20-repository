package test.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

import bean.Apple;
import utils.FileUtils;

public class Ex02FileReadSerializedData {
	public static void main(String[] args) {
		File file = FileUtils.createFile("class/data/security.txt");
		
		if (file.exists()) {
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			
			try {
				fis = new FileInputStream(file);
				ois = new ObjectInputStream(fis);
				
				var data = (List<Apple>)ois.readObject();
				
				System.out.println("data at runtime --> " + data.getClass());
				System.out.println("========== Printout Data ==========");
				data.forEach(System.out::println);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				FileUtils.close(ois, fis);
			}
		}
	}
}
