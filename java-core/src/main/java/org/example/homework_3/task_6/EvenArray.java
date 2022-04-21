package org.example.homework_3.task_6;

import java.util.Arrays;
import java.util.Random;

public class EvenArray {
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(50);
        int[] initialArray = new int[x];
        int even = 0;

        for (int i = 0; i < initialArray.length; i++) {
            initialArray[i] = i;
            if (initialArray[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println("Initial array: " + Arrays.toString(initialArray));

        int[] evenArray = new int[even];
        int index = 0;
        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] % 2 == 0) {
                evenArray[index] = initialArray[i];
                index = index + 1;
            }
        }
        System.out.println("Final array: " + Arrays.toString(evenArray));
    }
}


