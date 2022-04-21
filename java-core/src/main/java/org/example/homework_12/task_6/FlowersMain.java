package org.example.homework_12.task_6;

import java.util.ArrayList;
import java.util.List;

public class FlowersMain {
    public static void main(String[] args) {
        List<String> flowers = new ArrayList<>(); // а зачем тогда класс Flowers?
        flowers.add("Rose");
        flowers.add("Daisy");
        flowers.add("Poppy");
        System.out.println(flowers);
       // flowers.forEach(fl -> System.out.println(Flowers.getName())); // есть подозрение что эта строка не компилируется, лучше сначала решить вопрос, а потом писать дальше

     //   var sortedFlowers = flowers.stream().sorted(Comparator.comparing(Flowers::getName, Comparator.reverseOrder())).toList();

        /*
        Вариант решения 1:
        List<Flowers> flowers = new ArrayList<>();
        Comparator<Flowers> flowersComparator = Comparator.comparing(Flowers::getName).reversed();
        flowers.sort(flowersComparator);
        */
        
        /*
        Вариант решения 2:
        List<String> flowers = new ArrayList<>();
        flowers.sort(Comparator.reverseOrder());
        */
    }
}
