package org.example.homework_3.homework_2.task_7;

public class OddNumberSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int odd = 1; odd <= 99; odd = ++odd) {
            if (odd % 2 != 0) {
                sum = sum + odd;
            }
        }
        System.out.println("Общая сумма нечетных чисел от 1 до 99 равна " + sum);
    }
}
