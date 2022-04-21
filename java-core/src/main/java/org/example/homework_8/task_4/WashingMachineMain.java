package org.example.homework_8.task_4;

public class WashingMachineMain {
    public static void main(String[] args) throws ElectricityExeption {
        WashingMachine little = new WashingMachine("Alenka");
        try {
            little.workingMachine();
            System.out.println(little.workingMachine());

        } catch (ElectricityExeption e) {
            System.out.println(little.waterOff());
            System.out.println("No electricity, water out");
        }
    }
}
