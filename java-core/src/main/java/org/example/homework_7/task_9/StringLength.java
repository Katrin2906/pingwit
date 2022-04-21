package org.example.homework_7.task_9;

public class StringLength {
    public static void main(String[] args) {
        String[] blabla = new String[6];
        blabla[0] = "itsy";
        blabla[1] = "bitsy";
        blabla[2] = "spider";
        blabla[3] = "went";
        blabla[4] = "up";
        blabla[5] = "the";
        int letterNum=5;

        for (int i = 0; i < blabla.length; i++) {
            if (blabla[i].length() >= letterNum) {
                System.out.println("Нашлась! " + blabla[i]);
            }
        }
    }
}
