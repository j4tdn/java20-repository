package lesson23_tpthanh;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        File file = new File("input.txt");
        if (file.exists()) {
            var path = file.toPath();
            var lines = readFile(path);

            if (!lines.isEmpty()) {
                lines.remove(0); 
                var numbers = lines.stream() 
                        .flatMap(line -> Arrays.stream(line.split("[^0-9]+")))
                        .filter(nbTxt -> !nbTxt.isEmpty())
                        .map(Integer::parseInt)
                        .sorted()
                        .collect(Collectors.toList());

                List<String> numberStrings = numbers.stream()
                        .map(String::valueOf) 
                        .collect(Collectors.toList());
                numberStrings.forEach(System.out::println);
                File output = new File("output.txt");
                try {
                    Files.write(output.toPath(), numberStrings);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } 
    }

    private static List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList(); 
    }
}
