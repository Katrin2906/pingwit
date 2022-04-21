package org.example.homework_3.homework_2.task_3;

public class Summ {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;
        while (number <= 256) {
            sum = sum + number;
            number = number * 2;
        }
        System.out.println("Сумма равна " + sum);


    }
}
