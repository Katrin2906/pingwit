package org.example.homework_6.task_3.Trees;


public enum FruitType {
    COCONUT("Coconut"),
    BANANA("Banana");

    private final String name;

    FruitType(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

