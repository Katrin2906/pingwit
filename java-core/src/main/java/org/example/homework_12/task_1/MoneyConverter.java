package org.example.homework_12.task_1;

import java.util.function.Function;

// +
public class MoneyConverter {
    public static void main(String[] args) {

        Function<Integer, String> convert = x -> String.valueOf(x) + "$";
        System.out.println(convert.apply(10));
    }
}
