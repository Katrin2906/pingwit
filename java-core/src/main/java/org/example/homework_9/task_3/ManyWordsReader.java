package org.example.homework_9.task_3;

import java.io.FileReader;
import java.io.IOException;

public class ManyWordsReader {
    public static void main(String[] args) {
        try (FileReader manyWords = new FileReader("src/main/java/homework_9/task_2/manyWords");
        ) {
            String newManyWords = manyWords.getEncoding();
            System.out.println(newManyWords);
            int n;
            while ((n = manyWords.read()) != -1) {
                System.out.print((char) n);
            }
            // в конце обязательно вызывай метод flush
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

