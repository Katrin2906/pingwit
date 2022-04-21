package org.example.homework_3.homework_2.task_8;

public class DifferentSums {

    public static void main(String[] args) {
        int sumEven = 0;// название переменной sum_even -> sumEven
        int sumOdd = 0;
        for (int i = 0; i <= 100; i = ++i) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            } else {
                sumOdd = sumOdd + i;
            }
        }
        System.out.println("Общая сумма четных чисел от 0 до 100 равна " + sumEven);
        System.out.println("Общая сумма нечетных чисел от 0 до 100 равна " + sumOdd);
        System.out.println("Общая сумма чисел от 0 до 100 равна " + (sumEven + sumOdd));

    }
}


