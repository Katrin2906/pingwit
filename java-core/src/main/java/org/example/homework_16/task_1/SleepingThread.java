package org.example.homework_16.task_1;

public class SleepingThread extends Thread { // лучше использовать implements Runnable
    public void run() {
        System.out.println("Sleeping thread starts");
        for (int i = 0; i <= 20; i++) {
            System.out.println("New number= " + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } System.out.println("Sleeping thread is over"); // с новой строки
    }
}
