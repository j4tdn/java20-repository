package text.seirializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import bean.Apple;
import utils.FileUtils;

public class Ex02FileReadSerializedData {
	public static void main(String[] args) {
		File file = FileUtils.createFile("class/data/security.txt");

		if (file.exists()) {
			System.out.println("STARTING READING FILE");
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			
			
			try {
				fis = new FileInputStream(file);
				ois = new ObjectInputStream(fis);
				
				// read file, return raw data(object), auto convert at runtime
				@SuppressWarnings("unchecked")
				var data = (List<Apple>)ois.readObject();
				System.out.println("DATA READ AT RUNTIME --> " + data.getClass());
				System.out.println("----- print data -----");
				data.forEach(System.out::println);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				FileUtils.close(fis, ois);
			}
		}
		System.out.println("FINISHED ====>");
	}
}
