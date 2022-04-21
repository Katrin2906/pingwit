package org.example.homework_3.task_4;

public class MultiplicationTable {
    public static void main(String[] args) {
        int tableSize = 11;
        int[][] tableArray = new int[tableSize][tableSize];

        for (int i = 1; i < tableArray.length; i++) {
            for (int j = 1; j < tableArray[i].length; j++) {
                tableArray[i][j] = i * j;
            }
        }
        for (int[] row : tableArray) {
            for (int element : row) {
                if (element < 10) {
                    System.out.print(' ');
                }
                System.out.print(" " + element);
            }
            System.out.println();
        }
    }
}