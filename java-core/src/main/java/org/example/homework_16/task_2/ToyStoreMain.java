package org.example.homework_16.task_2;

public class ToyStoreMain {
    public static void main(String[] args) throws InterruptedException {
        ToyDelivers toyDelivers = new ToyDelivers();

        ToyDeliverRunnable commonToyDeliverRunnable = new ToyDeliverRunnable(toyDelivers);

        Thread commonThread = new Thread(commonToyDeliverRunnable);

        commonThread.start();
        commonThread.join();

        System.out.println(toyDelivers.getDelivers());
    }
}
