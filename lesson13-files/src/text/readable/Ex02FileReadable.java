package text.readable;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import utils.FileUtils;

public class Ex02FileReadable {

	public static void main(String[] args) {
		
		File file = new File("class/data/input.txt");
		if (file.exists()) {
			
			var path = file.toPath();
			var lines = readLines(path);

			// 4, 43silos0, zita002, le2sim, 231233, haha91ii222
			// 0, 2, 4, 43, 91, 222, 231233
			
			if (!lines.isEmpty()) {
				lines.remove(0);
				var numbers = lines.stream() // Stream<String>
					 .flatMap(line -> Arrays.stream(line.split("[^0-9]+")))
					 .filter(nbTxt -> !nbTxt.isEmpty())
					 .map(Integer::parseInt)
					 .distinct()
					 .sorted()
					 .collect(Collectors.toList());
				
				// write file
				File opFile = FileUtils.createFile("class/data/output.txt");
				if (opFile.exists()) {
					var oplines = numbers.stream()
									   .map(String::valueOf)
									   .collect(Collectors.toList());
					try {
						Files.write(opFile.toPath(), oplines);
						System.out.println("Write file " + opFile.getName() + " is successful!");
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
		}
		return Collections.EMPTY_LIST;
	}
}
