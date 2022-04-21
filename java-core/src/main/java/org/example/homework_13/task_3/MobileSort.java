package org.example.homework_13.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MobileSort {
    public static void main(String[] args) {
        List<Mobile> mobile = new ArrayList<>();
        mobile.add(new Mobile("Apple", "13 Pro"));
        mobile.add(new Mobile("Samsung", "S22 Ultra"));
        mobile.add(new Mobile("Apple", "13 mini"));
        mobile.add(new Mobile("Xiaomi", "Note 11"));
        mobile.add(new Mobile("BlackBerry", "Bold 9000"));
        System.out.println(mobile);

        Set<String> newProducers = Set.of("Apple", "Samsung", "Xiaomi");

       /* stream() каждый раз проходит по всей коллекции, как цикл. Когда ты дважды делаешь стрим, ты дважды проходишь по коллекции, 
       а все операции можно сделать за 1 раз

       */
        List<String> filteredProducers = mobile.stream()
                .map(Mobile::producer)
                .filter(newProducers::contains)
                .collect(Collectors.toList());
        System.out.println(filteredProducers);

    }
}
