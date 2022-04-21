package org.example.homework_3.task_1;

import java.util.Arrays;
import java.util.Scanner;

public class UserArray {
    public static void main(String[] args) {
        int[] userArray = new int[3];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < userArray.length; ++i) {
            System.out.println("Enter array elements ");
            userArray[i] = scanner.nextInt();
            sum = sum + userArray[i];
        }

        int min = userArray[0];
        int max = userArray[0];
        for (int elem : userArray) {
            if (elem < min) {
                min = elem;
            }
            if (elem > max) {
                max = elem;
            }
        }
        System.out.println("Final array " + Arrays.toString(userArray));
        System.out.println("Sum " + sum);
        System.out.println("Min element " + min);
        System.out.println("Max element " + max);
    }
}
