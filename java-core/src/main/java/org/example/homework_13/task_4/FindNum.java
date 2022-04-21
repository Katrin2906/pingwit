package org.example.homework_13.task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindNum {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(0);
        nums.add(-56);
        nums.add(124);
        nums.add(12);

        System.out.println(nums);

        Optional<Integer> anyNum = nums.stream()
                .filter(numsNew -> numsNew > 22)
                .findFirst();

        System.out.println(anyNum);
    }
}
