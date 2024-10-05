package test;

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
        File inputFile = new File("input.txt");

        if (!inputFile.exists()) {
            System.out.println("File input.txt not found.");
            return; 
        }

        List<String> lines = readLines(inputFile.toPath());
        if (lines.isEmpty()) {
            return;
        }

        lines.remove(0);

        List<Integer> numbers = lines.stream()
                .flatMap(line -> Arrays.stream(line.split("[^\\d]+")))
                .filter(nbTxt -> !nbTxt.isEmpty())
                .map(Integer::parseInt)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        
        writeNumbersToFile("output.txt", numbers);
    }

    private static List<String> readLines(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    private static void writeNumbersToFile(String filepath, List<Integer> numbers) {
        File outputFile = createFile(filepath);
        List<String> outputLines = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        try {
            Files.write(outputFile.toPath(), outputLines);
            System.out.println("Write file " + outputFile.getName() + " is successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static File createFile(String filepath) {
        File file = new File(filepath);
        if (file.exists()) {
            System.out.println("File " + file.getName() + " already exists ...");
            return file;
        }

        File parentDir = file.getParentFile();
        if (parentDir != null && !parentDir.exists()) {
            parentDir.mkdirs();
            System.out.println("Dir " + parentDir.getName() + " is created ...");
        }

        try {
            if (file.createNewFile()) {
                System.out.println("File " + file.getName() + " is created successfully");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}
