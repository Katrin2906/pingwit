package org.example.homework_13.task_5;

import java.util.ArrayList;
import java.util.List;

public class Multiply {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(-3);
        nums.add(4);
        nums.add(5);
        nums.add(345);
        
        System.out.println(nums);
        
        Integer mult = nums.stream()
                .limit(5)
                .reduce(1, (a, b) -> a * b);
        
        System.out.println(mult);
    }
}
