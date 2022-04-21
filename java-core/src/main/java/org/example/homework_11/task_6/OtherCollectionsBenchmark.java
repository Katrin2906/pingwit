package org.example.homework_11.task_6;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;

public class OtherCollectionsBenchmark {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static final Integer CAPACITY = 300_000;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(CAPACITY);
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < CAPACITY; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        Timer timer = new Timer();
        
        // у тебя два ябсолютно одинаковых цикла, сделай метод, который будет принимать List и удалять элементы. А в методе main ты его просто вызовешь для ArrayList и LinkedList
        timer.restart();
        do {
            arrayList.remove(0);
        } while (arrayList.size() > 0);
        printDuration(timer.getDuration(), "ArrayList");

        timer.restart();
        do {
            linkedList.remove(0);
        } while (linkedList.size() > 0);
        printDuration(timer.getDuration(), "LinkedList");
    }

    private static void printDuration(LocalDateTime time, String prefix) {
        System.out.println(prefix + " : " + dtf.format(time));
    }
}

// Думаю этот класс можно было использовать из Task_5
class Timer {
    long startTime = System.currentTimeMillis(); // поле должно быть приватным и сразу присваивать время не стоит, очень уж изменчивое значение

    public void restart() { // из такого метода было бы хорошо возвращать значение времени старта, т.е. return System.currentTimeMillis();
        startTime = System.currentTimeMillis();
    }

    public LocalDateTime getDuration() { // этот метод лучше сделать с 2 аргументами start/finish и возвращать результат
        long duration = System.currentTimeMillis() - startTime;
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(duration), ZoneId.of("UTC"));
    }

}

