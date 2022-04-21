package org.example.homework_3.homework_2.task_4;

public class Multiplication {
    public static void main(String[] args) {
        int a = 0;
        int b = -6;
        boolean isNegative = false;
        if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
            isNegative = true;
        }
        a = Math.abs(a);
        b = Math.abs(b);
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int result = 0;
        for (int i = 0; i < a; ++i) {
            result += b;
        }
        if (isNegative) {
            result = -result;
        }
        System.out.println(result);
    }
}


