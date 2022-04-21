package org.example.homework_9.task_1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArrayWriter {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("src/main/java/homework_9/task_1/fileArray")) {
            DataOutputStream tinyArray = new DataOutputStream(fos);
            int[] tiny = new int[12];
            for (int i = 0; i < tiny.length; i++) {
                tiny[i] = i + 2;
                tinyArray.writeInt(tiny[i]);
                fos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

