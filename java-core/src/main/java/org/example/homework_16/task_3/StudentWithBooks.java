package org.example.homework_16.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentWithBooks {
    private String studentName;
    private List<Book> books;

    public StudentWithBooks(String studentName, List<Book> books) {
        this.studentName = studentName;
        this.books = new ArrayList<>(books);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentWithBooks that = (StudentWithBooks) o;
        return Objects.equals(studentName, that.studentName) && Objects.equals(books, that.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, books);
    }

    @Override
    public String toString() {
        return "StudentWithBooks{" +
                "studentName='" + studentName + '\'' +
                ", books=" + books +
                '}';
    }
}
