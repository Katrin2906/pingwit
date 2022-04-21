package org.example.homework_3.task_7;

import java.util.Arrays;

public class BubbleArray {
    public static void main(String[] args) {

        int[] bubbleArray = {4, 15, 178, -23, 0, 0, 1000};
        boolean sorted = false;
        int replacement;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < bubbleArray.length - 1; i++) {
                if (bubbleArray[i] > bubbleArray[i + 1]) {
                    replacement = bubbleArray[i];
                    bubbleArray[i] = bubbleArray[i + 1];
                    bubbleArray[i + 1] = replacement;
                    sorted = false;
                }
            }
        }
        System.out.println("Final array: " + Arrays.toString(bubbleArray));
    }
}
