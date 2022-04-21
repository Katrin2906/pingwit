package org.example.homework_7.task_8;

import java.util.Arrays;

public class AutoMark {
    public static void main(String[] args) {
        String[] marks = new String[6];
        marks[0] = "1,1";
        marks[1] = "1,4";
        marks[2] = "1,2";
        marks[3] = "1,4";
        marks[4] = "1,8";
        marks[5] = "1,8";
        String change = "2,0T";
        String secondChange = "1,8T";

        for (int i = 0; i < marks.length; i++) {
            if (marks[i].equals("1,4")) {
                marks[i] = change;
            }
            if (marks[i].equals("1,8")) {
                marks[i] = secondChange;
            }
        }
        System.out.println(Arrays.toString(marks));
    }
}

