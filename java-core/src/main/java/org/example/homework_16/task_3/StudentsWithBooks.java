package org.example.homework_16.task_3;

import java.util.*;

public class StudentWithBooksMain {
    public static void main(String[] args) {
        List<StudentWithBooksMain> studentWithBooksMain = new ArrayList<>();

        studentWithBooksMain.add(new StudentWithBooks("Ann", ArrayList < Book > (new Book("Egor", 2022), new Book("I", 2000))); // не могу понять как правильно использовать здесь конструктор
        studentWithBooksMain.add(new StudentWithBooks("Kira", ArrayList < Book > (new Book("Egor", 2022), new Book("Me", 1980)));
        studentWithBooksMain.add(new StudentWithBooks("Eva", ArrayList < Book > (new Book("Me", 1980))));

        int countBookFirst = Collections.frequency(studentWithBooksMain, "Egor");
        int countBookSecond = Collections.frequency(studentWithBooksMain, "Me");
        int countBookThird = Collections.frequency(studentWithBooksMain, "I");

        Map<Integer, String> initialMap = new HashMap<>();
        initialMap.put(countBookFirst, "Egor");
        initialMap.put(countBookSecond, "Me");
        initialMap.put(countBookThird, "I");

        Map<Integer, String> sortedMap = new TreeMap<>(initialMap);
        System.out.println(sortedMap);
    }
}

