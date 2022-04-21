package org.example.homework_3.task_3;

import java.util.Arrays;
import java.util.Random;

public class OddArray {
    public static void main(String[] args) {
        Random randomInt = new Random();
        int x = randomInt.nextInt(50);
        int[] oddArray = new int[x];

        for (int i = 0; i < oddArray.length; ++i) {
            oddArray[i] = i;
        }
        System.out.println("Initial array " + Arrays.toString(oddArray));

        for (int i = 0; i < oddArray.length; ++i) {
            if (oddArray[i] % 2 != 0) {
                oddArray[i] = 0;
            }
        }
        System.out.println("Final array " + Arrays.toString(oddArray));
    }
}
