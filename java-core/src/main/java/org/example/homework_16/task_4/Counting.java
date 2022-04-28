package org.example.homework_16.task_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Counting {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<Path> filesList = Files.walk(Paths.get(""))
                .filter(Files::isRegularFile)
                .toList();

        for (int i = 0; i < filesList.size(); ++i) {
            Thread thread = new Thread();
            thread.start();
            thread.join();

            filesList.forEach(() -> filesList.countFile; //не совсем понимаю, почему не могу его тут вызвать
        }
    }
}
