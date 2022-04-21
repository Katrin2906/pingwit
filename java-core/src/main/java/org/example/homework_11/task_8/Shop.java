package org.example.homework_11.task_8;

import java.util.Objects;

// public class Shop implements Comparable<Shop> {
public class Shop implements Comparable<Shop> {
    private String name;
    private Integer id; // ID -> id - названия полей с маленькой буквы

    public Shop(String name, Integer id) { // ID -> id - название переменных с маленькой буквы
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", ID=" +id +
                '}';
    }

    // public int compareTo(Shop o) {

        // если всегда возвращать 0, то получается у тебя все элементы одинаковые и в TreeSet попадает максимум 1 Shop, даже если у магазинов будут разные name и id
        // Посмотри как я делал на лекции


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(name, shop.name) && Objects.equals(id, shop.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public int compareTo(Shop o) {
        return 0;
    }
}
