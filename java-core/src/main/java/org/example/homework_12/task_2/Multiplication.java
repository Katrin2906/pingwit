package org.example.homework_12.task_2;

import java.util.function.BinaryOperator;

// +
public class Multiplication {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(0, -1234));
    }
}
