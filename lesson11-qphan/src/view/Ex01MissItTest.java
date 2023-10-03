package view;

import java.util.List;

import utils.FileUtils;

public class Ex01MissItTest {

	public static void main(String[] args) {
		List<String> lines = FileUtils.readLines("test01-missit.txt");
		
		lines.forEach(line -> {
			System.out.println(line);
		});
	}

	
}
