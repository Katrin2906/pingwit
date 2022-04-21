package org.example.homework_8.task_4;

import java.util.Random;

public class WashingMachine {

    private Boolean electricity;
    private String washingMachine;

    public WashingMachine(String washingMachine) {
        this.washingMachine = washingMachine;
    }

    public String workingMachine() throws ElectricityExeption {
        Random random = new Random();
        random.nextBoolean();

        if (random.nextBoolean()) {
            return "working, electricity on";
        } else {
            throw new ElectricityExeption("No electricity, water out");
        }
    }

    public String waterOff() {
        return "water off";
    }

    public String getWashingMachine() {
        return washingMachine;
    }
}
