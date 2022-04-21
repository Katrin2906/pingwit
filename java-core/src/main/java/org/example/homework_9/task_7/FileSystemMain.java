package org.example.homework_9.task_7;

import java.io.File;

public class FileSystemMain {
    public static void main(String[] args) {
        FileSystem littleList = new FileSystem();
        littleList.search(new File("src/main/java/homework_9"));
    }
}
