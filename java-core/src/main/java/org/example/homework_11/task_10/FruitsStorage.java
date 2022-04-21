package org.example.homework_11.task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FruitsStorage {
    public static void main(String[] args) {
        List<Fruits> fruits = new ArrayList<>();
        fruits.add(new Fruits("bananas", 12));
        fruits.add(new Fruits("pineapple", 6));
        fruits.add(new Fruits("apricots", 5));
        fruits.add(new Fruits("bananas", 30));
        fruits.add(new Fruits("bananas", 6));
        fruits.add(new Fruits("apricots", 32));

        // за попытку молодец, а вот реализация подкачала
        Map<String, Object> mapFruits = fruits.stream().collect(Collectors.toMap(Fruits::getName, fruits1 -> fruits));

        /* с учетом текущих знаний можно было создать HasMap<String, Integer> warehouse и в цикле у мапки проверять наличие фрукта в мапке, 
        если уже есть - доставем, добавляем кг и кладем обратно
        если нету - просто кладем название фрукта и его кг
        */
        System.out.println(mapFruits);

    }
}
