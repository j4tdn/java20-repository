package text.readable;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import utils.FileUtils;

public class Ex02FileReadable {

	public static void main(String[] args) {
		File file = new File("class/data/input.txt");
	
		if(file.exists()) {
			var path = file.toPath();
			var lines = readLines(path);
			
			if(!lines.isEmpty()) {
				lines.remove(0);
				var numbers = lines.stream()//stream<String>
					 .flatMap(line -> Arrays.stream(line.split("[a-z]+")))//stream<>
					 .filter(nbtext -> !nbtext.isEmpty())
					 .distinct()
					 .map(Integer::parseInt)
					 .sorted()
					 .toList();
			
				File optfile = FileUtils.createNewFile("class/data/output.txt");
				if(optfile.exists()) {
					var oplines = numbers.stream()
										.map(String::valueOf)
										.toList();
					try {
						Files.write(optfile.toPath(), oplines);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				System.out.println("numbers -> " + numbers);
			}
		}	
	}
	private static List<String> readLines(Path path) {
		try {
			Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}
	
}


