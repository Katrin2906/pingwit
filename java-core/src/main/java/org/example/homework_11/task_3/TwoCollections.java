package org.example.homework_11.task_3;

import java.util.ArrayList;
import java.util.List;

public class TwoCollections {
    public static void main(String[] args) {
        Integer length = 15;
        Integer otherLength = 12;
        List<Integer> nums = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            nums.add(i);
        }
        System.out.println("First collection " + nums);
        List<Integer> otherNums = new ArrayList<>(otherLength);
        for (int i = 5; i < otherLength; i++) {
            otherNums.add(i);
        }
        System.out.println("Other collection " + otherNums);
        nums.removeAll(otherNums);
        System.out.println("Final result " + nums);
    }
}
