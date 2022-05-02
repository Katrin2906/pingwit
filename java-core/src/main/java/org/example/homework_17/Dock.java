package org.example.homework_17;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Dock {

    ReentrantLock locker;
    Condition condition;

    public Dock() {
        locker = new ReentrantLock();
        condition = locker.newCondition();
    }

    int[] array = {20, 50, 100};
    Random rnd = new Random();
    int waitingTime = array[rnd.nextInt(3)];

    public void work() throws InterruptedException {

        locker.lock();
        try {
            while (waitingTime = BoatTypes.BIG_BOAT || waitingTime = BoatTypes.MIDDLE_BOAT || waitingTime = BoatTypes.LITTLE_BOAT) {
                condition.await();
                System.out.println("Full boat");
                condition.signalAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}