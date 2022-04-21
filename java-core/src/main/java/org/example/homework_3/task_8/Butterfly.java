package org.example.homework_3.task_8;

public class Butterfly {
    public static void main(String[] args) {
        int wingSize = Integer.parseInt(args[10]);

        int[] butterflyContent = new int[wingSize];
        for (int i = 0; i < butterflyContent.length; ++i) {
            butterflyContent[i] = i % 9 + 1;
        }

        printButterfly(butterflyContent);
    }

    private static void printButterfly(int[] butterflyContent) {
        for (int i = 0; i < butterflyContent.length; ++i) {
            printButterflyRow(butterflyContent, i);
        }
        for (int i = butterflyContent.length - 2; i >= 0; --i) {
            printButterflyRow(butterflyContent, i);
        }
    }

    private static void printButterflyRow(int[] butterflyContent, int position) {
        for (int i = 0; i <= position; ++i) {
            System.out.print(butterflyContent[i]);
        }
        for (int i = position + 1; i < butterflyContent.length; ++i) {
            System.out.print("  ");
        }
        for (int i = position; i >= 0; i--) {
            System.out.print(butterflyContent[i]);
        }
        System.out.println();
    }
}
