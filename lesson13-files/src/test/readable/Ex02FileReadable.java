package test.readable;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import utils.FileUtils;

public class Ex02FileReadable {
	public static void main(String[] args) {
		File file = new File("class/data/input.txt");
		
		if (file.exists()) {
			var path = file.toPath();
			var lines = readLines(path);
			
			// 4, 43silos0, zita002, le2ssim, 23133, haha214821
			// 0, 43, 0, 2, 23133, 214821
			
			if (!lines.isEmpty()) {
				lines.remove(0);
				var numbers = lines.stream() // Stream<String>
					.flatMap(line -> Arrays.stream(line.split("[a-z]+")))
					.filter(nbTxt -> !nbTxt.isEmpty())
					.map(Integer::parseInt)
					.distinct()
					.sorted()
					.collect(Collectors.toList());
				
				// write file
				File outputfile = FileUtils.createFile("class/data/input.txt");
				if (outputfile.exists()) {
					var opLines = numbers.stream()
									.map(String::valueOf)
									.collect(Collectors.toList());
					try {
						Files.write(outputfile.toPath(), opLines);
						System.out.println("Write file " + outputfile.getName() + " is successed!");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	private static List<String> readLines(Path path) {
		try {
			return Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
