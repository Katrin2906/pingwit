package org.example.homework_9.task_2;

import java.io.FileWriter;
import java.io.IOException;

public class ThousandWords {
    public static void main(String[] args) {
        try(FileWriter newManyWords = new FileWriter("src/main/java/homework_9/task_2/manyWords");) {
            String words = "No regrets ";
            String manyWords = words.repeat(1000);
            newManyWords.write(manyWords);
            newManyWords.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}