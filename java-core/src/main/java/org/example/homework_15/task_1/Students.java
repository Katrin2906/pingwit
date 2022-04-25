package org.example.homework_15.task_1;

public class Students { // Students -> Student - в ед. числе название класса должно быть
    // ВСЕ поля класса должны быть приватными
    String id;
    String groupNumber;
    String name;
    String surname;
    String faculty;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", groupNumber=" + groupNumber +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
