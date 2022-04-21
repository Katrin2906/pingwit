package org.example.homework_9.task_4;

import java.io.Serializable;

public class Work implements Serializable {

    public String name;
    private Integer experience;

    public Work(String name, Integer experience) {
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Work{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
