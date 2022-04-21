package org.example.homework_11.task_8;

import java.util.HashSet;
import java.util.Set;

public class ShopCreation {
    public static void main(String[] args) {
        Set<Shop> shop = new HashSet<>();
        shop.add(new Shop("Zarina", 335));
        shop.add(new Shop("Zarina", 335));
        shop.add(new Shop("Zarina", 335));
        System.out.println(shop);
    }
}
