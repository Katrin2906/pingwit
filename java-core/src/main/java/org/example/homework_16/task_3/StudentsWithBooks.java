package org.example.homework_16.task_3;

import java.util.*;

// не забывай форматировать код
public class StudentWithBooksMain {
    public static void main(String[] args) {
        List<StudentWithBooksMain> studentWithBooksMain = new ArrayList<>(); // studentWithBooksMain -> students

        // когда пытаешься все запихнуть в одну строку, то выходит непонятка. Создай коллекцию книг, затем создай студента вместе с ней
        // Замени ArrayList < Book > на List.of и все будет ок
        studentWithBooksMain.add(new StudentWithBooks("Ann", ArrayList < Book > (new Book("Egor", 2022), new Book("I", 2000))); // не могу понять как правильно использовать здесь конструктор
        studentWithBooksMain.add(new StudentWithBooks("Kira", ArrayList < Book > (new Book("Egor", 2022), new Book("Me", 1980)));
        studentWithBooksMain.add(new StudentWithBooks("Eva", ArrayList < Book > (new Book("Me", 1980))));

        int countBookFirst = Collections.frequency(studentWithBooksMain, "Egor"); // таким способом ты ищешь строку в коллекции Student, результат будет всегда 0
        int countBookSecond = Collections.frequency(studentWithBooksMain, "Me");
        int countBookThird = Collections.frequency(studentWithBooksMain, "I");

        Map<Integer, String> initialMap = new HashMap<>();
        initialMap.put(countBookFirst, "Egor");
        initialMap.put(countBookSecond, "Me");
        initialMap.put(countBookThird, "I");

        Map<Integer, String> sortedMap = new TreeMap<>(initialMap);
        System.out.println(sortedMap);
                                 
        /*
        Map<String, Long> result = studentWithBooksMain.stream()
            .map(Student::books) // у каждого студента берем книги
            .flatMap(Collection::stream) // List<List<Book>> превращаем в List<Book>
            .collect(Collectors.toMap(Book::bookName, book -> 1L, Long::sum)); // Собираем мапку ключ=название книги, value=кол-во книг с одинаковым названием
            
            из полученных данных останется извлечь нужные нам
        */
    }
}

