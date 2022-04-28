package org.example.homework_16.task_2;

public class ToyDeliverRunnable implements Runnable {
    private ToyDelivers toyDelivers;
    static final Integer FIRST_DELIVER_TOYS = 100; // поля класса должны быть приватными. Этот параметр можно было передавать в конструктор из метода мейн
    static final Integer SECOND_DELIVER_TOYS = 50; // поля класса должны быть приватными. Этот параметр можно было передавать в конструктор из метода мейн

    public ToyDeliverRunnable(ToyDelivers toyDelivers) {
        this.toyDelivers = toyDelivers;
    }

    @Override
    public void run() {
        // цикл должен был быть здесь
        toyDelivers.toyDeliverSynchronizedFirst();
        toyDelivers.toyDeliverSynchronizedSecond();
    }
}
