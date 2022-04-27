package org.example.homework_15.task_2_3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;

public class AllStudentsToJson {

    public static <MergeJSON> void main(String[] args) throws IOException {
        // В метод Paths.get надо передавать путь к одному файлу, посмотри в дебаге что в себе хранит результат вызова метода Paths.get()
        List<AllStudents> allStudents = new ObjectMapper().readValue(Paths.get("homework_15/Alice.json").toFile(),
                new TypeReference<List<AllStudents>>() {
                });
        allStudents.forEach(System.out::println);
// по какой-то причине не хочет искать файлы
        StudentsNameComparator studentsNameComparator = new StudentsNameComparator();
        Comparator<AllStudents> studentComparator = studentsNameComparator.thenComparing(studentsNameComparator);
        System.out.println(studentComparator);
    }
}
