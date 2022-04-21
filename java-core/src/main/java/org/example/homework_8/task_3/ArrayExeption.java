package org.example.homework_8.task_3;

public class ArrayExeption extends Exception {

    public ArrayExeption(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "ArrayExeption{}";
    }
}

