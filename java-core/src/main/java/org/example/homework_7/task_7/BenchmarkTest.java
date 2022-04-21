package org.example.homework_7.task_7;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class BenchmarkTest {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static void main(String[] args) {

        final int numIterations =350_000;

        StringBuffer strBuffer = new StringBuffer();
        StringBuilder strBuilder = new StringBuilder();
        String str = "";

        Timer timer = new Timer();
        for (int i = 0; i < numIterations; ++i) {
            str += i % 10;
        }
        printDuration(timer.getDuration(), "String");

        timer.restart();
        for (int i = 0; i < numIterations; ++i) {
            strBuffer.append(i % 10);
        }
        printDuration(timer.getDuration(), "StringBuffer");

        timer.restart();
        for (int i = 0; i < numIterations; ++i) {
            strBuilder.append(i % 10);
        }
        printDuration(timer.getDuration(), "StringBuilder");
    }

    private static void printDuration(LocalDateTime time, String prefix) {
        System.out.println(prefix + " : " + dtf.format(time));
    }
}

class Timer {
    long startTime = System.currentTimeMillis();

    public void restart() {
        startTime = System.currentTimeMillis();
    }

    public LocalDateTime getDuration() {
        long duration = System.currentTimeMillis() - startTime;

        return LocalDateTime.ofInstant(Instant.ofEpochMilli(duration), ZoneId.of("UTC"));
    }
}


