package org.example.homework_7.task_1;

// +
public class StringEngin {
    public static void main(String[] args) {

        String text = new String("engineering");

        String engine = text.substring(0, 6);
        String ring = text.substring(7);
        System.out.println(engine);
        System.out.println(ring);
    }
}
