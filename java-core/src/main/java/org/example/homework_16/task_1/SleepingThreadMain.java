package org.example.homework_16.task_1;

public class SleepingThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = new Thread();
        mainThread.start();
        mainThread.join();
        SleepingThread sleepingThread = new SleepingThread();
        sleepingThread.start();
        System.out.println("Main thread is over");
    }
}
