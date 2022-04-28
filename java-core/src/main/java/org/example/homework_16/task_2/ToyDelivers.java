package org.example.homework_16.task_2;

import static org.example.homework_16.task_2.ToyDeliverRunnable.FIRST_DELIVER_TOYS;
import static org.example.homework_16.task_2.ToyDeliverRunnable.SECOND_DELIVER_TOYS;

public class ToyDelivers {
    private int deliver = 0;

    public void toyDeliverSynchronizedFirst() {
        synchronized (this) {
            for (int i = 0; i < FIRST_DELIVER_TOYS; ++i)
                ++deliver;
        }
    }

    public void toyDeliverSynchronizedSecond() {
        synchronized (this) {
            for (int i = 0; i < SECOND_DELIVER_TOYS; ++i)
                ++deliver;
        }
    }

    public int getDelivers() {
        return deliver;
    }
}
