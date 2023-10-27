package text.readable;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import utils.FileUtils;

public class Ex02FileReadable {

	public static void main(String[] args) {

		File file = new File("class/data/input.txt");

		if (file.exists()) {
			var path = file.toPath();
			var lines = readLines(path); // List<String>
			lines.forEach(System.out::println);
			// 5, 43silos0, zita002, le2sim, 231233, haha91ii222
			// 0, 2, 5, 43, 91, 222, 231233
			
			
			if(!lines.isEmpty()) {
				var gg123 =  lines.stream() // Stream<String>
				.flatMap(line -> Arrays.stream(line.split("[a-z]+")))// String -> Stream<String> -> ...
				.collect(Collectors.toList());
				
				gg123.forEach(seq -> System.out.println(seq));
			}
			
			if (lines.isEmpty()) {
				lines.remove(0);
				var numbers = lines.stream() // Stream<String>
					.flatMap(line -> Arrays.stream(line.split("[a-z]+"))) // String -> Stream<String> -> ...
					.filter(nbTxt -> !nbTxt.isEmpty())
					.map(Integer::parseInt)
					.distinct()
					.sorted()
					.collect(Collectors.toList());
				System.out.println("SDA");
				numbers.forEach(sq -> System.out.println(sq));
				
				// write file
				File opFile = FileUtils.createFile("class/data/output.txt");
				if (opFile.exists()) {
					var opLines = numbers.stream()
							.map(String::valueOf)
							.collect(Collectors.toList());
					opLines.forEach(sq -> System.out.println(sq));
					try {
						Files.write(opFile.toPath(), opLines);
						System.out.println("Write file " + opFile.getName() + "is sucessful");
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
		return Collections.emptyList();
	}

}