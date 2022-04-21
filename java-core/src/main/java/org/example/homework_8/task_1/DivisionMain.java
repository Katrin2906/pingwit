package org.example.homework_8.task_1;

public class DivisionMain {
    public static void main(String[] args) {
        try {
            Division.Division(15, 0);
        } catch (ArithmeticException e) {
            System.out.println("На 0 в Java целые числа не делят");
        }
    }
}
