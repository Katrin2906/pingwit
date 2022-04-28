package org.example.homework_16.task_2;

public class ToyDeliverRunnable implements Runnable {
    private ToyDelivers toyDelivers;
    static final Integer FIRST_DELIVER_TOYS = 100;
    static final Integer SECOND_DELIVER_TOYS = 50;

    public ToyDeliverRunnable(ToyDelivers toyDelivers) {
        this.toyDelivers = toyDelivers;
    }

    @Override
    public void run() {
        toyDelivers.toyDeliverSynchronizedFirst();
        toyDelivers.toyDeliverSynchronizedSecond();
    }
}