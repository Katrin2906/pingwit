package org.example.homework_9.task_4;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = -72801047642231177L;

    private String name;
    private Integer age;
    private Work work;


    public Employee(String name, Integer age, Work work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work=" + work +
                '}';
    }
}


