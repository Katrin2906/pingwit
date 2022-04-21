package org.example.homework_11.task_10;

import java.util.Objects;

// +
public class Fruits {
    private String name;
    private Integer weight;

    public Fruits(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruits fruits = (Fruits) o;
        return Objects.equals(name, fruits.name) && Objects.equals(weight, fruits.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
