package org.example.homework_12.task_5;

import java.util.Comparator;

// +
public class SpeedComparator implements Comparator<Sportsmen> {
    @Override
    public int compare(Sportsmen o1, Sportsmen o2) {
        return o1.getSpeed().compareTo(o2.getSpeed());
    }
}

