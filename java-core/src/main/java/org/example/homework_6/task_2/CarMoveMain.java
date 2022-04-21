package org.example.homework_6.task_2;

public class CarMoveMain {
    public static void main(String[] args) {

        CarMove car = new CarMove(4, false, false);

        System.out.println(car.EngineOff());
        System.out.println(car.EngineOn());
        System.out.println(car.AcceleratorPress());
        System.out.print(car.BreakTransmission() + " ");
        System.out.println(car.Switch());
        System.out.println(car.CarMove());
        System.out.println(car.CarMoveRightNow());
    }
}
