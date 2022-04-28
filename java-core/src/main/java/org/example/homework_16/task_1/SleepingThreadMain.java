package org.example.homework_16.task_1;

public class SleepingThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = new Thread();
        mainThread.start();
        SleepingThread sleepingThread = new SleepingThread();
        sleepingThread.start();
        sleepingThread.join();
        System.out.println("Main thread is over");
    }
}
