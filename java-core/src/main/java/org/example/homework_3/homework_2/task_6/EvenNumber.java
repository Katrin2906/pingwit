package org.example.homework_3.homework_2.task_6;

public class EvenNumber {
    public static void main(String[] args) {
        for (int even = 2; even <= 100; even = ++even) {
            if (even % 2 == 0) {
                System.out.print(even + " | ");
            }
        }
    }
}
