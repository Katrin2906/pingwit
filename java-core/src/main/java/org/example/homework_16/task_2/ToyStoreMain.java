package org.example.homework_16.task_2;

public class ToyStoreMain {
    public static void main(String[] args) throws InterruptedException {
        ToyDelivers toyDelivers = new ToyDelivers();

        ToyDeliverRunnable commonToyDeliverRunnable = new ToyDeliverRunnable(toyDelivers); // это твой первый поставшик
        // ToyDeliverRunnable secondDeliver = new ToyDeliverRunnable(toyDelivers); // это второй поставщик
        // затем запускаешь два потока и в методе run() класса ToyDeliverRunnable работает цикл на заданное через конструктор кол-во итераций

        Thread commonThread = new Thread(commonToyDeliverRunnable);

        commonThread.start();
        commonThread.join();

        System.out.println(toyDelivers.getDelivers());
    }
}
