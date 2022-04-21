package org.example.homework_4.task_1;

import java.util.Objects;

public class Dwarfs {

    private static String text = "Hello from static";
    private String name;
    private String age;

    public Dwarfs() {
        this("Балин", "231");
    }

    public Dwarfs(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String show() {
        return " Name: " + name + " Age: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dwarfs dwarfs = (Dwarfs) o;
        return Objects.equals(name, dwarfs.name) && Objects.equals(age, dwarfs.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void Text(String text) {
        this.text = text;
    }

    public void realiseText(String text) {
        this.text = text;
    }

    public void printText() {
        System.out.println(text);
    }
}



