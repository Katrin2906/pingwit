package org.example.homework_9.task_4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmployeeReturn {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("src/main/java/homework_9/task_4/Employee");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Employee valera = (Employee) objectInputStream.readObject();
            System.out.println(valera);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
