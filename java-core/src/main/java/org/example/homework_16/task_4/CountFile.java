package org.example.homework_16.task_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountFile {
    static int countFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        int countWord = 0;
        List<String> lines = Files.readAllLines(path);

        for (String s : lines) {
            String trimmed = s.trim();
            countWord += trimmed.isEmpty() ? 0 : trimmed.split("").length;
        }
        return countWord;
    }
}

