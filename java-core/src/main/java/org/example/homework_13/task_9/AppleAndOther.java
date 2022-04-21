package org.example.homework_13.task_9;

import org.example.homework_13.task_3.Mobile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class AppleAndOther {
    public static void main(String[] args) {
        List<Mobile> mobile = new ArrayList<>();
        mobile.add(new Mobile("Apple", "13 mini"));
        mobile.add(new Mobile("Samsung", "S22 Ultra"));
        mobile.add(new Mobile("Apple", "13 mini"));
        mobile.add(new Mobile("Xiaomi", "Note 11"));
        mobile.add(new Mobile("BlackBerry", "Bold 9000"));

        System.out.println(mobile);

        Map<Boolean, List<Mobile>> newApple = mobile.stream()
                .collect(Collectors.partitioningBy(producer -> Objects.equals(producer.producer(), "Apple"))); // producer.producer() == "Apple" -> producer.producer().equals("Apple")
        System.out.println(newApple);
    }
}
