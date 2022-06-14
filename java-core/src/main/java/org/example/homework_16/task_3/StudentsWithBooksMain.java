package org.example.homework_16.task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StudentsWithBooksMain {
    public static void main(String[] args) {
        List<StudentWithBooks> studentWithBooks = new ArrayList<>(); // studentWithBooks -> students

        // когда пытаешься все запихнуть в одну строку, то выходит непонятка. Создай коллекцию книг, затем создай студента вместе с ней
        // Замени ArrayList < Book > на List.of и все будет ок
        studentWithBooks.add(new StudentWithBooks("Ann", List.of (new Book("Egor", 2022), new Book("I", 2000)))); // не могу понять как правильно использовать здесь конструктор
        studentWithBooks.add(new StudentWithBooks("Kira", List.of (new Book("Egor", 2022), new Book("Me", 1980))));
        studentWithBooks.add(new StudentWithBooks("Eva", List.of (new Book("Me", 1980))));

        int countBookFirst = Collections.frequency(studentWithBooks, "Egor"); // таким способом ты ищешь строку в коллекции Student, результат будет всегда 0
        int countBookSecond = Collections.frequency(studentWithBooks, "Me");
        int countBookThird = Collections.frequency(studentWithBooks, "I");

        Map<Integer, String> initialMap = new HashMap<>();
        initialMap.put(countBookFirst, "Egor");
        initialMap.put(countBookSecond, "Me");
        initialMap.put(countBookThird, "I");

        Map<Integer, String> sortedMap = new TreeMap<>(initialMap);
        System.out.println(sortedMap);

        /*
        Map<String, Long> result = studentWithBooks.stream()
            .map(Student::books) // у каждого студента берем книги
            .flatMap(Collection::stream) // List<List<Book>> превращаем в List<Book>
            .collect(Collectors.toMap(Book::bookName, book -> 1L, Long::sum)); // Собираем мапку ключ=название книги, value=кол-во книг с одинаковым названием

            из полученных данных останется извлечь нужные нам
        */
    }
}
